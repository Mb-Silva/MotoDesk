/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Clientes;
import Model.DAO.ClientesDAO;
import java.util.ArrayList;


/**
 *
 * @author INTEL
 */
public class ClientesController {
    
    public static void Salvar(Clientes cliente){
        ClientesDAO clienteDAO = new ClientesDAO();
        
        clienteDAO.save(cliente); 
    }
    
    public ArrayList<Clientes> buscarTodosRegistros(){
		ClientesDAO clienteDAO = new ClientesDAO();
                ArrayList<Clientes> clientes = new ArrayList<Clientes>();
		
		for(Clientes c : clienteDAO.getClientes()) {
                        Clientes cliente = new Clientes();
                    
                        cliente.setId(c.getId());
			cliente.setNome(c.getNome());
			cliente.setCPF(c.getCPF());
                        cliente.setEmail(c.getEmail());
                        cliente.setUsuario(c.getUsuario());
                        cliente.setTelefone(c.getTelefone());
				
			clientes.add(cliente);
		} 
                
                return clientes;
    }
    
    public ArrayList<Clientes> buscarRegistrosPeloNome(String pesquisa){
		ClientesDAO clienteDAO = new ClientesDAO();
                ArrayList<Clientes> clientes = new ArrayList<Clientes>();
                
                pesquisa = "%" + pesquisa + "%";
                
		for(Clientes c : clienteDAO.getClientesByName(pesquisa)) {
                        Clientes cliente = new Clientes();
                    
                        cliente.setId(c.getId());
			cliente.setNome(c.getNome());
			cliente.setCPF(c.getCPF());
                        cliente.setEmail(c.getEmail());
                        cliente.setUsuario(c.getUsuario());
                        cliente.setTelefone(c.getTelefone());
				
			clientes.add(cliente);
		} 
                
                return clientes;
    }
}
