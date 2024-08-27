package javanotes;

import java.util.Scanner;

public class Voidfuncion {
    static Scanner sc = new Scanner(System.in);
    static int costumerId;
    static String costumerName;
    static String email;
    static String password;
    static boolean status;

    public static void main(String[] args) {  //main funcion global de java, static: funcion de clase
        createCostumer();
        printCostumerData();
    }

    public static void createCostumer() {     //creando funcion;  //la colocamos static para que nos funcione la funcion main

        System.out.println("Ingrese el id");
        costumerId = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre del cliente");
        costumerName = sc.nextLine();
        System.out.println("email");
        email = sc.nextLine();
        System.out.println("password");
        password = sc.nextLine();
        System.out.println("Seleccione un estado V/F : ");
        int selection=sc.nextInt();
        status = selectStatus(selection);
    }

    public static void printCostumerData() {
        System.out.println("Id" + costumerId + "\n" +
                "Nombre" + costumerName + "\n"
                + "correo" + email + "\n" +
                "status" + status);
    }

    public static String selectStatus(int selection) {               //funcion q recibe parametros
        String active="";
        if (selection == 1) {
            active = String.valueOf(Statuscostumer.TRUE);

        } else if (selection == 2) {
            active = String.valueOf(Statuscostumer.FALSE);
        }else{
            System.out.println("Seleccion no valida");
        }
        return active;
    }
}
