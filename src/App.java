import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {




    System.out.print("digite a nota (0 a 100): ");


    byte nota;

    Scanner conceito = new Scanner(System.in);


    while (true) {


        if (conceito.hasNextByte()) {
            nota = conceito.nextByte();
        } else{
             System.out.print("nota invalida.");
             conceito.next();
             continue;
        }
       

        if (nota < 0 || nota > 100) {
            System.out.print("nota invalida. digite novamente:" + System.lineSeparator());

        }   else if (nota >= 90 && nota == 100) {
        System.out.print("Conceito: A");
            break;

        }   else if (nota >= 90 && nota == 100) {
        System.out.print("Conceito: A");
            break;

        }   else if (nota >= 75 && nota < 90) {
            System.out.print("Conceito: B");
            break;

        }   else if (nota >= 60 && nota < 75)   {
                System.out.print("Conceito: C");
            break;

        }   else if (nota < 60 ) {
                    System.out.print("Conceito: D(reprovado)");
            break;
            }


            
        
        }
        conceito.close();
    }
}




