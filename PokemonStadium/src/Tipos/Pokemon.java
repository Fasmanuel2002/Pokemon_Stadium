/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipos;


import CreadorPokemones.Ataque;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author administrador
 */
public abstract class Pokemon implements Cloneable{
    private final int pokedexnum;
    private final String name;
    protected Tipo type; 
    protected int hp;
    protected int attack;
    protected double defense;
    private final int speed;
    private ArrayList<Ataque> attacks; 
    

    public Pokemon(int pokedexnum, String name, Tipo type, int hp, int attack, double defense, int speed) { 
        this.pokedexnum = pokedexnum;
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.attacks = new ArrayList<>();//ArrayList de los ataques 

    }

    public int getPokedexnum() {
        return pokedexnum;
    }
    
   
public void aprenderAtaque (Ataque ataque) {//aprender ataque , 4
    if (attacks.size() < 4) {
        attacks.add(ataque);
    } else {
        
    }
    
    
}

    public ArrayList<Ataque> getAttacks() {
        return attacks;
    }

 public int getDamage(Ataque ataque, Pokemon pAtaque){
    int damage = ataque.getDano();//es el daño del ataque
    return (int) (((damage * pAtaque.attack)/2)/defense);//formula para hacer daño a los pokemones, sacado de pagina oficial de Pokemon
    
 }

   
    

    

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

 

    

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Tipo getType() {
        return type;
    }

    public Tipo getType(Tipo type){
        return type;
    }

    public int getHp() {
        return hp;
    }
    
    public double getDefense(){
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public ArrayList<Ataque> getAtaque() {
        return attacks;
    }

    public void setAtaque(ArrayList<Ataque> attacks) {
        this.attacks = attacks;
    }
    
    public Ataque getAttack(int id){
        id--;
        return this.attacks.get(id);//Consigue en que posicion del array esta el pokemon
    }
    
  

    @Override
    public String toString() {
    return 
       "Pokedex Number: " + pokedexnum + "\n" 
        +    " Name: " + " - " + name  + "\n" 
        + " Is this type: " + type.getEmoji()  + "\n" 
        + " Has this hp: " + hp  + "\n "
        + " Has this attack: " + attack + "\n "
        + " Has this defense: " + defense + "\n "
        + " Has this speed: " + speed + "\n ";    }
   
    
    
    
 
    @Override
    public Pokemon clone() throws CloneNotSupportedException   {
        try {
            return (Pokemon)super.clone(); 
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Pokemon.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
    }
}

    