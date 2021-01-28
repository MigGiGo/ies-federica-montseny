import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);


    private static Banco pideBanco() {
        System.out.println("Introduce el nombre del banco");
        String nombre = scan.nextLine();
        return new Banco(nombre, pideClientes());
    }

    private static Cliente[] pideClientes() {
        System.out.println("Introduce el numero de clientes");
        int cantidad = scan.nextInt();
        scan.nextLine();
        while (cantidad <= 0) {
            System.out.println("Tiene que tener un cliente como mínimo");
            cantidad = scan.nextInt();
            scan.nextLine();
        }
        Cliente[] arrayCliente = new Cliente[cantidad];
        for (int i = 0; i < arrayCliente.length; i++) {
            arrayCliente[i] = pideCliente();
        }
        return arrayCliente;
    }

    private static void menu() {
        System.out.println("-----Menu-----");
        System.out.println("1.Monstrar nombre, apellidos y NIF de todos los clientes.");
        System.out.println("2.Mostrar información de las cuentas de un cliente.");
        System.out.println("3.Monstrar la información de la cuenta de un cliente.");
        System.out.println("4.Ingresar dinero en una cuenta de un cliente.");
        System.out.println("5.sacar dinero en una cuenta de un cliente.");
        System.out.println("6.Salir.");

    }

    private static Cliente pideCliente() {
        System.out.println("Introduce el nombre del cliente");
        String nombre = scan.nextLine();
        System.out.println("Introduce el apellido del cliente");
        String apellidos = scan.nextLine();
        System.out.println("Introduce el DNI del cliente:");
        String dni = scan.nextLine();
        return new Cliente(nombre, apellidos, dni, pideCuentas());
    }

    private static Cuenta pideCuenta() {
        System.out.println("Introduce el número de la cuenta :");
        int numero = scan.nextInt();
        scan.nextLine();

        while (numero < 0) {
            System.out.println("la cuenta tiene que ser mayor que 0:");
            numero = scan.nextInt();
            scan.nextLine();
        }
        System.out.println("Introduce saldo de la cuenta:");
        int saldo = scan.nextInt();
        scan.nextLine();

        return new Cuenta(numero, saldo);
    }

    private static Cuenta[] pideCuentas() {
        System.out.println("Introduce el numero de las cuentas que tiene a su disposición:");
        int cantidad = scan.nextInt();
        while (cantidad <= 0) {
            System.out.println("Tiene que tener minimo una cuenta");
            cantidad = scan.nextInt();
            scan.nextLine();
        }
        Cuenta[] arrayCuenta = new Cuenta[cantidad];
        for (int i = 0; i < arrayCuenta.length; i++) {
            arrayCuenta[i] = pideCuenta();
        }
        return arrayCuenta;
    }

    private static int operacion() {
        menu();
        int op = scan.nextInt();
        while (op < 1 || op > 6) {
            System.out.println("Operación inválida");
            menu();
            op = scan.nextInt();
        }
        return op;
    }

    public static void main(String[] args) {
        Banco banco = pideBanco();


        int op = operacion();

        while (op != 6) {
            if (op == 1) {
                banco.infoClientes();
            } else if (op == 2) {
                System.out.println("introduce el dni del titular");
                String dni = scan.nextLine();
                banco.infoCuentas(dni);
            } else if (op == 3) {

            } else if (op == 4) {

            } else if (op == 5) {

            } else if (op == 6) {

            }
            op = operacion();


        }


    }


}
