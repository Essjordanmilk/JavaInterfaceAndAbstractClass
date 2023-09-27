package Logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        System.out.println("\n____________________Squirtle - ataques_basicos____________________\n");
        squirtle.atacarAraniazo();
        squirtle.atacarMordisco();
        squirtle.atacarPlacaje();
        System.out.println("____________________Squirtle - ataques_especiales____________________\n");
        squirtle.atacarHidroBombas();
        squirtle.atacarBurbuja();
        squirtle.atacarPistolaAgua();


        System.out.println("\n____________________Charmander - ataques_basicos____________________\n");
        charmander.atacarAraniazo();
        charmander.atacarMordisco();
        charmander.atacarPlacaje();
        System.out.println("____________________Charmander - ataques_especiales____________________\n");
        charmander.atacarLanzaLlamas();
        charmander.atacarAscuas();
        charmander.atacarPunioFuego();


        System.out.println("\n____________________Bulbasaur - ataques_basicos____________________\n");
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarMordisco();
        bulbasaur.atacarPlacaje();
        System.out.println("____________________Bulbasaur - ataques_especiales____________________\n");
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarParalizar();


        System.out.println("\n____________________Pikachu - ataques_basicos____________________\n");
        pikachu.atacarAraniazo();
        pikachu.atacarMordisco();
        pikachu.atacarPlacaje();
        System.out.println("____________________Pikachu - ataques_especiales____________________\n");
        pikachu.atacarAraniazo();
        pikachu.atacarPunioTrueno();

    }
}
