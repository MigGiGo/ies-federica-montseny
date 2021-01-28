import java.util.Arrays;
import java.util.Objects;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private Cuenta[] cuentas;

    public Cliente(String nombre, String apellidos, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.cuentas = cuentas;
    }


    public void printInfo() {
        System.out.println(nombre + " " + apellidos + " con DNI " + dni);

    }

    public void printCuentas() {
        for (int i = 0; i < cuentas.length; i++) {
            Cuenta cuenta = cuentas [i];
            cuenta.infoCuenta();
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(apellidos, cliente.apellidos) &&
                Objects.equals(dni, cliente.dni) &&
                Arrays.equals(cuentas, cliente.cuentas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre, apellidos, dni);
        result = 31 * result + Arrays.hashCode(cuentas);
        return result;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", cuentas=" + Arrays.toString(cuentas) +
                '}';
    }
}

