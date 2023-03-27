/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package practica2;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author joz
 */
public class mov3 extends javax.swing.JPanel implements Runnable{

    private int x = getWidth()+200;
    private int y = getHeight();// Cordenada de origen en y
    private Color color;
    Thread hilo;
    private int derecha,izquierda,arriba, abajo;
    private int cant;
    private int vel;
    private int contador=0;
    
    private int c;
    public mov3() {
        initComponents();
        hilo = new Thread(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void paint(Graphics g){
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        
        for(int i=1; i<2 ; i++){
        g.setColor(color);
        g.fillOval(x+(i*50), y , 30, 30);

        
        }
        
        
    }
    
    public void continuar(){
      hilo.resume();
     
    }
    
    public void inicio(){
      hilo.start();
     
    }
    
    public void pausa() {
        hilo.suspend();
    }
    @Override
    public void run(){
    try {
            while(true){
             contador++;
                
                //movimiento izquierda
                while (x > 10) {
                    Thread.sleep(37); // Velocidad con la que mueve el circulo
                    x -= 10;
                    repaint(); // Se llama al metodo para redibujar el circulo
                }

              
                // movimiento abajo
                while (y <= getHeight() - 10) { 
                    Thread.sleep(1); // Velocidad con la que mueve el circulo
                    y += 10;
                    
                    repaint(); // Se llama al metodo para redibujar el circulo
                }

               //movimiento a la derecha 10
                while (x <= getWidth()- 10) {
                    
                    Thread.sleep(1); // Velocidad con la que mueve el circulo
                    x += 10;
                    repaint(); // Se llama al metodo para redibujar el circulo
                }
                

               // movimiento arriba
                while (y > 10) {
                    Thread.sleep(35); // Velocidad con la que mueve el circulo
                    y -= 10;
                    repaint(); // Se llama al metodo para redibujar el circulo
                }
               
                
                

                }
 
            
        } catch (Exception e) {
        }
    
    
    }
    
  public void setColor(Color color) {
        this.color = color;
    }

   public void setdireccion(int arriba){
   
   this.arriba= arriba;
   
 

   }
   
   public int getContador() {
        return contador;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
