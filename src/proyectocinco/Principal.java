package proyectocinco;

import funciones.Altas;
import funciones.IniciarSesion;

import pojos.Cliente;

import java.awt.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Query;
import org.hibernate.Session;

public class Principal extends javax.swing.JFrame {

    private Connection conexion;
    private Cliente clienteSeleccionado;
    private String aficiones;

    public Principal() {
        initComponents();
        rbHombre.setActionCommand("Hombre");
        rbMujer.setActionCommand("Mujer");
        txtEdadAlta.setName("txtEdadAlta");
        
        setSize(1000, 650);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private DefaultTableModel crearModelo() {
        String[] columnas = new String[5];
        columnas[0] = "DNI";
        columnas[1] = "Nombre";
        columnas[2] = "Sexo";
        columnas[3] = "Edad";
        columnas[4] = "Ciudad";

        DefaultTableModel mod = new DefaultTableModel(columnas, 0);

        return mod;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupHombreMujer = new javax.swing.ButtonGroup();
        frameMod = new javax.swing.JFrame();
        jLabel13 = new javax.swing.JLabel();
        txtDniMod = new javax.swing.JTextField();
        txtNameMod = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rbHombreMod = new javax.swing.JRadioButton();
        rbMujerMod = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        txtEdadMod = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCiudadMod = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        panelAficionesMod = new javax.swing.JPanel();
        cbAficionMod7 = new javax.swing.JCheckBox();
        cbAficionMod1 = new javax.swing.JCheckBox();
        cbAficionMod4 = new javax.swing.JCheckBox();
        cbAficionMod2 = new javax.swing.JCheckBox();
        cbAficionMod5 = new javax.swing.JCheckBox();
        cbAficionMod8 = new javax.swing.JCheckBox();
        cbAficionMod3 = new javax.swing.JCheckBox();
        cbAficionMod6 = new javax.swing.JCheckBox();
        cbAficionMod9 = new javax.swing.JCheckBox();
        cbAficionMod12 = new javax.swing.JCheckBox();
        cbAficionMod11 = new javax.swing.JCheckBox();
        cbAficionMod15 = new javax.swing.JCheckBox();
        cbAficionMod14 = new javax.swing.JCheckBox();
        cbAficionMod10 = new javax.swing.JCheckBox();
        cbAficionMod13 = new javax.swing.JCheckBox();
        btnOkMod = new javax.swing.JButton();
        btnCancelarMod = new javax.swing.JButton();
        groupHombreMujerMod = new javax.swing.ButtonGroup();
        panelesFrame1 = new javax.swing.JTabbedPane();
        panelConexion = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        comboBD = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        btnCrearBD = new javax.swing.JButton();
        btnConectar1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pizarraConexion = new javax.swing.JTextArea();
        panelAltasCli = new javax.swing.JPanel();
        panelDatosCliAlta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNameAlta = new javax.swing.JTextField();
        rbHombre = new javax.swing.JRadioButton();
        rbMujer = new javax.swing.JRadioButton();
        txtEdadAlta = new javax.swing.JTextField();
        txtCiudadAlta = new javax.swing.JTextField();
        panelAficionesAlta = new javax.swing.JPanel();
        cbAficion4 = new javax.swing.JCheckBox();
        cbAficion1 = new javax.swing.JCheckBox();
        cbAficion5 = new javax.swing.JCheckBox();
        cbAficion2 = new javax.swing.JCheckBox();
        cbAficion3 = new javax.swing.JCheckBox();
        cbAficion6 = new javax.swing.JCheckBox();
        cbAficion7 = new javax.swing.JCheckBox();
        cbAficion8 = new javax.swing.JCheckBox();
        cbAficion9 = new javax.swing.JCheckBox();
        cbAficion12 = new javax.swing.JCheckBox();
        cbAficion11 = new javax.swing.JCheckBox();
        cbAficion10 = new javax.swing.JCheckBox();
        cbAficion15 = new javax.swing.JCheckBox();
        cbAficion14 = new javax.swing.JCheckBox();
        cbAficion13 = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDniAlta = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        panelClientes = new javax.swing.JPanel();
        panelDatosCliMod = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNameCli = new javax.swing.JLabel();
        txtDniCli = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtSexoCli = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEdadCli = new javax.swing.JLabel();
        txtCiudadCli = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        panelAficionesCli = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAficionesMod = new javax.swing.JTextArea();
        btnEditarMod = new javax.swing.JButton();
        btnGuardarMod = new javax.swing.JButton();
        btnDelCli = new javax.swing.JButton();
        btnClearMod = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaClientesMod = new javax.swing.JTable();
        panelHistorico = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        panelMatrimonio = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        pizarraFin = new javax.swing.JTextArea();

        frameMod.setTitle("Modificar Datos");

        jLabel13.setText("DNI:");

        txtDniMod.setEditable(false);
        txtDniMod.setBackground(new java.awt.Color(204, 204, 204));

        jLabel15.setText("Nombre:");

        groupHombreMujerMod.add(rbHombreMod);
        rbHombreMod.setSelected(true);
        rbHombreMod.setText("Hombre");

        groupHombreMujerMod.add(rbMujerMod);
        rbMujerMod.setText("Mujer");

        jLabel17.setText("Sexo:");

        jLabel19.setText("Edad:");

        jLabel20.setText("Ciudad:");

        panelAficionesMod.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aficiones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cbAficionMod7.setText("Bailar");

        cbAficionMod1.setText("Senderismo");

        cbAficionMod4.setText("Viajar");

        cbAficionMod2.setText("Dormir");

        cbAficionMod5.setText("Comer");

        cbAficionMod8.setText("Vaguear");

        cbAficionMod3.setText("Saltar");

        cbAficionMod6.setText("Escribir");

        cbAficionMod9.setText("Lectura");

        cbAficionMod12.setText("Música");

        cbAficionMod11.setText("Caminar");

        cbAficionMod15.setText("Coches");

        cbAficionMod14.setText("Golpear");

        cbAficionMod10.setText("Deporte");

        cbAficionMod13.setText("Informática");

        javax.swing.GroupLayout panelAficionesModLayout = new javax.swing.GroupLayout(panelAficionesMod);
        panelAficionesMod.setLayout(panelAficionesModLayout);
        panelAficionesModLayout.setHorizontalGroup(
            panelAficionesModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAficionesModLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAficionesModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAficionMod1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAficionMod4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAficionMod7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAficionMod10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAficionMod13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelAficionesModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAficionMod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAficionMod5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAficionMod8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAficionMod11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAficionMod14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAficionesModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAficionMod3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAficionMod6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAficionMod9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAficionMod12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAficionMod15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAficionesModLayout.setVerticalGroup(
            panelAficionesModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAficionesModLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAficionesModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAficionMod1)
                    .addComponent(cbAficionMod2)
                    .addComponent(cbAficionMod3))
                .addGap(18, 18, 18)
                .addGroup(panelAficionesModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAficionMod4)
                    .addComponent(cbAficionMod5)
                    .addComponent(cbAficionMod6))
                .addGap(18, 18, 18)
                .addGroup(panelAficionesModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAficionMod7)
                    .addComponent(cbAficionMod8)
                    .addComponent(cbAficionMod9))
                .addGap(18, 18, 18)
                .addGroup(panelAficionesModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAficionMod12)
                    .addComponent(cbAficionMod11)
                    .addComponent(cbAficionMod10))
                .addGap(18, 18, 18)
                .addGroup(panelAficionesModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAficionMod15)
                    .addComponent(cbAficionMod14)
                    .addComponent(cbAficionMod13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOkMod.setText("Aceptar");
        btnOkMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkModActionPerformed(evt);
            }
        });

        btnCancelarMod.setText("Cancelar");
        btnCancelarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameModLayout = new javax.swing.GroupLayout(frameMod.getContentPane());
        frameMod.getContentPane().setLayout(frameModLayout);
        frameModLayout.setHorizontalGroup(
            frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameModLayout.createSequentialGroup()
                .addGroup(frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameModLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDniMod)
                            .addComponent(txtCiudadMod)
                            .addComponent(txtNameMod)
                            .addGroup(frameModLayout.createSequentialGroup()
                                .addGroup(frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdadMod, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(frameModLayout.createSequentialGroup()
                                        .addComponent(rbHombreMod)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbMujerMod)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameModLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOkMod)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarMod))
                    .addGroup(frameModLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panelAficionesMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        frameModLayout.setVerticalGroup(
            frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameModLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbHombreMod)
                    .addComponent(rbMujerMod)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdadMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCiudadMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addComponent(panelAficionesMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarMod)
                    .addComponent(btnOkMod))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGENCIA MATRIMONIAL");

        panelesFrame1.setPreferredSize(new java.awt.Dimension(949, 600));

        comboBD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hibernate", "NeoDatis", "Exist" }));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Seleccione BD a usar:");

        btnCrearBD.setText("CREAR NUEVA BD AGENCIA");
        btnCrearBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearBDActionPerformed(evt);
            }
        });

        btnConectar1.setText("CONECTAR CON BASE DE DATOS");
        btnConectar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnConectar1)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearBD))
                    .addComponent(jLabel22)
                    .addComponent(comboBD, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(557, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearBD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConectar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pizarraConexion.setColumns(20);
        pizarraConexion.setRows(5);
        jScrollPane4.setViewportView(pizarraConexion);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout panelConexionLayout = new javax.swing.GroupLayout(panelConexion);
        panelConexion.setLayout(panelConexionLayout);
        panelConexionLayout.setHorizontalGroup(
            panelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConexionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConexionLayout.setVerticalGroup(
            panelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConexionLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelesFrame1.addTab("CONEXION", panelConexion);

        panelDatosCliAlta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setText("Nombre:");

        jLabel1.setText("Sexo:");

        jLabel4.setText("Edad:");

        jLabel3.setText("Ciudad:");

        groupHombreMujer.add(rbHombre);
        rbHombre.setSelected(true);
        rbHombre.setText("Hombre");

        groupHombreMujer.add(rbMujer);
        rbMujer.setText("Mujer");

        panelAficionesAlta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aficiones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cbAficion4.setText("Viajar");

        cbAficion1.setText("Senderismo");

        cbAficion5.setText("Comer");

        cbAficion2.setText("Dormir");

        cbAficion3.setText("Saltar");

        cbAficion6.setText("Escribir");

        cbAficion7.setText("Bailar");

        cbAficion8.setText("Vaguear");

        cbAficion9.setText("Lectura");

        cbAficion12.setText("Música");

        cbAficion11.setText("Caminar");

        cbAficion10.setText("Deporte");

        cbAficion15.setText("Coches");

        cbAficion14.setText("Golpear");

        cbAficion13.setText("Informática");

        javax.swing.GroupLayout panelAficionesAltaLayout = new javax.swing.GroupLayout(panelAficionesAlta);
        panelAficionesAlta.setLayout(panelAficionesAltaLayout);
        panelAficionesAltaLayout.setHorizontalGroup(
            panelAficionesAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAficionesAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAficionesAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAficionesAltaLayout.createSequentialGroup()
                        .addGroup(panelAficionesAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAficion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbAficion1)
                            .addComponent(cbAficion13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelAficionesAltaLayout.createSequentialGroup()
                        .addComponent(cbAficion7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(panelAficionesAltaLayout.createSequentialGroup()
                        .addComponent(cbAficion10, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGroup(panelAficionesAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAficion11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAficion14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAficion8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAficion5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAficion2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(panelAficionesAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAficion15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAficion12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAficion9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAficion6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAficion3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelAficionesAltaLayout.setVerticalGroup(
            panelAficionesAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAficionesAltaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAficionesAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAficion1)
                    .addComponent(cbAficion2)
                    .addComponent(cbAficion3))
                .addGap(18, 18, 18)
                .addGroup(panelAficionesAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAficion6)
                    .addComponent(cbAficion5)
                    .addComponent(cbAficion4))
                .addGap(18, 18, 18)
                .addGroup(panelAficionesAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAficion7)
                    .addComponent(cbAficion8)
                    .addComponent(cbAficion9))
                .addGap(18, 18, 18)
                .addGroup(panelAficionesAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAficion10)
                    .addComponent(cbAficion11)
                    .addComponent(cbAficion12))
                .addGap(18, 18, 18)
                .addGroup(panelAficionesAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAficion13)
                    .addComponent(cbAficion14)
                    .addComponent(cbAficion15))
                .addGap(23, 23, 23))
        );

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar Casillas");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("DNI:");

        javax.swing.GroupLayout panelDatosCliAltaLayout = new javax.swing.GroupLayout(panelDatosCliAlta);
        panelDatosCliAlta.setLayout(panelDatosCliAltaLayout);
        panelDatosCliAltaLayout.setHorizontalGroup(
            panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCliAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosCliAltaLayout.createSequentialGroup()
                        .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNameAlta)
                            .addGroup(panelDatosCliAltaLayout.createSequentialGroup()
                                .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdadAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosCliAltaLayout.createSequentialGroup()
                                            .addComponent(rbHombre)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                            .addComponent(rbMujer))
                                        .addComponent(txtDniAlta, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelDatosCliAltaLayout.createSequentialGroup()
                        .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelAficionesAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDatosCliAltaLayout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(panelDatosCliAltaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(txtCiudadAlta)))
                .addContainerGap())
        );
        panelDatosCliAltaLayout.setVerticalGroup(
            panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCliAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbHombre)
                    .addComponent(rbMujer)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdadAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCiudadAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelAficionesAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panelDatosCliAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Sexo", "Edad", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelAltasCliLayout = new javax.swing.GroupLayout(panelAltasCli);
        panelAltasCli.setLayout(panelAltasCliLayout);
        panelAltasCliLayout.setHorizontalGroup(
            panelAltasCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltasCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosCliAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAltasCliLayout.setVerticalGroup(
            panelAltasCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltasCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAltasCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatosCliAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelesFrame1.addTab("ALTAS CLIENTE", panelAltasCli);

        panelDatosCliMod.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel5.setText("Nombre:");

        jLabel14.setText("DNI:");

        jLabel16.setText("Sexo:");

        jLabel18.setText("Edad:");

        jLabel21.setText("Ciudad:");

        panelAficionesCli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aficiones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtAficionesMod.setEditable(false);
        txtAficionesMod.setColumns(20);
        txtAficionesMod.setRows(5);
        jScrollPane7.setViewportView(txtAficionesMod);

        javax.swing.GroupLayout panelAficionesCliLayout = new javax.swing.GroupLayout(panelAficionesCli);
        panelAficionesCli.setLayout(panelAficionesCliLayout);
        panelAficionesCliLayout.setHorizontalGroup(
            panelAficionesCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAficionesCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        panelAficionesCliLayout.setVerticalGroup(
            panelAficionesCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAficionesCliLayout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEditarMod.setText("Editar Datos");
        btnEditarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarModActionPerformed(evt);
            }
        });

        btnGuardarMod.setText("Guardar Cambios");
        btnGuardarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModActionPerformed(evt);
            }
        });

        btnDelCli.setText("Dar de Baja");
        btnDelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelCliActionPerformed(evt);
            }
        });

        btnClearMod.setText("Limpiar Selección");
        btnClearMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosCliModLayout = new javax.swing.GroupLayout(panelDatosCliMod);
        panelDatosCliMod.setLayout(panelDatosCliModLayout);
        panelDatosCliModLayout.setHorizontalGroup(
            panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCliModLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosCliModLayout.createSequentialGroup()
                        .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelDatosCliModLayout.createSequentialGroup()
                                .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCiudadCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEdadCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSexoCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelDatosCliModLayout.createSequentialGroup()
                                .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDniCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNameCli, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))
                            .addComponent(panelAficionesCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(panelDatosCliModLayout.createSequentialGroup()
                        .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClearMod, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btnDelCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardarMod, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btnEditarMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelDatosCliModLayout.setVerticalGroup(
            panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCliModLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNameCli, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSexoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCiudadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addComponent(panelAficionesCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panelDatosCliModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearMod)
                    .addComponent(btnGuardarMod))
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tablaClientesMod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Sexo", "Edad", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientesMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesModMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablaClientesMod);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosCliMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatosCliMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelesFrame1.addTab("CLIENTES", panelClientes);

        panelHistorico.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Buscar citas de un cliente: ");
        panelHistorico.add(jLabel7);
        jLabel7.setBounds(21, 32, 149, 14);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CLIENTE 1", "CLIENTE 2", "FECHA", "LUGAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        panelHistorico.add(jScrollPane2);
        jScrollPane2.setBounds(380, 20, 452, 402);

        jLabel8.setText("Seleccionar cliente:");
        panelHistorico.add(jLabel8);
        jLabel8.setBounds(20, 60, 120, 20);

        panelesFrame1.addTab("HISTORICO CITAS", panelHistorico);

        panelMatrimonio.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Búsqueda por fecha:");
        panelMatrimonio.add(jLabel9);
        jLabel9.setBounds(10, 100, 140, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CLIENTE 1", "CLIENTE 2", "FECHA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        panelMatrimonio.add(jScrollPane3);
        jScrollPane3.setBounds(390, 20, 452, 402);

        jLabel10.setText("Selecciona Cliente (en un comboBox)");
        panelMatrimonio.add(jLabel10);
        jLabel10.setBounds(10, 140, 190, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Búsqueda por cliente:");
        panelMatrimonio.add(jLabel11);
        jLabel11.setBounds(10, 24, 140, 30);

        jLabel12.setText("Selecciona Cliente (en un comboBox)");
        panelMatrimonio.add(jLabel12);
        jLabel12.setBounds(10, 60, 190, 30);

        panelesFrame1.addTab("MATRIMONIOS", panelMatrimonio);

        panelSalir.setLayout(null);

        btnFinalizar.setText("FINALIZAR PROGRAMA");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        panelSalir.add(btnFinalizar);
        btnFinalizar.setBounds(54, 49, 180, 30);

        pizarraFin.setColumns(20);
        pizarraFin.setRows(5);
        jScrollPane5.setViewportView(pizarraFin);

        panelSalir.add(jScrollPane5);
        jScrollPane5.setBounds(50, 120, 460, 190);

        panelesFrame1.addTab("SALIR", panelSalir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelesFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelesFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearBDActionPerformed
        pizarraConexion.setText("");
        pizarraConexion.append("Vamos a proceder a crear la BD AGENCIA desde cero\n");
        pizarraConexion.append("Se borrará cualquier BD con nombre AGENCIA\n");
        pizarraConexion.append("Se introducen algunos datos desde el programa para pruebas\n");

        CrearTablas.CrearTablas();

        pizarraConexion.append("Creada BD AGENCIA\n");
        pizarraConexion.setEditable(false);

        try {
            Altas.datosEjemplo();
                cargarTabla();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrearBDActionPerformed

    private void btnConectar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectar1ActionPerformed
        switch (comboBD.getSelectedIndex()) {
            case 0:
                conexion = conectaBDHibernate();
                if(conexion != null) {
                    cargarTabla();
                }
                break;
            case 1:
                // Insertar Código para Conectar con NeoDatis
                break;
            case 2:
                // Insertar Código para Conectar con Exist
                break;
        }
    }//GEN-LAST:event_btnConectar1ActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        pizarraFin.setText("");
        pizarraFin.append("PREPARADO PARA CERRAR EL PROGRAMA...\n");

        int i = JOptionPane.showConfirmDialog(null, "Realmente desea salir del programa?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (i == 0) {
            System.exit(0);
        } else {
            pizarraFin.setText("");
            pizarraFin.append("El programa continua en ejecución");
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnEditarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarModActionPerformed
        frameMod.setVisible(true);
        frameMod.setSize(370, 530);
        frameMod.setLocationRelativeTo(null);
        
        txtDniMod.setText(clienteSeleccionado.getDni());
        txtNameMod.setText(clienteSeleccionado.getNombre());
        txtEdadMod.setText(String.valueOf(clienteSeleccionado.getEdad()));
        txtCiudadMod.setText(clienteSeleccionado.getCiudad());
        if(clienteSeleccionado.getSexo().equalsIgnoreCase("Hombre")) {
            rbHombreMod.setSelected(true);
        } else {
            rbMujerMod.setSelected(true);
        }
        
        for(Component c : panelAficionesMod.getComponents()) {
            if(c instanceof JCheckBox) {
                String[] aficiones = clienteSeleccionado.getAficiones().split("[, ]");
                for (int i = 0; i < aficiones.length; i++) {
                    if(aficiones[i].equalsIgnoreCase(((JCheckBox)c).getText())) {
                        ((JCheckBox)c).setSelected(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnEditarModActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        byte b = 0;
        // Aficiones de los clientes
        ArrayList<String> textCheckBox = new ArrayList();
        for (Component t : panelDatosCliAlta.getComponents()) {
            if (t instanceof JTextField) {
                if (((JTextField) t).getText().isEmpty()) {
                    b = 1;
                }  
            }

        }
         
        if (b == 1) {
            JOptionPane.showMessageDialog(null, "Se deben rellenar todos los campos para proceder");
        }

        for (Component c : panelAficionesAlta.getComponents()) {
            if (c instanceof JCheckBox) {
                int i = 0;
                if (((JCheckBox) c).isSelected()) {
                    b = 2;
                    textCheckBox.add(((JCheckBox) c).getText());
                }
            }
        }

        if (b != 2) {
            JOptionPane.showMessageDialog(null, "Se debe elegir al menos una afición");
        }

        if (b != 1 && b == 2) {
            Cliente newCli = new Cliente(txtDniAlta.getText(), txtNameAlta.getText(), groupHombreMujer.getSelection().getActionCommand(), Integer.parseInt(txtEdadAlta.getText()), txtCiudadAlta.getText());
            newCli.getArrayAficiones().addAll(textCheckBox);
            try {
                Altas.guardarCliente(newCli);
                insertar(newCli, tablaClientes, (DefaultTableModel)tablaClientes.getModel());
                insertar(newCli, tablaClientesMod, (DefaultTableModel)tablaClientesMod.getModel());
//                cargarTabla();
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if(b == 2) {
            limpiarAltas();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarAltas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tablaClientesModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesModMouseClicked
        String dni = tablaClientesMod.getValueAt(tablaClientesMod.getSelectedRow(), 0).toString();
        clienteSeleccionado = cargarCliente(dni);
        
        txtAficionesMod.setText("");
        
        txtNameCli.setText(clienteSeleccionado.getNombre());
        txtDniCli.setText(clienteSeleccionado.getDni());
        txtSexoCli.setText(clienteSeleccionado.getSexo());
        txtEdadCli.setText(String.valueOf(clienteSeleccionado.getEdad()));
        txtCiudadCli.setText(clienteSeleccionado.getCiudad());
        
        String[] aficiones = clienteSeleccionado.getAficiones().split("[, ]");
        for (int i = 0; i < aficiones.length; i++) {
            txtAficionesMod.append(aficiones[i]+"\n");
        }
    }//GEN-LAST:event_tablaClientesModMouseClicked

    private void btnDelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelCliActionPerformed
        String dni = tablaClientesMod.getValueAt(tablaClientesMod.getSelectedRow(), 0).toString();
        int elec = JOptionPane.showConfirmDialog(null, "Seguro de dar de Baja al Cliente de DNI "+dni+"?", "Confirmación de Baja", 0);
        
        if(elec == 0) {
            borrarCliente(dni);
            limpiarMods();
        } 
    }//GEN-LAST:event_btnDelCliActionPerformed

    private void btnCancelarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModActionPerformed
        frameMod.dispose();
    }//GEN-LAST:event_btnCancelarModActionPerformed

    private void btnOkModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkModActionPerformed
        String sexo = "Hombre";
        aficiones = "";
        txtAficionesMod.setText("");
        
        if(rbHombreMod.isSelected()) {
            sexo = "Hombre";
        } else {
            sexo = "Mujer";
        }
        
        for(Component c : panelAficionesMod.getComponents()) {
            if(c instanceof JCheckBox) {
                if(((JCheckBox) c).isSelected()) {
                    aficiones += ((JCheckBox) c).getText()+", ";
                }
            }
        }
        
        clienteSeleccionado.setNombre(txtNameMod.getText());
        clienteSeleccionado.setSexo(sexo);
        clienteSeleccionado.setEdad(Integer.parseInt(txtEdadMod.getText()));
        clienteSeleccionado.setCiudad(txtCiudadMod.getText());
        clienteSeleccionado.setAficiones(aficiones);
        
        txtNameCli.setText(clienteSeleccionado.getNombre());
        txtEdadCli.setText(String.valueOf(clienteSeleccionado.getEdad()));
        txtCiudadCli.setText(clienteSeleccionado.getCiudad());
        txtSexoCli.setText(clienteSeleccionado.getSexo());
        
        String[] aficionesArray = aficiones.split("[, ]");
        for (int i = 0; i < aficionesArray.length; i++) {
            txtAficionesMod.append(aficionesArray[i]+"\n");
        }
        
        frameMod.dispose();
    }//GEN-LAST:event_btnOkModActionPerformed

    private void btnGuardarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModActionPerformed
        int elec = JOptionPane.showConfirmDialog(null, "Seguro de guardar los cambios realizados sobre el cliente?", "Confirmación Cambios", 0);
        
        if(elec == 0) {
            try {
                Session sesion = IniciarSesion.inicioSesionFactory();
                String hql = "FROM Cliente Where dni = '"+txtDniCli.getText()+"'";
                Query query = sesion.createQuery(hql);
                Cliente cli = (Cliente)query.uniqueResult();
                cli.setNombre(txtNameCli.getText());
                cli.setEdad(Integer.parseInt(txtEdadCli.getText()));
                cli.setCiudad(txtCiudadCli.getText());
                cli.setSexo(txtSexoCli.getText());
                cli.setAficiones(aficiones);

                sesion.beginTransaction();
                sesion.update(cli);
                sesion.getTransaction().commit();
                sesion.close();

                cargarTabla();
            } catch(SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnGuardarModActionPerformed

    private void btnClearModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearModActionPerformed
        limpiarMods();
    }//GEN-LAST:event_btnClearModActionPerformed

    public Connection conectaBDHibernate() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/?user=root&password=usbw");
            pizarraConexion.append("Conexión establecida correctamente\n");
            
            return conexion;
        } catch (Exception e) {
            System.out.println("IMPOSIBLE CONECTAR CON BASE DE DATOS");
            System.out.println(e.getMessage());
            
            return null;
        }
    }

    public void cargarTabla() {
        try {
            Session sesion = IniciarSesion.inicioSesionFactory();
            String hql = "FROM Cliente";
            Query query = sesion.createQuery(hql);
            List clientes = query.list();
            Iterator clis = clientes.iterator();
            
            //Obtenemos el modelo de la tabla para borrarla, así cuando hagamos un nuevo alta no se sobreescribirá la tabla
            // primero la guardamos con el botón registrar y luego cargamos todos los registros en este método
            
            DefaultTableModel modeloAlta = ((DefaultTableModel) tablaClientes.getModel());
            DefaultTableModel modeloMod = ((DefaultTableModel) tablaClientesMod.getModel());
            
            ((DefaultTableModel) tablaClientesMod.getModel()).setRowCount(0);
            ((DefaultTableModel) tablaClientes.getModel()).setRowCount(0);
            while (clis.hasNext()) {
                Cliente cli = (Cliente) clis.next();
                insertar(cli, tablaClientesMod, modeloMod);
                insertar(cli, tablaClientes, modeloAlta);
            }
            sesion.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Cliente cargarCliente(String dni) {
        try {
            Session sesion = IniciarSesion.inicioSesionFactory();
            String hql = "FROM Cliente WHERE dni = '"+dni+"'";
            Query query = sesion.createQuery(hql);
            Cliente cli = (Cliente)query.uniqueResult();
            sesion.close();
            return cli;
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private void insertar(Cliente cli, JTable tabla, DefaultTableModel modelo) {

        if (modelo == null) {
            modelo = crearModelo();
        }

        String[] cliente = new String[5];
        cliente[0] = cli.getDni();
        cliente[1] = cli.getNombre();
        cliente[2] = cli.getSexo();
        cliente[3] = String.valueOf(cli.getEdad());
        cliente[4] = cli.getCiudad();

        modelo.addRow(cliente);
        tabla.setModel(modelo);

    }

    private void borrarCliente(String dni) {
        try {
            Cliente cli = cargarCliente(dni);
            
            Session sesion = IniciarSesion.inicioSesionFactory();
            
            sesion.beginTransaction();
            sesion.delete(cli);
            sesion.getTransaction().commit();
            sesion.close();
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private void limpiarAltas() {
        for (Component c : panelDatosCliAlta.getComponents()) {
            if (c instanceof JTextField) {
                if (!((JTextField) c).getText().isEmpty()) {
                    ((JTextField) c).setText("");
                }
            } 
        }

        rbHombre.setSelected(true);
        
        for (Component c : panelAficionesAlta.getComponents()) {
            if (c instanceof JCheckBox) {
                if (((JCheckBox) c).isSelected()) {
                    ((JCheckBox) c).setSelected(false);
                }
            }
        }
    }
    
    private void limpiarMods(){
        txtNameCli.setText("");
        txtDniCli.setText("");
        txtSexoCli.setText("");
        txtEdadCli.setText("");
        txtCiudadCli.setText("");
        txtAficionesMod.setText("");
        tablaClientesMod.clearSelection();
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarMod;
    private javax.swing.JButton btnClearMod;
    private javax.swing.JButton btnConectar1;
    private javax.swing.JButton btnCrearBD;
    private javax.swing.JButton btnDelCli;
    private javax.swing.JButton btnEditarMod;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnGuardarMod;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnOkMod;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox cbAficion1;
    private javax.swing.JCheckBox cbAficion10;
    private javax.swing.JCheckBox cbAficion11;
    private javax.swing.JCheckBox cbAficion12;
    private javax.swing.JCheckBox cbAficion13;
    private javax.swing.JCheckBox cbAficion14;
    private javax.swing.JCheckBox cbAficion15;
    private javax.swing.JCheckBox cbAficion2;
    private javax.swing.JCheckBox cbAficion3;
    private javax.swing.JCheckBox cbAficion4;
    private javax.swing.JCheckBox cbAficion5;
    private javax.swing.JCheckBox cbAficion6;
    private javax.swing.JCheckBox cbAficion7;
    private javax.swing.JCheckBox cbAficion8;
    private javax.swing.JCheckBox cbAficion9;
    private javax.swing.JCheckBox cbAficionMod1;
    private javax.swing.JCheckBox cbAficionMod10;
    private javax.swing.JCheckBox cbAficionMod11;
    private javax.swing.JCheckBox cbAficionMod12;
    private javax.swing.JCheckBox cbAficionMod13;
    private javax.swing.JCheckBox cbAficionMod14;
    private javax.swing.JCheckBox cbAficionMod15;
    private javax.swing.JCheckBox cbAficionMod2;
    private javax.swing.JCheckBox cbAficionMod3;
    private javax.swing.JCheckBox cbAficionMod4;
    private javax.swing.JCheckBox cbAficionMod5;
    private javax.swing.JCheckBox cbAficionMod6;
    private javax.swing.JCheckBox cbAficionMod7;
    private javax.swing.JCheckBox cbAficionMod8;
    private javax.swing.JCheckBox cbAficionMod9;
    private javax.swing.JComboBox<String> comboBD;
    private javax.swing.JFrame frameMod;
    private javax.swing.ButtonGroup groupHombreMujer;
    private javax.swing.ButtonGroup groupHombreMujerMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel panelAficionesAlta;
    private javax.swing.JPanel panelAficionesCli;
    private javax.swing.JPanel panelAficionesMod;
    private javax.swing.JPanel panelAltasCli;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelConexion;
    private javax.swing.JPanel panelDatosCliAlta;
    private javax.swing.JPanel panelDatosCliMod;
    private javax.swing.JPanel panelHistorico;
    private javax.swing.JPanel panelMatrimonio;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JTabbedPane panelesFrame1;
    private javax.swing.JTextArea pizarraConexion;
    private javax.swing.JTextArea pizarraFin;
    private javax.swing.JRadioButton rbHombre;
    private javax.swing.JRadioButton rbHombreMod;
    private javax.swing.JRadioButton rbMujer;
    private javax.swing.JRadioButton rbMujerMod;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaClientesMod;
    private javax.swing.JTextArea txtAficionesMod;
    private javax.swing.JTextField txtCiudadAlta;
    private javax.swing.JLabel txtCiudadCli;
    private javax.swing.JTextField txtCiudadMod;
    private javax.swing.JTextField txtDniAlta;
    private javax.swing.JLabel txtDniCli;
    private javax.swing.JTextField txtDniMod;
    private javax.swing.JTextField txtEdadAlta;
    private javax.swing.JLabel txtEdadCli;
    private javax.swing.JTextField txtEdadMod;
    private javax.swing.JTextField txtNameAlta;
    private javax.swing.JLabel txtNameCli;
    private javax.swing.JTextField txtNameMod;
    private javax.swing.JLabel txtSexoCli;
    // End of variables declaration//GEN-END:variables

}