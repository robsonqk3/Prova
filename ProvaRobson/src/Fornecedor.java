
public class Fornecedor extends Pessoa {

	private double creditoMaximo = 10.000;
	private double valorEmDivida = 5.000;
	
	
	public double getCreditoMaximo() {
		return creditoMaximo;
	}
	public void setCreditoMaximo(double creditoMaximo) {
		this.creditoMaximo = creditoMaximo;
	}
	public double getValorEmDivida() {
		return valorEmDivida;
	}
	public void setValorEmDivida(double valorEmDivida) {
		this.valorEmDivida = valorEmDivida;
	} 
	
	double obterSaldo(){
		double Saldo = creditoMaximo - valorEmDivida;
	
		return Saldo;	
	}	
}
