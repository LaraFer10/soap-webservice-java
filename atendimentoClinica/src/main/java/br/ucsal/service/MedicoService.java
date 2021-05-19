package br.ucsal.service;

import java.util.List;

import br.ucsal.model.Especialidade;
import br.ucsal.model.Medico;

public class MedicoService {

	static List<Medico> listaMedico;

	public boolean incluir(String nome, String crm, Long especialidade) {
		Medico medico = new Medico();
		Especialidade esp = new Especialidade();
		esp.setDescricao("Alergologia");
		medico.setId(1L);
		medico.setNome(nome);
		medico.setCrm(crm);
		medico.setEspecialidade(esp);

		if(listasMedicos(medico) != null)
			return true;
		else
			return false;
	}

	public List<Medico> listasMedicos(Medico medico) {
		if(listaMedico.add(medico))
			return listaMedico;
		else
			return null;
	}

	public String obterNomePorCRM(String crm) {
		for (Medico medico : listaMedico) {
			if(medico.getCrm().equals(crm)) {
				return medico.getNome();
			}
		}
		return "";
	}

	public String obterEspecialidadePorCRM(String crm) {
		for (Medico medico : listaMedico) {
			if(medico.getCrm().equals(crm)) {
				return medico.getEspecialidade().getDescricao();
			}
		}
		return "";
	}
	
	@SuppressWarnings("null")
	public List<Medico> listaMedicosPorEspecialidade(Especialidade especialidade) {
		 List<Medico> listaMedicosPorEspecialidade = null;

		   for (Medico medico : this.listaMedico) {
		        if (medico.getEspecialidade().getDescricao() == especialidade.getDescricao()) {
		        	listaMedicosPorEspecialidade.add(medico);
		        }
		    }
		return listaMedicosPorEspecialidade;
	}

	public Boolean excluir(String crm) {
		for (Medico medico : listaMedico) {
			if(medico.getCrm().equals(crm)) {
				return listaMedico.remove(medico);
			}
		}
		return false;
	}

}
