package edu.srg.primeirasemana;
import java.util.Scanner;

public class BoletinALuno {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro nota: ");
        double nota1 = scanner.nextDouble ();

        System.out.print("Digite o primeiro nota: ");
        double nota2 = scanner.nextDouble ();

        double mediaAluno = NotaMedia(nota1,nota2);
        
        if (mediaAluno > 6.0)
            System.out.print("Aluno Aprovado");

        else if (mediaAluno == 6.0)
            System.out.print("Aluno em Recuperação");

        else 
            System.out.print("Aluno Reprovado");

        scanner.close();  
    }
    public static double NotaMedia(double nota1, double nota2){
        return ((nota1+ nota2)/2);
        
    }
    
}
