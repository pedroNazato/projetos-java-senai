package exercicios;

import java.util.Scanner;

public class n7 {
    static void main() {
        Scanner input = new Scanner(System.in);

        int nota = 0; double somaNotas = 0; int contador = 0; int matricula = 0;
        double media = 0;

        do {

            System.out.print("INFORME A MATRÍCULA DO ALUNO: ");
            matricula = input.nextInt();

            if(matricula<=0){
                continue;
            }

            for (int i = 1; i <= 3; i++) {
                System.out.print("INFORME A NOTA DA PROVA "+i+": ");
                nota = input.nextInt();

                somaNotas += nota;

            }

            media = somaNotas/3;

            System.out.println("MÉDIA DO ALUNO MATRÍCULA "+matricula+": "+media);

            somaNotas = 0;

        }   while(matricula>=1);

    }
}
