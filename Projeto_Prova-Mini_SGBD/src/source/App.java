package source;

import javax.swing.JOptionPane;

/**
 * @author Geovane Donizete Laera  - RA: 1902679 
 * @author Isaque Ribeiro dos Santos Junior - RA: 1903978
 * @author Marcelo Martinez Mesa Campos - RA: 1905076 
 * @author Paulo Ricardo Costa da Silva - RA: 1905013 
 * @author Vinícius da Cruz Pera - RA: 1903144
 * Data: 24/11/2021
 *
 */
public class App {
	static Turma classe = new Turma();
	
	public static int menu() {
	    String menu = "MENU\n";
		menu = menu + "1. Inserir novo aluno \r\n";
		menu = menu + "2. Consultar um aluno em específico \r\n";
		menu = menu + "3. Remover um aluno \r\n";
		menu = menu + "4. Sair";
		int opcao = 0;
		String aux = JOptionPane.showInputDialog(menu);
		opcao = Integer.valueOf(aux);
		return opcao;
    }
	 
	public static void cadastrarAluno(){
        String ra, nome, endereco, telefone, dataNascimento;
        
        ra = JOptionPane.showInputDialog(
        		null, 
        		"Qual o RA do Aluno?",
                "Controle de Aluno - Informar Matricula",
                JOptionPane.QUESTION_MESSAGE
        );
        
        nome = JOptionPane.showInputDialog(
        		null,
                "Qual o nome do Aluno?",
                "Controle de Aluno - Informar Nome",
                JOptionPane.QUESTION_MESSAGE
        );
        
        endereco = JOptionPane.showInputDialog(
        		null,
                "Qual o endereço do Aluno?",
                "Controle de Aluno - Informar Matricula",
                JOptionPane.QUESTION_MESSAGE
        );
        
        telefone = JOptionPane.showInputDialog(
        		null,
                "Qual o telefone do Aluno?",
                "Controle de Aluno - Informar Matricula",
                JOptionPane.QUESTION_MESSAGE
        );
        
        dataNascimento = JOptionPane.showInputDialog(
        		null,
                "Qual a data de nascimento do Aluno?",
                "Controle de Aluno - Informar Matricula",
                JOptionPane.QUESTION_MESSAGE
        );
        
        classe.cadastrarAluno(ra, nome, endereco, telefone, dataNascimento); 
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");   
    }
    
    public static void buscarAluno(){
        String ra;
        
        ra = JOptionPane.showInputDialog(
        		null,
                "Qual o RA do Aluno?",
                "Controle de Aluno - Buscar Aluno",
                JOptionPane.QUESTION_MESSAGE
        );
        
        try {
        	JOptionPane.showMessageDialog(null,classe.buscarAluno(ra));
        }
        catch(Exception e) {
        	JOptionPane.showMessageDialog(null,"Aluno não encontrado");
        }
    }
    
    public static void removerAluno(){
        String ra;
        
        ra = JOptionPane.showInputDialog(
        		null,
                "Qual o RA do Aluno?",
                "Controle de Aluno - Buscar Aluno",
                JOptionPane.QUESTION_MESSAGE
        );
        
    JOptionPane.showMessageDialog(null,classe.removerAluno(ra));
    }
 
	public static void main(String[] args) {
		int op;
		do {
			op = menu();
			
	        switch (op) {
	        	case 1:
	        		cadastrarAluno();
	        		break;

	        	case 2:
	                buscarAluno();
	                break;

	            case 3: 
	                removerAluno();
	                break;
	               
	            case 4:
	                System.exit(0); 
	                break;

	        }
	    } while (op >= 1 && op <= 4);   
	}	
}
