package controleFluxo;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o Primeiro Pârametro:");
        int parametro1 = scanner.nextInt();
        System.out.println("Digite o Segundo Pârametro:");
        int parametro2 = scanner.nextInt();
        
        try{
            
           
            contar(parametro1,parametro2);
            
        }
        catch(ParametrosInvalidosException e) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

    }
    
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if (parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        }

        int ocorrencias =  parametro2 - parametro1;

        for (int numero = 0; numero < ocorrencias; numero ++){
            System.out.println("Imprimindo o número " + (numero+1));
        }

    }
    
}
