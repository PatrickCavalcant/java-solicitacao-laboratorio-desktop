/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solicitacao.de.laboratorio;
/**
 * @author Patrick Cavalcante Moraes
 * @email patrick0000.pc@gmail.com	
 * @date 2018/11/02
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class conexaobd {
 
public conexaobd () {      } //Possibilita instancias
public static Connection con = null;
 
    public static void Conectar() {
    System.out.println("Conectando ao banco...");
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/testedb","root","");
      System.out.println("Conectado.");
    } catch (ClassNotFoundException ex) {
        System.out.println("Classe n�o encontrada, adicione o driver nas bibliotecas.");
      Logger.getLogger(conexaobd.class.getName()).log(Level.SEVERE, null, ex);
    } catch(SQLException e) {
        System.out.println(e);
        throw new RuntimeException(e);
    }

    }

}
