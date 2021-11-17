package Logica;

import IGU.Principal;

public class PeluqueriaCanina {
    
    public static void main(String[] args) {
        Controladora control = new Controladora();
        Principal princi = new Principal(control);
        princi.setVisible(true);
        princi.setLocation(null);
    }
    
}
 