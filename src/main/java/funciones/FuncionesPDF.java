/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import com.itextpdf.html2pdf.HtmlConverter;
import dto.ReporteMensual;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Locale;
import java.util.Optional;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import tablas.ComponenteProgramatico;
import tablas.FichaInscripcion;
import tablas.Parentezco;
import utils.FileUtils;
import vo.Plantillas;
import vo.TipoComponenteProgramaticoVO;

public class FuncionesPDF {

    private final static Logger LOGGER = Logger.getLogger("mx.hash.impresionpdf.Impresor");

    public static void generarPDFFichaCecrea(FichaInscripcion ficha) {
        try {
            String contenidoHtml = FileUtils.abrirPlantilla(Plantillas.FICHA_CECREA);
            Optional<Parentezco> parentezco = Funciones.obtenerParentezcos().stream().filter(x -> x.getId() == ficha.getParentezco().longValue()).findFirst();
            contenidoHtml = contenidoHtml
                    .replaceAll("#NOMBRE", procesarCampo(ficha.getNombreparticipante()))
                    .replaceAll("#APELLIDOP", procesarCampo(ficha.getApelldpaternopart()))
                    .replaceAll("#APELLIDOM", procesarCampo(ficha.getApelldmaternopart()))
                    .replaceAll("#RUT", procesarCampo(ficha.getRun()))
                    .replaceAll("#FECHAN", procesarCampo(ficha.getFechanacparticipante()))
                    .replaceAll("#AP_RUTADULTORESP", procesarCampo(ficha.getRunretiro1()))
                    .replaceAll("#PARETEZCO", parentezco.isPresent() ? parentezco.get().getNombre() : "SIN DATO")
                    .replaceAll("#DOMICILIO",  procesarCampo(ficha.getDomicilio()))
                    .replaceAll("#TELEFONO", procesarCampo(ficha.getFonoparticipante()))
                    .replaceAll("#TELEFONO", procesarCampo(ficha.getFonoadresp()))
                    .replaceAll("#AP_NOMBRE", procesarCampo(ficha.getNombreadresp()))
                    .replaceAll("#AP_APELLIDOP", procesarCampo(ficha.getApellpatadresp()))
                    .replaceAll("#AP_APELLIDOM", procesarCampo(ficha.getApellmatadresp()))
                    .replaceAll("#AP_DOMICILIO", procesarCampo(ficha.getDiradresp()))
                    .replaceAll("#AP_TELEFONO", procesarCampo(ficha.getFonoadresp()))
                    .replaceAll("#AP_EMAIL", procesarCampo(ficha.getEmailadresp()))
                    .replaceAll("#LOGO_CECREA", obtenerImagen("logocecrea.png"))
                    .replaceAll("#ACUERDO_USO_IMAGEN", ficha.getAcuerdoUsoImagen() ? "SI" : "NO");
            File pdfDest = new File(System.getProperty("user.home") + "/Desktop/" + "FICHA_" + ficha.getRun() + ".pdf");
             HtmlConverter.convertToPdf(contenidoHtml, new FileOutputStream(pdfDest));
            JOptionPane.showMessageDialog(null, "PDF de ficha generado existosamente en el escritorio");
            PDDocument.load(pdfDest).close();
            return;
        } catch (Exception e) {
            System.out.println("Error inesperado al generar pdf de ficha, error: " + e);
            JOptionPane.showMessageDialog(null, "ERROR INESPERADO AL GENERAR PDF DE FICHA");
        }
        return;
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
                    .replaceAll("#CANTIDAD_PRESTAMOS", procesarCampo(reporte.getCantidadPrestamos()))
                    .replaceAll("#CANTIDAD_DEVOLUCIONES", procesarCampo(reporte.getCantidadDevoluciones()))
                    .replaceAll("#CANTIDAD_LABORATORIOS", procesarCampo(cantidadLaboratorios.toString()))
                    .replaceAll("#LABORATIORIO_FACILITADOR", procesarCampo(htmlLaboratorioFacilitador))
                    .replaceAll("#CANTIDAD_EXPERIENCIAS", procesarCampo(cantidadExperiencias))
                    .replaceAll("#EXPERIENCIA_FACILITADOR", procesarCampo(htmlExperienciaFacilitador))
                    .replaceAll("#CANTIDAD_FICHAS", procesarCampo(reporte.getCantidadFichas()))
                    .replaceAll("#MES", procesarCampo(reporte.getPeriodoConsultado()))
                    .replaceAll("#CANTIDAD_CONFICHA", procesarCampo(Funciones.consultarInscripcionesConFichaDelMes()))
                    .replaceAll("#CANTIDAD_SINFICHA",procesarCampo(Funciones.consultarInscripcionesSinFichaDelMes()))
                    .replaceAll("#LOGO_CECREA", obtenerImagen("logocecrea.png"))
                    .replaceAll("#TOTAL_FICHASCECREA", procesarCampo(Funciones.consultarTotalfichasCecrea()))
                    .replaceAll("#CANTIDAD_FICHASLAB", procesarCampo(Funciones.consultarTotalinscritoslab()));
   
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
    
    private static String procesarCampo (Object dato) {
        return dato == null ? "SIN DATO" : dato.toString();
    }

}
