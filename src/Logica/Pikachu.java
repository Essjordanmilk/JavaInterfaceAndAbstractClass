package Logica;

public class Pikachu extends Pokemon implements IElecrico{
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Araniazo.");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Araniazo.");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Araniazo.");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Impactrueno.");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola, soy Pikachu y este es mi ataque PunioTrueno.");
    }
}
