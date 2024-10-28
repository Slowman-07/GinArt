package Tablas;

import Tablas.TablaProductos;
import java.util.Date;

/**
 *
 * @author Gonzalo
 */
public class TablaVenta {
    
    public class Venta {

    private int idFactura;
    private TablaCliente idcliente;
    private TablaProductos idproducto;
    private Date fecha;
    private int stock;
    private double preciouni;
    private double total;

        public Venta(int idFactura, TablaCliente idcliente, TablaProductos idproducto, Date fecha, int stock, double preciouni, double total) {
            this.idFactura = idFactura;
            this.idcliente = idcliente;
            this.idproducto = idproducto;
            this.fecha = fecha;
            this.stock = stock;
            this.preciouni = preciouni;
            this.total = total;
        }

        public int getIdFactura() {
            return idFactura;
        }

        public void setIdFactura(int idFactura) {
            this.idFactura = idFactura;
        }

        public TablaCliente getIdcliente() {
            return idcliente;
        }

        public void setIdcliente(TablaCliente idcliente) {
            this.idcliente = idcliente;
        }

        public TablaProductos getIdproducto() {
            return idproducto;
        }

        public void setIdproducto(TablaProductos idproducto) {
            this.idproducto = idproducto;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public double getPreciouni() {
            return preciouni;
        }

        public void setPreciouni(double preciouni) {
            this.preciouni = preciouni;
        }

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }
        
    public void agregarProducto(TablaProductos producto) {
        
        
        total += producto.getPrecio();
        
        try {
            if (producto != null) {
                
                total += producto.getPrecio();
                
            } else {
                
                throw new NullPointerException("Producto no puede ser nulo");
                
            }
            
        } catch (NullPointerException e) {
            
            System.out.println("Error: " + e.getMessage());
            
        } 
    }
    }
}


        
        