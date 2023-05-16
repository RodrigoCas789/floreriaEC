import java.sql.*;
import java.util.Scanner;

public class eliminarcliente {public static void main(String[] args) {


    try {



        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EP2", "root", "Sonicrodriz12");

        Statement statement = connection.createStatement();
        Scanner scanner = new Scanner(System.in);
        //mostrarn en la cosola
        System.out.println("Ingrese id del cliente : ");
        int id = Integer.parseInt(scanner.nextLine());



        PreparedStatement ps = connection.prepareStatement("DELETE FROM cliente WHERE IdCliente = ?");

        ps.setInt(1, id);
        int filasAfectadas = ps.executeUpdate();


        System.out.println("se acaba de elimar el id de la fila numero : " + id ); // Mostrar el número de filas afectadas
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
