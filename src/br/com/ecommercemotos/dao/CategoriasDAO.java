package br.com.ecommercemotos.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.ecommercemotos.factory.ConnectionFactory;
import br.com.ecommercemotos.model.Categorias;

import com.mysql.cj.jdbc.ClientPreparedStatement;

public class CategoriasDAO {

	public void save(Categorias categoria) {
		String sql = "INSERT INTO Categorias(Nome, Descricao) VALUES (?, ?)";
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, categoria.getNome());
			pstm.setString(2, categoria.getDescricao());
			
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
	
	public List<Categorias> getCategorias(){
		String sql = "SELECT * FROM Categorias";
		
		List<Categorias> categorias = new ArrayList<Categorias>();
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		//Recupera os dados do BD
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Categorias categoria = new Categorias();
				
				categoria.setId(rset.getInt("Id"));
				categoria.setNome(rset.getString("Nome"));
				categoria.setDescricao(rset.getString("Descricao"));
				
				categorias.add(categoria);
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
		
		return categorias;
		
	}
	
	public List<Categorias> getCategoriasByName(Categorias categoria){
		String sql = "SELECT * FROM Categorias WHERE nome LIKE ?";
		
		List<Categorias> categorias = new ArrayList<Categorias>();
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		//Recupera os dados do BD
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, categoria.getNome());
			
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Categorias categoria2 = new Categorias();
				
				categoria2.setId(rset.getInt("Id"));
				categoria2.setNome(rset.getString("Nome"));
				categoria2.setDescricao(rset.getString("Descricao"));
				
				categorias.add(categoria2);
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
		
		return categorias;
		
	}
	
	public void update(Categorias categoria) {
		
		String sql = "UPDATE categorias set nome = ?, descricao = ? " +
					 "WHERE Id = ?";
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, categoria.getNome());
			pstm.setString(2, categoria.getDescricao());
			pstm.setInt(3, categoria.getId());
			
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
	
	public void delete(Categorias categoria) {
		String sql = "DELETE FROM categorias WHERE Id = ?";
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			pstm.setInt(1, categoria.getId());
			
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
}
