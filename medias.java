/*Condições de quebra e/ou divisão por 0:
Tamanho do vetor = -1 (-5)
Tamanho do vetor = 0 / Divisão por 0 (-5)
Tamanho do vetor = qwe (-5)
Tamanho do vetor = 1,2 (-5)
Com tipo operação diferente ele não solicita para digitar novamente (-5)
Número = qwe (-5)
Número = 1,5 (-5)
Número = 0 / Divisão por 0(-5)
*/

import java.util.Scanner;

public class medias {
    public static void main(String[] args) {
        int qtd = 0;
        float medArit = 0;
        double aux, medHar = 0;
        String select = "harmonica aritimetica sair";
        Scanner sc = new Scanner(System.in);

        //não sei pq mas ele entra no IF, então tem que digitar a opcao 2 vezes

        System.out.println("Ola user,qual tipo de media voce gostaria de realizar? harmonica ou aritimetica. Para sair digite sair ");
        String option = sc.next();

       if(!option.equals("sair") || !option.equals("harmonica") || !option.equals("aritimetica")){
           System.out.println("Digite uma opcao correta: aritimetica, harmonica ou sair");
           option = sc.next();
       }



        if (option.equals("aritimetica")){
        int qtde;
            System.out.println("digite a quantidade de numeros inteiros a serem calculados: ");
            qtde = sc.nextInt();
            int [] numeros = new int[qtde];
            for (int i=0 ; i < numeros.length ; i++){
                System.out.println("Digite o numero "+i);
                numeros[i] = sc.nextInt();
                medArit = medArit + numeros[i];
            }
            medArit = (medArit/qtde);
            System.out.println("Numeros digitados: ");
            for (int i=0 ; i < numeros.length ; i++){
            System.out.println(" " +numeros[i]);}
            System.out.println("A media aritimetica e: "+medArit);


        }else if (option.equals("harmonica")){
        int qtde;
            System.out.println("digite a quantidade de numeros inteiros a serem calculados: ");
            qtde = sc.nextInt();
            int [] numeros = new int[qtde];
            for (int i=0 ; i < numeros.length ; i++){
                System.out.println("Digite o numero "+i);
                numeros[i] = sc.nextInt();
                aux = (1.0 / numeros[i]);
                medHar = medHar + aux;

            }
            medHar = (qtde/medHar);
            System.out.println("Numeros digitados: ");
            for (int i=0 ; i < numeros.length ; i++){
                System.out.println(" " +numeros[i]);}
            System.out.println("A media aritimetica e: "+medHar);


        }else System.out.println("Obrigado e ate a proxima! ");
    }
}
