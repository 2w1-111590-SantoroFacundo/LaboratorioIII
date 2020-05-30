
package labiiiparcial;


public class Oficina {
    
    
    private Pedido [] pedidos;

    public Oficina(int cantidad) {       
        
        pedidos=new Pedido[cantidad];  
        
    }

    public void cargarPedido(Pedido p) {
        for (int i = 0; i < pedidos.length; i++) {
            if(pedidos[i]==null){
                pedidos[i]=p;
                break;
            }
            
        }
        
    }
    
    
    public String listarPedidos(){
        String resultado="";
        for (int i = 0; i < pedidos.length; i++) {
            if (pedidos[i]!=null) {
                Pedido p1=pedidos[i];
                resultado+=p1.toString()+'\n';
                
            }
            
        }
        return resultado;
    }
    

    public String oficinaPedidoMayor() {
        Pedido p1=pedidos[0];
        String nombre="";
        for (int i = 0; i < pedidos.length; i++) {
           
            if(pedidos[i]!=null&&pedidos[i].getResmasPedidas()>p1.getResmasPedidas()){
                p1=pedidos[i];                             
           }
           nombre=p1.getNombreOficina();
           
        }
        return nombre; 
    }

    public int totalResmas() {
       int total=0;
               for (int i = 0; i < pedidos.length; i++) {
            if(pedidos[i]!=null){
                total+=pedidos[i].getResmasPedidas();
            }
            
        }
        return total;

    }

    public int cantSolicitudesxPiso(int piso) {
      int resultado=0;
      
        for (int i = 0; i < pedidos.length; i++) {
            if(pedidos[i]!=null&&pedidos[i].getPiso()==piso){
                resultado++;
            }
            
        }
        return resultado;
    }
    
    
    
    
    
}
