/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author PERLA
 */
public class Herencia {

   
    public static void main(String[] args) {
       //Estudiante estudiante = new Estudiante();
       //estudiante.mostrarDatos();
       
    }
    
}


    class Persona{
        private String nombre;
        private String apellidos;
        private int edad;
        
        public Persona(String nombre, String apellidos, int edad){
            this.nombre=nombre;
            this.apellidos=apellidos;
            this.edad=edad;
        }
        public String getNombre(){
            return nombre;
        }
        public String getApellidos(){
            return apellidos;
        }
        public int getEdad(){
            return edad;
        }
}

    class Estudiante extends Persona{
        private int codigoEstudiante;
        private float notaFinal;
        
        public Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal){
            super(nombre, apellidos, edad);
            this.codigoEstudiante=codigoEstudiante;
            this.notaFinal=notaFinal;
        }
        public void mostrarDatos(){
            System.out.println("Nombre: "+getNombre()+"\nApellidos: "+getApellidos()+"\nEdad: "+
                    "\nCodigo de estudiante: "+codigoEstudiante+"\nLa nota final es: "+notaFinal);
        }
    }
