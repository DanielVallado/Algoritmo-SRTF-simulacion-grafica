package Modelo;

public enum ListaProcesos {
    PROCESO_1(new Proceso(1, 0, 8)),
    PROCESO_2(new Proceso(2, 3, 4)),
    PROCESO_3(new Proceso(3, 6, 2)),
    PROCESO_4(new Proceso(4, 10, 3)),
    PROCESO_5(new Proceso(5, 15, 6)),;

    private final Proceso proceso;

    ListaProcesos(Proceso proceso) {
        this.proceso = proceso;
    }

    public Proceso getProceso() {
        return proceso;
    }
}
