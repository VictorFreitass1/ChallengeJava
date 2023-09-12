package pamv.com.chamado;

import pamv.com.dominio.Veiculo;

public class Chamado {
	private Veiculo veiculo;
	private String localizacao;
	private String status;
	private String descricao;
	    
	public Chamado(Veiculo veiculo, String localizacao, String status, String descricao) {
	    this.veiculo = veiculo;
	    this.localizacao = localizacao;
	    this.status = status;
	    this.descricao = descricao;
	}


	public Chamado() {
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getLocalizacao() {
		return localizacao;
	}

	public String getStatus() {
		return status;
	}

	public String getDescricao() {
		return descricao;
	}

}
