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

public class PokemonPlanta extends Pokemon{
    
            
    public PokemonPlanta(int pokedexnum, String name, int hp, int attack, float defense, int speed) {
        super(pokedexnum, name, Tipo.PLANTA, hp, attack, defense, speed); //Aqui hace que el pokemon sea de Tipo PLANTA
    }
    
    
@Override
    public int getDamage(Ataque ataque, Pokemon pAtaque) {
        
        
        int totalDamage = super.getDamage(ataque, pAtaque);

            if (ataque.getTypeataque()== Tipo.FUEGO) {
                 totalDamage *= 2;
                System.out.println("Super Effective!!!! ");
            
    }
            if ((ataque.getTypeataque() == Tipo.AGUA)) {
                 totalDamage *= 0.5;
                System.out.println("Non effective!!!! ");
                
            
        }
        return totalDamage;      
}
}