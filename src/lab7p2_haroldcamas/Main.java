package lab7p2_haroldcamas;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() throws FileNotFoundException {
        initComponents();
        this.setResizable(false);
        
        DefaultComboBoxModel m = (DefaultComboBoxModel) cb_vehiculos.getModel();
        m = refresh(new File("./Vehiculos.txt"), m);
        cb_vehiculos.setModel(m);
        
        DefaultComboBoxModel m2 = (DefaultComboBoxModel) cb_vendedores.getModel();
        m2 = refresh(new File("./Vendedores.txt"), m2);
        cb_vendedores.setModel(m2);
        
        DefaultComboBoxModel m3 = (DefaultComboBoxModel) cb_clientes.getModel();
        m3 = refresh(new File("./Clientes.txt"), m3);
        cb_clientes.setModel(m3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_marca = new javax.swing.JTextField();
        bt_color = new javax.swing.JButton();
        tf_modelo = new javax.swing.JTextField();
        sp_año = new javax.swing.JSpinner();
        sp_precio = new javax.swing.JSpinner();
        bt_agregarVehiculo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombreVendedor = new javax.swing.JTextField();
        sp_carrosVendidos = new javax.swing.JSpinner();
        sp_dineroGenerado = new javax.swing.JSpinner();
        bt_agregarVendedor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_nombreCliente = new javax.swing.JTextField();
        sp_edad = new javax.swing.JSpinner();
        tf_profesion = new javax.swing.JTextField();
        sp_carrosComprados = new javax.swing.JSpinner();
        sp_salario = new javax.swing.JSpinner();
        bt_agregarClientes = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sp_costo = new javax.swing.JSpinner();
        cb_vendedores = new javax.swing.JComboBox<>();
        cb_clientes = new javax.swing.JComboBox<>();
        cb_vehiculos = new javax.swing.JComboBox<>();
        bt_agregarVenta = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Marca");

        jLabel2.setText("Color");

        jLabel3.setText("Modelo");

        jLabel4.setText("Año");

        jLabel5.setText("Precio");

        bt_color.setBackground(new java.awt.Color(0, 0, 0));
        bt_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_colorMouseClicked(evt);
            }
        });

        sp_año.setValue(2000);

        bt_agregarVehiculo.setText("Agregar");
        bt_agregarVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarVehiculoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sp_año, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(sp_precio)
                            .addComponent(tf_modelo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_color, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(tf_marca))))
                .addGap(150, 150, 150)
                .addComponent(bt_agregarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(bt_color, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sp_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bt_agregarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sp_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(262, 262, 262))
        );

        jTabbedPane1.addTab("Vehiculo", jPanel1);

        jLabel6.setText("Nombre");

        jLabel7.setText("Carros Vendidos");

        jLabel8.setText("Dinero Generado");

        bt_agregarVendedor.setText("Agregar");
        bt_agregarVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarVendedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nombreVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(sp_carrosVendidos)
                    .addComponent(sp_dineroGenerado))
                .addGap(149, 149, 149)
                .addComponent(bt_agregarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_nombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(sp_carrosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(sp_dineroGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bt_agregarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(329, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vendedor", jPanel2);

        jLabel9.setText("Nombre");

        jLabel10.setText("Edad");

        jLabel11.setText("Profesion");

        jLabel12.setText("Carros Comprados");

        jLabel13.setText("Salario");

        bt_agregarClientes.setText("Agregar");
        bt_agregarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarClientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(sp_edad)
                            .addComponent(sp_salario))
                        .addComponent(tf_profesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sp_carrosComprados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151)
                .addComponent(bt_agregarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(tf_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(sp_carrosComprados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bt_agregarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(sp_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel3);

        jLabel14.setText("Vendedor");

        jLabel15.setText("Cliente");

        jLabel16.setText("Vehiculo");

        jLabel17.setText("Costo de la Transaccion");

        bt_agregarVenta.setText("Agregar ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addGap(107, 107, 107)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sp_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_vehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(124, 124, 124)
                .addComponent(bt_agregarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cb_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cb_vehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bt_agregarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(sp_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(290, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ventas", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Base de Datos", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_colorMouseClicked
        Color c = JColorChooser.showDialog(this, "Elija un color", Color.yellow);
        bt_color.setBackground(c);
    }//GEN-LAST:event_bt_colorMouseClicked

    private void bt_agregarVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarVehiculoMouseClicked
        if(tf_marca.getText().equals("") || tf_modelo.getText().equals("") || (int) sp_año.getModel().getValue() <= 0 || (int) sp_precio.getModel().getValue() <= 0){
            JOptionPane.showMessageDialog(this, "Tiene que llenar todas las casillas!");
        }
        else{
            Vehiculo c = new Vehiculo(tf_marca.getText(),
                    bt_color.getBackground().toString(), 
                    tf_modelo.getText(), 
                    (int) sp_año.getModel().getValue(), 
                    (int) sp_precio.getModel().getValue());
            
            vehiculos.add(c);
            
            File file = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                file = new File("./Vehiculos.txt");
                fw = new FileWriter(file,true);
                bw = new BufferedWriter(fw);
                bw.write("[\n" +
                        "\t" + c.getMarca() + "\n" +
                        "\t" + c.getModelo() + "\n" +
                        "\t" + c.getColor() + "\n" +
                        "\t" + c.getAño() + "\n" +
                        "\t" + c.getPrecioVenta() + "\n" +
                        "];");
                bw.newLine();
                bw.flush();
                
                tf_marca.setText("");
                bt_color.setBackground(Color.black);
                tf_modelo.setText("");
                sp_año.getModel().setValue(2000);
                sp_precio.getModel().setValue(0);
                
                JOptionPane.showMessageDialog(this, "Vehiculo agregado exitosamente!");
                
                DefaultComboBoxModel m = (DefaultComboBoxModel) cb_vehiculos.getModel();
                m = refresh(file, m);
                cb_vehiculos.setModel(m);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_bt_agregarVehiculoMouseClicked

    private void bt_agregarVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarVendedorMouseClicked
        if(tf_nombreVendedor.getText().equals("") || (int) sp_carrosVendidos.getModel().getValue() < 0 || (int) sp_dineroGenerado.getModel().getValue() < 0){
            JOptionPane.showMessageDialog(this, "Tiene que llenar todas las casillas!");
        }
        else{
            Vendedor v = new Vendedor(tf_nombreVendedor.getText(), 
                    (int) sp_carrosVendidos.getModel().getValue(), 
                    (int) sp_dineroGenerado.getModel().getValue());
            
            vendedores.add(v);
            
            File file = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            
            try {
                file = new File("./Vendedores.txt");
                fw = new FileWriter(file,true);
                bw = new BufferedWriter(fw);
                bw.write("[\n" +
                        "\t" + v.getNombre() + "\n" +
                        "\t" + v.getCarrosVendidos() + "\n" +
                        "\t" + v.getDineroGenerado() + "\n" +
                        "];");
                bw.newLine();
                bw.flush();
                
                tf_nombreVendedor.setText("");
                sp_carrosVendidos.getModel().setValue(0);
                sp_dineroGenerado.getModel().setValue(0);
                
                JOptionPane.showMessageDialog(this, "Vendedor añadido exitosamente!");
                
                DefaultComboBoxModel m = (DefaultComboBoxModel) cb_vendedores.getModel();
                m = refresh(file, m);
                cb_vendedores.setModel(m);
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_bt_agregarVendedorMouseClicked

    private void bt_agregarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarClientesMouseClicked
        if(tf_nombreCliente.getText().equals("") || 
                (int) sp_edad.getModel().getValue() <= 0 ||
                tf_profesion.getText().equals("") ||
                (int) sp_carrosComprados.getModel().getValue() <= 0 ||
                (int) sp_salario.getModel().getValue() <= 0){
            JOptionPane.showMessageDialog(this, "Tiene que llenar todas las casillas!");
        }
        else{
            Cliente c = new Cliente(tf_nombreCliente.getText(), 
                    (int) sp_edad.getModel().getValue(), 
                    tf_profesion.getText(), 
                    (int) sp_carrosComprados.getModel().getValue(), 
                    (int) sp_salario.getModel().getValue());
            
            clientes.add(c);
            
            File file = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            
            try {
                file = new File("./Clientes.txt");
                fw = new FileWriter(file,true);
                bw = new BufferedWriter(fw);
                bw.write("[\n" +
                        "\t" + c.getNombre() + "\n" +
                        "\t" + c.getEdad() + "\n" +
                        "\t" + c.getProfesion() + "\n" +
                        "\t" + c.getCantidadComprados() + "\n" +
                        "\t" + c.getSueldo() + "\n" +
                        "];");
                bw.newLine();
                bw.flush();
                
                tf_nombreCliente.setText("");
                sp_edad.getModel().setValue(0);
                tf_profesion.setText("");
                sp_carrosComprados.getModel().setValue(0);
                sp_salario.getModel().setValue(0);
                
                JOptionPane.showMessageDialog(this, "Cliente añadido exitosamente!");
                
                DefaultComboBoxModel m = (DefaultComboBoxModel) cb_clientes.getModel();
                m = refresh(file, m);
                cb_clientes.setModel(m);
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_bt_agregarClientesMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public static DefaultComboBoxModel refresh(File file, DefaultComboBoxModel modelo) throws FileNotFoundException{
        ArrayList lista = new ArrayList();
        Scanner sc = new Scanner(file);
        String texto = "";
        while(sc.hasNext()){
            texto += sc.nextLine();
        }
        sc.close();
        
        String[] informacion = texto.split(";");
        String[] lineas = informacion[0].split("\t");
        String[] valores = new String[lineas.length - 1];
        
        for (int i = 0; i < informacion.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                lineas = informacion[i].split("\t");
                valores[j] = lineas[j + 1];
            }
            if(file.getName().equals("Vehiculos.txt")){
                valores[4] = valores[4].substring(0, valores[4].length() - 1);
                Vehiculo v = new Vehiculo(valores[0], 
                        valores[2], 
                        valores[1], 
                        Integer.parseInt(valores[3]), 
                        Integer.parseInt(valores[4]));
                
                lista.add(v);
            }
            else if(file.getName().equals("Clientes.txt")){
                valores[4] = valores[4].substring(0, valores[4].length() - 1);
                Cliente c = new Cliente(valores[0], 
                        Integer.parseInt(valores[1]), 
                        valores[2], 
                        Integer.parseInt(valores[3]), 
                        Integer.parseInt(valores[4]));
                
                lista.add(c);
            }
            else{
                valores[2] = valores[2].substring(0, valores[2].length() - 1);
                Vendedor v = new Vendedor(valores[0], 
                        Integer.parseInt(valores[1]), 
                        Integer.parseInt(valores[2]));
                
                lista.add(v);
            }
        }
        
        modelo.removeAllElements();
        for (Object object : lista) {
            modelo.addElement(object);
        }
        return modelo;
    }
    
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    ArrayList<Vendedor> vendedores =  new ArrayList();
    ArrayList<Cliente> clientes =  new ArrayList();
    ArrayList<Ventas> ventas =  new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregarClientes;
    private javax.swing.JButton bt_agregarVehiculo;
    private javax.swing.JButton bt_agregarVendedor;
    private javax.swing.JButton bt_agregarVenta;
    private javax.swing.JButton bt_color;
    private javax.swing.JComboBox<String> cb_clientes;
    private javax.swing.JComboBox<String> cb_vehiculos;
    private javax.swing.JComboBox<String> cb_vendedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner sp_año;
    private javax.swing.JSpinner sp_carrosComprados;
    private javax.swing.JSpinner sp_carrosVendidos;
    private javax.swing.JSpinner sp_costo;
    private javax.swing.JSpinner sp_dineroGenerado;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JSpinner sp_precio;
    private javax.swing.JSpinner sp_salario;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    private javax.swing.JTextField tf_nombreCliente;
    private javax.swing.JTextField tf_nombreVendedor;
    private javax.swing.JTextField tf_profesion;
    // End of variables declaration//GEN-END:variables
}
