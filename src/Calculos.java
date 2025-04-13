import java.util.Scanner;

public class Calculos {
    Scanner scanner = new Scanner(System.in);

    double numero1 = 0.00;
    double numero2 = 0.00;
    double resultado = 0.00;
    double resto = 0.00;

    public void Soma(){
        System.out.println("Digite o primeiro número:");
        numero1 = scanner.nextDouble();
        System.out.println("Digite o primeiro número:");
        numero2 = scanner.nextDouble();

        resultado = numero1 + numero2;
        System.out.println("Numeros digitados: " + numero1 + " e " + numero2);
        System.out.println("Resultado da soma: " + resultado);

    };

    public void Sub(){
        System.out.println("Digite o primeiro número:");
        numero1 = scanner.nextDouble();
        System.out.println("Digite o primeiro número:");
        numero2 = scanner.nextDouble();

        resultado = numero1 - numero2;
        System.out.println("Numeros digitados: " + numero1 + " e " + numero2);
        System.out.println("Resultado da subtração: " + resultado);
    };

    public void Mult(){
        System.out.println("Digite o primeiro número:");
        numero1 = scanner.nextDouble();
        System.out.println("Digite o primeiro número:");
        numero2 = scanner.nextDouble();

        resultado = numero1 * numero2;
        System.out.println("Numeros digitados: " + numero1 + " e " + numero2);
        System.out.println("Resultado da multiplicação: " + resultado);
    };

    public void Div(){
        System.out.println("Digite o primeiro número:");
        numero1 = scanner.nextDouble();
        System.out.println("Digite o primeiro número:");
        numero2 = scanner.nextDouble();

        if (numero2 != 0) {
            resultado = numero1 / numero2;
            resto = numero1 % numero2;
            System.out.println("Números digitados: " + numero1 + " e " + numero2);
            System.out.println("Resultado da divisão: " + resultado);
            System.out.println("Resto da divisão: " + resto);
        } else {
            System.err.println("Erro: Divisão por zero não é permitida.");
            Div();
        }
    };
}
