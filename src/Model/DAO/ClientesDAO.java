/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Factory.ConnectionFactory;
import Model.Clientes;
import com.mysql.cj.jdbc.ClientPreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author INTEL
 */
public class ClientesDAO {
    
    public void save(Clientes cliente) {
		String sql = "INSERT INTO Clientes(Nome, CPF, Email, Senha, Telefone, Usuario) VALUES (?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCPF());
                        pstm.setString(3, cliente.getEmail());
                        pstm.setString(4, cliente.getSenha());
                        pstm.setString(5, cliente.getTelefone());
                        pstm.setString(6, cliente.getUsuario());
			
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
    
    public ArrayList<Clientes> getClientes(){
		String sql = "SELECT * FROM Clientes";
		
		ArrayList<Clientes> clientes = new ArrayList<Clientes>();
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		//Recupera os dados do BD
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Clientes cliente = new Clientes();
				
				cliente.setId(rset.getInt("IdCliente"));
				cliente.setNome(rset.getString("Nome"));
				cliente.setCPF(rset.getString("CPF"));
                                cliente.setEmail(rset.getString("Email"));
                                cliente.setUsuario(rset.getString("Usuario"));
                                cliente.setTelefone(rset.getString("Telefone"));
				
				clientes.add(cliente);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
				if(rset != null) {
					rset.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return clientes;
		
	}
    
    public ArrayList<Clientes> getClientesByName(String pesquisa){
		String sql = "SELECT * FROM Clientes WHERE nome LIKE ?";
		
		ArrayList<Clientes> clientes = new ArrayList<Clientes>();
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		//Recupera os dados do BD
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, pesquisa);
			
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Clientes cliente = new Clientes();
				
				cliente.setId(rset.getInt("IdCliente"));
				cliente.setNome(rset.getString("Nome"));
				cliente.setCPF(rset.getString("CPF"));
                                cliente.setEmail(rset.getString("Email"));
                                cliente.setUsuario(rset.getString("Usuario"));
                                cliente.setTelefone(rset.getString("Telefone"));
				
				clientes.add(cliente);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
				if(rset != null) {
					rset.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return clientes;
		
	}
}
