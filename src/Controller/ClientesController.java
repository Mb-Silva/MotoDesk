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
    
    public ArrayList<Clientes> BuscarTodosRegistros(){
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
    
    public ArrayList<Clientes> BuscarRegistrosPeloNome(String pesquisa, String tpPesquisa){
        ClientesDAO clienteDAO = new ClientesDAO();
        ArrayList<Clientes> clientes = new ArrayList<Clientes>();
                
                
        //Tratamento das Strings de Pesquisa para a Busca
        pesquisa = "%" + pesquisa + "%";
        tpPesquisa = tpPesquisa.equals("Código") ? "IdCliente" : tpPesquisa;

        for(Clientes c : clienteDAO.getClientesByName(pesquisa, tpPesquisa)) {
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
    
    public static Clientes BuscarRegistroPorId(int id){
        ClientesDAO clienteDAO = new ClientesDAO();
        
        Clientes cliente = clienteDAO.getClientesById(id);
                    	
	return cliente;
    }
    
    public static void Deletar(int id){
        ClientesDAO clienteDAO = new ClientesDAO();
        Clientes cliente = new Clientes();
        
        cliente = BuscarRegistroPorId(id);
        
        clienteDAO.delete(cliente); 
    }
    
    public static boolean Login(String user, String password){
        ClientesDAO clienteDAO = new ClientesDAO();
        
        boolean valido = clienteDAO.login(user, password);
        
        return valido;
    }
    
    public static boolean VerificaUsuario(String user){
        ClientesDAO clienteDAO = new ClientesDAO();
        
        boolean valido = clienteDAO.validaUsuario(user);
        
        return valido;
    }
    
    public static boolean VerificaCPF(String cpf){
        ClientesDAO clienteDAO = new ClientesDAO();
        
        boolean valido = clienteDAO.validaCPF(cpf);
        
        return valido;
    }
}
