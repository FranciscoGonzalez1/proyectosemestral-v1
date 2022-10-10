package Modelo;

public class Cliente {
    private String rut;
    private String nombre;
    private String direccion;
    private String telefono;
    private boolean activo;

    //constructor
    public Cliente(String rut, String nom, String tel, String dir) {
        this.rut = rut;
        nombre = nom;
        telefono = tel;
        direccion = dir;
        activo = true;
    }

    //getters autogenerados
    public String getRut() {
        return rut;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }

    public boolean isActivo(){
        return activo;
    }
    public void setActivo(){
        activo = true;
    }
    public void setInactivo(){
        activo = false;
    }
}
