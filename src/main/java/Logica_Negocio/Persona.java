/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1064676460
 */
public class Persona {
    
   //Atributos
    private String Identificacion;
    private String Nombre;
    private ArrayList<Perro>lsperros;//Aqui se realiza la asociacion
    
    //constructor no parametrzado
    public Persona(){
        
    }
    //constructor no parametrizado
     public Persona(String Identificacion, String Nombre,ArrayList<Perro>lsperros ) {
         
         
         
         this.Identificacion=Identificacion;
         this.Nombre=Nombre;
        this.lsperros=lsperros;
         
   
    


     }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Perro> getLsperros() {
        return lsperros;
    }

    public void setLsperros(ArrayList<Perro> lsperros) {
        this.lsperros = lsperros;
    }
}
     