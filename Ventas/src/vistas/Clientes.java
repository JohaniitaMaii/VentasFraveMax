package vistas;

import acceso.*;
import entidades.*;
import enums.Personas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author johan
 */
public class Clientes extends javax.swing.JFrame {
  private  DefaultTableModel modeloCompra = new DefaultTableModel();
private DefaultTableModel modelo = new DefaultTableModel();
ImageIcon icono = new ImageIcon("C:\\Users\\johan\\Documents\\GitHub\\Mis Versiones\\Ventas\\src\\iconos\\client.png");
ClienteDAO cdao = new ClienteDAO();
VentaDAO vdao = new VentaDAO();
DetalleVentaDAO dedao = new DetalleVentaDAO();

    /**
     * Creates new form Clientes
     */
    public Clientes() throws Exception {
        initComponents();
        inicializarCombo();
        inicializarTabla();
        setTitle(" Clientes ");
        setIconImage(icono.getImage());
        setLocationRelativeTo(null);  
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Datos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboCliente = new javax.swing.JComboBox<>();
        btnVerCompras = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botonListar = new javax.swing.JButton();
        panelTablaClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        panelCompras = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCompras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(java.awt.Color.lightGray);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Datos.setBackground(new java.awt.Color(51, 51, 51));
        Datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        Datos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");
        Datos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Domicilio");
        Datos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono");
        Datos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        botonAgregar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cliente_24.png"))); // NOI18N
        botonAgregar.setContentAreaFilled(false);
        botonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cliente.png"))); // NOI18N
        botonAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cliente_24.png"))); // NOI18N
        botonAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarMouseExited(evt);
            }
        });
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        Datos.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 95, 100));

        botonActualizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/update_24.png"))); // NOI18N
        botonActualizar.setContentAreaFilled(false);
        botonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonActualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar.png"))); // NOI18N
        botonActualizar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/update_24.png"))); // NOI18N
        botonActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonActualizarMouseExited(evt);
            }
        });
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });
        Datos.add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 99, 100));

        botonEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/trash_24.png"))); // NOI18N
        botonEliminar.setContentAreaFilled(false);
        botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/trash_24.png"))); // NOI18N
        botonEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/trash.png"))); // NOI18N
        botonEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEliminarMouseExited(evt);
            }
        });
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        Datos.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 100, 100));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search-engine-optimization.png"))); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        Datos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/escoba.png"))); // NOI18N
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        Datos.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        Datos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 200, 30));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        Datos.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 200, 30));
        Datos.add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 200, 30));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("GESTION DE CLIENTES");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Datos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 490, 50));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Cliente");
        Datos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, -1));

        comboCliente.setSelectedIndex(-1);
        comboCliente.setBorder(null);
        comboCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClienteActionPerformed(evt);
            }
        });
        Datos.add(comboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 310, 30));

        btnVerCompras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVerCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/shopping-cart.png"))); // NOI18N
        btnVerCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerCompras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnVerCompras.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVerCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerComprasMouseExited(evt);
            }
        });
        btnVerCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerComprasActionPerformed(evt);
            }
        });
        Datos.add(btnVerCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        Datos.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 200, 30));
        Datos.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        botonListar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonListar.setForeground(new java.awt.Color(255, 255, 255));
        botonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lista_24.png"))); // NOI18N
        botonListar.setContentAreaFilled(false);
        botonListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonListar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonListar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lista_24.png"))); // NOI18N
        botonListar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lista_32.png"))); // NOI18N
        botonListar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonListarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonListarMouseExited(evt);
            }
        });
        botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarActionPerformed(evt);
            }
        });
        Datos.add(botonListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 116, 100));

        getContentPane().add(Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 560));

        panelTablaClientes.setBackground(new java.awt.Color(51, 51, 51));

        tablaClientes.setBackground(new java.awt.Color(51, 51, 51));
        tablaClientes.setForeground(new java.awt.Color(255, 255, 255));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apellido", "Nombre", "Domicilio", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaClientes.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tablaClientes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        javax.swing.GroupLayout panelTablaClientesLayout = new javax.swing.GroupLayout(panelTablaClientes);
        panelTablaClientes.setLayout(panelTablaClientesLayout);
        panelTablaClientesLayout.setHorizontalGroup(
            panelTablaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        panelTablaClientesLayout.setVerticalGroup(
            panelTablaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        getContentPane().add(panelTablaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 570, 280));

        panelCompras.setBackground(new java.awt.Color(51, 51, 51));

        tablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cantidad", "Fecha de Compra"
            }
        ));
        jScrollPane2.setViewportView(tablaCompras);

        javax.swing.GroupLayout panelComprasLayout = new javax.swing.GroupLayout(panelCompras);
        panelCompras.setLayout(panelComprasLayout);
        panelComprasLayout.setHorizontalGroup(
            panelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        panelComprasLayout.setVerticalGroup(
            panelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        getContentPane().add(panelCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 570, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        // MOUSE CLICKED TABLA CLIENTES
        int f = tablaClientes.getSelectedRow();
        if (f >= 0) {
            txtApellido.setText(tablaClientes.getValueAt(f, 0).toString());
            txtNombre.setText(tablaClientes.getValueAt(f, 1).toString());
            txtDomicilio.setText(tablaClientes.getValueAt(f, 2).toString());
            txtTelefono.setText(tablaClientes.getValueAt(f, 3).toString());
        } else {
            System.out.println("Ninguna fila seleccionada");
        }
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void btnVerComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerComprasActionPerformed
        // BOTON VER COMPRAS DE CLIENTE
        modeloCompra.setRowCount(0);
        Persona c = null;
        try {
            if (comboCliente.getSelectedIndex() >= 0 ) {
                c = (Persona) comboCliente.getSelectedItem();
                int id = cdao.obtenerID(c.getNombre(), c.getApellido(), c.getDomicilio(), c.getTelefono());
//                c = crearCliente();
                c.setId(id);
            } else if (tablaClientes.getSelectedRow() >= 0) {
                c = crearCliente();
                int id = cdao.obtenerID(c.getNombre(), c.getApellido(), c.getDomicilio(), c.getTelefono());
                c.setId(id);
            }
            
            List<DetalleVenta> lista = dedao.buscarVentaCliente(c.getId());
            if (lista.size() > 0) {
                for (DetalleVenta dv : lista) {
                    modeloCompra.addRow(new Object[]{dv.getProducto().getNombreProducto(), dv.getProducto().getPrecioActual(), dv.getCantidad(), dv.getVenta().getFechaVenta()});
                }
            } else {
                JOptionPane.showMessageDialog(this, "El cliente seleccionado no posee compras registradas");
                limpiarDatos();
            }
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (panelCompras.isVisible() && e.getComponent() != panelCompras) {
                        panelCompras.setVisible(false);
                    }
                }
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnVerComprasActionPerformed

    private void btnVerComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerComprasMouseExited
        btnVerCompras.setText("");
    }//GEN-LAST:event_btnVerComprasMouseExited

    private void btnVerComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerComprasMouseEntered
        btnVerCompras.setText(" Ver Compras");
    }//GEN-LAST:event_btnVerComprasMouseEntered

    private void comboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteActionPerformed
        // TODO add your handling code here:
        Persona c = new Persona();
        if (comboCliente.getSelectedIndex() != -1) {
            c = ((Persona) comboCliente.getSelectedItem());
            traerDatosTabla(c);
        }
    }//GEN-LAST:event_comboClienteActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c> '9') evt.consume();
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        // TODO add your handling code here:
        btnLimpiar.setText("");
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        // TODO add your handling code here:
        btnLimpiar.setText(" Limpiar");
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // BOTON BUSCAR
        if (!txtNombre.getText().trim().isEmpty() && txtApellido.getText().trim().isEmpty() ) {
            try {
                List<Persona> clientes = cdao.buscarNombre(txtNombre.getText());
                for (Persona c : clientes) {
                    modelo.addRow(new Object[]{c.getApellido(), c.getNombre(), c.getDomicilio() , c.getTelefono()});
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (txtNombre.getText().trim().isEmpty() && !txtApellido.getText().trim().isEmpty()) {
            try {
                List<Persona> clientes = cdao.buscarApellido(txtApellido.getText());
                for (Persona c : clientes) {
                    modelo.addRow(new Object[]{c.getApellido(), c.getNombre(), c.getDomicilio() , c.getTelefono()});
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (!txtNombre.getText().trim().isEmpty() && !txtApellido.getText().trim().isEmpty()) {
            try {
                List<Persona> clientes = cdao.buscarNombreApellido(txtNombre.getText(), txtApellido.getText());
                for (Persona c : clientes) {
                    modelo.addRow(new Object[]{c.getApellido(), c.getNombre(), c.getDomicilio() , c.getTelefono()});
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
        btnBuscar.setText("");
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
        btnBuscar.setText(" Buscar");
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // BOTON ELIMINAR
        Persona c = null;
        try {
            if (comboCliente.getSelectedIndex() >= 0 ) {
                c = (Persona) comboCliente.getSelectedItem();
                int id = cdao.obtenerID(c.getNombre(), c.getApellido(), c.getDomicilio(), c.getTelefono());
                c = crearCliente();
                c.setId(id);
            } else if (tablaClientes.getSelectedRow() >= 0) {
                c = crearCliente();
                int id = cdao.obtenerID(c.getNombre(), c.getApellido(), c.getDomicilio(), c.getTelefono());
                c.setId(id);
            }
            int confirm = JOptionPane.showConfirmDialog(this, c.toStringCliente(), "Está seguro que desea eliminar el Cliente?", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                if (cdao.eliminar(c)) {
                    JOptionPane.showMessageDialog(this, "Cliente Eliminado de la Base de Datos", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "El Cliente posee Registros en la Base de Datos", "Elimine Registros de Ventas", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ha cancelado la operacion");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        limpiarDatos();
        try {
            inicializarCombo();
            cargarTabla();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseExited
        // TODO add your handling code here:
        botonEliminar.setText("");
    }//GEN-LAST:event_botonEliminarMouseExited

    private void botonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseEntered
        // TODO add your handling code here:
        botonEliminar.setText("Eliminar");
    }//GEN-LAST:event_botonEliminarMouseEntered

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        // BOTON ACTUALIZAR
        Persona c = null;
        try {
            if (comboCliente.getSelectedIndex() >= 0 ) {
                c = (Persona) comboCliente.getSelectedItem();
                int id = cdao.obtenerID(c.getNombre(), c.getApellido(), c.getDomicilio(), c.getTelefono());
                c = crearCliente();
                c.setId(id);
            } else if (tablaClientes.getSelectedRow() >= 0) {
                c = crearCliente();
                int id = cdao.obtenerID(c.getNombre(), c.getApellido(), c.getDomicilio(), c.getTelefono());
                c.setId(id);
            }
            int confirm = JOptionPane.showConfirmDialog(this, c.toStringCliente(), "Está seguro que desea modificar los datos?", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                cdao.actualizar(c);
                JOptionPane.showMessageDialog(this, "Cliente Actualizado en la Base de Datos", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Ha cancelado la operacion");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        limpiarDatos();
        try {
            inicializarCombo();
            cargarTabla();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseExited
        // TODO add your handling code here:
        botonActualizar.setText("");
    }//GEN-LAST:event_botonActualizarMouseExited

    private void botonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseEntered
        // TODO add your handling code here:
        botonActualizar.setText("Actualizar");
    }//GEN-LAST:event_botonActualizarMouseEntered

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // BOTON AGREGAR CLIENTE
        Persona c = crearCliente();
        if (c != null) {
            try {
                if ( cdao.nuevoCliente(c)) {
                    JOptionPane.showMessageDialog(this, "El cliente se ha registrado en la Base de Datos");
                    limpiarDatos();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al registrar el Cliente en la Base de Datos");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        try {
            limpiarDatos();
            inicializarCombo();
            cargarTabla();
        } catch (Exception ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseExited
        // TODO add your handling code here:
        botonAgregar.setText("");
    }//GEN-LAST:event_botonAgregarMouseExited

    private void botonAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseEntered
        // TODO add your handling code here:
        botonAgregar.setText("Agregar");
    }//GEN-LAST:event_botonAgregarMouseEntered

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void botonListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListarMouseEntered
        // TODO add your handling code here:
        botonListar.setText("Listar CLientes");
    }//GEN-LAST:event_botonListarMouseEntered

    private void botonListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListarMouseExited
        // TODO add your handling code here:
        botonListar.setText("");
    }//GEN-LAST:event_botonListarMouseExited

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
        // BOTON LISTAR TODO
        try {
            limpiarDatos();
            cargarTabla();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_botonListarActionPerformed
 
    public void inicializarTabla() {
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Telefono");        
        tablaClientes.setModel(modelo); 
        modeloCompra.addColumn("Nombre");
        modeloCompra.addColumn("Precio");
        modeloCompra.addColumn("Cantidad");
        modeloCompra.addColumn("Fecha Compra");
        tablaCompras.setModel(modeloCompra);
    }
     
    public void inicializarCombo() throws Exception {
        DefaultComboBoxModel<Persona> model = new DefaultComboBoxModel<>();       
        try {
            for (Persona c : cdao.listarClientes()) {
                model.addElement(c);
            }
            comboCliente.setModel(model);
            comboCliente.setSelectedIndex(-1);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    private boolean validarDomicilio(String variable) {
        String patron = ".*[^a-zA-Z0-9ÑÁÉÍÓÚüÜ\\s].*";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(variable);
        if (variable.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Debe ingresar los datos");
        } else if (matcher.matches()) {
            JOptionPane.showMessageDialog(this, "Caracter ingresado no válido");
        } else {
            return true;
        }
        return false;
    }
    
    private boolean validarTelefono(String variable) {
        String patron = ".*[^0-9].*";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(variable.toUpperCase());
        if (variable.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Debe ingresar los datos");
        } else if (matcher.matches()) {
            JOptionPane.showMessageDialog(this, "Caracter ingresado no válido");
        } else {
            return true;
        }
        return false;
    }
    
    private Persona crearCliente() {
        Persona c = new Persona();
        if (txtApellido.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe indicar el Apellido");
        } else if (txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe indicar el Nombre");
        } else if (validarDomicilio(txtDomicilio.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Domicilio ingresado no válido");
        } else if (validarTelefono(txtTelefono.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Telefono ingresado no válido");
        } else {
            c.setApellido(txtApellido.getText());
            c.setNombre(txtNombre.getText());
            c.setDomicilio(txtDomicilio.getText());
            c.setTelefono(txtTelefono.getText());
            return c;
        }
        return null;
    }
    
    public void limpiarDatos() {
        txtApellido.setText("");
        txtNombre.setText("");
        txtDomicilio.setText("");
        txtTelefono.setText("");        
        modelo.setRowCount(0);
        comboCliente.setSelectedIndex(-1);
        modeloCompra.setRowCount(0);
        
    }
    
    public void cargarTabla() throws Exception { 
        for (Persona a : cdao.listarClientes()) {
            modelo.addRow(new Object[]{a.getApellido(),a.getNombre(),a.getDomicilio(),a.getTelefono()});
        }
    }
    
    public void traerDatosTabla(Persona cliente) {
        txtApellido.setText(cliente.getApellido());
        txtNombre.setText(cliente.getNombre());
        txtDomicilio.setText(cliente.getDomicilio());
        txtTelefono.setText(cliente.getTelefono());
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Clientes().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Datos;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonListar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVerCompras;
    private javax.swing.JComboBox<Persona> comboCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelCompras;
    private javax.swing.JPanel panelTablaClientes;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaCompras;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
