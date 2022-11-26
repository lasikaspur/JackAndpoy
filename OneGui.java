
package com.mycompany.one;
import java.util.Random;

public class OneGui extends javax.swing.JFrame {
Random rand = new Random();
int upperbound = 3;
int computerInput = 0;
int counterP = 0;
int counterC = 0;
    public OneGui() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        computer = new javax.swing.JLabel();
        player = new javax.swing.JLabel();
        computerTF = new javax.swing.JLabel();
        playerCB = new javax.swing.JComboBox<>();
        exit = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        counterPlayer = new javax.swing.JLabel();
        counterComputer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setText("JACK & POY");

        computer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        computer.setText("COMPUTER : ");

        player.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        player.setText("PLAYER :");

        computerTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        computerTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerTF.setText(" ________________");

        playerCB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROCK", "PAPER", "SCISSORS" }));
        playerCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerCBActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        enter.setText("ENTER");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        result.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        counterPlayer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        counterPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counterPlayer.setText("0");
        counterPlayer.setToolTipText("");

        counterComputer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        counterComputer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counterComputer.setText("0");
        counterComputer.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(computer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(computerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(counterComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(counterPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(counterPlayer, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(playerCB)))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(computer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(computerTF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(counterComputer))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playerCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerCBActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_playerCBActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed

        String selectedvalue = playerCB.getSelectedItem().toString();
        computerInput = rand.nextInt(upperbound);
       
        switch(computerInput){
            case 0:
                computerTF.setText("ROCK");
                break;
            case 1:
                computerTF.setText("PAPER");
                break;
            case 2:
                computerTF.setText("SCISSORS");
                break;   
        }
        
        if(selectedvalue.equals("ROCK" )&& computerInput == 1 ){
            counterC +=1;
            counterComputer.setText(Integer.toString(counterC));
            result.setText("COMPUTER WINS");
            
        }
        else if(selectedvalue.equals("ROCK") && computerInput == 2){
            counterP += 1;
            counterPlayer.setText(Integer.toString(counterP));
            result.setText("PLAYER WINS");
        }
        else if(selectedvalue.equals("PAPER") && computerInput == 0){
            counterP += 1;
            counterPlayer.setText(Integer.toString(counterP));
            result.setText("PLAYER WINS");
        }
        else if(selectedvalue.equals("PAPER") && computerInput == 2){
            counterC += 1;
            counterComputer.setText(Integer.toString(counterC));
            result.setText("COMPUTER WINS");
        }
        else if(selectedvalue.equals("SCISSORS") && computerInput == 0){
            counterC += 1;
            counterComputer.setText(Integer.toString(counterC));
            result.setText("COMPUTER WINS");
        }
        else if(selectedvalue.equals("SCISSORS") && computerInput == 1){
            counterP += 1;
            counterPlayer.setText(Integer.toString(counterP));
            result.setText("PLAYER WINS");
        }
        else result.setText("DRAW");
     
        
        
        if(counterP == 5){
            title.setText("YOU WIN");
            remove(computer);
            remove(player);
            remove(enter);
            remove(playerCB);
            remove(computerTF);
            remove(counterPlayer);
            remove(counterComputer);
            
        }
        else if(counterC == 5){
            title.setText("YOU LOST");
            remove(enter);
            remove(counterPlayer);
            remove(counterComputer);
            remove(player);
            remove(computer);
            remove(playerCB);
            remove(computerTF);
        }
    }//GEN-LAST:event_enterActionPerformed

      
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OneGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel computer;
    private javax.swing.JLabel computerTF;
    private javax.swing.JLabel counterComputer;
    private javax.swing.JLabel counterPlayer;
    private javax.swing.JButton enter;
    private javax.swing.JButton exit;
    private javax.swing.JLabel player;
    private javax.swing.JComboBox<String> playerCB;
    private javax.swing.JLabel result;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
