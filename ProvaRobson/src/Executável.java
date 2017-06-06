
public class Executável {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Robson");
		p.setIdade(27);
		p.setAltura(1.84);
		p.setSexo("Masculino");
		
		Empregado e = new Empregado();
		System.out.println("O Salario inicial é: " + e.getSalario());
		e.setDisconto(200);
		

	}

}
