import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("QUESTÃO 1");
        int INDICE = 13, SOMA = 0, K = 0;
        while (K< INDICE){
            K+=1;
            SOMA+=K;
        }
        System.out.println("O valor da variável SOMA será: "+SOMA);

        System.out.println("----------------------------------------------------");
        System.out.println("QUESTÃO 2");

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número interio para testar a questão 2: ");
        int n = scan.nextInt();
        Questao2.fibonacci(n);

        System.out.println("----------------------------------------------------");
        System.out.println("QUESTÃO 3");
        System.out.print("a) 1, 3, 5, 7, ___ \n R:9" +
                "\n" +
                "b) 2, 4, 8, 16, 32, 64, ____ \n R:128" +
                "\n" +
                "c) 0, 1, 4, 9, 16, 25, 36, ____ \n R:49" +
                "\n" +
                "d) 4, 16, 36, 64, ____ \n R:100" +
                "\n" +
                "e) 1, 1, 2, 3, 5, 8, ____ \n R:13" +
                "\n" +
                "f) 2,10, 12, 16, 17, 18, 19, ____ \n R:200" +
                "\n");

        System.out.println("----------------------------------------------------");
        System.out.println("QUESTÃO 4");

        System.out.println("No instante em que eles se cruzam na rodovia, ambos estão no mesmo ponto da pista, sendo assim, também estão à mesma distancia de Ribeirão preto. Um não está mais perto do que o outro de Ribeirão Preto, pois eles se encontram no mesmo local naquele dado instante");

        System.out.println("----------------------------------------------------");
        System.out.println("QUESTÃO 5");
        System.out.println("Digite qualquer coisa e veja como ela ficará com os caracteres invertidos: ");
        String normal = scan.next();
        String invertida = Questao5.inverterStrings(normal);
        System.out.println(invertida);

    }
}