package Logica;

public class Charmander extends Pokemon implements IFuego{
    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Charmander y este es mi ataque Araniazo.");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Charmander y este es mi ataque Araniazo.");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Charmander y este es mi ataque Araniazo.");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola, soy Charmander y este es mi ataque PunioFuego.");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola, soy Charmander y este es mi ataque LanlzaLlamas.");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola, soy Charmander y este es mi ataque Ascuas.");
    }
}
