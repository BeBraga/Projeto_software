package sistematização_ps;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Aleatorizador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<String> elementos = new ArrayList<>();
        String entrada;
        
        System.out.println("Digite os elementos que deseja adicionar para o sorteio (digite 'fim' para parar):");
        
        while (true) {
            System.out.print("Elemento: ");
            entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            elementos.add(entrada);
        }
        
        if (elementos.isEmpty()) {
            System.out.println("Nenhum elemento foi inserido para o sorteio.");
        } else {
            int indiceSorteado = random.nextInt(elementos.size());
            String elementoSorteado = elementos.get(indiceSorteado);
            System.out.println("O elemento sorteado foi: " + elementoSorteado);
        }
        
        scanner.close();
    }
}
