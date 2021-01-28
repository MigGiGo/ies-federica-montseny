import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class Banco implements IBanco {
    private String nombre;
    private Cliente[] clientes;

    public Banco(String nombre, Cliente[] clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
    }

    @Override
    public void infoClientes() {
        for (int i = 0; i < clientes.length; i++) {
            Cliente cliente = clientes[i];
            cliente.printInfo();
        }
    }

    @Override
    public void infoCuentas(String dni) {
        boolean encontrado = false;
        for (int i = 0; i < clientes.length; i++) {
            Cliente cliente = clientes[i];
            if (cliente.getDni().equals(dni)) {
                encontrado = true;
                cliente.printCuentas();
            }
        }
        if (!encontrado){
            System.out.println("El cliente no existe o ha introducido mal el dni");
        }
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(nombre, banco.nombre) &&
                Arrays.equals(clientes, banco.clientes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(clientes);
        return result;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", clientes=" + Arrays.toString(clientes) +
                '}';
    }
}
