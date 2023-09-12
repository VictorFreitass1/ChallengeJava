package pamv.com.chamado;

import pamv.com.dominio.Veiculo;

import java.util.List;
import java.util.ArrayList;

public class GerenciadorDeChamados {
    private List<Chamado> chamados;
    
    public GerenciadorDeChamados() {
        chamados = new ArrayList<>();
    }
    
	public void abrirChamado(Veiculo Veiculo, String localizacao, String status, String descricao) {
	Chamado umChamado = new Chamado(Veiculo, localizacao, status, descricao);
	chamados.add(umChamado);
	}

	public void abrirChamado(Chamado chamado) {
	
	}
}
