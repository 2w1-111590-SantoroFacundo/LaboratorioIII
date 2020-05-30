
package labiiiparcial;


public class Pedido {
    
    private int resmasPedidas;
    private String nombreOficina;
    private int piso;

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getNombreOficina() {
        return nombreOficina;
    }

    public void setNombreOficina(String nombreOficina) {
        this.nombreOficina = nombreOficina;
    }

       

    public Pedido(int resmasPedidas,String nombreOficina,int piso) {
        this.resmasPedidas = resmasPedidas;
        this.nombreOficina=nombreOficina;
        this.piso=piso;
    }

    public int getResmasPedidas() {
        return resmasPedidas;
    }

    public void setResmasPedidas(int resmasPedidas) {
        this.resmasPedidas = resmasPedidas;
    }

    @Override
    public String toString() {
        return "Pedido{" + "resmasPedidas=" + resmasPedidas + ", nombreOficina=" + nombreOficina + ", piso=" + piso + '}';
    }

    

   
    
    
}
