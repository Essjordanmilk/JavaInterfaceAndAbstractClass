package Logica;

public class Charmander extends Pokemon implements IFuego{
    String Generacion = "Primera";
    int Ratio_captura = 45;
    int Experiencia_base = 62;

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Charmander y este es mi ataque Araniazo.\n" +
                "danio:200PS");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Charmander y este es mi ataque Araniazo.\n" +
                "danio:430PS");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Charmander y este es mi ataque Araniazo.\n" +
                "danio:302PS");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola, soy Charmander y este es mi ataque PunioFuego.\n" +
                "danio:300PS");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola, soy Charmander y este es mi ataque LanlzaLlamas.\n" +
                "danio:350PS");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola, soy Charmander y este es mi ataque Ascuas.\n" +
                "danio:400PS");
    }
}
