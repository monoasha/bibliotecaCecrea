
package dto;


public class ResumenFicha {

    private Long id;
    private String nombreparticipante;
    private String apelldpaternopart;
    private String apelldmaternopart;
    private String run;

    public ResumenFicha(Long id, String nombreparticipante, String apelldpaternopart, String apelldmaternopart, String run) {
        this.id = id;
        this.nombreparticipante = nombreparticipante;
        this.apelldpaternopart = apelldpaternopart;
        this.apelldmaternopart = apelldmaternopart;
        this.run = run;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreparticipante() {
        return nombreparticipante;
    }

    public void setNombreparticipante(String nombreparticipante) {
        this.nombreparticipante = nombreparticipante;
    }

    public String getApelldpaternopart() {
        return apelldpaternopart;
    }

    public void setApelldpaternopart(String apelldpaternopart) {
        this.apelldpaternopart = apelldpaternopart;
    }

    public String getApelldmaternopart() {
        return apelldmaternopart;
    }

    public void setApelldmaternopart(String apelldmaternopart) {
        this.apelldmaternopart = apelldmaternopart;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }
    
    
    
}
