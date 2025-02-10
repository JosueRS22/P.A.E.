import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Ingrese número de candidatos:");
        int candidatos = scanner.nextInt();

        int[] votos = new int[candidatos];
        int totalVotos = 0;

        System.out.println("Ingrese el número del candidato para votar. Para terminar, ingrese 0.");
        
        while (true) {
            System.out.print("Ingrese el número del candidato: ");
            int candidato = scanner.nextInt();

            if (candidato == 0) {
                break;
            }

            if (candidato < 1 || candidato > candidatos) {
                System.out.println("Número de candidato no válido. Intente nuevamente.");
                continue;
            }
            
            votos[candidato - 1]++;
            totalVotos++;
        }

        System.out.println("\nPorcentaje de votos por candidato:");
        for (int i = 0; i < candidatos; i++) {
            double porcentaje = (votos[i] * 100.0) / totalVotos;
            System.out.printf("Candidato %d: %.2f%% de los votos\n", i + 1, porcentaje);
        }
    }
}
