package source;

public class Turma {
	private Aluno turma[] = new Aluno[60];
    private int tam=0;
	
    public void cadastrarAluno(String ra, String nome, String endereco, String telefone, String dataNascimento){
        turma[tam]= new Aluno(ra, nome, endereco, telefone, dataNascimento);
        tam++;
    }
    
    public Aluno buscarAluno(String ra){
        for(int i=0 ; i<tam ;i++){
            if(turma[i].getRA().equals(ra))
                return turma[i];
        }
        return null;
    } 
    
    @SuppressWarnings("unused")
	public String removerAluno(String ra){
        for(int i=0 ; i<tam ;i++){
            if(turma[i].getRA().equals(ra))
            	turma[i] = null;
            	return "Removido com sucesso!";
        }
		return null;
    } 
}
