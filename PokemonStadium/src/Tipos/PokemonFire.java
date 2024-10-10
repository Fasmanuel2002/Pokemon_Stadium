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

public class PokemonFire extends Pokemon{
    private ArrayList<Pokemon> pokemones;
    
            
    public PokemonFire(int pokedexnum, String name, int hp, int attack, float defense, int speed) {
        super(pokedexnum, name, Tipo.FUEGO, hp, attack, defense, speed);////Aqui hace que el pokemon sea de Tipo FUEGO
    }
    
    
@Override
    public int getDamage(Ataque ataque, Pokemon pAtaque) {
        
        
        int totalDamage = super.getDamage(ataque, pAtaque);

            if (ataque.getTypeataque()== Tipo.AGUA) {
                 totalDamage *= 2;
                System.out.println("Super Effective!!!! ");
            
    }
            if ((ataque.getTypeataque() == Tipo.PLANTA)) {
                 totalDamage *= 0.5;
                System.out.println("Non effective!!!! ");
                
            
        }
        return totalDamage;      
}

}    