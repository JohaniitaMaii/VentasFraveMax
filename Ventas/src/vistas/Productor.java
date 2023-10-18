package vistas;

import acceso.ProductoDAO;
import acceso.VentaDAO;
import entidades.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author Johnny
 */
public class Productor extends javax.swing.JFrame {

    ProductoDAO prodao = new ProductoDAO();
    VentaDAO vedao = new VentaDAO();

    /**
     * Creates new form Coso
     */
    public Productor() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIDProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        radioBoton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescri = new javax.swing.JTextArea();
        btnBuscarProducto = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("ID Producto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        txtIDProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtIDProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 74, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Descripción:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 122, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Precio Actual:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Stock:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtStock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 190, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Estado:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        jPanel1.add(radioBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        txtAreaDescri.setColumns(10);
        txtAreaDescri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAreaDescri.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescri);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 80));

        btnBuscarProducto.setBackground(new java.awt.Color(0, 51, 102));
        btnBuscarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/search-engine-optimization.png"))); // NOI18N
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 120, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 51, 102));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/escoba.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 120, -1));

        btnAgregar.setBackground(new java.awt.Color(0, 51, 102));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar-producto.png"))); // NOI18N
        btnAgregar.setText("Agregar ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 120, -1));

        btnModificar.setBackground(new java.awt.Color(0, 51, 102));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/update_24.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 120, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 51, 102));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/trash_24.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 120, -1));

        btnListar.setBackground(new java.awt.Color(0, 51, 102));
        btnListar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ojo.png"))); // NOI18N
        btnListar.setText("Listar Productos");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ojo.png"))); // NOI18N
        jButton1.setText("Productos de Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 51, 102));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 440, 50));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Productos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        //BUSCAR PRODUCTO POR ID

        if (txtIDProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe indicar un ID");
        } else {
            if (esNumerico(txtIDProducto.getText())) {
                Producto p = prodao.buscarPorID(Integer.parseInt(txtIDProducto.getText()));
                if (p == null) {
                    JOptionPane.showMessageDialog(null, "No existe ese ID de Producto");
                    limpiarTextos();
                } else {
                    cargarDatos(p);
                }
            } else {
                limpiarTextos();
                JOptionPane.showMessageDialog(null, "Ingresa un ID válido");
            }
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // BOTON LIMPIAR
        limpiarTextos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // AGREGAR PRODUCTO

        Producto pro = new Producto();

        if (validarAgregar()) {//validar que no esten vacíos

            pro.setNombreProducto(txtNombre.getText());
            pro.setDescripcion(txtAreaDescri.getText());
            pro.setPrecioActual(Double.parseDouble(txtPrecio.getText()));
            pro.setStock(Integer.parseInt(txtStock.getText()));
            pro.setEstado(true);
            prodao.insertarProductos(pro);//agregamos el producto a la base de datos
            JOptionPane.showMessageDialog(null, "Producto agregado");
            limpiarTextos();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // MODIFICAR PRODUCTO
        Producto pro = new Producto();

        if (validarModificar()) {
            if (esNumerico(txtIDProducto.getText())) {

                int pregunta = JOptionPane.showConfirmDialog(
                        this, "¿Estas seguro de querer modificar el producto?",
                        "Mensaje..!!",
                        JOptionPane.YES_NO_OPTION);
                if (pregunta == JOptionPane.YES_OPTION) {
                    pro.setIdProducto(Integer.parseInt(txtIDProducto.getText()));
                    pro.setNombreProducto(txtNombre.getText());
                    pro.setDescripcion(txtAreaDescri.getText());
                    pro.setPrecioActual(Double.parseDouble(txtPrecio.getText()));
                    pro.setStock(Integer.parseInt(txtStock.getText()));
                    boolean estado = radioBoton.isSelected();
                    pro.setEstado(estado);
                    prodao.modificarProducto(pro);//modificamos el producto
                    JOptionPane.showMessageDialog(null, "Producto modificado");
                    limpiarTextos();
                }
                if (pregunta == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Modificación cancelada!!");
                    limpiarTextos();
                }

            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // ELIMINAR PRODUCTO

        if (txtIDProducto.getText().isEmpty()) {//Verificamos que haya datos
            JOptionPane.showMessageDialog(null, "Debe indicar un ID");
        } else {
            if (esNumerico(txtIDProducto.getText())) {//Verificamos que sea un valor entero

                try {
                    Producto produ = prodao.buscarPorID(Integer.parseInt(txtIDProducto.getText()));//Buscamos el producto
                    if (produ == null) {
                        JOptionPane.showMessageDialog(null, "El Producto no Existe.!!");
                    } else {//Producto existente
                        if (vedao.obtenerClientesporProducto(produ.getIdProducto()).isEmpty()) {//Verificamos que no haya una venta
                            //Preguntamos si está seguro de realizar la acción
                            int pregunta = JOptionPane.showConfirmDialog(
                                    this, "¿Estas seguro de querer eliminar el producto?",
                                    "Mensaje..!!",
                                    JOptionPane.YES_NO_OPTION);
                            if (pregunta == JOptionPane.YES_OPTION) {
                                prodao.eliminarProducto(produ);
                                JOptionPane.showMessageDialog(null, "Producto eliminado!!");
                                limpiarTextos();
                            }
                            if (pregunta == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Eliminación cancelada!!");
                                limpiarTextos();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Imposible Eliminar!!! Producto asociado a una Venta");
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
                }

            } else {
                limpiarTextos();
                JOptionPane.showMessageDialog(null, "Ingresa un ID válido");
            }
        }
        limpiarTextos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // MOSTRAR LISTA DE PRODUCTOS
        ListaPro lp = new ListaPro();
        lp.setVisible(true);
    }//GEN-LAST:event_btnListarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // PRODUCTOS DE CLIENTES
        ListaPro_IDCliente lpic = new ListaPro_IDCliente();
        lpic.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // BOTON SALIR
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public boolean validarAgregar() {
        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue un nombre al producto");
        } else if (txtAreaDescri.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue una descripción al producto");
        } else if (txtPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue un precio al producto");
        } else if (txtStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el stock al producto");
        } else if (!radioBoton.isSelected()) {
            JOptionPane.showMessageDialog(null, "Active el estado del producto ");
        } else if (!esDouble(txtPrecio.getText())) {
            JOptionPane.showMessageDialog(null, "Agregue un precio válido");
        } else if (!esNumerico(txtStock.getText())) {
            JOptionPane.showMessageDialog(null, "Agregue un stock válido");
        } else if (Integer.parseInt(txtStock.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "Agregue un stock mayor a 0");
        } else if (Double.parseDouble(txtPrecio.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "Agregue un precio mayor a 0");
        } else {
            return true;
        }
        return false;
    }

    public boolean validarModificar() {
        if (txtIDProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue un ID");
        } else if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue un nombre");
        } else if (txtAreaDescri.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue una descripción");
        } else if (txtPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue un precio");
        } else if (txtStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el stock");
        } else if (!esDouble(txtPrecio.getText())) {
            JOptionPane.showMessageDialog(null, "Agregue un precio válido");
        } else if (!esNumerico(txtStock.getText())) {
            JOptionPane.showMessageDialog(null, "Agregue un stock válido");
        } else if (Integer.parseInt(txtStock.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "Agregue un stock mayor o igual a 0");
        } else if (Double.parseDouble(txtPrecio.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "Agregue un precio mayor o igual a 0");
        } else {
            return true;
        }
        return false;
    }

    public void cargarDatos(Producto p) {
        txtIDProducto.setText(p.getIdProducto() + "");
        txtNombre.setText(p.getNombreProducto());
        txtAreaDescri.setText(p.getDescripcion());
        txtPrecio.setText(p.getPrecioActual() + "");
        txtStock.setText(p.getStock() + "");
        if (p.isEstado()) {
            radioBoton.setSelected(true);
        }
    }

    public void limpiarTextos() {
        txtIDProducto.setText("");
        txtNombre.setText("");
        txtAreaDescri.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        radioBoton.setSelected(false);
    }

    public boolean esNumerico(String cadena) {//verificar si es un entero
        boolean resultado;
        try {
            Integer.valueOf(cadena);
            resultado = true;
        } catch (NumberFormatException ex) {
            resultado = false;
        }
        return resultado;
    }

    public boolean esDouble(String cadena) {//verificar si es un Double
        boolean resultado;
        try {
            Double.valueOf(cadena);
            resultado = true;
        } catch (NumberFormatException ex) {
            System.out.println("Precio no válido");
            resultado = false;
        }
        return resultado;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioBoton;
    private javax.swing.JTextArea txtAreaDescri;
    private javax.swing.JTextField txtIDProducto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
