package br.ucsal;

import java.util.List;

import javax.jws.WebService;

import br.ucsal.service.MedicoService;
@WebService(endpointInterface = "br.ucsal.IMedico")
public class Medico implements IMedico{

	public boolean incluirMedico(String nome, String crm, Long especialidade) {
		return (new MedicoService()).incluir(nome,crm,especialidade);
	}

	public boolean excluirMedico(String crm) {
		return (new MedicoService()).excluir(crm);
	}

	public String obterNomeMedico(String crm) {
		return (new MedicoService()).obterNomePorCRM(crm);
	}

	public String obterCRMMedico(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> listarNomeMedico(String especialidade) {
		// TODO Auto-generated method stub
		return null;
	}

	public String obterEspecialidadeMedico(String crm) {
		return (new MedicoService()).obterEspecialidadePorCRM(crm);
	}

}
