
package supermercado;


public class Folleto {
    
     private String fecha;
     private Articulo[] articulos;
     
    
    public Folleto(String fecha,int cantidadArticulos) {
        
        this.fecha=fecha;
        articulos=new Articulo[cantidadArticulos];
        
    }
    
    public void cargarArticulo(Articulo a){
        
        for (int i = 0; i < articulos.length; i++) {
            if(articulos[i]==null){
                articulos[i]=a;
                break;
            }
            
        }
    }
    
    public String listarArticulos(){
        String resultado="";
        int c=0;
        for (int i = 0; i <articulos.length; i++) {
            if(articulos[i]!=null){
                System.out.println(articulos[i].toString());
                c++;
            }
        }
        return resultado;
    
    }

    public int articulo5() {
        int c=0;
        for (int i = 0; i <articulos.length; i++) {
            if(articulos[i]!=null&&articulos[i].getDias()>5){
                c++;
            }
            
        }
        return c;
        
    }

    public int cantidadStock() {
        
        int acumulador=0;
        for (Articulo articulo : articulos) {
            if(articulo!=null){
                acumulador+=articulo.getStock();
                
            }
            
        }
        
        return acumulador;
        
    }

    public int articulosMasde20() {
        int c=0;
        int descuento=20;
        for (Articulo articulo : articulos) {
            if (articulo!=null&&(articulo.getPrecioRegular()-articulo.getPrecioOferta())>descuento) {
                c++;
                
            }
            
        }
        return c;
       
    }

    public double recaudacion(int id) {
        double total=0;
        for (int i = 0; i < articulos.length; i++) {
            if(articulos[i]!=null&&articulos[i].getNroProducto()==id){
                
                total+=articulos[i].getPrecioOferta()*articulos[i].getStock();
            }
            
        }
       return total;
    }
    
}