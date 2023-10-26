package vistas;

import acceso.ClienteDAO;
import acceso.DetalleVentaDAO;
import acceso.ProductoDAO;
import acceso.VentaDAO;
import entidades.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Johnny
 */
public class VentaView extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
//    Cliente cliente = new Cliente();
    ProductoDAO prodao = new ProductoDAO();
    ClienteDAO clidao = new ClienteDAO();
    VentaDAO vedao = new VentaDAO();
    DetalleVentaDAO detadao = new DetalleVentaDAO();
    List<Producto> listaproductos = new ArrayList();
    List<Cliente> listaClientes = new ArrayList();
    List<DetalleVenta> listaDetalles = new ArrayList();

    /**
     * Creates new form VentaView
     */
    public VentaView() {
        initComponents();
        cargarTabla();
        cargarCombo1();
//        cargarCombo2();
        setLocationRelativeTo(null);
        bloqueados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboProductos = new javax.swing.JComboBox<>();
        DateChooser = new com.toedter.calendar.JDateChooser();
        lblCantidad = new javax.swing.JLabel();
        comboCantidad = new javax.swing.JComboBox<>();
        lblPrecio = new javax.swing.JLabel();
        lblPrecioTotal = new javax.swing.JLabel();
        btnRealizarVenta = new javax.swing.JButton();
        comboClientes = new javax.swing.JComboBox<>();
        btnIniciarVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnCancelarVenta = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();
        btnQuitarProductoTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Venta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(486, 486, 486)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Cliente:");

        lblProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(0, 51, 102));
        lblProducto.setText("Producto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Fecha:");

        comboProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductosActionPerformed(evt);
            }
        });

        DateChooser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 51, 102));
        lblCantidad.setText("Cantidad:");

        comboCantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCantidadActionPerformed(evt);
            }
        });

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 51, 102));
        lblPrecio.setText("Precio:");

        lblPrecioTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecioTotal.setForeground(new java.awt.Color(255, 0, 0));
        lblPrecioTotal.setText("0");

        btnRealizarVenta.setBackground(new java.awt.Color(0, 51, 102));
        btnRealizarVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRealizarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/venta.png"))); // NOI18N
        btnRealizarVenta.setText("Realizar Venta");
        btnRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVentaActionPerformed(evt);
            }
        });

        comboClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnIniciarVenta.setBackground(new java.awt.Color(0, 51, 102));
        btnIniciarVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIniciarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iniciarVenta.png"))); // NOI18N
        btnIniciarVenta.setText("Iniciar una venta");
        btnIniciarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarVentaActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripción", "Precio p/u", "Cantidad", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        btnCancelarVenta.setBackground(new java.awt.Color(0, 51, 102));
        btnCancelarVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cruz.png"))); // NOI18N
        btnCancelarVenta.setText("Cancelar Venta");
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });

        btnCarrito.setBackground(new java.awt.Color(0, 51, 102));
        btnCarrito.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/carrito.png"))); // NOI18N
        btnCarrito.setText("Agregar al Carrito");
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        btnQuitarProductoTabla.setBackground(new java.awt.Color(0, 51, 102));
        btnQuitarProductoTabla.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnQuitarProductoTabla.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitarProductoTabla.setText("Quitar Producto");
        btnQuitarProductoTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarProductoTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRealizarVenta)
                        .addGap(29, 29, 29)
                        .addComponent(btnCancelarVenta))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuitarProductoTabla)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(lblProducto)
                                        .addComponent(lblCantidad)
                                        .addComponent(lblPrecio))
                                    .addGap(25, 25, 25)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnIniciarVenta, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(btnCarrito)))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnIniciarVenta)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProducto)
                    .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(comboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(lblPrecioTotal))
                .addGap(18, 18, 18)
                .addComponent(btnCarrito)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuitarProductoTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealizarVenta)
                    .addComponent(btnCancelarVenta))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarVentaActionPerformed
        if (DateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Debe indicar la Fecha");
        } else {
            cargarCombo2();
            comboClientes.setEnabled(false);
            DateChooser.setEnabled(false);
            desbloqueados();
        }
    }//GEN-LAST:event_btnIniciarVentaActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        if (modelo.getRowCount() == 0) {
            bloqueados();
            comboClientes.setEnabled(true);
            DateChooser.setEnabled(true);
            listaDetalles.clear();
        } else {
            JOptionPane.showMessageDialog(null, "Quita todos los productos del carrito");
        }

    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void btnRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVentaActionPerformed
        // REALIZAR LA VENTA

        int pregunta = JOptionPane.showConfirmDialog(//Preguntamos si está seguro de realizar la acción
                this, "¿Estas seguro de querer realizar la venta?",
                "Mensaje..!!",
                JOptionPane.YES_NO_OPTION);
        if (pregunta == JOptionPane.YES_OPTION) {
            Venta venta = new Venta();
            venta.setCliente((Cliente) comboClientes.getSelectedItem());
            java.util.Date fechaUTIL = DateChooser.getDate();
            java.sql.Date fechaSQL = new java.sql.Date(fechaUTIL.getTime());
            venta.setFechaVenta(fechaSQL);
            vedao.insertarVenta(venta);
            Venta ve = vedao.traerVenta(venta);//traigo la venta recien realizada
            for (DetalleVenta deta : listaDetalles) {
                deta.setVenta(ve);           //seteo la venta reciente a cada detalleVenta
                detadao.insertarDetalle(deta);
            }
            JOptionPane.showMessageDialog(null, "Venta Exitosa!!");
            modelo.setRowCount(0);
            bloqueados();
            comboClientes.setEnabled(true);
            DateChooser.setEnabled(true);
            DateChooser.setDate(null);
            listaDetalles.clear();
        }
        if (pregunta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Venta cancelada!!");
        }
    }//GEN-LAST:event_btnRealizarVentaActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        // CARRITO

        DetalleVenta detalle = null;
        Cliente cli = (Cliente) comboClientes.getSelectedItem();
        Producto pro = (Producto) comboProductos.getSelectedItem();
        java.util.Date fechaUTIL = DateChooser.getDate();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUTIL.getTime());
        Venta ve = new Venta(cli, fechaSQL);

        if (pro.getStock() == 0) {
            JOptionPane.showMessageDialog(null, "Lo sentimos!! no hay más stock de ese producto");
        } else if (comboCantidad.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecciona el producto y la cantidad");
        } else {
            if ((Integer) comboCantidad.getSelectedItem() > 0) {
                btnQuitarProductoTabla.setEnabled(true);
                btnRealizarVenta.setEnabled(true);
                detalle = new DetalleVenta();
                detalle.setVenta(ve);
                detalle.setProducto(pro);
                detalle.setCantidad((Integer) comboCantidad.getSelectedItem());
                detalle.setPrecioTotal((pro.getPrecioActual() * (Integer) comboCantidad.getSelectedItem()));
                listaDetalles.add(detalle);

                modelo.addRow(new Object[]{pro.getIdProducto(), pro.getNombreProducto(), pro.getDescripcion(), "$ "+pro.getPrecioActual(),//Agrego el producto a la tabla
                    comboCantidad.getSelectedItem(), "$ "+(pro.getPrecioActual() * (Integer) comboCantidad.getSelectedItem())});
                pro.setStock(pro.getStock() - (Integer) comboCantidad.getSelectedItem());//Seteo el stock  
                prodao.modificarProducto(pro);//Modifico en la base de datos el stock               
            } else {
                JOptionPane.showMessageDialog(null, "Elija la cantidad");
            }
        }
        cargarCombo2();
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void comboProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductosActionPerformed
        //COMBOBOX PRODUCTO
        comboCantidad.removeAllItems();
        Producto pro = (Producto) comboProductos.getSelectedItem();
        if (pro != null) {
            int cantidad = pro.getStock();//saco la cantidad de productos que haya       
            for (int i = 0; i <= cantidad; i++) {//Cargo el comboCantidad con el stock
                comboCantidad.addItem(i);
            }
        }
    }//GEN-LAST:event_comboProductosActionPerformed

    private void comboCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCantidadActionPerformed
        // COMBOBOX CANTIDAD 
        if (comboCantidad.getSelectedItem() != null) {
            int num = (Integer) comboCantidad.getSelectedItem();//TOMAR LA CANTIDAD ELEGIDA
            Producto pro = (Producto) comboProductos.getSelectedItem();
            lblPrecioTotal.setText("$  " + pro.getPrecioActual() * num);//MULTIPLICAR EL PRECIO DEL PRODUCTO PORLA CANTIDAD ELEGIDA
        }

    }//GEN-LAST:event_comboCantidadActionPerformed

    private void btnQuitarProductoTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarProductoTablaActionPerformed
        // QUITAR PRODUCTOS DE LA TABLA
        DetalleVenta deta = null;
        Producto pro = null;
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtenemos los datos de la fila seleccionada
            int id = (int) tabla.getValueAt(filaSeleccionada, 0);//Obtengo el ID del producto
            pro = prodao.buscarPorID(id);//busco al producto con ese ID
            int cantidad = (int) tabla.getValueAt(filaSeleccionada, 4);//Obtengo la cantidad de productos

            for (int i = 0; i < listaDetalles.size(); i++) {
                deta = listaDetalles.get(i);
                if (deta.getProducto().getIdProducto()==pro.getIdProducto()) {//BUSCO EL ONJETO DETALLEVENTA SELECCIONADO Y LO ELIMINO DE LA LISTA
                    listaDetalles.remove(i);
                    break; 
                }
            }

            pro.setStock((pro.getStock() + cantidad));//Le sumo esa cantidad al stock
            prodao.modificarProducto(pro);//Seteo el stock 

            modelo.removeRow(filaSeleccionada);//Elimino la fila de la tabla

        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un producto de la tabla para quitar");
        }
        cargarCombo2();
        if (modelo.getRowCount() == 0) {
            btnQuitarProductoTabla.setEnabled(false);
            btnRealizarVenta.setEnabled(false);
        }
    }//GEN-LAST:event_btnQuitarProductoTablaActionPerformed

    public void cargarCombo1() {
        listaClientes = clidao.listarClientes();
        for (Cliente cli : listaClientes) {
            comboClientes.addItem(cli);
        }
    }

    public void cargarCombo2() {
        comboProductos.removeAllItems();
        listaproductos = prodao.listarProductos();
        for (Producto pro : listaproductos) {
            comboProductos.addItem(pro);
        }
    }

    public void cargarTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio p/u");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Total");
        tabla.setModel(modelo);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(10);
            tabla.getColumnModel().getColumn(1).setMinWidth(150);
            tabla.getColumnModel().getColumn(2).setMinWidth(400);
            tabla.getColumnModel().getColumn(5).setMinWidth(50);
        }
    }

    public void bloqueados() {
        lblProducto.setEnabled(false);
        comboProductos.setEnabled(false);
        lblCantidad.setEnabled(false);
        comboCantidad.setEnabled(false);
        lblPrecio.setEnabled(false);
        lblPrecioTotal.setEnabled(false);
        tabla.setEnabled(false);
        btnRealizarVenta.setEnabled(false);
        btnCarrito.setEnabled(false);
        btnCancelarVenta.setEnabled(false);
        btnQuitarProductoTabla.setEnabled(false);
    }

    public void desbloqueados() {
        lblProducto.setEnabled(true);
        comboProductos.setEnabled(true);
        lblCantidad.setEnabled(true);
        comboCantidad.setEnabled(true);
        lblPrecio.setEnabled(true);
        lblPrecioTotal.setEnabled(true);
        tabla.setEnabled(true);
        btnCarrito.setEnabled(true);
        btnCancelarVenta.setEnabled(true);
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
            java.util.logging.Logger.getLogger(VentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnIniciarVenta;
    private javax.swing.JButton btnQuitarProductoTabla;
    private javax.swing.JButton btnRealizarVenta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<Integer> comboCantidad;
    private javax.swing.JComboBox<Cliente> comboClientes;
    private javax.swing.JComboBox<Producto> comboProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecioTotal;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
