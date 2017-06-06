
public class Administrador extends Empregado {
	
	private double ajudaDeCusto;

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double obterLucros(){
		setSalario(getSalario() + ajudaDeCusto); 
		
		
		System.out.println("O seu lucro é:"+ getSalario());
		return getSalario();

}
	}
