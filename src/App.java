import dao.TaskDAO;
import model.Task;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TaskDAO dao = new TaskDAO();

        int option = 0;

        while (option !=5) {

            System.out.println("\n===== TASK MANAGER =====\n");
            System.out.println("1 - Cadastrar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Atualizar status");
            System.out.println("4 - Deletar tarefa");
            System.out.println("5 - Sair\n");

            System.out.println("Escolha uma opção: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:

                Task task = new Task();

                System.out.println("Título: ");
                task.setTitle(scanner.nextLine());

                System.out.println("Descrição: ");
                task.setDescription(scanner.nextLine());

                task.setStatus("PENDENTE");

                dao.save(task);

                break;

            case 2:
                    
                List <Task> tasks = dao.getTasks();

                for (Task t : tasks) {

                    System.out.println("\nID: " + t.getId());
                    System.out.println("Título: " + t.getTitle());
                    System.out.println("Descrição: " + t.getDescription());
                    System.out.println("Status: " + t.getStatus());

                    System.out.println("----------------------");
                }
                
                break;

            case 3:

                System.out.println("Digite o ID da tarefa: ");
                int updateId = scanner.nextInt();

                scanner.nextLine();

                System.out.println("Novo Status: ");
                String newStatus = scanner.nextLine();

                dao.updateStatus(updateId, newStatus);

                break;

            case 4:

                System.out.println("Digite o ID da tarefa: ");

                int deleteId = scanner.nextInt();

                dao.delete(deleteId);

                break;

            case 5:

                System.out.println("Encerrando sistema...");
                break;

            default:

                System.out.println("Opção inválida!");

            }
        }

        scanner.close();

    }
}