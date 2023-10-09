package comunicacion;

public class Alfabeto extends Pictograma{
	
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
		
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String toString() {
		String answer = "";
		for (String letra : letras) {
            answer += letra + ", ";
        }
		String resultado = answer.substring(0, answer.length() - 2);
		return resultado;
	}
}
