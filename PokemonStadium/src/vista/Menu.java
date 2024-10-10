/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import Tipos.Pokemon;
import Game.Game;
import java.util.Scanner;
import Game.Jugador;

/**
 *
 * @author administrador
 */
public class Menu {
    private Game game;
    
    public Menu(){
        game = new Game();
        
        
    }
     public void mostrarMenu() throws CloneNotSupportedException{
     Scanner sc = new Scanner(System.in);
     String respuesta;
     
            System.out.println("""
                                                                 ,'\\
                                   _.----.        ____         ,'  _\\   ___    ___     ____
                               _,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.
                               \\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |
                                \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |
                                  \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |
                                   \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |
                                    \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |
                                     \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |
                                      \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |
                                       \\_.-'       |__|    `-._ |              '-.|     '-.| |   |
                                                               `'                            '-._|""");
       
     
     
         do {
             
         
            
            System.out.println("=============================================");
            System.out.println(" See Pokemons");
           
            
        System.out.println("=============================================");    
        game.mostrarPokemon();
        System.out.println("=============================================");
        
        System.out.println("What Pokemon do you want player 1: ");
        
        
        
       

  Jugador[] jugadores = new Jugador[2];

    for (int i = 0; i < 2; i++) {
        Jugador jugador = new Jugador();//Se crea el jugador que tendra a los pokemones 
        System.out.println("Enter ID for Player " + (i + 1) + ": ");
        int playerID = sc.nextInt();
        jugador.setID(playerID); //Se le añade al jugador un ID, que seran dos jugadores 
        jugadores[i] = jugador;//Este jugadores[i] es para almacenar en el array de 0 y 1 la informacion de los jugadores 0 y 1
        for (int j = 0; j < 3; j++) {//Sera un Array de 3 por que son tres pokemones los que se añaden por jugador
            System.out.println("Enter Pokedex number for Pokemon " + (j + 1) + ": ");
            int pokedexnumber = sc.nextInt();
            Pokemon pokemon = game.choosePokemon(pokedexnumber);//Se llama a la funcion de elegir pokemon el cual tendra un PokedexNumber para elegir al pokemon seleccionado e insertarlo en el pokemon
            jugadores[i].addPokemon(pokemon);// se añidira a los jugadores 0 y 1 los pokemones seleccionados que seran 6
            jugadores[i].setActivePokemon(pokedexnumber); //Se añadiran en ActivePokemon la informacion de los pokemons para que no valga -1
    }
}
        
       
            game.fightPokemon(jugadores[0], jugadores[1]);//aqui se pelearan todos los pokemones del jugador 1 y todos los pokemones del jugador 2
       
        
     
             System.out.println("You want to repeat the game (yes/no)");
             respuesta = sc.next();
     
     
     }while(respuesta.equals("yes"));
    
}
}
