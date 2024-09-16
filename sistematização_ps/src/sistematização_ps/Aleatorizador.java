package sistematização_ps;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Aleatorizador {

    private List<String> elementos;

    public Aleatorizador() {
        this.elementos = new ArrayList<>();
    }

    public void adicionarElemento(String elemento) {
        this.elementos.add(elemento);
    }

    public String sortearElemento() {
        if (elementos.isEmpty()) {
            return "Nenhum elemento foi adicionado.";
        }
        Random random = new Random();
        int index = random.nextInt(elementos.size());
        return elementos.get(index);
    }

    public int sortearNumeroEntre(int inicio, int fim) {
        Random random = new Random();
        return random.nextInt((fim - inicio) + 1) + inicio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aleatorizador aleatorizador = new Aleatorizador();

        System.out.println("Qual o tipo de sorteio?");
        System.out.println("1 - Sequência");
        System.out.println("2 - Grupos de elementos");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Digite o início da sequência:");
            int inicio = scanner.nextInt();

            System.out.println("Digite o fim da sequência:");
            int fim = scanner.nextInt();

            int numeroSorteado = aleatorizador.sortearNumeroEntre(inicio, fim);
            System.out.println("Número sorteado: " + numeroSorteado);

        } else if (escolha == 2) {
            scanner.nextLine(); 
            System.out.println("Digite os elementos (separados por vírgula):");
            String input = scanner.nextLine();
            String[] elementos = input.split(",");

            for (String elemento : elementos) {
                aleatorizador.adicionarElemento(elemento.trim());
            }

            String elementoSorteado = aleatorizador.sortearElemento();
            System.out.println("Elemento sorteado: " + elementoSorteado);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}