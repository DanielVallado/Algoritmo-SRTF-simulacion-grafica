package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.table.DefaultTableCellRenderer;

public class VistaPrincipal extends javax.swing.JFrame {
    
    public VistaPrincipal() {
        initComponents();
        centrarTabla();
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProcesos = new javax.swing.JTable();
        panelDiagrama = new javax.swing.JPanel();
        panelInformacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tiempoEsperaP1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tiempoEsperaP2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tiempoEsperaP3 = new javax.swing.JLabel();
        tiempoEsperaP4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tiempoEsperaP5 = new javax.swing.JLabel();
        TEP = new javax.swing.JLabel();
        TTP = new javax.swing.JLabel();
        porcentaje = new javax.swing.JLabel();
        panelBoton = new javax.swing.JPanel();
        botonPasos = new javax.swing.JButton();
        botonReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmo SRTF");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulo.setBackground(new java.awt.Color(173, 216, 230));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIMULACIÓN DEL ALGORITMO SRTF");
        panelTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 6, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        panelTitulo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 460, 20));

        panelPrincipal.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        panelTabla.setBackground(new java.awt.Color(173, 216, 230));

        tablaProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"P1", "0", "8"},
                {"P2", "3", "4"},
                {"P3", "6", "2"},
                {"P4", "10", "3"},
                {"P5", "15", "6"}
            },
            new String [] {
                "Proceso", "Tiempo de llegada", "Tiempo de ráfaga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProcesos.setGridColor(new java.awt.Color(0, 0, 0));
        tablaProcesos.setName(""); // NOI18N
        tablaProcesos.setSelectionBackground(new java.awt.Color(0, 153, 102));
        tablaProcesos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaProcesos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProcesos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProcesos.setShowGrid(true);
        jScrollPane1.setViewportView(tablaProcesos);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        panelPrincipal.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 200));

        panelDiagrama.setBackground(new java.awt.Color(173, 216, 230));
        panelDiagrama.setForeground(new java.awt.Color(0, 0, 0));
        panelDiagrama.setLayout(new java.awt.BorderLayout());
        panelPrincipal.add(panelDiagrama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 800, 160));

        panelInformacion.setBackground(new java.awt.Color(173, 216, 230));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cálculo de los tiempos. El cambio de contexto se realiza en 0.2 milisegundos.");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("a) Tiempo de espera de cada proceso:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("b) Tiempo de espera promedio de todos los procesos (TEP):");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("c) Tiempo total de procesamiento de todos los procesos (TTP):");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("d) Porcentaje del TTP que consume el TEP:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("P1:");

        tiempoEsperaP1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tiempoEsperaP1.setForeground(new java.awt.Color(0, 0, 0));
        tiempoEsperaP1.setText("--");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("P2:");

        tiempoEsperaP2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tiempoEsperaP2.setForeground(new java.awt.Color(0, 0, 0));
        tiempoEsperaP2.setText("--");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("P3:");

        tiempoEsperaP3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tiempoEsperaP3.setForeground(new java.awt.Color(0, 0, 0));
        tiempoEsperaP3.setText("--");

        tiempoEsperaP4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tiempoEsperaP4.setForeground(new java.awt.Color(0, 0, 0));
        tiempoEsperaP4.setText("--");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("P4:");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("P5:");

        tiempoEsperaP5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tiempoEsperaP5.setForeground(new java.awt.Color(0, 0, 0));
        tiempoEsperaP5.setText("--");

        TEP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TEP.setForeground(new java.awt.Color(0, 0, 0));
        TEP.setText("--");

        TTP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TTP.setForeground(new java.awt.Color(0, 0, 0));
        TTP.setText("--");

        porcentaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        porcentaje.setForeground(new java.awt.Color(0, 0, 0));
        porcentaje.setText("--");

        javax.swing.GroupLayout panelInformacionLayout = new javax.swing.GroupLayout(panelInformacion);
        panelInformacion.setLayout(panelInformacionLayout);
        panelInformacionLayout.setHorizontalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TTP))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(porcentaje))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInformacionLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tiempoEsperaP1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tiempoEsperaP2))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tiempoEsperaP3)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tiempoEsperaP4)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tiempoEsperaP5))
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TEP)))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        panelInformacionLayout.setVerticalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(tiempoEsperaP5))
                    .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(tiempoEsperaP4))
                    .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(tiempoEsperaP3))
                    .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(tiempoEsperaP2))
                    .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7)
                        .addComponent(tiempoEsperaP1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TEP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TTP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(porcentaje))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 800, 160));

        panelBoton.setBackground(new java.awt.Color(173, 216, 230));

        botonPasos.setBackground(new java.awt.Color(255, 187, 130));
        botonPasos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonPasos.setForeground(new java.awt.Color(0, 0, 0));
        botonPasos.setText("Paso n");
        botonPasos.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2), BorderFactory.createEmptyBorder(5, 10, 5, 10)));
        botonPasos.setBorderPainted(false);
        botonPasos.setFocusPainted(false);

        botonReiniciar.setBackground(new java.awt.Color(255, 187, 130));
        botonReiniciar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonReiniciar.setForeground(new java.awt.Color(0, 0, 0));
        botonReiniciar.setText("Reiniciar");
        botonReiniciar.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2), BorderFactory.createEmptyBorder(5, 10, 5, 10)));
        botonReiniciar.setBorderPainted(false);
        botonReiniciar.setFocusPainted(false);

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(botonPasos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(botonReiniciar)
                .addGap(30, 30, 30))
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPasos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 800, 60));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VistaPrincipal().setVisible(true);
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TEP;
    private javax.swing.JLabel TTP;
    private javax.swing.JButton botonPasos;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelDiagrama;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel porcentaje;
    private javax.swing.JTable tablaProcesos;
    private javax.swing.JLabel tiempoEsperaP1;
    private javax.swing.JLabel tiempoEsperaP2;
    private javax.swing.JLabel tiempoEsperaP3;
    private javax.swing.JLabel tiempoEsperaP4;
    private javax.swing.JLabel tiempoEsperaP5;
    // End of variables declaration//GEN-END:variables

    private void centrarTabla() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        int cantColumnas = tablaProcesos.getModel().getColumnCount();
        for (int columnas = 0; columnas < cantColumnas; columnas++) {
            tablaProcesos.getColumnModel().getColumn(columnas).setCellRenderer(centerRenderer);
        }
    }

    public JTable getTablaProcesos() {
        return tablaProcesos;
    }

    public void setTablaProcesos(JTable tablaProcesos) {
        this.tablaProcesos = tablaProcesos;
    }

    public JLabel getTEP() {
        return TEP;
    }

    public void setTEP(JLabel TEP) {
        this.TEP = TEP;
    }

    public JLabel getTTP() {
        return TTP;
    }

    public void setTTP(JLabel TTP) {
        this.TTP = TTP;
    }

    public JLabel getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(JLabel porcentaje) {
        this.porcentaje = porcentaje;
    }

    public JLabel getTiempoEsperaP1() {
        return tiempoEsperaP1;
    }

    public void setTiempoEsperaP1(JLabel tiempoEsperaP1) {
        this.tiempoEsperaP1 = tiempoEsperaP1;
    }

    public JLabel getTiempoEsperaP2() {
        return tiempoEsperaP2;
    }

    public void setTiempoEsperaP2(JLabel tiempoEsperaP2) {
        this.tiempoEsperaP2 = tiempoEsperaP2;
    }

    public JLabel getTiempoEsperaP3() {
        return tiempoEsperaP3;
    }

    public void setTiempoEsperaP3(JLabel tiempoEsperaP3) {
        this.tiempoEsperaP3 = tiempoEsperaP3;
    }

    public JLabel getTiempoEsperaP4() {
        return tiempoEsperaP4;
    }

    public void setTiempoEsperaP4(JLabel tiempoEsperaP4) {
        this.tiempoEsperaP4 = tiempoEsperaP4;
    }

    public JLabel getTiempoEsperaP5() {
        return tiempoEsperaP5;
    }

    public void setTiempoEsperaP5(JLabel tiempoEsperaP5) {
        this.tiempoEsperaP5 = tiempoEsperaP5;
    }

    public JButton getBotonPasos() {
        return botonPasos;
    }

    public void setBotonPasos(JButton botonPasos) {
        this.botonPasos = botonPasos;
    }

    public JButton getBotonReiniciar() {
        return botonReiniciar;
    }

    public void setBotonReiniciar(JButton botonReiniciar) {
        this.botonReiniciar = botonReiniciar;
    }
    
    public JPanel getPanelDiagrama() {
        return panelDiagrama;
    }

    public JPanel getPanelInformacion() {
        return panelInformacion;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public JPanel getPanelTabla() {
        return panelTabla;
    }

    public JPanel getPanelTitulo() {
        return panelTitulo;
    }

}
