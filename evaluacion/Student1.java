/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion;

public class Student1 extends Subject {
    String name;
    int matricula;
    double score1;
    double score2;
    double score3;
    double score4;
    double score5;
    double finalScore;
    
   
    
    public Student1(String name, int matricula,  double finalScore,String subject1,String subject2,String subject3,String subject4,String subject5){
        super(subject1,subject2,subject3,subject4,subject5);
        this.name=name;
        this.matricula=matricula;
        this.finalScore=finalScore;
        
    }
    public String getName(){
        return name;
    }
    public int getMatricula(){
        return matricula;
    }
    
    
   // @Override
    public String getSubject1(){
        score1=9;
        score2=9;
        score3=9;
        
        return subject1;
    }
    public double getFinalScoreSubject1 (){
        double finalScoreSubject1 =(score1 + score2 + score3)/3;
        return finalScoreSubject1;
    }
    
    //@Override
    public String getSubject2(){
        return subject2;
    }
    public double getFinalScoreSubject2(){
        score1=5;
        score2=7;
        score3=2;
        double finalScoreSubject2 =(score1 + score2 + score3)/3;
        return finalScoreSubject2;
    }
    //@Override
    public String getSubject3(){
        return subject3;
    }
    public double getFinalScoreSubject3(){
        score1=7;
        score2=7;
        score3=9;
        double finalScoreSubject3 =(score1 + score2 + score3)/3;
        return finalScoreSubject3;
    }
    //@Override
    public String getSubject4(){
        return subject4;
    }
    public double getFinalScoreSubject4(){
        score1=9;
        score2=9;
        score3=9;
        double finalScoreSubject4 =(score1 + score2 + score3)/3;
        return finalScoreSubject4;
    }
    
   // @Override
    public String getSubject5(){
        return subject5;
    }
    public double getFinalScoreSubject5(){
        score1=10;
        score2=10;
        score3=9;
        double finalScoreSubject5 =(score1 + score2 + score3)/3;
        return finalScoreSubject5;
    }
    public double getFinalScore(){
        score1=9;
        score2=4.66666666;
        score3=7.66666666;
        score4=9.66666666;
        score5=9.66666666;
        double finalScoreSubject5 =(score1 + score2 + score3 + score4+score5)/5;
        return finalScore;
    }
    
}


