/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thiag
 */
public class Produtos {
   
    private Integer id;
    private String name;
    private String description;
    private Integer quantity;
    private Double value;
    private String category;
    
    public Produtos(){
            

        }
    
    public Produtos(String name, String description,Integer quantity, Double value){
           
        
        this.name = name;
        this.description = description; 
        this.quantity = quantity;
        this.value = value;

        }
    
        public Integer getId(){
       
            return this.id;
            
        }
        
        
        public void setId(Integer id){
        
            this.id = id;
        
        }
    
    
                        
        public String getName(){
    
            return this.name;       
    
        }
        
        
        public void setName(String name){
        
            this.name = name;
        }
       
        public String getDescription(){
        
            return this.description;
        
        }
        
        public void setDescription(String description){
        
            this.description = description;
        }
        
        public Integer getQuantity(){
            
            return this.quantity;
        
        }
        
        public void setQuantity(Integer quantity){
        
            this.quantity = quantity;
        }
        
                
        public Double getValue(){
        
            return this.value;        
        
        }
        
        public void setValue(Double value){
        
            this.value = value;
        }
        
        public String getCategory(){
            
            return this.category;
        }
        
        public void setCategory(){
            
            this.category = category;        
        
        }
      
     
    }
    

            

