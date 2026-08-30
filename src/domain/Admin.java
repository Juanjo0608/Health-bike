package domain;

import java.time.LocalDate;

public class Admin extends User {


    private boolean isAdmin;

//constructor

    public Admin(String userName, String email, String telefono, LocalDate fechaRegistro, String tipoMoto,
                 boolean isAdmin) {
        super(userName, email, telefono, fechaRegistro, tipoMoto);
        this.isAdmin = isAdmin;
    }
    //getter

    public boolean isAdmin() {
        return isAdmin;
    }

    //setter

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}

