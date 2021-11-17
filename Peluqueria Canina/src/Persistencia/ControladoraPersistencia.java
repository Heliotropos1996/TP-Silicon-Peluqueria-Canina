
package Persistencia;

import Logica.Cliente;


public class ControladoraPersistencia {
    ClienteJpaController cliJPA = new ClienteJpaController();
    

    public ControladoraPersistencia() {
       
    }
    public void crearCliente(Cliente cli){
        
        
    try { 
        cliJPA.create(cli);
    }
    catch(Exception e) {
        System.out.println("No se pudo crear el cliente");
    }
    }
    }
    

