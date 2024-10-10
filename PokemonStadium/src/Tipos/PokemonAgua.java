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


public class PokemonAgua extends Pokemon {
   

    public PokemonAgua(int pokedexnum, String name, int hp, int attack, float defense, int speed) {
        super(pokedexnum, name, Tipo.AGUA, hp, attack, defense, speed);//Aqui hace que el pokemon sea de Tipo AGUA
        
        
    }

    @Override
    public int getDamage(Ataque ataque, Pokemon pAtaque) {
        
        
        int totalDamage = super.getDamage(ataque, pAtaque);

            if ((ataque.getTypeataque()== Tipo.RAYO) || (ataque.getTypeataque() == Tipo.PLANTA)) {
                 totalDamage *= 2;
                System.out.println("Super Effective!!!! ");
            
    }
            if ((ataque.getTypeataque() == Tipo.FUEGO)) {
                 totalDamage *= 0.5;
                System.out.println("Non effective!!!! ");
                
            
        }
        return totalDamage;      
}
    
}