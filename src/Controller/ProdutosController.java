/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Produtos;
import Model.DAO.ProdutosDAO;
import java.util.ArrayList;

/**
 *
 * @author thiag
 */
public class ProdutosController {
    
       public void Salvar(Produtos produto){
        ProdutosDAO produtoDAO = new ProdutosDAO();
        
        produtoDAO.saveProduto(produto); 
    }
    
    public ArrayList<Produtos> buscarTodosRegistros(){
		ProdutosDAO produtoDAO = new ProdutosDAO();
                ArrayList<Produtos> produtos = new ArrayList<>();
		
		for(Produtos p : produtoDAO.getProdutos()) {
                        
                        Produtos produto = new Produtos();
                    
                        produto.setId(p.getId());
			produto.setName(p.getName());
			produto.setDescription(p.getDescription());
                        produto.setQuantity(p.getQuantity());
                        produto.setValue(p.getValue());
                        			
			produtos.add(produto);
		} 
                
                return produtos;
    }
    
    public ArrayList<Produtos> buscarRegistrosPeloNome(String pesquisa){
		ProdutosDAO produtoDAO = new ProdutosDAO();
                ArrayList<Produtos> produtos = new ArrayList<>();
                
                pesquisa = "%" + pesquisa + "%";
                
		for(Produtos p : produtoDAO.getProdutosByName(pesquisa)) {
                          
                        Produtos produto = new Produtos();
                    
                        produto.setId(p.getId());
			produto.setName(p.getName());
			produto.setDescription(p.getDescription());
                        produto.setQuantity(p.getQuantity());
                        produto.setValue(p.getValue());
                        			
			produtos.add(produto);
		} 
                
                return produtos;
    }
    
}
