package suhu;
public class konversi extends javax.swing.JFrame {
    public konversi() {
        initComponents();
        reset();
    }
    void reset(){
        txtsuhuawal.setText(null);
        vcelcius.setText(null);
        vfahrenheit.setText(null);
        vreamur.setText(null);
        vkelvin.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtsuhuawal = new javax.swing.JTextField();
        Bcelcius = new javax.swing.JButton();
        Bfahrenheit = new javax.swing.JButton();
        Breamur = new javax.swing.JButton();
        Bkelvin = new javax.swing.JButton();
        vcelcius = new javax.swing.JLabel();
        vfahrenheit = new javax.swing.JLabel();
        vreamur = new javax.swing.JLabel();
        vkelvin = new javax.swing.JLabel();
        Breset = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("KONVERSI SUHU");

        jLabel2.setText("SuhuAwal");
        jLabel2.setToolTipText("SuhuAwal");

        Bcelcius.setText("celcius");
        Bcelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcelciusActionPerformed(evt);
            }
        });

        Bfahrenheit.setText("fahrenheit");
        Bfahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfahrenheitActionPerformed(evt);
            }
        });

        Breamur.setText("reamur");
        Breamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreamurActionPerformed(evt);
            }
        });

        Bkelvin.setText("kelvin");
        Bkelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BkelvinActionPerformed(evt);
            }
        });

        vcelcius.setText("jLabel3");

        vfahrenheit.setText("jLabel4");

        vreamur.setText("jLabel5");

        vkelvin.setText("jLabel6");

        Breset.setText("Reset");
        Breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vfahrenheit)
                            .addComponent(vcelcius)
                            .addComponent(vreamur)
                            .addComponent(vkelvin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Breset)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Bcelcius))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsuhuawal, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Bfahrenheit)
                                        .addGap(18, 18, 18)
                                        .addComponent(Breamur)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Bkelvin)))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsuhuawal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bcelcius)
                    .addComponent(Bfahrenheit)
                    .addComponent(Breamur)
                    .addComponent(Bkelvin))
                .addGap(30, 30, 30)
                .addComponent(vcelcius)
                .addGap(18, 18, 18)
                .addComponent(vfahrenheit)
                .addGap(18, 18, 18)
                .addComponent(vreamur)
                .addGap(18, 18, 18)
                .addComponent(vkelvin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Breset)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_BresetActionPerformed

    private void BcelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcelciusActionPerformed
        // TODO add your handling code here:
        double SuhuAwal = Double.parseDouble(txtsuhuawal.getText());
        double celcius = SuhuAwal;
        double fahrenheit = celcius * 1.8 + 32;
        double reamur = celcius * 0.8;
        double kelvin = celcius + 273.15;
        vcelcius.setText("celcius :" + celcius);
        vfahrenheit.setText("fahtenheit :" + fahrenheit);
        vreamur.setText("reamur:" + reamur);
        vkelvin.setText("kelvin:" + kelvin);
       
    }//GEN-LAST:event_BcelciusActionPerformed

    private void BfahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfahrenheitActionPerformed
        // TODO add your handling code here:
        double SuhuAwal = Double.parseDouble(txtsuhuawal.getText());
        double fahrenheit = SuhuAwal;
        double celcius = (fahrenheit - 32) / 1.8;
        double reamur = (fahrenheit - 32) / 2.25;
        double kelvin = (fahrenheit + 459.67) / 1.8;
        vfahrenheit.setText("fahrenheit :" + fahrenheit);
        vcelcius.setText("celcius :" + celcius);
        vreamur.setText("reamur:" + reamur);
        vkelvin.setText("kelvin:" + kelvin);
        
        
    }//GEN-LAST:event_BfahrenheitActionPerformed

    private void BreamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreamurActionPerformed
        // TODO add your handling code here:
        double SuhuAwal = Double.parseDouble(txtsuhuawal.getText());
        double reamur = SuhuAwal;
        double celcius= reamur / 0.8;
        double fahrenheit = (reamur * 2.25) + 32;
        double kelvin = reamur / 0.8 + 237.15;
        vreamur.setText("reamur:" + reamur);
        vcelcius.setText("celcius :" + celcius);
        vfahrenheit.setText("fahtenheit :" + fahrenheit);
        vkelvin.setText("kelvin:" + kelvin);
        
    }//GEN-LAST:event_BreamurActionPerformed

    private void BkelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BkelvinActionPerformed
        // TODO add your handling code here:
        double SuhuAwal = Double.parseDouble(txtsuhuawal.getText());
        double kelvin = SuhuAwal;
        double celcius= kelvin - 273.15;
        double fahrenheit = kelvin * 1.8 - 459.67;
        double reamur = (kelvin - 273.15) * 0.8;
        vkelvin.setText("kelvin:" + kelvin);
        vcelcius.setText("celcius :" + celcius);
        vfahrenheit.setText("fahtenheit :" + fahrenheit);
        vreamur.setText("reamur:" + reamur);

        
    }//GEN-LAST:event_BkelvinActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konversi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcelcius;
    private javax.swing.JButton Bfahrenheit;
    private javax.swing.JButton Bkelvin;
    private javax.swing.JButton Breamur;
    private javax.swing.JButton Breset;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private javax.swing.JTextField txtsuhuawal;
    private javax.swing.JLabel vcelcius;
    private javax.swing.JLabel vfahrenheit;
    private javax.swing.JLabel vkelvin;
    private javax.swing.JLabel vreamur;
    // End of variables declaration//GEN-END:variables
}
