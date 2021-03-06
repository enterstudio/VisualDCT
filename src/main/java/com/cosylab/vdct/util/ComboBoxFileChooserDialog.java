/*
 * ComboBoxFileChooser.java
 *
 * Created on July 20, 2004, 5:06 PM
 */

package com.cosylab.vdct.util;
import javax.swing.JFileChooser;

/**
 *
 * @author  ilist
 */
public class ComboBoxFileChooserDialog extends javax.swing.JDialog {
        
    /** Creates new form ComboBoxFileChooser
     * @param parent
     * @param jfc */
    public ComboBoxFileChooserDialog(java.awt.Frame parent, JFileChooser jfc) {
        super(parent, true);
        jFileChooser = jfc;
        initComponents();    
		if(jfc.getDialogType() ==JFileChooser. OPEN_DIALOG)
			jButtonDefault.setText("Open");
		else if (jfc.getDialogType() == JFileChooser.SAVE_DIALOG) 		
			jButtonDefault.setText("Save");
        
        
        //getRootPane().setDefaultButton(jButtonDefault);
		//getRootPane().setWindowDecorationStyle(JRootPane.FILE_CHOOSER_DIALOG);
		//final File blankFile = new File(""); 
		//jFileChooser.setSelectedFile(blankFile);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        jCheckBoxAbsoluteDBD = new javax.swing.JCheckBox();
        jButtonDefault = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
   
        jFileChooser.setControlButtonsAreShown(false);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jFileChooser, gridBagConstraints);

        jCheckBoxAbsoluteDBD.setText("Use absolute DBD paths");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 10, 0);
        getContentPane().add(jCheckBoxAbsoluteDBD, gridBagConstraints);

        jButtonDefault.setText("Save");
        jButtonDefault.setMinimumSize(new java.awt.Dimension(75, 25));
        jButtonDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDefaultActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 11, 5);
        getContentPane().add(jButtonDefault, gridBagConstraints);

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 11, 11);
        getContentPane().add(jButtonCancel, gridBagConstraints);

        pack();
    }//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
		jFileChooser.cancelSelection();
		//jFileChooser.getActionMap().get("cancelSelection").actionPerformed(evt);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDefaultActionPerformed     
		if (jFileChooser.getActionMap().get("approveSelection")!=null) {
			jFileChooser.getActionMap().get("approveSelection").actionPerformed(evt);
		} else {
			if (jFileChooser.getSelectedFile()!=null) {
				jFileChooser.approveSelection();
			}
		}
    }//GEN-LAST:event_jButtonDefaultActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDefault;
    private javax.swing.JCheckBox jCheckBoxAbsoluteDBD;
    private javax.swing.JFileChooser jFileChooser;
    // End of variables declaration//GEN-END:variables
    
	/**
	 * @return
	 */
	public javax.swing.JCheckBox getJCheckBoxAbsoluteDBD() {
		return jCheckBoxAbsoluteDBD;
	}

	/**
	 * @return
	 */
	public javax.swing.JFileChooser getJFileChooser() {
		return jFileChooser;
	}
}
