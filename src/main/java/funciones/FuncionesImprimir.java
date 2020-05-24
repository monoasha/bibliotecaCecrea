/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import com.itextpdf.html2pdf.HtmlConverter;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;
import tablas.FichaInscripcion;

/**
 *
 * @author shofy
 */
public class FuncionesImprimir {

    private final static Logger LOGGER = Logger.getLogger("mx.hash.impresionpdf.Impresor");

    public static void imprimir() {
        // Indicamos el nombre del archivo Pdf que deseamos imprimir
        try {
            PDDocument document = PDDocument.load(new File("./documento.pdf"));

            PrinterJob job = PrinterJob.getPrinterJob();

            LOGGER.log(Level.INFO, "Mostrando el dialogo de impresion");
            if (job.printDialog() == true) {
                job.setPageable(new PDFPageable(document));

                LOGGER.log(Level.INFO, "Imprimiendo documento");
                job.print();
            }
        } catch (Exception e) {
            System.out.println("Error inesperado al imprimir PDF, Error: " + e);
            JOptionPane.showMessageDialog(null, "ERROR INESPERADO AL IMPRIMIR EL PDF");
        }
    }

    public static void imprimirFichaCecrea() {
        try {
            PDDocument fichaPDF = generarPDFFicha(null);
            PrinterJob job = PrinterJob.getPrinterJob();
            LOGGER.log(Level.INFO, "Mostrando el dialogo de impresion");
            if (job.printDialog() == true) {
                job.setPageable(new PDFPageable(fichaPDF));
                LOGGER.log(Level.INFO, "Imprimiendo documento");
                job.print();
            }
        } catch (Exception e) {
            System.out.println("Error inesperado al imprimir PDF, Error: " + e);
            JOptionPane.showMessageDialog(null, "ERROR INESPERADO AL IMPRIMIR EL PDF");
        }
    }

    public static PDDocument generarPDFFicha(FichaInscripcion ficha) {
        try {
            URL uri = FuncionesImprimir.class.getClass().getResource("/plantillas/plantillaFichaCecrea.html");
            String contenidoHtml = new String(Files.readAllBytes(Paths.get(uri.toURI())));
            contenidoHtml = contenidoHtml
                    .replaceAll("#NOMBRE", ficha.getNombreparticipante())
                    .replaceAll("#APELLIDOP", ficha.getApelldpaternopart())
                    .replaceAll("#APELLIDOM", ficha.getApelldmaternopart())
                    .replaceAll("#RUT", ficha.getRun())
                    .replaceAll("#FECHAN", ficha.getFechanacparticipante().toString())
                    .replaceAll("#DOMICILIO", ficha.getDomicilio())
                    .replaceAll("#TELEFONO", ficha.getFonoparticipante())
                    .replaceAll("#AP_RELACION", ficha.getParentezco().toString())
                    .replaceAll("#TELEFONO", ficha.getFonoadresp())
                    .replaceAll("#AP_NOMBRE", ficha.getNombreadresp())
                    .replaceAll("#AP_APELLIDOP", ficha.getApellpatadresp())
                    .replaceAll("#AP_APELLIDOM", ficha.getApellmatadresp())
                    .replaceAll("#AP_DOMICILIO", ficha.getDiradresp())
                    .replaceAll("#AP_TELEFONO", ficha.getFonoadresp())
                    .replaceAll("#AP_EMAIL", ficha.getEmailadresp());
                    
                    
                    
            File pdfDest = new File(System.getProperty("user.home") + "/Desktop/" + "FICHA_" + ficha.getRun() + ".pdf");
            HtmlConverter.convertToPdf(contenidoHtml, new FileOutputStream(pdfDest));
            JOptionPane.showMessageDialog(null, "PDF de ficha generado existosamente en el escritorio");
            return PDDocument.load(pdfDest);
        } catch (Exception e) {
            System.out.println("Error inesperado al generar pdf de ficha, error: " + e);
            JOptionPane.showMessageDialog(null, "ERROR INESPERADO AL GENERAR PDF DE FICHA");
        }
        return null;
    }
}
