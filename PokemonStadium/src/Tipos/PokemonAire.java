/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipos;

/**
 *
 * @author administrador
 */


import java.util.ArrayList;
import CreadorPokemones.Ataque;

public class PokemonAire extends Pokemon{
    private ArrayList<Pokemon> pokemones;
   
    
            
    public PokemonAire(int pokedexnum, String name, int hp, int attack, float defense, int speed) {
        super(pokedexnum, name, Tipo.AIRE, hp, attack, defense, speed);//Aqui hace que el pokemon sea de Tipo AIRE
    }
    
    
    
    
 
 @Override
    public int getDamage(Ataque ataque, Pokemon pAtaque) {
        
        
        int totalDamage = super.getDamage(ataque, pAtaque);

            if (ataque.getTypeataque()== Tipo.RAYO) {
                 totalDamage *= 2;
                System.out.println("Super Effective!!!! ");
            
    }
            
        return totalDamage;      
}
    
    
}