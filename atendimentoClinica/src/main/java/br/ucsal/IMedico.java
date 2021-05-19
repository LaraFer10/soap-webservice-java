package br.ucsal;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.ucsal.model.Especialidade;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface IMedico {

	@WebMethod boolean incluirMedico(String nome, String crm, Long especialidade);
	@WebMethod boolean excluirMedico(String crm);
	@WebMethod String obterNomeMedico(String crm);
	@WebMethod String obterCRMMedico(String nome);
	@WebMethod String obterEspecialidadeMedico(String crm);
	@WebMethod List<String> listarNomeMedico(String especialidade);
	@WebMethod List<br.ucsal.model.Medico> listaMedicosPorEspecialidade(Especialidade especialidade);
}
