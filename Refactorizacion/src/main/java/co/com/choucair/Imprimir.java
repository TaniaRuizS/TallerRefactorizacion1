package co.com.choucair;

import co.com.choucair.model.Compras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Esta clase se encarga de imprimir
 */
public class Imprimir {
    public static void main (String [] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Antonio");
        cliente.setApellido1("Zapata");
        cliente.setApellido2("Restrepo");
        cliente.setNumerodoc("123456789");
        Compras compra1 = new Compras();
        compra1.setCantProducto(8);
        compra1.setNombrePoducto("Arroz");
        cliente.setComprasList(Arrays.asList(compra1));

        impInfoPersonalCliente(cliente);
        impTodaInfoCliente(cliente);
    }

    /**
     * Este metodo se encarga de imprimir la iformacion personal del cliente
     * @param cliente
     */
    public static void impInfoPersonalCliente(Cliente cliente) {
        imprimirDatosCliente(cliente);
    }

    /**
     * Este metodo se encarga de imprimir el objeto cliente
     * @param cliente
     */
    private static void imprimirDatosCliente(Cliente cliente) {
        System.out.println("Nombre:" + cliente.getNombre());
        System.out.println("Apellido 1:" + cliente.getApellido1());
        System.out.println("Apellido 2:" + cliente.getApellido2());
        System.out.println("Numero de documento:" + cliente.getNumerodoc());
    }

    /**
     * Este metodo se encarga de imprimir toda la informacion del cliente
     * @param cliente
     */
    public static void impTodaInfoCliente (Cliente cliente) {
        imprimirDatosCliente(cliente);

        for (Compras listsCompras : cliente.getComprasList()) {
            System.out.println(listsCompras.getNombrePoducto());
        }
    }

}
