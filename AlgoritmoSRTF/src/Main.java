import Controlador.ControladorPrincipal;
import Modelo.ListaProcesos;
import Modelo.Proceso;
import Modelo.SRTF;
import Vista.Principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Principal ventanaPrincipal = new Principal();
        ControladorPrincipal controlador = new ControladorPrincipal(ventanaPrincipal);

        List<Proceso> listaProcesos = new ArrayList<>(Arrays.stream(ListaProcesos.values())
                .map(ListaProcesos::getProceso)
                .toList());


        SRTF algoritmo = new SRTF();
        algoritmo.srtf(listaProcesos).forEach(System.out::println);
    }
}