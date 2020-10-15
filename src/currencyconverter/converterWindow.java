package currencyconverter;
import java.text.DecimalFormat;

public class converterWindow extends javax.swing.JFrame {

    public converterWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEuro = new javax.swing.JLabel();
        labelDollars = new javax.swing.JLabel();
        euro = new javax.swing.JTextField();
        dollars = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelEuro.setText("Euro");

        labelDollars.setText("Dollars");

        euro.setText("€€€");
        euro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                euroMouseReleased(evt);
            }
        });
        euro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                euroKeyReleased(evt);
            }
        });

        dollars.setText("$$$");
        dollars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dollarsMouseReleased(evt);
            }
        });
        dollars.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dollarsKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEuro)
                    .addComponent(euro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dollars, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(labelDollars))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEuro)
                    .addComponent(labelDollars))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dollars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void euroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_euroMouseReleased
        euro.setText("");
    }//GEN-LAST:event_euroMouseReleased

    private void dollarsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dollarsMouseReleased
        dollars.setText("");
    }//GEN-LAST:event_dollarsMouseReleased

    private void euroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_euroKeyReleased
        String euroString = euro.getText();
        double euroDouble = Double.parseDouble(euroString);
        double usdResult = euroDouble * 1.18;
        usdResult = Double.parseDouble(new DecimalFormat("##.##").format(usdResult));
        dollars.setText("" + usdResult);
    }//GEN-LAST:event_euroKeyReleased

    private void dollarsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dollarsKeyReleased
        String dollarsString = dollars.getText();
        double dollarsDouble = Double.parseDouble(dollarsString);
        double euroResult = dollarsDouble * 0.85; 
        euroResult = Double.parseDouble(new DecimalFormat("##.##").format(euroResult));
        euro.setText("" + euroResult);
    }//GEN-LAST:event_dollarsKeyReleased

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dollars;
    private javax.swing.JTextField euro;
    private javax.swing.JLabel labelDollars;
    private javax.swing.JLabel labelEuro;
    // End of variables declaration//GEN-END:variables
}
