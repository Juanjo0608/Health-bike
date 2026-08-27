package domain;
import java.util.Scanner;
import java.time.LocalDate;
public class User {
    public Scanner scanner = new Scanner(System.in);


//Atributos

private String userName;
private String role;
private String email;
private String telefono;
private LocalDate fechaRegistro;
private String TipoMoto;

//Constructores

    public User(){

    }

    public User(String userName, String role, String email, String telefono, LocalDate fechaRegistro, String tipoMoto) {
        this.userName = userName;
        this.role = role;
        this.email = email;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        TipoMoto = tipoMoto;
    }

    //Getters

    public String getUserName() {
        return userName;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public String getTipoMoto() {
        return TipoMoto;
    }

    //Setters


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setTipoMoto(String tipoMoto) {
        TipoMoto = tipoMoto;
    }
}