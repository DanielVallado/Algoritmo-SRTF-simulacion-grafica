package vista;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CanvaProcesos extends Canvas {
    
    private final List<String> valores;
    private final Map<String, Color> colores;
    
    public CanvaProcesos() {
        this.valores = new ArrayList<>();
        this.colores = new HashMap<>();
        setPreferredSize(new Dimension(690, 100));
        setBackground(new Color(173, 216, 230));
    }
    
    public void addValor(String proceso, Color color) {
        this.valores.add(proceso);
        this.colores.put(proceso, color);
        repaint();
    }

    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        int x = 0; // Coordenada x inicial
        int width = 30; // Ancho del rectángulo
        colocarBorde(g, 0, 0, getWidth(), getHeight() - 20);


        for (int i = 0; i < valores.size(); i++){
            int height = 80; // Alto del rectángulo
            String texto = valores.get(i);
            Color color = colores.get(texto);

            g.setColor(color);
            g.fillRect(x, 0, width, height);

            this.colocarBorde(g, x, 0, width, height);
            colocarIteracion(g, i, x, height + 15);
            this.colocarTexto(g, texto, x, width, height);
        
            x += width;
        }
    }
    
    public void reset() {
        this.valores.clear();
        this.colores.clear();
        repaint();
    }
    
    private void colocarBorde(Graphics g, int x, int y, int width, int height) {
        // Establecer el color y el grosor del borde
        g.setColor(Color.BLACK);
        Graphics2D g2d = (Graphics2D) g;
        Stroke oldStroke = g2d.getStroke();
        g2d.setStroke(new BasicStroke(3)); // Grosor del borde: 3 píxeles

        // Dibujar el borde del rectángulo
        g2d.drawRect(x, y, width, height);

        // Restaurar el grosor original del borde
        g2d.setStroke(oldStroke);
    }
    
    private void colocarIteracion(Graphics g, int iteracion, int x, int y) {
        // Establecer el color y la fuente del texto
        g.setColor(Color.BLACK);
        g.setFont(g.getFont().deriveFont(Font.BOLD));

        // Dibujar el número de iteración debajo del borde izquierdo del rectángulo
        g.drawString(Integer.toString(iteracion), x, y);
    }

    
    private void colocarTexto(Graphics g, String texto, int x, int width, int height) {
         // Calcular las coordenadas x, y para centrar el texto
        FontMetrics fm = g.getFontMetrics();
        int textoWidth = fm.stringWidth(texto);
        int textoHeight = fm.getHeight();
        int textoX = x + (width - textoWidth) / 2;
        int textoY = (height - textoHeight) / 2 + fm.getAscent();

        // Establecer el color y la fuente del texto
        g.setColor(Color.BLACK);
        g.setFont(g.getFont().deriveFont(Font.BOLD));

        // Dibujar el texto en el centro del rectángulo
        g.drawString(texto, textoX, textoY);
    }

}
