package source;

/**
 * @author Geovane Donizete Laera  - RA: 1902679 
 * @author Isaque Ribeiro dos Santos Junior - RA: 1903978
 * @author Marcelo Martinez Mesa Campos - RA: 1905076 
 * @author Paulo Ricardo Costa da Silva - RA: 1905013 
 * @author Vinícius da Cruz Pera - RA: 1903144
 * Data: 24/11/2021
 *
 */
public class Aluno {
	// Cria as variáveis RA, nome, endereco, telefone e dataNascimento
	private String RA;
	private String nome;
	private String endereco;
	private String telefone;
	private String dataNascimento;
	
	// Método Construtor
	public Aluno(String ra2, String nome, String endereco, String telefone2, String dataNascimento) {
		this.RA = ra2;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone2;
		this.dataNascimento = dataNascimento;
	}

	// Métodos Getters
	public String getRA() { 
		return RA; 
	}
	
	public String getNome() { 
		return nome; 
	}
	
	public String getEndereço() { 
		return endereco; 
	}
	
	public String getTelefone() { 
		return telefone; 
	}
	
	public String getDataNascimento() { 
		return dataNascimento; 
	}
	
	// Métodos Setters
	public void setRA(String RA) { 
		this.RA = RA; 
	}
	
	public void setNome(String nome) { 
		this.nome = nome; 
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco; 
	}
	
	public void setTelefone(String telefone) { 
		this.telefone = telefone; 
	}
	
	public void setDataNascimento(String dataNascimento) { 
		this.dataNascimento = dataNascimento; 
	}
	
	public String toString() {
		return "RA: " + RA + "\n" + 
			   "Nome: " + nome + "\n" + 
			   "Endereço: " + endereco  + "\n" +
			   "Telefone: " + telefone + "\n" + 
			   "Data de Nascimento: " + dataNascimento;
	}
}
