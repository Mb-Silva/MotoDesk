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
    
    public ArrayList<Clientes> getClientesByName(String Pesquisa, String TpPesquisa){
		String sql = "SELECT * FROM Clientes WHERE " + TpPesquisa + " LIKE ?";
                if(TpPesquisa.equals("IdCliente")){
                    sql = "SELECT * FROM Clientes WHERE " + TpPesquisa + " = ?";
                }
		
		ArrayList<Clientes> clientes = new ArrayList<Clientes>();
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
                

		//Recupera os dados do BD
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
                        pstm.setObject(1, TpPesquisa);
                        if(TpPesquisa.equals("IdCliente")){
                            Pesquisa = Pesquisa.replace("%", "");
                            int PesquisaInt = Integer.parseInt(Pesquisa);
                            pstm.setInt(1, PesquisaInt);
                        } else {
                            pstm.setString(1, Pesquisa);
                        }
			
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
    
    public Clientes getClientesById(int Id){
		String sql = "SELECT * FROM Clientes WHERE IdCliente = ?";
		
		Clientes cliente = new Clientes();
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		//Recupera os dados do BD
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
                        //Só deve retornar 1 registro pois a chave é unica
                        pstm.setInt(1, Id);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
                            cliente.setId(rset.getInt("IdCliente"));
                            cliente.setNome(rset.getString("Nome"));
                            cliente.setCPF(rset.getString("CPF"));
                            cliente.setEmail(rset.getString("Email"));
                            cliente.setUsuario(rset.getString("Usuario"));
                            cliente.setTelefone(rset.getString("Telefone"));
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
		
		return cliente;
		
    }
    
    public void delete(Clientes cliente) {
		String sql = "DELETE FROM Clientes WHERE IdCliente = ?";
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			pstm.setInt(1, cliente.getId());
			
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
    
    public boolean login(String user, String password){
                boolean usuarioValido = false;
        
                String sql = "SELECT * FROM Clientes WHERE usuario = ? AND senha = ?";
        
                Connection conn = null;
		ClientPreparedStatement pstm = null;
                ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, user);
                        pstm.setString(2, password);
			
			rset = pstm.executeQuery();
                        if(!rset.next()){
                            usuarioValido = false;
                        } else{
                            usuarioValido = true;
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
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
                
                return usuarioValido;
    }
    
    public boolean validaUsuario(String user){
                boolean usuarioValido = false;
        
                String sql = "SELECT * FROM Clientes WHERE usuario = ?";
        
                Connection conn = null;
		ClientPreparedStatement pstm = null;
                ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, user);
			
			rset = pstm.executeQuery();
                        if(!rset.next()){
                            usuarioValido = false;
                        } else{
                            usuarioValido = true;
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
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
                
                return usuarioValido;
    }
    
    public boolean validaCPF(String cpf){
                boolean cpfValido = false;
        
                String sql = "SELECT * FROM Clientes WHERE CPF = ?";
        
                Connection conn = null;
		ClientPreparedStatement pstm = null;
                ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, cpf);
			
			rset = pstm.executeQuery();
                        if(!rset.next()){
                            cpfValido = false;
                        } else{
                            cpfValido = true;
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
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
                
                return cpfValido;
    }
}
