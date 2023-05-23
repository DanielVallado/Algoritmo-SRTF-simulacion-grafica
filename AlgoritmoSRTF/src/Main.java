import controlador.*;
import vista.*;
import modelo.*;


public class Main {
    
    public static void main(String[] args) {
        VistaPrincipal principal = new VistaPrincipal();
        ControladorVistaPrincipal controlador = new ControladorVistaPrincipal(principal);
        principal.setVisible(true);       
    }
    
}
   