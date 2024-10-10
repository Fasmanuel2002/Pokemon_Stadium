/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreadorPokemones;

import Tipos.Tipo;

/**
 *
 * @author administrador
 */
public class Ataque {
    private int id;
    private String nombre_ataque;
    private Tipo typeataque; 
    private int dano;
    
    public Ataque(int id, String nombre_ataque, Tipo typeataque,int dano){
    this.id = id;
    this.nombre_ataque = nombre_ataque;
    this.typeataque = typeataque;
    this.dano = dano;
    
    }

    
    

    public String getNombre_ataque() {
        return nombre_ataque;
    }

    public int getDano() {
        return dano;
    }
    

    public Tipo getTypeataque() {
        return typeataque;
    }

    public void setNombre_ataque(String nombre_ataque) {
        this.nombre_ataque = nombre_ataque;
    }

    public void setTypeataque(Tipo typeataque) {
        this.typeataque = typeataque;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getId() {
        return id;
    }
    
    

    @Override
    public String toString() {
        
        return "->" + id + "\t" +
                "Attack: " + nombre_ataque + "\t" + 
                "damage: " + dano;
    }

   
 
    
}
