package modelo;

import Modelo.Proceso;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class FactoryProcesos {
    
    public static List<Proceso> getProcesos() {
        List<Proceso> procesos = new ArrayList<>();
        procesos.add(new Proceso(1, 0, 8, Color.BLUE));
        procesos.add(new Proceso(2, 3, 4, Color.RED));
        procesos.add(new Proceso(3, 6, 2, Color.YELLOW));
        procesos.add(new Proceso(4, 10, 3, Color.CYAN));
        procesos.add(new Proceso(5, 15, 6, Color.GREEN));
        return procesos;
    }
}
