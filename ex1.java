mport java.util.Scanner;

public class ex1 {

    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            Double h, bMaior, bMenor, area; 

            System.out.println("********* Dados **********"); 

            System.out.print("Digite a altura: ");
            
            h = entrada.nextDouble();

            System.out.print("Digite a base menor: ");
           
            bMenor = entrada.nextDouble();

            System.out.print("Digite a base maior: ");
           
            bMaior = entrada.nextDouble();
            
            area = (h * (bMenor + bMaior)) / 2;

            System.out.println("========= Resultados ========="); 
            
            System.out.println("Altura: " + h); 
            
            System.out.println("Base maior: " + bMenor); 
            
            System.out.println("Base menor: " + bMaior); 
           
            System.out.println("A area é: " + area); 
        }
    }

}
