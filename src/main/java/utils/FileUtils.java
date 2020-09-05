package utils;

import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileUtils {

    public static String abrirPlantilla(String nombrePlantilla) throws Exception {
        try {
            String contenidoHtml;
            URL uri = FileUtils.class.getResource("/plantillas/" + nombrePlantilla);
            String[] array = uri.toString().split("!");
            switch (array.length) {
                case 2:
                    Map<String, String> env = new HashMap<>();
                    FileSystem fs = FileSystems.newFileSystem(URI.create(array[0]), env);
                    Path path = fs.getPath(array[1]);
                    contenidoHtml = new String(Files.readAllBytes(path));
                    fs.close();
                    break;
                case 1:
                    contenidoHtml = new String(Files.readAllBytes(Paths.get(uri.toURI())));  
                    break;
                default:
                    throw new Exception();
            }
            return contenidoHtml;
        } catch (Exception ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, "Error al abrir la plantilla: " + nombrePlantilla, ex);
            throw ex;
        }
    }
}
