/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1064676460
 */
public class Perro {
    
    private String Nombre;
    private String Raza;
    
    //constructor no parametrizaado
    
    public Perro(){
    }
    
    //constructor parametrizado
     public Perro(String Nombre, String Raza) {
         
         
         
         this.Nombre=Nombre;
         this.Raza=Raza;
     }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }
     
        
     }