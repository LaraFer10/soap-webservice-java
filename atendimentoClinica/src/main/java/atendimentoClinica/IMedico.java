package atendimentoClinica;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface IMedico {

	@WebMethod boolean incluirMedico(String nome, String crm, Long especialidade);
}
