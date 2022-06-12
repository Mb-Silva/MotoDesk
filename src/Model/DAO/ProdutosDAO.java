/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Factory.ConnectionFactory;
import Model.Produtos;
import com.mysql.cj.jdbc.ClientPreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thiag
 */
public class ProdutosDAO {
    
    public void saveProduto(Produtos produto) {
		String sql = "INSERT INTO Produtos(NomeProduto, Descricao, Quantidade, Valor) VALUES (?, ?, ?, ?)";
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, produto.getName());
			pstm.setString(2, produto.getDescription());
                        pstm.setString(3, produto.getQuantity().toString());
                        pstm.setString(4, produto.getValue().toString());
                       
			
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
    
    public ArrayList<Produtos> getProdutos(){
		
                String sql = "SELECT * FROM Produtos";
		
		ArrayList<Produtos> produtos = new ArrayList<>();
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		//Recupera os dados do BD
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnection();
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Produtos produto = new Produtos();
				
				produto.setId(rset.getInt("IdProduto"));
				produto.setName(rset.getString("NomeProduto"));
				produto.setDescription(rset.getString("Descricao"));
                                produto.setQuantity(rset.getInt("Quantidade"));
                                produto.setValue(rset.getDouble("Valor"));
                                
				
				produtos.add(produto);
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
		
		return produtos;
		
	}
    
    public ArrayList<Produtos> getProdutosByName(String pesquisa){
		
                String sql = "SELECT * FROM Produtos WHERE NomeProduto LIKE ?";
		
		ArrayList<Produtos> produtos = new ArrayList<>();
		
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
				Produtos produto = new Produtos();
				
				produto.setId(rset.getInt("IdProduto"));
				produto.setName(rset.getString("NomeProduto"));
				produto.setDescription(rset.getString("Descricao"));
                                produto.setQuantity(rset.getInt("Quantidade"));
                                produto.setValue(rset.getDouble("Valor"));
                                
				produtos.add(produto);
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
		
		return produtos;
		
	}
    
}
