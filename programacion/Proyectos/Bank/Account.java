import java.util.Objects;

public class Cuenta {
    private int cuenta;
    private int saldo;

    public Cuenta(int cuenta, int saldo) {
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public void infoCuenta() {
        System.out.println("la cuenta " + cuenta + " tiene " + saldo + " euros.");
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return this.cuenta == cuenta.cuenta &&
                saldo == cuenta.saldo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuenta, saldo);
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "cuenta=" + cuenta +
                ", saldo=" + saldo +
                '}';
    }
}
