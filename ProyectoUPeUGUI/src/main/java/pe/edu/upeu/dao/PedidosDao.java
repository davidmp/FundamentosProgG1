package pe.edu.upeu.dao;


import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.modelo.Pedidos;
import pe.edu.upeu.modelo.Productos;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;

public class PedidosDao extends AppCrud{
    Pedidos pedTO;
    SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    LeerArchivo leerArch;
    LeerTeclado teclado=new LeerTeclado();    
    public Object[][] registrarPedido(){        
        leerArch=new LeerArchivo("Productos.txt");
        
        Object[][] productos=listarContenido(leerArch);
        if(productos!=null){
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
            pedTO.setFechaRegPed(formateador.format(new Date()));           
        
            leerArch=new LeerArchivo("Pedidos.txt");
        }else{
            crearProducto();
            leerArch.clearConsole();
            registrarPedido();
        }

        return agregarContenido(leerArch, pedTO);
    }

    public Object[][] crearProducto(){       
        leerArch=new LeerArchivo("Productos.txt");
        String continuar="S";
        do{
            Productos prodTO=new Productos();
            prodTO.setProductoId(teclado.leer("", "Ingrese el codigo de Tipo de Productos:"));
            prodTO.setNombreProd(teclado.leer("", "Ingrese del nombre de tipo de Producto:")); 
            agregarContenido(leerArch, prodTO);
            continuar=teclado.leer("S", "Desea Continuar Ingresando Productos? (S=SI, N=NO):");
        }while(continuar.toUpperCase().equals("S"));
        return listarContenido(leerArch);
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

    public Object[][] reportePedidoFecha(String fecha){
        leerArch=new LeerArchivo("Pedidos.txt");
        Object[][] dataGobal=listarContenido(leerArch);
        Object[][] dataNew=null;
        int numFilas=0;
        if(dataGobal!=null){
            for(int fila=0; fila<dataGobal.length;fila++){
                String[] fechaCompleta=dataGobal[fila][6].toString().split(" ");
                if(fechaCompleta[0].equals(fecha)){
                    numFilas++;
                }
            }
            dataNew=new Object[numFilas][dataGobal[0].length];
            int filaX=0, comulnaX=0;
            for(int fila=0;fila<dataGobal.length;fila++){
                String[] fechaCompleta=dataGobal[fila][6].toString().split(" ");
                if(fechaCompleta[0].equals(fecha)){
                    for(int columna=0;columna<dataGobal[0].length;columna++){                    
                        dataNew[filaX][comulnaX]=dataGobal[fila][columna];
                        comulnaX++;
                    }
                    filaX++; 
                    comulnaX=0;  
                }
            }
        }
        imprimirLista(dataNew);
        return dataNew;
    }

}