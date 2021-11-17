
package Logica;

import Persistencia.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia contrPers = new ControladoraPersistencia();
    
    public void crearCliente (String numCliente, String color, String raza, String nombDueño, String celular,  String nomPerro, String observacion, String alergico, String atencEspe){
        Cliente cli = new Cliente();
        
        cli.setNomDueño(nombDueño);
        cli.setColor(color);
        cli.setNumCliente(numCliente);
        cli.setObservacion(observacion);
        cli.setAlergico(alergico);
        cli.setAtencEspe(atencEspe);
        cli.setNomPerro(nomPerro);
        cli.setRaza(raza);
        cli.setCelular(celular);
       
        contrPers.crearCliente(cli);
    
    }
public void crearCliente(Cliente cli){
    contrPers.crearCliente(cli);
    }
  
}
