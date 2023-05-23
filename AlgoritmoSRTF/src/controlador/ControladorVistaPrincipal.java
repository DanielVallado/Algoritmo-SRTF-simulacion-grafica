package controlador;

import Modelo.Proceso;
import Modelo.SRTF;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import modelo.FactoryProcesos;
import vista.CanvaProcesos;
import vista.VistaPrincipal;

public class ControladorVistaPrincipal implements ActionListener {
    
    private final VistaPrincipal vista;
    private List<Proceso> listaProcesos;
    private SRTF algoritmo;
    private CanvaProcesos canva;
    private int numPaso;
            
    public ControladorVistaPrincipal(VistaPrincipal vista) {
        this.listaProcesos = new ArrayList<>();
        this.listaProcesos.addAll(this.obtenerProcesos());
        this.algoritmo = new SRTF(listaProcesos);
        this.vista = vista;
        this.numPaso = 0;
        
        this.agregarCanvas();
        this.vista.getBotonPasos().addActionListener(this);
        this.vista.getBotonReiniciar().addActionListener(this);
        this.vista.getBotonReiniciar().setVisible(false);
        this.vista.getBotonPasos().setText("Iniciar");

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (vista.getBotonPasos() == evento.getSource()) {
            Proceso proceso = algoritmo.ejecutar();
            
            if (proceso == null) {
                this.calcularTiempos();
                this.vista.getBotonPasos().setText("Finalizado");
                this.vista.getBotonReiniciar().setVisible(true);
                return;
            }
            
            this.numPaso++;
            this.canva.addValor(proceso.toString(), proceso.getColor());
            this.actualizarBoton();
        }
        
        if (vista.getBotonReiniciar() == evento.getSource()) {
            this.colocarInformacion("--", "--", "--", "--", "--", "--", "--", "--");
            this.listaProcesos = obtenerProcesos();
            this.algoritmo = new SRTF(listaProcesos);
            this.vista.getBotonReiniciar().setVisible(false);
            this.canva.reset();
            this.numPaso = 0;
            this.actualizarBoton();
        }
    }
    
    private List<Proceso> obtenerProcesos() {
        return FactoryProcesos.getProcesos();
    }
    
    private void agregarCanvas() {
        JPanel canvasPanel = new JPanel(new GridBagLayout());
        canvasPanel.setPreferredSize(new Dimension(620, 150));
        canvasPanel.setBackground(new Color(173, 216, 230));
        
        this.canva = new CanvaProcesos();
        canvasPanel.add(canva);
        
        this.vista.getPanelDiagrama().add(canvasPanel, BorderLayout.CENTER);
    }
    
    private void actualizarBoton() {
        this.vista.getBotonPasos().setText("Paso " + numPaso);
    }
    
    private void calcularTiempos() {
        List<Proceso> procesos = listaProcesos;
        DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Formato con dos decimales

        String p1 = decimalFormat.format(procesos.get(0).getTiempoEspera());
        String p2 = decimalFormat.format(procesos.get(1).getTiempoEspera());
        String p3 = decimalFormat.format(procesos.get(2).getTiempoEspera());
        String p4 = decimalFormat.format(procesos.get(3).getTiempoEspera());
        String p5 = decimalFormat.format(procesos.get(4).getTiempoEspera());
        String TEP = decimalFormat.format(algoritmo.calcularTEP(procesos));
        String TTP = decimalFormat.format(algoritmo.calcularTTP(procesos));
        String porcentaje = decimalFormat.format(algoritmo.calcularPorcentaje(procesos)) + "%";
        colocarInformacion(p1, p2, p3, p4, p5, TEP, TTP, porcentaje);
    }
    
    private void colocarInformacion(String p1, String p2, String p3, String p4, String p5, String TEP, String TTP, String porcentaje) {
        this.vista.getTiempoEsperaP1().setText(p1);
        this.vista.getTiempoEsperaP2().setText(p2);
        this.vista.getTiempoEsperaP3().setText(p3);
        this.vista.getTiempoEsperaP4().setText(p4);
        this.vista.getTiempoEsperaP5().setText(p5);
        this.vista.getTEP().setText(TEP);
        this.vista.getTTP().setText(TTP);
        this.vista.getPorcentaje().setText(porcentaje);      
    }
    
}
