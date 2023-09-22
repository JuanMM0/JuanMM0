import java.util.Scanner;

public class TesteMoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        moto yamaha = new moto();
        yamaha.velocidadeMaxima = 120;
        yamaha.velocidadeAtual = 25;

        moto honda = new moto();
        honda.velocidadeMaxima = 110;
        honda.velocidadeAtual = 20;

        moto suzuki = new moto();
        suzuki.velocidadeMaxima = 100;
        suzuki.velocidadeAtual = 15;

        System.out.println("Escolha uma moto (1-Yamaha, 2-Honda, 3-Suzuki): ");
        int escolha = scanner.nextInt();

        moto motoSelecionada = null;

        switch (escolha) {
            case 1:
                motoSelecionada = yamaha;
                break;
            case 2:
                motoSelecionada = honda;
                break;
            case 3:
                motoSelecionada = suzuki;
                break;
            default:
                System.out.println("Opção inválida. Saindo do programa.");
                System.exit(0);
        }

        System.out.println("Velocidade atual da moto selecionada: " + motoSelecionada.velocidadeAtual);

        System.out.println("Quanto você gostaria de acelerar a moto?");
        double quantidadeAceleracao = scanner.nextDouble();

        int resultado = motoSelecionada.acelerar(quantidadeAceleracao);

        if (resultado == 0) {
            System.out.println("A moto capotou!");
        } else {
            System.out.println("Nova velocidade da moto: " + motoSelecionada.velocidadeAtual);
        }

        scanner.nextLine(); // Limpar o buffer
        System.out.println("Qual o tipo de combustível utilizado na moto (Gasolina/Alcool)?");
        String tipoCombustivel = scanner.nextLine();

        System.out.println("Tipo de combustível selecionado: " + tipoCombustivel);

        motoSelecionada.buzinar();

        motoSelecionada.desligar();

        scanner.close();
    }
}
