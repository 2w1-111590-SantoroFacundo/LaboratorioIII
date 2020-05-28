
package supermercado;


public class Articulo {
    
    private int nroProducto;
    private String nombreProducto;
    private double precioRegular,precioOferta;
    private int dias;
    private int stock;

    public Articulo(int nroProducto, String nombreProducto, double precioRegular, double precioOferta, int dias, int stock) {
        this.nroProducto = nroProducto;
        this.nombreProducto = nombreProducto;
        this.precioRegular = precioRegular;
        this.precioOferta = precioOferta;
        this.dias = dias;
        this.stock = stock;
    }

    public int getNroProducto() {
        return nroProducto;
    }

    public void setNroProducto(int nroProducto) {
        this.nroProducto = nroProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioRegular() {
        return precioRegular;
    }

    public void setPrecioRegular(double precioRegular) {
        this.precioRegular = precioRegular;
    }

    public double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) {
        this.precioOferta = precioOferta;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nroProducto=" + nroProducto + ", nombreProducto=" + nombreProducto + ", precioRegular=" + precioRegular + ", precioOferta=" + precioOferta + ", dias=" + dias + ", stock=" + stock + '}';
    }
    
    
    
    
    
    
}
