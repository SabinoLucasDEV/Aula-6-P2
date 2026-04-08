import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Digite a frase: ");
        String frase = sc.nextLine();
        System.out.println("digite a palavra de deseja buscar");
        String bucar = sc.nextLine();
        int posicao = frase.indexOf(bucar);

        if(posicao != -1) {
            System.out.println("a palavra aparece na posição: " + posicao);

        }
        else{
            System.out.println("a palavra não foi encontrada ");
        }

    }
}