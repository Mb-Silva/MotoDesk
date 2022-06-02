package br.com.ecommercemotos.aplicacao;
import java.util.Scanner;

import br.com.ecommercemotos.dao.CategoriasDAO;
import br.com.ecommercemotos.model.Categorias;

public class Main {

	public static void main(String[] args){
		buscarTodosRegistros();
	}
	
	public static void incluir(){
		Scanner leitor = new Scanner(System.in);
		String categoriaNome = "", categoriaDescricao = "";
		boolean newCategoria = false;
		
		CategoriasDAO categoriasDAO = new CategoriasDAO();
		Categorias categoria = new Categorias();
		
		/* **Inclusão** */
		System.out.println("Informe o nome da Categoria: ");
		categoriaNome = leitor.next();
		System.out.println("Informe a descricao da Categoria: ");
		categoriaDescricao = leitor.next();
		
		categoria.setNome(categoriaNome);
		categoria.setDescricao(categoriaDescricao);
		categoria.setId(6);
		
		categoriasDAO.save(categoria);
		
		System.out.println("Inclusao Concluida.");
	}
	
	public static void buscarPeloNome(){
		Scanner leitor = new Scanner(System.in);
		String categoriaNome = "";
		
		CategoriasDAO categoriasDAO = new CategoriasDAO();
		Categorias categoria = new Categorias();
		
		System.out.println("Informe o nome da Categoria que deseja buscar: ");
		categoriaNome = "%"+leitor.next()+"%";
		
		categoria.setNome(categoriaNome);
		
		for(Categorias c : categoriasDAO.getCategoriasByName(categoria)) {
			System.out.println("Id: "+ c.getId() + " Categoria: " + c.getNome());
		}
		
		System.out.println("Busca Concluida.");
	}
	
	public static void buscarTodosRegistros(){
		CategoriasDAO categoriasDAO = new CategoriasDAO();
		
		for(Categorias c : categoriasDAO.getCategorias()) {
			System.out.println("Id: "+ c.getId() + " Categoria: " + c.getNome());
		} 
		
		System.out.println("Busca Concluida.");
	}
	
	public static void deletar(){
		Scanner leitor = new Scanner(System.in);
		int categoriaId = 0;
		
		CategoriasDAO categoriasDAO = new CategoriasDAO();
		Categorias categoria = new Categorias();
		
		System.out.println("Informe o Id da Categoria a ser Excluida: ");
		categoriaId = leitor.nextInt();
		
		categoria.setId(categoriaId);
		
		//Delete
		categoriasDAO.delete(categoria);
		
		System.out.println("Exclusao Concluida.");
	}
	
	public static void atualizar(){
		Scanner leitor = new Scanner(System.in);
		String categoriaNome = "", categoriaDescricao = "";
		int categoriaId = 0;
		
		CategoriasDAO categoriasDAO = new CategoriasDAO();
		Categorias categoria = new Categorias();
		
		System.out.println("Informe o Id da Categoria a ser Alterada: ");
		categoriaId = leitor.nextInt();
		System.out.println("Informe o novo nome da Categoria: ");
		categoriaNome = leitor.next();
		System.out.println("Informe a nova descricao da Categoria: ");
		categoriaDescricao = leitor.next();
		
		categoria.setNome(categoriaNome);
		categoria.setDescricao(categoriaDescricao);
		categoria.setId(categoriaId);
		
		//Alterar
		categoriasDAO.update(categoria);
		
		System.out.println("Alteracao Concluida.");
	}
	
}
