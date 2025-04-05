import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro numero");
        int numero1 = sc.nextInt();
        System.out.println("Insira o segundo numero");
        int numero2 = sc.nextInt();


        try {
            contar(numero1,numero2);
        } catch (Exception MinhaExcecao) {
            System.out.println(MinhaExcecao.getMessage());;
        }

    }

    static void contar(int primeiro, int segundo) throws Exception{
        if (primeiro > segundo){
            throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
        }else{
            int contagem = segundo - primeiro;
            for (int i = 1;i <= contagem ; i++) {
                System.out.println(i);
            }
        }
    }

}