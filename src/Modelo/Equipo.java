package Modelo;

public class Equipo {
    //Atributos
    private long código;
    private String descripción;
    private long precioArriendoDia;
    private EstadoEquipo estado = EstadoEquipo.OPERATIVO;

    //Constructor.
    public Equipo (long cod, String desc, long precio){
        código=cod;
        descripción=desc;
        precioArriendoDia=precio;
    }

    //Creación de Getters.
    public long getCódigo() {
        return código;
    }

    public String getDescripción() {
        return descripción;
    }

    public long getPrecioArriendoDia() {
        return precioArriendoDia;
    }

    public EstadoEquipo getEstado() {
        return estado;
    }
}
