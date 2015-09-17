
import java.text.ParseException;
import java.util.Date;
import java.util.InputMismatchException;

public class ConsultorioMedico {

    public static void main(String[] args) {
        int op = -1;
        RepositorioPacientes repositorioPacientes = new RepositorioPacientes();

        do {
            System.out.println("Menu: ");
            System.out.println("1- Cadastrar Paciente");
            System.out.println("2- Listar Pacientes");
            System.out.println("3- Sair da Aplicação");

            try {
                op = Console.scanInt("Digite a opção do menu: ");

                switch (op) {
                    case 1:
                        try {
                            System.out.println("\nCadastro de Pacientes");
                            String rg = Console.scanString("RG: ");
                            String nome = Console.scanString("Nome: ");
                            String dataString = Console.scanString("Nascimento (dia/mes/ano): ");
                            Date dataNasc = DateUtil.stringToDate(dataString);
                            Paciente paciente = new Paciente(rg, nome, dataNasc);
                            repositorioPacientes.adicionar(paciente);
                        } catch (ParseException ex) {
                            System.out.println("Formato de data errado! Operação cancelada!");
                           
                        }

                        break;

                    case 2:
                        System.out.println("\nLista de pacientes");
                        if (!repositorioPacientes.temPacientes()) {
                            System.out.println("Nenhum paciente foi cadastrado!");
                        } else {
                            System.out.print(String.format("%-10s", "RG"));
                            System.out.print(String.format("%-20s", "NOME"));
                            System.out.println(String.format("%-10s", "NASCIMENTO"));
                            for (Paciente p : repositorioPacientes.getListaPacientes()) {
                                System.out.print(String.format("%-10s", p.getRg()));
                                System.out.print(String.format("%-20s", p.getNome()));
                                System.out.println(String.format("%-10s", DateUtil.dateToString(p.getDataNascimento())));

                            }
                        }

                        break;
                    case 3:
                        System.out.println("Saindo da aplicação...");
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Opção Inválida! Não pode digitar letras!");
            }

        } while (op != 3);

    }

}
