package Principal;
import java.util.ArrayList;

public class Cafeteria {
     private String nombre;
    private String  direccion;
    private String redess;

    public Cafeteria(String nombre, String direccion, String redess) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.redess = redess;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRedess() {
        return redess;
    }

    public void setRedess(String redess) {
        this.redess = redess;
    }
    
}
