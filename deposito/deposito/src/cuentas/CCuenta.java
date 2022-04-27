package cuentas;
/**
 * 
 * @author DACC
 *
 */
public class CCuenta {

/**
 * Los atributos de la clase
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 * El constructor de la cuenta
 */
    public CCuenta()
    {
    }
/**
 * 
 * @param nom Nombre
 * @param cue Cuenta
 * @param sal Salario
 * @param tipo Tipo de interés
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**
 * 
 * @return El saldo almacenado
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * 
 * @param cantidad El dinero que se ingresará
 * @throws Exception si el número introducido es negativo
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * 
 * @param cantidad El dinero que retiraremos
 * @throws Exception Si se introduce una cantidad negativa o si la cantidad a extraer es mayór a la almacenada
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * 
 * @return El nombre del titular
 */
	private String getNombre() {
		return nombre;
	}
/**
 * 
 * @param nombre almacena el nombre del titular de la cuneta
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return Devuelve una cuenta
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * 
 * @param cuenta Almacena una cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * 
 * @return El saldo de la cuenta
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * 
 * @param saldo Almacena el saldo de la cuenta
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * 
 * @return Devuelve el tipo de interés
 */
	private double getTipoInterés() {
		return tipoInterés;
	}
/**
 * 
 * @param tipoInterés Almacena el tipo de interés
 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}