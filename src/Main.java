import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author PampSPP
 */
public class Main {
    public static void main(String[] args) {

        List<Pessoas> pessoasList = new ArrayList<Pessoas>();
        List<Pessoas> masculinoList = new ArrayList<Pessoas>();
        List<Pessoas> femininoList = new ArrayList<Pessoas>();

        Scanner resp = new Scanner(System.in);
        String r = "";

        while (true) {
            System.out.println("Gostaria de cadastrar uma pessoa? (s ou n) ");
            r = resp.nextLine();

            if (r.equalsIgnoreCase("s")) {
                Pessoas pessoa = new Pessoas();

                Scanner input = new Scanner(System.in);

                System.out.println("Informe o nome da pessoa: ");
                String nome = input.nextLine();
                pessoa.setNome(nome);

                System.out.println("Informe o sexo da pessoa (masculino/feminino): ");
                String sexo = input.nextLine();
                pessoa.setSexo(sexo.toLowerCase());

                pessoasList.add(pessoa);
                for (Pessoas i : pessoasList) {
                    System.out.println(i.getNome() + " " + i.getSexo());
                }
            } else if (r.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Resposta inválida! Por favor, responda 's' ou 'n'.");
            }
        }


        for (Pessoas i : pessoasList) {
            if (i.getSexo().equals("masculino")) {
                masculinoList.add(i);
            } else {
                femininoList.add(i);
            }
        }
        System.out.println("Total de " + masculinoList.toArray().length + " pessoa(s) na lista de sexo Masculino");
        for (Pessoas i : masculinoList) {
            System.out.println(i.getNome() + " " + i.getSexo());
        }
        System.out.println("Total de " + femininoList.toArray().length + " pessoa(s) na lista de sexo Feminino");
        for (Pessoas i : femininoList) {
            System.out.println(i.getNome() + " " + i.getSexo());
        }
    }
}