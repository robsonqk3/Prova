
public class Empregado extends Pessoa {

	private double Salario = 1000;
	private double desconto;
	
	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
	
	public double getDisconto() {
		return desconto;
	}

	public void setDisconto(double desconto) {
		this.desconto = desconto;
	}

	public double obterLucros(){
		double Lucro = Salario - desconto;
		
		System.out.println("O seu lucro é:"+ Lucro );
		return Lucro;
		
	}
}
