package Logica;

public abstract class Pokemon {
    /* Estos atributos estan protegidos para que solo las clases hijas puedan tener
    acceso a estos atribuos */
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    protected abstract void atacarPlacaje();

    protected abstract void atacarAraniazo();

    protected abstract void atacarMordisco();


}
