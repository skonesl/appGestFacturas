package com.borja.appfacturas;

import com.borja.appfacturas.modelo.Cliente;
import com.borja.appfacturas.modelo.Factura;
import com.borja.appfacturas.modelo.ItemFactura;
import com.borja.appfacturas.modelo.Producto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        Cliente cliente = new Cliente();
        cliente.setNif("505050503B");
        cliente.setNombre("Borja");

        System.out.println("Ingrese una descripción de la factura: ");
        String descripcion = entrada.nextLine();
        Factura factura = new Factura(descripcion, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
            nombre = entrada.next();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = entrada.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = entrada.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);

            System.out.println();
        }

        System.out.println(factura.generarDetalle());

    }

}
