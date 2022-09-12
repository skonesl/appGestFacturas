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

        // Para optimizar el código: En lugar de crear variables para pasárselas al objeto, se pasa
        // directamente el Scanner al set del objeto.

//        String nombre;
//        float precio;
//        int cantidad;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
//            nombre = entrada.next();
            producto.setNombre(entrada.nextLine());

            System.out.print("Ingrese el precio: ");
//            precio = entrada.nextFloat();
            producto.setPrecio(entrada.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura(new ItemFactura(entrada.nextInt(), producto));

            System.out.println();
            entrada.nextLine();
        }

        System.out.println(factura);

    }

}
