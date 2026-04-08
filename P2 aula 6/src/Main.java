import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = 0;
        System.out.print("digite a primeiro palavra: ");
        String x = sc.nextLine();
        System.out.print("digite a segunda palvra: ");
        String y = sc.nextLine();

        if(x.equals(y)){
            System.out.println("nomes iguais");
        }
        else{
            System.out.println("nomes diferente");
        }

        if(x.equalsIgnoreCase(y)){
            System.out.println("nomes iguas com maisculo e minusculo");
        }
        else {
            System.out.println("nomes diferentes com maiusculo e minusculo");
        }
        System.out.print("qual palavra deseja ver a quantidade de caracteres(1/2)?");

       int z = sc.nextInt();
        if(z == 1){
             n = x.length();
        }
        else if (z == 2) {
             n = y.length();
        }
        else{
            System.out.println("numero invalido");
        }
        System.out.println("a primeira palavra tem: " + n + " letras");
    }
}