/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesYObjetos;

public class Operacion {
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    
    
    
    
    //metodos
    public void LeerNumeros(){
        numero1=Integer.parseInt(JoptionPane.showDialog("DIGITA UN NUMERO: "));

    }
    public void Sumar(){
        suma = numero1+numero2;
    }
    public void Restar(){
        suma = numero1-numero2;
    }
    public void Multiplicar(){
        suma = numero1*numero2;
    }
    public void Dividir(){
        suma = numero1/numero2;
    }
    public void MostrarResultados(){
        System.out.println("La SUMA es: "+suma);
        System.out.println("La RESTA es: "+resta);
        System.out.println("La MULTIPLICACION es: "+multiplicacion);
        System.out.println("La DIVISION es: "+division);
    }


}
