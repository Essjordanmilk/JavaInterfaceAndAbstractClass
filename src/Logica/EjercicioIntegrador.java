package Logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();


        squirtle.atacarAraniazo();
        squirtle.atacarHidroBombas();

        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();

        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();

        pikachu.atacarAraniazo();
        pikachu.atacarPunioTrueno();
    }
}