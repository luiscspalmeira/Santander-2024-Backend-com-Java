import java.util.List;

public class Banco{
    
    private String nome;
    private List<BancoConta> contas;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<BancoConta> getContas() {
		return contas;
	}

	public void setContas(List<BancoConta> contas) {
		this.contas = contas;
	}


}