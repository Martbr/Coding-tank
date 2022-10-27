import java.util.Scanner;

public class medias {
    public static void main(String[] args) {
        int qtd = 0;
        float medArit = 0;
        double aux, medHar = 0;

        Scanner sc = new Scanner(System.in);
        String select = "harmonica aritimetica sair";
        System.out.println("Ola user, qual tipo de media voce gostaria de realizar? harmonica ou aritimetica. Para sair digite sair ");
        String option = sc.next();

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
            System.out.println("A media aritimetica e: "+medArit);

        }if (option.equals("harmonica")){
        int qtde;
            System.out.println("digite a quantidade de numeros inteiros a serem calculados: ");
            qtde = sc.nextInt();
            int [] numeros = new int[qtde];
            for (int i=0 ; i < numeros.length ; i++){
                System.out.println("Digite o numero "+i);
                numeros[i] = sc.nextInt();
                aux = (1.0 / numeros[i]);
                medHar = medHar + aux;

                System.out.println("valor aux "+ aux);
            }
            medHar = (qtde/medHar);
            System.out.println("A media harmonica e: "+medHar);
        }
    }
}