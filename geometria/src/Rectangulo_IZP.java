/**
 * 
 * @author Iván Zarco Pareja
 * @version 1.2
 *
 */
public class Rectangulo_IZP extends FiguraGeometrica_IZP {
	private double l1;
	private double l2;

	/**
	 * Método constructor
	 * @param tipoFigura Heredado de la superclase FiguraGeometrica_IZP
	 * @param lG un lado del rectángulo
	 * @param lP el otro aldo del rectángulo
	 */
	public Rectangulo_IZP(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
/**
 * Método sobreescrito de la superclase FiguraGeometrica_IZP
 * Calcula el área del rectángulo
 * @return el área del rectángulo
 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Método sobreescrito de la superclase FiguraGeometrica_IZP
	 * Calcula el perímetro del rectángulo
	 * @return el perímetro del rectángulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
