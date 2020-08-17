/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import com.itextpdf.html2pdf.HtmlConverter;
import dto.ReporteMensual;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;
import tablas.ComponenteProgramatico;
import tablas.FichaInscripcion;
import utils.FileUtils;
import vo.Plantillas;
import vo.TipoComponenteProgramaticoVO;

public class FuncionesPDF {

    private final static Logger LOGGER = Logger.getLogger("mx.hash.impresionpdf.Impresor");

    public static void imprimirFichaCecrea() {
        try {
            PDDocument fichaPDF = generarPDFFichaCecrea(null);
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

    public static PDDocument generarPDFFichaCecrea(FichaInscripcion ficha) {
        try {
            String contenidoHtml = FileUtils.abrirPlantilla(Plantillas.FICHA_CECREA);
            contenidoHtml = contenidoHtml
                    .replaceAll("#NOMBRE", ficha.getNombreparticipante())
                    .replaceAll("#APELLIDOP", ficha.getApelldpaternopart())
                    .replaceAll("#APELLIDOM", ficha.getApelldmaternopart())
                    .replaceAll("#RUT", ficha.getRun())
                    .replaceAll("#FECHAN", ficha.getFechanacparticipante().toString())
                    .replace("#AP_RUTADULTORESP", ficha.getRunretiro1())
                    .replace("#PARETEZCO", ficha.getParentezco().toString())
                    .replaceAll("#DOMICILIO",  ficha.getDomicilio())
                    .replaceAll("#TELEFONO", ficha.getFonoparticipante())
                    .replaceAll("#TELEFONO", ficha.getFonoadresp())
                    .replaceAll("#AP_NOMBRE", ficha.getNombreadresp())
                    .replaceAll("#AP_APELLIDOP", ficha.getApellpatadresp())
                    .replaceAll("#AP_APELLIDOM", ficha.getApellmatadresp())
                    .replaceAll("#AP_DOMICILIO", ficha.getDiradresp())
                    .replaceAll("#AP_TELEFONO", ficha.getFonoadresp())
                    .replaceAll("#AP_EMAIL", ficha.getEmailadresp())
                    .replaceAll("#LOGO_CECREA", obtenerImagen("logocecrea.png"))
                    .replaceAll("#ACUERDO_USO_IMAGEN", ficha.getAcuerdoUsoImagen() ? "SI" : "NO");

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

    public static PDDocument generarPDFReporteMensual(Integer mes, Integer año) {
        try {
            ReporteMensual reporte = FuncionesReporte.generarDatosReporteMensual(mes, año);
            String contenidoHtml = FileUtils.abrirPlantilla(Plantillas.REPORTE_MENSUAL);
            String htmlLaboratorioFacilitador = "";
            String htmlExperienciaFacilitador = "";
            Long cantidadLaboratorios = reporte.getComponentesProgramaticos().stream().filter(c -> c.getTipo().equals(TipoComponenteProgramaticoVO.COMPONENTE_LABORATORIO)).count();
            Long cantidadExperiencias = reporte.getComponentesProgramaticos().stream().filter(c -> c.getTipo().equals(TipoComponenteProgramaticoVO.COMPONENTE_EXPERIENCIA)).count();
            for (ComponenteProgramatico c : reporte.getComponentesProgramaticos()) {
                if (c.getTipo().equals(TipoComponenteProgramaticoVO.COMPONENTE_LABORATORIO)) {
                    htmlLaboratorioFacilitador += c.getNombre() + " - " + c.getNombrefacilitador() + "<br>";
                } else if (c.getTipo().equals(TipoComponenteProgramaticoVO.COMPONENTE_EXPERIENCIA)) {

                    htmlExperienciaFacilitador += c.getNombre() + " - " + c.getNombrefacilitador() + "<br>";
                }
            }
            contenidoHtml = contenidoHtml
                    .replaceAll("#CANTIDAD_PRESTAMOS", reporte.getCantidadPrestamos().toString())
                    .replaceAll("#CANTIDAD_DEVOLUCIONES", reporte.getCantidadDevoluciones().toString())
                    .replaceAll("#CANTIDAD_LABORATORIOS", cantidadLaboratorios.toString())
                    .replaceAll("#LABORATIORIO_FACILITADOR", htmlLaboratorioFacilitador)
                    .replaceAll("#CANTIDAD_EXPERIENCIAS", cantidadExperiencias.toString())
                    .replaceAll("#EXPERIENCIA_FACILITADOR", htmlExperienciaFacilitador)
                    .replaceAll("#CANTIDAD_FICHAS", reporte.getCantidadFichas().toString())
                    .replaceAll("#MES", reporte.getPeriodoConsultado())
                    .replaceAll("#CANTIDAD_CONFICHA",Funciones.consultarInscripcionesConFichaDelMes().toString())
                    .replaceAll("#CANTIDAD_SINFICHA",Funciones.consultarInscripcionesSinFichaDelMes().toString())
                    .replaceAll("#LOGO_CECREA", obtenerImagen("logocecrea.png"));
            File pdfDest = new File(System.getProperty("user.home") + "/Desktop/" + "REPORTE_" + Calendar.getInstance().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + "_CECREA.pdf");
            FileOutputStream output = new FileOutputStream(pdfDest);
            HtmlConverter.convertToPdf(contenidoHtml, output);
            output.close();
            JOptionPane.showMessageDialog(null, "PDF de reporte generado existosamente en el escritorio");
            return PDDocument.load(pdfDest);
        } catch (Exception e) {
            System.out.println("Error inesperado al generar pdf de reporte, error: " + e);
            JOptionPane.showMessageDialog(null, "ERROR INESPERADO AL GENERAR PDF DE reporte");
        }
        return null;
    }
    
    public static String obtenerImagen(String nombreImagen) {
        return FuncionesPDF.class.getClass().getResource("/imagenes/"+nombreImagen).getFile();
    }

}
