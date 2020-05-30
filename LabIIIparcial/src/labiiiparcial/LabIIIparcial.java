package labiiiparcial;

import java.util.Scanner;

public class LabIIIparcial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cantidad de pedidos a cargar");
        int cantidadPedidos =Integer.parseInt(sc.nextLine());

        Oficina o = new Oficina(cantidadPedidos);
        
        for (int i = 0; i <cantidadPedidos; i++) {
            System.out.println("ingrese Cantidad de resmas pedidas");
            int res=Integer.parseInt(sc.nextLine());
            System.out.println("ingrese nombre de la oficina");
            String nom=sc.nextLine();
            System.out.println("ingrese el piso de la oficina");
            int pi=Integer.parseInt(sc.nextLine());
           Pedido p = new Pedido(res,nom,pi); 
         o.cargarPedido(p);
        }
        

        
        
        System.out.println(o.listarPedidos());

        System.out.println(o.oficinaPedidoMayor());
        System.out.println(o.totalResmas());
        System.out.println("ingrese el piso ");
        int canSoli=Integer.parseInt(sc.nextLine());
        System.out.println(o.cantSolicitudesxPiso(canSoli));

    }

}

