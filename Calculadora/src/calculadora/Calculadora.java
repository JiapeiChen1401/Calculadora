package calculadora;

/**
 * Conjunto de operaciones básicas (sumar, restar, multiplicar y dividir).
 * 
 * @author Jiapei
 * @version 1.0.1
 * @since 2026
 */
public class Calculadora {
	/**
	 * Este método devuelve la suma de dos números enteros.
	 * 
	 * @param a Primer sumando.
	 * @param b Segundo sumando.
	 * @return Resultado de la suma de a+b.
	 */
	public int sumar(int a, int b) {
		return a+b; 
	}
	
	/**
	 * Este método devuelve la diferencia entre dos números enteros.
	 * 
	 * @param a Minuendo.
	 * @param b Sustraendo.
	 * @return Resultado de la resta de a-b.
	 */
	public int restar(int a, int b) {
		return a-b; 
	}
	
	/**
	 * Este método devuelve el producto de dos números enteros.
	 * 
	 * @param a Multiplicando.
	 * @param b Multiplicador.
	 * @return Producto de a*b.
	 */
	public int multiplicar(int a, int b) {
		return a*b; 
	}
	
	/**
	 * Este médoto devuelve el cociente de de la división entre dos números.
	 * 
	 * @param a Dividendo.
	 * @param b Divisor.
	 * @return Cociente de a/b.
	 */
	public double dividir(int a, int b) {
		if(b==0) {
			throw new IllegalArgumentException("No se puede dividir entre cero");
		}
		return (double)a/b;
	}
}
