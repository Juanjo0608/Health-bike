public class tipo_Moto {

    String marca;
    String tipoUso; //Si es para uso publico o privado
    String categoriaMoto;
    int cilindraje;
    int modelo;

    public tipo_Moto(String tipoUso, String marca, String categoriaMoto, int cilindraje, int modelo) {
        this.tipoUso = tipoUso;
        this.marca = marca;
        this.categoriaMoto = categoriaMoto;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCategoriaMoto() {
        return categoriaMoto;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public int getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setCategoriaMoto(String categoriaMoto) {
        this.categoriaMoto = categoriaMoto;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
