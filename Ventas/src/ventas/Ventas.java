package ventas;

import acceso.ProductoDAO;
import entidades.Producto;

/**
 *
 * @author johan
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoDAO pedao = new ProductoDAO();
        Producto producto = new Producto(2,"Heladera","Semi-Automática",130.000,10,true);
        
//        pedao.insertarProductos(producto);//------------INSERTAR PRODUCTO
//        pedao.modificarProducto(producto);//-------------MODIFICAR PRODUCTO
        pedao.eliminarProducto(producto);//-------------ELIMINAR PRODUCTO
        
        for(Producto pro : pedao.listarProductos()){
            System.out.println(pro);
        }
        
        System.out.println(pedao.buscarPorNombre("Lavarropa")); //BUSCAR PRODUCTO POR NOMBRE
        
        
    }
    
}
