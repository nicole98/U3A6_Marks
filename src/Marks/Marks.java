/*
 * Nicole Tao
 * Marks.java
 * Sorts and calculates marks entered by user
 * May 26th, 2018
 */

package Marks;
import java.text.DecimalFormat;
import java.util.*;
/**
 *
 * @author nitao5001
 */
public class Marks extends javax.swing.JFrame {
    ArrayList <Integer> grades = new ArrayList();
    
    /**
     * Creates new form Marks
     */
    public Marks() {
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

        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelMark = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        textEnter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textSort = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAnalyze = new javax.swing.JTextArea();
        buttonSort = new javax.swing.JButton();
        buttonAnalyze = new javax.swing.JButton();
        labelInvalid = new javax.swing.JLabel();
        buttonReverse = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTitle.setText("Marks Program");

        labelMark.setText("Student Mark");

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        textSort.setColumns(20);
        textSort.setLineWrap(true);
        textSort.setRows(5);
        jScrollPane1.setViewportView(textSort);

        textAnalyze.setColumns(20);
        textAnalyze.setLineWrap(true);
        textAnalyze.setRows(5);
        jScrollPane2.setViewportView(textAnalyze);

        buttonSort.setText("Sort");
        buttonSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSortActionPerformed(evt);
            }
        });

        buttonAnalyze.setText("Analyze");
        buttonAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnalyzeActionPerformed(evt);
            }
        });

        labelInvalid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelInvalid.setForeground(new java.awt.Color(204, 0, 0));

        buttonReverse.setText("Reverse");
        buttonReverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReverseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(labelMark)
                .addGap(31, 31, 31)
                .addComponent(textEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelInvalid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(buttonAdd)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(buttonSort)
                        .addGap(26, 26, 26)
                        .addComponent(buttonReverse)
                        .addGap(60, 60, 60)
                        .addComponent(buttonAnalyze))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(labelTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMark)
                    .addComponent(buttonAdd)
                    .addComponent(textEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelInvalid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAnalyze)
                    .addComponent(buttonSort)
                    .addComponent(buttonReverse))
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        int marks;
        marks = Integer.parseInt(textEnter.getText()); //Get mark from input text and convert String to Integer
        if ((marks >= 0) && (marks <= 100)){
            grades.add(marks); //Only add marks from 0-100 to ArrayList
        }
        else{
            labelInvalid.setText("Invalid mark");//Mark not added to ArrayList, outputs Invalid in label
        }
        textEnter.setText("");//Clears text box
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSortActionPerformed
        textSort.setText("");
        Collections.sort(grades); //Sort ArrayList in increasing order
        for (int i = 0; i <grades.size(); i++){
            textSort.append(grades.get(i) + "\n"); //Output ArrayList in increasing order
        }
    }//GEN-LAST:event_buttonSortActionPerformed

    private void buttonAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnalyzeActionPerformed
        textAnalyze.setText("");
        int range;
        range = maxValue() - minValue(); //Caculates range of values using maxValue and minValue methods
        int [] level = levels(); //Declare and initialize new int array 
        
        DecimalFormat avg = new DecimalFormat ("###.0"); //Display average to one decimal place
            
        textAnalyze.append("Class Average: " + avg.format(classAverage()) + "%" + "\nMaximum mark: " + maxValue()
        + "\nMimimum value: " + minValue() + "\nRange of Marks: " + range
        + "\nNumber at level 4: " + level[4] + "\nNumber at level 3: " + level[3] 
        + "\nNumber at level 2: " + level[2] + "\nNumber at level 1: " + level[1]
        + "\nNumber at level R: " + level[0]);
        
    }//GEN-LAST:event_buttonAnalyzeActionPerformed

    private void buttonReverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReverseActionPerformed
        textSort.setText("");
        Collections.sort(grades); //Sort ArrayList in increading order
        for (int i = grades.size()-1; i >= 0; i--){
            textSort.append(grades.get(i) + "\n");//Output ArrayList in decreasing order
        }
    }//GEN-LAST:event_buttonReverseActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0); //Exits program
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * Calculates the average mark
     * pre:  method is called, there are items in the ArrayList
     * post: returns average
     */
    private double classAverage(){
    double average;
    double sum = 0.0;
    
    for (int i = 0; i <grades.size(); i++){
        sum += grades.get(i);
    }
    average = sum/grades.size();
    return average;
}
    /**
     * Calculates the average mark
     * pre:  method is called, there are items in the ArrayList
     * post: returns maximum mark
     */
    private int maxValue(){
        int max;
        Collections.sort(grades); 
        max = grades.get(grades.size()-1);
        return max;
    }
    /**
     * Calculates the average mark
     * pre:  method is called, there are items in the ArrayList
     * post: returns minimum mark
     */
    private int minValue(){
        int min;
        Collections.sort(grades);
        min = grades.get(0);
        return min;
    }
    /**
     * Calculates the average mark
     * pre: method is called, there are items in the ArrayList
     * post: returns an array 
     */
    private int[] levels(){
    int[] levels;
    levels = new int [5];
    int R=0; int one = 0; int two=0; int three=0; int four=0;
    
    for (int i = 0; i < grades.size(); i++){
        if (grades.get(i) < 50){
            R += 1;
            levels [0] = R;
        }
        else if ((grades.get(i) >= 50) && (grades.get(i) < 60)){
            one += 1;
            levels [1] = one;
        }
        else if ((grades.get(i) >= 60) && (grades.get(i) < 70)){
            two += 1;
            levels [2] = two;
        }
        else if ((grades.get(i) >= 70) && (grades.get(i) < 80)){
            three += 1;
            levels [3] = three;
        }
        else if (grades.get(i) >= 80){
            four += 1;
            levels [4] = four;
        }
    } 
    return levels;
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAnalyze;
    private javax.swing.JButton buttonReverse;
    private javax.swing.JButton buttonSort;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelInvalid;
    private javax.swing.JLabel labelMark;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextArea textAnalyze;
    private javax.swing.JTextField textEnter;
    private javax.swing.JTextArea textSort;
    // End of variables declaration//GEN-END:variables
}
