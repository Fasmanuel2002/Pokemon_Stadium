/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

import Tipos.Pokemon;
import java.util.ArrayList;
import CreadorPokemones.*;

/**
 *
 * @author administrador
 */
public class Jugador {
    public int ID; //ID del jugador 
    public ArrayList<Pokemon> pokemones; //ArrayList Pokemons
    public ArrayList<Ataque> ataques; //ArrayList Ataques
    private Pokemon[] team = new Pokemon[3]; // esto que se puedan aceptar 3 pokemons 
    private int PokemonVivos = -1;//si el pokemon esta vivo o no.
    
    public Jugador(int ID) {
        this.ID = ID;
    }
    
    
    
    
  public Jugador() {
    pokemones = new ArrayList<>(3); //se inicia los arrayList que contendran 3 pokemones
    ataques = new ArrayList<>(); 
}
  public void addPokemon(Pokemon poke) {//esta sirve para añadir pokemones
    pokemones.add(poke);
    for (int i = 0; i < 3; i++) {//este Bucle for sirve para añadir el numero de pokemones que tendra el equipo, si cambiaramos el lenght del bucle se podrian añadir mas o menos pokemons
        if (team[i] == null) {//Revisa que cada espacio del array este vacio y si esta vacio hace que lo rellene con un pokemon que haya seleccionado el jugador
            team[i] = poke; //aqui lo añade al i que este se compondra de 0,1,2
            break;
        }
    }
}
 
    
    public Pokemon getPokemon(int pokedexnumber){
        for (Pokemon pokemon : pokemones) {
            if(pokemon.getPokedexnum() == pokedexnumber){
            return pokemon;
            }
            
        }
        return null;
    
    }

    public int getID(int i) {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setActivePokemon(int pokemonIndex) {//este servira para demostrar que el pokemon esta vivo o no, toma el indice que se encuentra en el Array;
        if (pokemonIndex >= 0 && pokemonIndex < team.length) { //esto servira para compara que el indice sea entre 0 a 2 (1,2,3)
            PokemonVivos = pokemonIndex;//aqui añades por el indice del pokemon en el Array
        }
    }

    public Pokemon getActivePokemon() {
        if (PokemonVivos != -1) {//si los pokemones estan en positivos y no son -1 hara que se pueda buscar la el pokemon que prefieres
            return team[PokemonVivos];//te añade el numero del indice del pokemon en el equipo
        } else {
            return null; 
        }
    }
}
    
    
   

    

