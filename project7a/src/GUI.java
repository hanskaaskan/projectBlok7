import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Ernst
 */
public class GUI extends javax.swing.JFrame {
    JFileChooser fileChooser = new JFileChooser();
    File selectedFile;
    private static BufferedReader inFile;
    Applicatie app = new Applicatie();
    /**
     * Creates new form NewJFrame
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bestandTextField = new javax.swing.JTextField();
        bladerButton = new javax.swing.JButton();
        zoekButton = new javax.swing.JButton();
        voorspelButton = new javax.swing.JButton();
        voorspelORFButton = new javax.swing.JButton();
        blastButton = new javax.swing.JButton();
        visualiseerBlastButton = new javax.swing.JButton();
        zoekTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        orfVisualisatie = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        blastVisualisatie = new javax.swing.JTextArea();
        scrollPane1 = new java.awt.ScrollPane();
        scrollPane2 = new java.awt.ScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        openButton.setText("Open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Bestand:");

        bestandTextField.setText("Bestand hier");

        bladerButton.setText("Blader");
        bladerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bladerButtonActionPerformed(evt);
            }
        });

        zoekButton.setText("Zoek ORFs");

        voorspelButton.setText("Voorspel ORFs");

        voorspelORFButton.setText("Visualiseer ORFs");
        voorspelORFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voorspelORFButtonActionPerformed(evt);
            }
        });

        blastButton.setText("Blast");

        visualiseerBlastButton.setText("Visualiseer Blast");

        orfVisualisatie.setColumns(20);
        orfVisualisatie.setRows(5);
        jScrollPane1.setViewportView(orfVisualisatie);

        blastVisualisatie.setColumns(20);
        blastVisualisatie.setRows(5);
        jScrollPane2.setViewportView(blastVisualisatie);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zoekTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zoekButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bestandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(voorspelButton)
                                        .addComponent(voorspelORFButton)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(bladerButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(openButton)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blastButton)
                            .addComponent(visualiseerBlastButton))))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bestandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bladerButton)
                    .addComponent(openButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(voorspelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voorspelORFButton))
                    .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(blastButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(visualiseerBlastButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zoekTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zoekButton))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bladerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bladerButtonActionPerformed
        int reply = fileChooser.showOpenDialog(this);
        if (reply == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
        }
        bestandTextField.setText(selectedFile.getAbsolutePath());
    }//GEN-LAST:event_bladerButtonActionPerformed

    private void voorspelORFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voorspelORFButtonActionPerformed
    app.voorspel(app.sequence);
    app.voorspel(app.reverseSequentie(app.sequence));

// TODO add your handling code here:
    }//GEN-LAST:event_voorspelORFButtonActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        String fileLocation = bestandTextField.getText();
            try {
                app.leesBestand(fileLocation);

            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
     
    }//GEN-LAST:event_openButtonActionPerformed

    private void visualiseerORF(ORF item, DNA sequentie){
        

    //visualiseren van ORFs
    }
    
    private void visualiseerBlast(BLAST item){
        //visualiseren van de blastresultaten
    }
    private void openActionPerformed(){
        // openen van een bestand
    }
    
    private void leesActionPerformed(){
        //lezen van een bestand
    }
    
    private void zoekActionPerformed(){
        // zoeken over DNA sequentie
    }


    private void visualiseerOrfActionPerformed(){
        //visualiseren van ORFs
    }
    
    private void visualiseerBlastActionPerformed(){
        // visualiseren van de blast resultaten
    }
    
    private void blastActionPerformed(){
        // uitvoeren van de blast
    } 
   /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bestandTextField;
    private javax.swing.JButton bladerButton;
    private javax.swing.JButton blastButton;
    private javax.swing.JTextArea blastVisualisatie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton openButton;
    private javax.swing.JTextArea orfVisualisatie;
    private java.awt.ScrollPane scrollPane1;
    private java.awt.ScrollPane scrollPane2;
    private javax.swing.JButton visualiseerBlastButton;
    private javax.swing.JButton voorspelButton;
    private javax.swing.JButton voorspelORFButton;
    private javax.swing.JButton zoekButton;
    private javax.swing.JTextField zoekTextField;
    // End of variables declaration//GEN-END:variables
}