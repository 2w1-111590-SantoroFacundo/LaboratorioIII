package supermercado;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la fecha del Folleto");
        String fecha =sc.nextLine();
        System.out.println("Ingresa Cantidad de articulos");
        int cantidad =Integer.parseInt(sc.nextLine());
        
        Folleto f = new Folleto(fecha, cantidad);
      
        /* String fecha="22/12/2020";
       int cantidad=4;
        Folleto f = new Folleto(fecha, cantidad);
        
        Articulo a = new Articulo(001, "Manteca", 100, 70, 4, 10);
        Articulo b = new Articulo(002, "Queso", 50, 25, 4, 8);
        Articulo c = new Articulo(003,"Leche", 20, 19, 4, 5);
        Articulo d = new Articulo(004,"Crema", 30, 9, 19, 0);
             
        f.cargarArticulo(a);
        f.cargarArticulo(b);
        f.cargarArticulo(c);
        f.cargarArticulo(d);
        */
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nro Articulo");
            int nroProducto=Integer.parseInt(sc.nextLine());
            System.out.println("Nombre");
            String nombreProducto=sc.nextLine();
            System.out.println("Precio Regular");
            double precioRegular=Double.parseDouble(sc.nextLine());
            System.out.println("Precio Oferta");
            double precioOferta=Double.parseDouble(sc.nextLine());
            System.out.println("Cantidad Dias");
            int dias=Integer.parseInt(sc.nextLine());
            System.out.println("Stock");
            int stock=Integer.parseInt(sc.nextLine());
            
             Articulo a = new Articulo(nroProducto, nombreProducto, precioRegular, precioOferta, dias, stock);
             
             f.cargarArticulo(a);

        }
        
       
        f.listarArticulos();
        
        
        System.out.println(f.articulo5()); 
        
        
        System.out.println(f.cantidadStock());
       
        
        System.out.println(f.articulosMasde20());
        System.out.println("Ingrese Numero de Articulo");
        int id=sc.nextInt();
        System.out.println(f.recaudacion(id));
     
    
        
    }
}
