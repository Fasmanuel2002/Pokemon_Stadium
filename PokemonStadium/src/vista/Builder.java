/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import CreadorPokemones.Ataque;
import Tipos.Pokemon;

import Tipos.*;
import java.util.ArrayList;

//
/**
 *
 * @author administrador
 */
public class Builder {
    
    public static ArrayList<Pokemon> crearPokemones(){//Creador de Pokemones
        
        ArrayList<Pokemon> pokemones = new ArrayList<>();

                        
        pokemones.add(new PokemonRayo(1,"Pikachu", 180,50,45,55));//hp==vida
        pokemones.add(new PokemonNormal(2,"Eevee", 200,40,50,50));
        pokemones.add(new PokemonPlanta(3,"Chokorita", 220,40,45,50));
        pokemones.add(new PokemonFire(4,"Charmander", 160,52,43,65));
        pokemones.add(new PokemonAire(5,"Pidgey", 150,45,40,56));
        pokemones.add(new PokemonFire(6,"Geowlithe", 140,60,45,60));
        pokemones.add(new PokemonAgua(7,"Psyduck", 190,52,48,55));
        pokemones.add(new PokemonRayo(8,"Mareep", 170,40,40,30));
        pokemones.add(new PokemonPlanta(9,"Bulbasur", 200,45,49,45));
        pokemones.add(new PokemonAgua(10,"Squirtle", 200,40,51,42));
        pokemones.add(new PokemonAgua(11, "Totodile", 210,30,50,43));
        pokemones.add(new PokemonAire(12,"Starly",155,50,35,60));
        pokemones.add(new PokemonRayo(13,"Magnite",240,30,60,30));
        pokemones.add(new PokemonNormal(14, "Macham",200,45,45,45));
        pokemones.add(new PokemonPlanta(15,"Bellsprout",175,53,39,49));
        
      return pokemones;
    
    }
    
    public static ArrayList<Ataque> crearAtaque(){//Creador de Ataques
    
      ArrayList<Ataque> ataques = new ArrayList<>();
      
      ataques.add(new Ataque(1,"Tackle" , Tipo.NORMAL, 15));
      ataques.add(new Ataque(2,"Bite" , Tipo.NORMAL, 30));
      ataques.add(new Ataque(3,"Swift" , Tipo.NORMAL, 28));
      ataques.add(new Ataque(4,"Crunch" , Tipo.NORMAL, 35));
      ataques.add(new Ataque(1,"RazorLeaf" , Tipo.PLANTA, 25));
      ataques.add(new Ataque(2,"MagicalLeaf" , Tipo.PLANTA, 28));
      ataques.add(new Ataque(3,"SolarBeam" , Tipo.PLANTA, 35));
      ataques.add(new Ataque(4,"LeafStrom",Tipo.PLANTA,32));
      ataques.add(new Ataque(1,"Fire" , Tipo.FUEGO, 27));
      ataques.add(new Ataque(2,"FlameThrower" , Tipo.FUEGO, 30));
      ataques.add(new Ataque(3,"FireBlast" , Tipo.FUEGO, 35));
      ataques.add(new Ataque(4,"BlastBurn" , Tipo.FUEGO, 32));
      ataques.add(new Ataque(1,"Thunder" , Tipo.RAYO, 28));
      ataques.add(new Ataque(2,"Volt Tackle" , Tipo.RAYO, 30));
      ataques.add(new Ataque(3,"Catastropika" , Tipo.RAYO, 35));
      ataques.add(new Ataque(4,"ZapCannon", Tipo.RAYO, 31));
      ataques.add(new Ataque(1,"Water" , Tipo.AGUA, 20)); 
      ataques.add(new Ataque(2,"Surf" , Tipo.AGUA, 25));
      ataques.add(new Ataque(3,"HidroBump" , Tipo.AGUA, 35));
      ataques.add(new Ataque(4,"HydroCannon", Tipo.AGUA, 32));
      ataques.add(new Ataque(1,"Wind" , Tipo.AIRE, 20));
      ataques.add(new Ataque(2,"Tornado" , Tipo.AIRE, 35));
      ataques.add(new Ataque(3,"Fly" , Tipo.AIRE, 28));
      ataques.add(new Ataque(4,"BleakBlast", Tipo.AIRE, 32));
      return ataques;
    }
    
}
