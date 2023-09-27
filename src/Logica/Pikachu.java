package Logica;

public class Pikachu extends Pokemon implements IElecrico{
    String Generacion = "Primera";
    int Ratio_captura = 190;
    int Experiencia_base = 105;
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Araniazo.\n"+
                "danio:200PS");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Araniazo.\n"+
                "danio:200PS");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Araniazo.\n"+
                "danio:200PS");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Impactrueno.\n"+
                "danio:200PS");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola, soy Pikachu y este es mi ataque PunioTrueno.\n"+
                "danio:200PS");
    }
}
