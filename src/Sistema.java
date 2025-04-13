import java.util.Scanner;

public class Sistema {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculos calc = new Calculos();

        int opcao = 0;

            do {
                System.out.println("\n === Menu ===");
                System.out.println("1. Somar.");
                System.out.println("2. Subtrair");
                System.out.println("3. Multiplicar.");
                System.out.println("4. Dividir.");
                System.out.println("5. Sair.");
                opcao = scanner.nextInt();

                switch (opcao){
                    case 1:
                        System.out.println("Opção escolhida: 1. Somar");
                        calc.Soma(); // chamada da função Soma()
                        break;
                    case 2:
                        System.out.println("Opção escolhida: 2. Subtrair");
                        calc.Sub(); // chamada da função Sub()
                        break;
                    case 3:
                        System.out.println("Opção escolhida: 3. Multiplicar");
                        calc.Mult(); // chamada da função Mult()
                        break;
                    case 4:
                        System.out.println("Opção escolhida: 4. Dividir");
                        calc.Div(); // chamada da função Div()
                        break;
                    case 5:
                        System.out.println("Opção escolhida: 5. Sair");
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 5);

            scanner.close();
        }

}
