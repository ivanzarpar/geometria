
public class Circulo_IZP extends FiguraGeometrica_IZP {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_IZP(double r, String tipoFigura) {
		super(tipoFigura);
		while(radio>=0) {
		radio = r;
		}
		
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
