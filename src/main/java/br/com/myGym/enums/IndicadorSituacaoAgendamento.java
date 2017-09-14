package br.com.myGym.enums;

/**
 * Respons�vel por indicar qual a situa��o(status) do agendamento
 * 
 * @author Deylon
 *
 */
public enum IndicadorSituacaoAgendamento
{

	LIBERADO("Liberado para agendar"), AGENDADO("J� foi agendado por algum usu�rio"), FINALIZADO(
			"Tempo de agendamento conclu�do"), CANCELADO("Agendamento cancelado");

	private String descricao;

	private IndicadorSituacaoAgendamento(String p_descricao)
	{
		setDescricao(p_descricao);
	}

	public String getDescricao()
	{
		return this.descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

}
