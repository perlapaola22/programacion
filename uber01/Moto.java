/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uber01;

import java.awt.Color;

public class Moto extends Vehicle {
    String matricula;
    
    
    public Moto(String matricula, Color color, String model){
        super(matricula,color,model);
        this.color = color;
        this.maticula = matricula;
        this.model = model;
        
    }
    public String getModel(){
        return model;
    }
    public String matricula(){
        return matricula;
    }

}
