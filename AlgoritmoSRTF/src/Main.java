import Controlador.ControladorPrincipal;
import Vista.Principal;

public class Main {
    public static void main(String[] args) {
        Principal ventanaPrincipal = new Principal();
        ControladorPrincipal controlador = new ControladorPrincipal(ventanaPrincipal);
    }
}