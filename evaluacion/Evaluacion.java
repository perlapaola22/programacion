/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion;

public class Evaluacion {

    public static void main(String[] args) {
        System.out.println("NOMBRE DEL ALUMNO 1: ");
        Student1 s1= new Student1("PERLA PAOLA PANTALEON BEDOLLA", 2001285,8.133172,"FISICA","CALCULO","ALGEBRA","INGLES","ELECTRONICA");
        System.out.println("\n...............EL NOMBRE DEL ESTUDIANTE 1 ES.................. ");
        System.out.println(s1.getName());
        System.out.println("\nLA MATRICULA DEL ESTUDIANTE 1 ES: ");
        System.out.println(s1.getMatricula());
        System.out.println("\nLA MATERIA 1 ES: ");
        System.out.println(s1.getSubject1());
        System.out.println("\nEL PROMEDIO FINAL DE LA MATERIA 1 ES: ");
        System.out.println(s1.getFinalScoreSubject1());
        System.out.println("\nLA MATERIA 2 ES: ");
        System.out.println(s1.getSubject2());
        System.out.println("\nEL PROMEDIO FINAL DE LA MATERIA 2 ES: ");
        System.out.println(s1.getFinalScoreSubject2());
        System.out.println("\nEL PROMEDIO FINAL DE LA MATERIA 3 ES: ");
        System.out.println(s1.getFinalScoreSubject3());
        System.out.println("\nEL PROMEDIO FINAL DE LA MATERIA 4 ES: ");
        System.out.println(s1.getFinalScoreSubject5());
        System.out.println("\nEL PROMEDIO FINAL DE LA MATERIA 3 ES: ");
        System.out.println(s1.getFinalScoreSubject5());
        System.out.println("\nEL PROMEDIO FINAL DEL SEMESTRE ES: ");
        System.out.println(s1.getFinalScore());
        System.out.println("EL ALUMNO1 HA APROBADO EL SEMESTRE!!!");
        
        
        //ALUMNO2
        Student2 s2 = new Student2("Juan Carlos Perez Garcia", 2001285,8.266651,"FISICA","CALCULO","ALGEBRA","INGLES","ELECTRONICA");
        System.out.println("\n.......................EL NOMBRE DEL ALUMNO 2 ES.................... ");
        System.out.println(s2.getName());
         System.out.println("\nLA MATRICULA DEL ESTUDIANTE 1 ES: ");
        System.out.println(s2.getMatricula());
        System.out.println("\nLA MATERIA 1 ES: ");
        System.out.println(s2.getSubject1());
        System.out.println("\nEL PROMEDIO FINAL DE LA MATERIA 1 ES: ");
        System.out.println(s2.getFinalScoreSubject1());
        System.out.println("\nLA MATERIA 2 ES: ");
        System.out.println(s2.getSubject2());
        System.out.println("\nEL PROMEDIO FINAL DE LA MATERIA 2 ES: ");
        System.out.println(s2.getFinalScoreSubject2());
        System.out.println("\nEL PROMEDIO FINAL DE LA MATERIA 3 ES: ");
        System.out.println(s2.getFinalScoreSubject3());
        System.out.println("\nPROMEDIO FINAL DE LA MATERIA 4 ES: ");
        System.out.println(s2.getFinalScoreSubject5());
        System.out.println("EL PROMEDIO FINAL DE LA MATERIA 3 ES: ");
        System.out.println(s2.getFinalScoreSubject5());
        System.out.println("\nEL PROMEDIO FINAL DEL SEMESTRE ES: ");
        System.out.println(s2.getFinalScore());
        System.out.println("\nEL ALUMNO 2 HA APROBADO EL SEMESTRE!!!");
        
        //PROFESOR 1
        Teacher1  t1 = new Teacher1("JOSE ORTIZ BEJAR","FISICA","CALCULO","ELECTRONICA","PROGRAMACION","METODOS NUMERICOS");
        System.out.println("\n..................EL NOMBRE DEL PROFESOR 1 ES:....................... ");
        System.out.println(t1.getName());
        System.out.println("\n LA MATERIA 1 ES: ");
        System.out.println(t1.getSubject1());
        System.out.println("\n LA MATERIA 2 ES: ");
        System.out.println(t1.getSubject2());
        System.out.println("\n LA MATERIA 3 ES: ");
        System.out.println(t1.getSubject3());
        System.out.println("\n LA MATERIA 4 ES: ");
        System.out.println(t1.getSubject4());
        System.out.println("\n LA MATERIA 5 ES: ");
        System.out.println(t1.getSubject5());
        
        //PROFESOR 2
        Teacher2  t2 = new Teacher2("VIOLETA MEDINA RIOS","REDES","ESTRUCTURAS DE DATOS","HERRAMIENTAS COMPUTACIONALES","PROGRAMACION I","MATEMATICAS DISCRETAS");
        System.out.println("\n..................EL NOMBRE DEL PROFESOR 1 ES:....................... ");
        System.out.println(t2.getName());
        System.out.println("\n LA MATERIA 1 ES: ");
        System.out.println(t2.getSubject1());
        System.out.println("\n LA MATERIA 2 ES: ");
        System.out.println(t2.getSubject2());
        System.out.println("\n LA MATERIA 3 ES: ");
        System.out.println(t2.getSubject3());
        System.out.println("\n LA MATERIA 4 ES: ");
        System.out.println(t2.getSubject4());
        System.out.println("\n LA MATERIA 5 ES: ");
        System.out.println(t2.getSubject5());
        //PROFESOR 3
        Teacher3  t3 = new Teacher3("OCTAVIO BARRIGA TORRES","CONTROL ANALOGICO","CALCULO","FISICA","LABORATORIO CONTROL ANALOGICO","ELECTRONICA");
        System.out.println("\n..................EL NOMBRE DEL PROFESOR 1 ES:....................... ");
        System.out.println(t3.getName());
        System.out.println("\n LA MATERIA 1 ES: ");
        System.out.println(t3.getSubject1());
        System.out.println("\n LA MATERIA 2 ES: ");
        System.out.println(t3.getSubject2());
        System.out.println("\n LA MATERIA 3 ES: ");
        System.out.println(t3.getSubject3());
        System.out.println("\n LA MATERIA 4 ES: ");
        System.out.println(t3.getSubject4());
        System.out.println("\n LA MATERIA 5 ES: ");
        System.out.println(t3.getSubject5());
        
    }
    
    
}
