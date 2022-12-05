/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion;


public class Teacher1 extends Subject {
    String name;
    public Teacher1(String name,String subject1,String subject2,String subject3,String subject4,String subject5){
        super(subject1,subject2,subject3,subject4,subject5);
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String getSubject1(){
        return subject1;
    }
    public String getSubject2(){
        return subject2;
    }
    public String getSubject3(){
        return subject3;
    }
    public String getSubject4(){
        return subject4;
    }
    public String getSubject5(){
        return subject5;
    }
    
    
}
