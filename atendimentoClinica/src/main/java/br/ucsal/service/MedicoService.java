package br.ucsal.service;

import java.util.Map;

import br.ucsal.model.Especialidade;
import br.ucsal.model.Medico;

public class MedicoService {

	
	public boolean incluir(String nome, String crm, Long especialidade) {
		Medico medico = new Medico();
		Especialidade esp = new Especialidade();
		esp.setDescricao("Alergologia");
		medico.setId(1L);
		medico.setNome(nome);
		medico.setCrm(crm);
		medico.setEspecialidade(esp);
		return false;
	}
	
	public Map<Integer, Medico> listasMedicos(Medico medico) {
		return null;
	}

}
