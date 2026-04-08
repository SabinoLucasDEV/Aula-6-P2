public class Main {
    public static void main(String[] args) {
        String x = "Sabino";
        String y = "sabino";

        if(x.equals(y)){
            System.out.println("nomes iguais");
        }
        else{
            System.out.println("nomes diferente");
        }

        if(x.equalsIgnoreCase(y)){
            System.out.println("nomes iguas");
        }
        else {
            System.out.println("nomes diferentes");
        }
        int z = x.length();
        System.out.println("a primeira palavra tem: " + z + " letras");
    }
}