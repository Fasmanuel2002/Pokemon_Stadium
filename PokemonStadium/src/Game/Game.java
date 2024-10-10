/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;
import Tipos.Pokemon;
import Tipos.*;
import java.util.ArrayList;
import vista.Builder;
import CreadorPokemones.*;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Game {
    
    private final ArrayList<Pokemon> pokemones; 
    private final ArrayList<Ataque> attack; 
    Scanner sc = new Scanner(System.in);
    private Jugador j1, j2;
    

    
    
    
    
    
    public Game(){
        pokemones = Builder.crearPokemones(); 
        attack = Builder.crearAtaque(); 
        j1 = new Jugador();
        j2 = new Jugador();
        
        
        
    }
    
    
    public void mostrarPokemon(){
        for (Pokemon pokemon : pokemones) { 
            System.out.println(pokemon);
           
            
        }
    
    }
    public void mostarAtaques(){
        for (Ataque ataques : attack) {
            System.out.println(ataques);
            
            
        }
    }
    
    public Pokemon choosePokemon(int pokedexnumber) throws CloneNotSupportedException{
        Pokemon p;
        Pokemon pClon = null;
        Jugador jugador = new Jugador();
        
                for (Pokemon pokemon : pokemones) {
                    if (pokemon.getPokedexnum() == pokedexnumber) {
                        p = pokemon;
                        jugador.addPokemon(p);
                        p = pokemon.clone();
                        pClon = p;
                        System.out.println("==================================");
                        System.out.println("You have choose this Pokemon: ");
                        System.out.println(pClon);
                        System.out.println("==================================");
                                for (Ataque ataques : attack) {
                                    if (ataques.getTypeataque() == pokemon.getType()) {
                                        System.out.println(ataques);
                                        p.aprenderAtaque(ataques);
                        }
                                    
                        }
                               
                        
                        
                    }
                    
                }
            
         
        
        return pClon;
        
    }
 
     
    
     public int fightPokemon(Jugador jugador1, Jugador jugador2) throws CloneNotSupportedException {//Fight Pelean
            
            jugador1.setActivePokemon(0); //Aquí se inicia el index del pokemon que comenzara en "0" debido a que el array es de 3(0,1,2) 
            jugador2.setActivePokemon(0); //Aquí se inicia el index del pokemon que comenzara en "0" debido a que el array es de 3(0,1,2) 
                    
            for (int i = 0;i < 3; i++) {
            Pokemon p1 = jugador1.getActivePokemon();//Consigue en que posicion estamos del Array y conseguira que pokemon peleara 
            Pokemon p2 = jugador2.getActivePokemon();//Consigue en que posicion estamos del Array y conseguira que pokemon peleara
            boolean turn1P1 = (p1.getSpeed() >= p2.getSpeed()); // Sera True si una de estas condicion 
            
            System.out.println(p1.getName() + " ============vs============ " + p2.getName());
            while(p1.getHp() >= 0 && p2.getHp() >= 0) {
             
                 
                if (turn1P1) {
                    
                        try{
                            System.out.println("Its the turn of: " + p1.getName());
                            DisplayAttacks(p1);
                            System.out.println("What attack do you want: ");
                            int id = sc.nextInt();
                            PerformAttack( id, p1, p2);
                        } catch(InputMismatchException e){
                            System.err.println("Error: Input is not an integer");
                            break;
                        } 
                            }
                else {
                    try{
                            System.out.println("Its the turn of: \t" + p2.getName());
                            DisplayAttacks(p2);
                            System.out.println("What attack do you want: \t");
                            int id2 = sc.nextInt();
                            PerformAttack(id2, p2, p1);
                            } catch(InputMismatchException e){
                            System.err.println("Error: Input is not an integer");
                            break;
                       
                        } 
                    }
                
                if (p1.getSpeed() == p2.getSpeed()) {
                    
                if (Math.random() < 0.5) {
                    System.out.println("It's a tie in speed!!  " + p1.getName() + " attacks!");
                    DisplayAttacks(p1);
                    System.out.println("What attack do you want: ");
                    int id = sc.nextInt();
                    PerformAttack(id, p1, p2);
                } else {
                    System.out.println("It's a tie in speed!!"  + p2.getName() + " attacks!");
                    DisplayAttacks(p2);
                    System.out.println("What attack do you want: ");
                    int id = sc.nextInt();
                    PerformAttack(id, p2, p1);
                
                }
                } else  turn1P1 = !turn1P1;

               
                if (p1.getHp() <= 0 || p2.getHp() <= 0) {
                break;
            } 
            }
                if (p1.getHp() <= 0) {
                    jugador1.setActivePokemon(i + 1);
                    
                }
                if (p2.getHp() <= 0) {
                    jugador2.setActivePokemon(i + 1);
                    
                }
            
            
           
            
         }
                           
            
          return 0;
             
            }
           
       
           
         
      
     public void DisplayAttacks(Pokemon pokemon){//Demostrara los ataques por pokemon
         System.out.println("Attacks: \t");
         
         for (Ataque ataque : attack) {
             if (ataque.getTypeataque() == pokemon.getType()) {
                System.out.println(ataque);
                 
             }
             
         }
     
     }
     private void PerformAttack(int id, Pokemon pAttacker, Pokemon pDefender){//Esta funcion servira para que que se haga el daño al pokemon, recibira el pokemon que ataca y uno que defiende
         
         
                    int damage = pDefender.getDamage(pAttacker.getAttack(id), pAttacker);
                    pDefender.setHp( pDefender.getHp() - damage); 
                    System.err.println(pDefender.getName() + " has this hp left: " + pDefender.getHp() + "!");
                    if (pDefender.getHp() <= 0) {
                       System.out.println(pAttacker.getName() + " Wins!");
                      }  

                     
                 }
                  
             
         
         
    
     
     }
     
     

