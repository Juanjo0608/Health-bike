public class ubicacion_Talleres {

    String municipio;
    String barrio;
    String nombre_Mecanico;
    String especialidad_Taller;
    String direccion;

    public ubicacion_Talleres(String municipio, String nombre_Mecanico, String barrio, String especialidad_Taller, String direccion) {
        this.municipio = municipio;
        this.nombre_Mecanico = nombre_Mecanico;
        this.barrio = barrio;
        this.especialidad_Taller = especialidad_Taller;
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getNombre_Mecanico() {
        return nombre_Mecanico;
    }

    public String getEspecialidad_Taller() {
        return especialidad_Taller;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setNombre_Mecanico(String nombre_Mecanico) {
        this.nombre_Mecanico = nombre_Mecanico;
    }

    public void setEspecialidad_Taller(String especialidad_Taller) {
        this.especialidad_Taller = especialidad_Taller;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
