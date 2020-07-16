package pe.edu.upeu.dao;

import pe.edu.upeu.modelo.Pedidos;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;

public class PedidosDao extends AppCrud{
    Pedidos pedTO;
    LeerArchivo leerArch;
    LeerTeclado teclado=new LeerTeclado();    
    public Object[][] registrarPedido(){        
        leerArch=new LeerArchivo("Productos.txt");
        Object[][] productos=listarContenido(leerArch);
        for(int i=0;i<productos.length;i++){
            System.out.print(productos[i][0]+"="+productos[i][1]+", ");
        }
        System.out.println("");
        pedTO=new Pedidos(); 
        pedTO.setPedidoId(generarPedidoId(0));
        leerArch=new LeerArchivo("Productos.txt");
        pedTO.setProductoId(teclado.leer("", "Ingrese el Codigo del Producto:"));
        productos=buscarContenido(leerArch, 0, pedTO.getProductoId());
        pedTO.setDescripcionPed(productos[0][1].toString());
        pedTO.setCantidad(teclado.leer(0.0, "Ingrese la cantidad del producto:"));
        pedTO.setPrecioUnit(teclado.leer(0.0, "Ingrese el precio Producto:"));
        pedTO.setPrecioTotal(pedTO.getCantidad()*pedTO.getPrecioUnit());
        leerArch=new LeerArchivo("Pedidos.txt");
        return agregarContenido(leerArch, pedTO);
    }

    public String generarPedidoId(int columna){
        Object[][] data=listarContenido(new LeerArchivo("Pedidos.txt"));
        int serie=1;
        try {
            if(data!=null){
                serie=Integer.parseInt(data[data.length-1][columna].toString().substring(1))+1;
            }     
        } catch (Exception e) {
            System.err.println("Error:"+e.getMessage());
        }
        return "P"+serie;
    }

    public void reportarPedidos(){
        System.out.println("*****************Pedidos Realizados*****************");
        leerArch=new LeerArchivo("Pedidos.txt");
        imprimirLista(listarContenido(leerArch));
    }


}