import java.util.Scanner;

public class Calculodecorrida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaração das variaveis
        String nome;
        int distancia;
        int tempo;
        int tipo_corrida;
        int horario_corrida;
        double valordistancia;
        double valortempo;
        double somatotal = 0;
        boolean horariopico = false;

        System.out.println("------ SISTEMA DE CALCULO DE CORRIDA ------     ");

        System.out.println("Nome do passageiro: ");
        nome = sc.nextLine();

        System.out.println("Distância (km): ");
        distancia = sc.nextInt();

        System.out.println("Tempo (minutos): ");
        tempo = sc.nextInt();

        System.out.println("Tipo da corrida (1 = Econômica | 2 = Executiva)");
        tipo_corrida = sc.nextInt();

        System.out.println("Horário da corrida (0 as 23): ");
        horario_corrida = sc.nextInt();

        // Tipo de corrida
        if (tipo_corrida == 1) {
            valordistancia = distancia * 2;
            valortempo = tempo * 0.50;
            somatotal = valordistancia + valortempo;
        }

        else if (tipo_corrida == 2) {
            valordistancia = distancia * 3.50;
            valortempo = tempo * 0.80;
            somatotal = valordistancia + valortempo;
        }

        if (horario_corrida >= 17 && horario_corrida <= 20) {
            somatotal *= 1.20;
            horariopico = true;
        }

        System.out.println("------ RESUMO DA CORRIDA ------           ");

        System.out.println("Nome do passageiro: " + nome);

        if (tipo_corrida == 1) {
            System.out.println("Corrida: Econômica");
        } else {
            System.out.println("Corrida: Executiva");
        }

        System.out.println("Distância: " + distancia + " km");
        System.out.println("Tempo: " + tempo + " minutos");

        if (horariopico) {
            System.out.println("Horário de pico: SIM (20% aplicado)");
        } else {
            System.out.println("Horário de pico: NÃO");
        }

        System.out.println("========================================");
        System.out.println("Valor Final: " + somatotal);
        System.out.println("========================================");

        sc.close();
    }
}