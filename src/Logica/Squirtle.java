package Logica;

public class Squirtle extends Pokemon implements IAgua{
    String Generacion = "Primera";
    int Ratio_captura = 45;
    int Experiencia_base = 63;
    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Squirtle y este es mi ataque Placaje.\n" +
                "danio:203PS");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Squirtle y este es mi ataque Araniazo.\n" +
                "danio: 200PS"); //Puntos de salud -> HP en ingles de "Hit Points"
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Squirtle y este es mi ataque Araniazo.\n" +
                "danio: 120PS");
    }

    @Override
    public void atacarHidroBombas() {
        System.out.println("Hola, soy Squirtle y este es mi ataque HidroBombas.\n" +
                "danio: 100PS");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola, soy Squirtle y este es mi ataque Burbuja.\n" +
                "danio:293PS");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola, soy Squirtle y este es mi ataque PistolaAgua.\n" +
                "danio:123PS");
    }
}
