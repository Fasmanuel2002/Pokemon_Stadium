/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipos;

/**
 *
 * @author administrador
 */


import CreadorPokemones.Ataque;
import java.util.ArrayList;


public class PokemonRayo extends Pokemon{
    private ArrayList<Pokemon> pokemones;
    
            
    public PokemonRayo(int pokedexnum, String name, int hp, int attack, float defense, int speed) {
        super(pokedexnum, name, Tipo.RAYO, hp, attack, defense, speed);//Aqui hace que el pokemon sea de Tipo RAYO
    }
    
    

    @Override
    public int getDamage(Ataque ataque, Pokemon pAtaque) {
        
        
        int totalDamage = super.getDamage(ataque, pAtaque);
        return totalDamage; 
      
        }
             
}
