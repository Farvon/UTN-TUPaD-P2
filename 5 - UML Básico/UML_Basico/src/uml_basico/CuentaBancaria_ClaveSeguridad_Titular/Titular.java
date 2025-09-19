package uml_basico.CuentaBancaria_ClaveSeguridad_Titular;

public class Titular {

    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }

    public CuentaBancaria getCuentaBancaria() {
        return this.cuentaBancaria;
    }

    public String mostrarCuentaBancaria() {
        if (this.cuentaBancaria != null) {
            return cuentaBancaria.getInfo();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", cuentaBancaria= {" + mostrarCuentaBancaria() + '}';
    }

}
