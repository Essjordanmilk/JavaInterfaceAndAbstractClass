package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{
    String Generacion = "Primera";
    int Ratio_captura = 45;
    int Experiencia_base = 64;
    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque placaje.\n");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Araniazo.\n" +
                "danio:200PS");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Mordisco.\n"+
                "danio:320PS");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Drenaje.\n"+
                "danio:430PS");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Paralizar.\n"+
                "danio:100PS");
    }
}
