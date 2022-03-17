package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("1: Hamburguesa");
        System.out.println("2: Perros  8000");
        System.out.println("3: Salchipapas");
        System.out.println("4: Chorizos");

        int numper;
        int plato = 0, contaPlato1 = 0, contaPlato2 = 0, contaPlato3 = 0, contaPlato4 = 0,contaPropina = 0;
        double total = 0, descuento = 0;
        String propina = "";

        System.out.print("Ingrese el número de personas que van a comer: ");
        numper = entrada.nextInt();

        for (int i=0; i < numper; i++) {
            System.out.print("ingrese el numero plato : ");
            plato = entrada.nextInt();


            System.out.print("Desea incluir propina(s/n): ");
            propina = entrada.next();

            if(propina.equals("S") || propina.equals("s")) {
                contaPropina++;
            }

            if (plato == 1) {
                total += 10000;
                contaPlato1++;
            } else if(plato == 2) {
                total += 8000;
                contaPlato2++;
            } else if(plato== 3) {
                total += 6000;
                contaPlato3++;
            } else if(plato == 4) {
                total += 7000;
                contaPlato4++;
            } else {
                System.out.println("no valida");
            }
        }

        if(contaPropina > 0) {
            total += (total*0.10*contaPropina);
        }

        if(contaPlato1 >= 2 || contaPlato2 >= 2 || contaPlato3 >= 2 || contaPlato4 >= 2){
            descuento = total * 0.05;
            total = total - descuento;
        }

        if (total > 20000) {

            descuento = total * 0.10;
            total -= descuento;

            System.out.println("se le realizó un descuento por compras superiores a 20000 pesos" + descuento);
        }

        System.out.println("Total a pagar " + total);


    }

}
