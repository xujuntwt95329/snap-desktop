/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.esa.snap.configurator.ui;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JFileChooser;
import org.esa.snap.configurator.ConfigurationOptimizer;
import org.esa.snap.configurator.PerformanceParameters;

final class PerformancePanel extends javax.swing.JPanel {
    
    /**
     * Color for fields filed with values in place in the application
     */
    private static final Color CURRENT_VALUES_COLOR = Color.BLACK;

    /**
     * Color for modified fields
     */
    private static final Color MODIFIED_VALUES_COLOR = Color.BLUE;

    /**
     * Color for error fields
     */
    private static final Color ERROR_VALUES_COLOR = Color.RED;

    /**
     * Tool for optimizing and setting the performance parameters
     */
    private ConfigurationOptimizer confOptimizer;

    private final PerformanceOptionsPanelController controller;

    PerformancePanel(PerformanceOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        
        confOptimizer = new ConfigurationOptimizer();

        vmParametersTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (vmParametersTextField.getForeground() != MODIFIED_VALUES_COLOR) {
                    vmParametersTextField.setForeground(MODIFIED_VALUES_COLOR);
                    controller.changed();
                }
            }
        });

        vmTmpDirTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (vmTmpDirTextField.getForeground() != MODIFIED_VALUES_COLOR) {
                    vmTmpDirTextField.setForeground(MODIFIED_VALUES_COLOR);
                    controller.changed();
                }
            }
        });

        userDirTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (userDirTextField.getForeground() != MODIFIED_VALUES_COLOR) {
                    userDirTextField.setForeground(MODIFIED_VALUES_COLOR);
                    controller.changed();
                }
            }
        });

        tileSizeTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (tileSizeTextField.getForeground() != MODIFIED_VALUES_COLOR) {
                    tileSizeTextField.setForeground(MODIFIED_VALUES_COLOR);
                    controller.changed();
                }
            }
        });

        cacheSizeTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (cacheSizeTextField.getForeground() != MODIFIED_VALUES_COLOR) {
                    cacheSizeTextField.setForeground(MODIFIED_VALUES_COLOR);
                    controller.changed();
                }
            }
        });

        nbThreadsTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (nbThreadsTextField.getForeground() != MODIFIED_VALUES_COLOR) {
                    nbThreadsTextField.setForeground(MODIFIED_VALUES_COLOR);
                    controller.changed();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        systemParametersPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vmParametersTextField = new javax.swing.JTextField();
        vmTmpDirTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        userDirTextField = new javax.swing.JTextField();
        browseJAICacheButton = new javax.swing.JButton();
        browseLargeCacheButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sysResetButton = new javax.swing.JButton();
        sysComputeButton = new javax.swing.JButton();
        jaiCacheInfoLabel = new javax.swing.JLabel();
        largeCacheInfoLabel = new javax.swing.JLabel();
        vmParametersInfoLabel = new javax.swing.JLabel();
        processingParametersPanel = new javax.swing.JPanel();
        tileSizeLabel = new javax.swing.JLabel();
        cacheSizeLabel = new javax.swing.JLabel();
        nbThreadsLabel = new javax.swing.JLabel();
        tileSizeTextField = new javax.swing.JTextField();
        cacheSizeTextField = new javax.swing.JTextField();
        nbThreadsTextField = new javax.swing.JTextField();
        processingParamsResetButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 3000), new java.awt.Dimension(0, 32767));

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        systemParametersPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.systemParametersPanel.border.title"))); // NOI18N
        systemParametersPanel.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.jLabel2.text")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        systemParametersPanel.add(jLabel2, gridBagConstraints);

        vmParametersTextField.setText(org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.vmParametersTextField.text")); // NOI18N
        vmParametersTextField.setToolTipText(org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.vmParametersTextField.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 10);
        systemParametersPanel.add(vmParametersTextField, gridBagConstraints);

        vmTmpDirTextField.setText(org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.jaiCacheTextField.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        systemParametersPanel.add(vmTmpDirTextField, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.jLabel4.text")); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 14));
        jLabel4.setMinimumSize(new java.awt.Dimension(80, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 5);
        systemParametersPanel.add(jLabel4, gridBagConstraints);

        userDirTextField.setText(org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.largeTileCacheTextField.text")); // NOI18N
        userDirTextField.setToolTipText(org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.largeTileCacheTextField.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        systemParametersPanel.add(userDirTextField, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(browseJAICacheButton, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.browseJAICacheButton.text")); // NOI18N
        browseJAICacheButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseJAICacheButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 3, 0, 10);
        systemParametersPanel.add(browseJAICacheButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(browseLargeCacheButton, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.browseLargeCacheButton.text")); // NOI18N
        browseLargeCacheButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseLargeCacheButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 0, 10);
        systemParametersPanel.add(browseLargeCacheButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.jLabel3.text")); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 14));
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 2, 5);
        systemParametersPanel.add(jLabel3, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(sysResetButton, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.sysResetButton.text")); // NOI18N
        sysResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sysResetButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(10, 3, 0, 10);
        systemParametersPanel.add(sysResetButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(sysComputeButton, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.sysComputeButton.text")); // NOI18N
        sysComputeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sysComputeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 3);
        systemParametersPanel.add(sysComputeButton, gridBagConstraints);

        jaiCacheInfoLabel.setFont(new java.awt.Font("Tahoma", 2, 8)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jaiCacheInfoLabel, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.jaiCacheInfoLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        systemParametersPanel.add(jaiCacheInfoLabel, gridBagConstraints);

        largeCacheInfoLabel.setFont(new java.awt.Font("Tahoma", 2, 8)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(largeCacheInfoLabel, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.largeCacheInfoLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        systemParametersPanel.add(largeCacheInfoLabel, gridBagConstraints);

        vmParametersInfoLabel.setFont(new java.awt.Font("Tahoma", 2, 8)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(vmParametersInfoLabel, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.vmParametersInfoLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        systemParametersPanel.add(vmParametersInfoLabel, gridBagConstraints);

        add(systemParametersPanel);

        processingParametersPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.processingParametersPanel.border.title"))); // NOI18N
        processingParametersPanel.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(tileSizeLabel, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.tileSizeLabel.text")); // NOI18N
        tileSizeLabel.setMaximumSize(new java.awt.Dimension(100, 14));
        tileSizeLabel.setPreferredSize(new java.awt.Dimension(80, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 2, 5);
        processingParametersPanel.add(tileSizeLabel, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(cacheSizeLabel, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.cacheSizeLabel.text")); // NOI18N
        cacheSizeLabel.setMaximumSize(new java.awt.Dimension(100, 14));
        cacheSizeLabel.setPreferredSize(new java.awt.Dimension(80, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 2, 5);
        processingParametersPanel.add(cacheSizeLabel, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(nbThreadsLabel, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.nbThreadsLabel.text")); // NOI18N
        nbThreadsLabel.setMaximumSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 2, 5);
        processingParametersPanel.add(nbThreadsLabel, gridBagConstraints);

        tileSizeTextField.setText(org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.tileSizeTextField.text")); // NOI18N
        tileSizeTextField.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 10);
        processingParametersPanel.add(tileSizeTextField, gridBagConstraints);

        cacheSizeTextField.setText(org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.cacheSizeTextField.text")); // NOI18N
        cacheSizeTextField.setMinimumSize(new java.awt.Dimension(100, 20));
        cacheSizeTextField.setName(""); // NOI18N
        cacheSizeTextField.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 10);
        processingParametersPanel.add(cacheSizeTextField, gridBagConstraints);

        nbThreadsTextField.setText(org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.nbThreadsTextField.text")); // NOI18N
        nbThreadsTextField.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 10);
        processingParametersPanel.add(nbThreadsTextField, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(processingParamsResetButton, org.openide.util.NbBundle.getMessage(PerformancePanel.class, "PerformancePanel.processingParamsResetButton.text")); // NOI18N
        processingParamsResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processingParamsResetButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 3, 0, 10);
        processingParametersPanel.add(processingParamsResetButton, gridBagConstraints);

        add(processingParametersPanel);
        add(filler1);
    }// </editor-fold>//GEN-END:initComponents


    private void browseJAICacheButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseJAICacheButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser(vmTmpDirTextField.getText());
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedDir = fileChooser.getSelectedFile();
            vmTmpDirTextField.setText(selectedDir.getAbsolutePath());
            vmTmpDirTextField.setForeground(MODIFIED_VALUES_COLOR);
            controller.changed();
        }
    }//GEN-LAST:event_browseJAICacheButtonActionPerformed

    private void browseLargeCacheButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseJAICacheButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser(vmTmpDirTextField.getText());
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedDir = fileChooser.getSelectedFile();
            userDirTextField.setText(selectedDir.getAbsolutePath());
            userDirTextField.setForeground(MODIFIED_VALUES_COLOR);
            controller.changed();
        }
    }//GEN-LAST:event_browseJAICacheButtonActionPerformed

    private void sysResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysResetButtonActionPerformed
        setSystemPerformanceParametersToActualValues();
    }//GEN-LAST:event_sysResetButtonActionPerformed

    private void sysComputeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysComputeButtonActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        PerformanceParameters optimizedParameters = confOptimizer.computeOptimisedSystemParameters();

        if(!vmParametersTextField.getText().equals(optimizedParameters.getVMParameters())) {
            vmParametersTextField.setText(optimizedParameters.getVMParameters());
            vmParametersTextField.setForeground(MODIFIED_VALUES_COLOR);
            vmParametersTextField.setCaretPosition(0);
        }

        if(!vmTmpDirTextField.getText().equals(optimizedParameters.getVmTmpDir())) {
            vmTmpDirTextField.setText(optimizedParameters.getVmTmpDir());
            vmTmpDirTextField.setForeground(MODIFIED_VALUES_COLOR);
        }

        if(!userDirTextField.getText().equals(optimizedParameters.getUserDir())) {
            userDirTextField.setText(optimizedParameters.getUserDir());
            userDirTextField.setForeground(MODIFIED_VALUES_COLOR);
        }

        setCursor(Cursor.getDefaultCursor());

        controller.changed();
    }//GEN-LAST:event_sysComputeButtonActionPerformed

    private void processingParamsResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processingParamsResetButtonActionPerformed
        setProcessingPerformanceParametersToActualValues();
    }//GEN-LAST:event_processingParamsResetButtonActionPerformed

    void load() {
        setSystemPerformanceParametersToActualValues();
        setProcessingPerformanceParametersToActualValues();
    }

    void store() {
        if(valid()) {
            PerformanceParameters updatedPerformanceParams = getPerformanceParameters();
            confOptimizer.updateCustomisedParameters(updatedPerformanceParams);
            confOptimizer.saveCustomisedParameters();
        }
    }


    private PerformanceParameters getPerformanceParameters() {
        PerformanceParameters parameters = new PerformanceParameters();
        parameters.setVMParameters(vmParametersTextField.getText());
        parameters.setVmTmpDir(vmTmpDirTextField.getText());
        parameters.setUserDir(userDirTextField.getText());
        parameters.setTileCacheCapacity(Long.parseLong(cacheSizeTextField.getText()));
        parameters.setTileSize(Long.parseLong(tileSizeTextField.getText()));
        parameters.setNbThreads(Integer.parseInt(nbThreadsTextField.getText()));
        return parameters;
    }

    boolean valid() {
        boolean isValid = true;

        File vmTmpDir = new File(vmTmpDirTextField.getText());
        if(!vmTmpDir.exists() || !vmTmpDir.isDirectory()) {
            vmTmpDirTextField.setForeground(ERROR_VALUES_COLOR);
            isValid = false;
        }

        File userDir = new File(userDirTextField.getText());
        if(!userDir.exists() || !userDir.isDirectory()) {
            userDirTextField.setForeground(ERROR_VALUES_COLOR);
            isValid = false;
        }

        String tileCacheCapacity = cacheSizeTextField.getText();
        try{
            Long.parseUnsignedLong(tileCacheCapacity);
        } catch (NumberFormatException ex) {
            cacheSizeTextField.setForeground(ERROR_VALUES_COLOR);
            isValid = false;
        }

        String tileSize = tileSizeTextField.getText();
        try{
            Long.parseUnsignedLong(tileSize);
        } catch (NumberFormatException ex) {
            tileSizeTextField.setForeground(ERROR_VALUES_COLOR);
            isValid = false;
        }

        String nbThreads = nbThreadsTextField.getText();
        try{
            Integer.parseUnsignedInt(nbThreads);
        } catch (NumberFormatException ex) {
            nbThreadsTextField.setForeground(ERROR_VALUES_COLOR);
            isValid = false;
        }

        return isValid;
    }

    private void setSystemPerformanceParametersToActualValues() {
        PerformanceParameters actualPerformanceParameters = confOptimizer.getActualPerformanceParameters();

        vmParametersTextField.setText(actualPerformanceParameters.getVMParameters());
        vmParametersTextField.setForeground(CURRENT_VALUES_COLOR);
        vmParametersTextField.setCaretPosition(0);

        vmTmpDirTextField.setText(actualPerformanceParameters.getVmTmpDir());
        vmTmpDirTextField.setForeground(CURRENT_VALUES_COLOR);

        userDirTextField.setText(actualPerformanceParameters.getUserDir());
        userDirTextField.setForeground(CURRENT_VALUES_COLOR);
    }

    private void setProcessingPerformanceParametersToActualValues() {
        PerformanceParameters actualPerformanceParameters = confOptimizer.getActualPerformanceParameters();

        cacheSizeTextField.setText(Long.toString(actualPerformanceParameters.getTileCacheCapacity()));
        cacheSizeTextField.setForeground(CURRENT_VALUES_COLOR);

        tileSizeTextField.setText(Long.toString(actualPerformanceParameters.getTileSize()));
        tileSizeTextField.setForeground(CURRENT_VALUES_COLOR);

        nbThreadsTextField.setText(Integer.toString(actualPerformanceParameters.getNbThreads()));
        nbThreadsTextField.setForeground(CURRENT_VALUES_COLOR);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseJAICacheButton;
    private javax.swing.JButton browseLargeCacheButton;
    private javax.swing.JLabel cacheSizeLabel;
    private javax.swing.JTextField cacheSizeTextField;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jaiCacheInfoLabel;
    private javax.swing.JTextField vmTmpDirTextField;
    private javax.swing.JLabel largeCacheInfoLabel;
    private javax.swing.JTextField userDirTextField;
    private javax.swing.JLabel nbThreadsLabel;
    private javax.swing.JTextField nbThreadsTextField;
    private javax.swing.JPanel processingParametersPanel;
    private javax.swing.JButton processingParamsResetButton;
    private javax.swing.JButton sysComputeButton;
    private javax.swing.JButton sysResetButton;
    private javax.swing.JPanel systemParametersPanel;
    private javax.swing.JLabel tileSizeLabel;
    private javax.swing.JTextField tileSizeTextField;
    private javax.swing.JLabel vmParametersInfoLabel;
    private javax.swing.JTextField vmParametersTextField;
    // End of variables declaration//GEN-END:variables
}