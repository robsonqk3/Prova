
public class Vendedor extends Empregado {

	private double valorVendas;
	private double Comissao;
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return Comissao;
	}
	public void setComissao(double comissao) {
		Comissao = comissao;
	}
	
	public double obterLucros(){
		Comissao = valorVendas + (0.20 * valorVendas);  
		setSalario(getSalario() + Comissao); 
		
		
		System.out.println("O seu salário é:"+ getSalario());
		return getSalario();

}
	}
