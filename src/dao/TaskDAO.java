package dao;

import connection.ConnectionFactory;
import model.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {
    
    private Connection connection;

    public TaskDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    //CREATE

    public void save (Task task) {

        String sql = "INSERT INTO tasks(title, description, status) VALUES (?, ?, ?)";
    
        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString (1, task.getTitle());
            stmt.setString (2, task.getDescription());
            stmt.setString (3, task.getStatus());

            stmt.execute();
            stmt.close();

            System.out.println("Tarefa salva com sucesso!!");
        } catch (Exception e) {

            System.out.println("Erro ao salvar tarefa!");
            e.printStackTrace();
        }
    }

    //READ

    public List <Task> getTasks() {
        String sql = "SELECT * FROM tasks";

        List <Task> tasks = new ArrayList<>();

        try {

               PreparedStatement stmt =
                connection.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            Task task = new Task();

            task.setId(rs.getInt("id"));
            task.setTitle(rs.getString("title"));
            task.setDescription(rs.getString("description"));
            task.setStatus(rs.getString("status"));

            tasks.add(task);
        }

        rs.close();
        stmt.close();

    } catch (Exception e) {

        e.printStackTrace();
    }

    return tasks;
        
    }

    //UPDATE

    public void updateStatus(int id, String status) {

        String sql = "UPDATE tasks SET status = ? WHERE id = ?";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, status);
            stmt.setInt(2, id);

            stmt.execute();
            stmt.close();

            System.out.println("Status atualizado com sucesso!");

        } catch (Exception e) {

            System.out.println("Erro ao atualizar status!");
            e.printStackTrace();
        }
    }

    //DELETE

    public void delete(int id) {

        String sql = "DELETE FROM tasks WHERE id = ?";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.execute();
            stmt.close();

            System.out.println("Tarefa deletada com sucesso!");

        } catch (Exception e) {

            System.out.println("Erro ao deletar tarefa!");
            e.printStackTrace();

        }
    }

}
