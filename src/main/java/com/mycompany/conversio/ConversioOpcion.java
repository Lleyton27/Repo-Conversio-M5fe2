/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversio;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class ConversioOpcion {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int salir = 0;

    while (salir == 0) {
	System.out.println("¿Que opción deseas?");
	System.out.println("1. Euros a libras esterlinas");
	System.out.println("2. Libras esterlinas a Euros");
	int opcion = sc.nextInt();

	if (opcion == 1) {
		System.out.println("Introduce en libra esterlina");
		int valor_libra = sc.nextInt();
		
	double tipos_de_cambio = 1.15d;
	System.out.println(valor_libra + " libras esterlinas (£) actualmente equivalente a " + (valor_libra * tipos_de_cambio) + " euros (€)");

	} else if (opcion == 2) {
	System.out.println("Introduce en €");
	int valor_euros = sc.nextInt();

	double tipos_de_cambio = 1.15d;
	System.out.println(valor_euros + " euros (€) actualmente equivalente a " + (valor_euros / tipos_de_cambio) + " libras esterlinas (£)");
	}else{
	System.out.println("Opción no valida");
	salir = 1;
        }
      }
    }
    }
