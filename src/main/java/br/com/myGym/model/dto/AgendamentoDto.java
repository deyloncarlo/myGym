package br.com.myGym.model.dto;

import java.time.LocalDateTime;

import br.com.myGym.enums.IndicadorSituacaoAgendamento;

public class AgendamentoDto
{

	private Long oid;

	private Float valorCobrado;

	private LocalDateTime dataHoraCriacao;

	private LocalDateTime dataHoraInicio;

	private LocalDateTime dataHoraFim;

	private Integer numeroUtilizadores;

	private IndicadorSituacaoAgendamento situacaoAgendamento;

	/**
	 * Contrutor
	 */
	public AgendamentoDto()
	{
	}

	public Long getOid()
	{
		return this.oid;
	}

	public void setOid(Long oid)
	{
		this.oid = oid;
	}

	public Float getValorCobrado()
	{
		return this.valorCobrado;
	}

	public void setValorCobrado(Float valorCobrado)
	{
		this.valorCobrado = valorCobrado;
	}

	public LocalDateTime getDataHoraInicio()
	{
		return this.dataHoraInicio;
	}

	public void setDataHoraInicio(LocalDateTime dataHoraInicio)
	{
		this.dataHoraInicio = dataHoraInicio;
	}

	public LocalDateTime getDataHoraFim()
	{
		return this.dataHoraFim;
	}

	public void setDataHoraFim(LocalDateTime dataHoraFim)
	{
		this.dataHoraFim = dataHoraFim;
	}

	public Integer getNumeroUtilizadores()
	{
		return this.numeroUtilizadores;
	}

	public void setNumeroUtilizadores(Integer numeroUtilizadores)
	{
		this.numeroUtilizadores = numeroUtilizadores;
	}

	public IndicadorSituacaoAgendamento getSituacaoAgendamento()
	{
		return this.situacaoAgendamento;
	}

	public void setSituacaoAgendamento(IndicadorSituacaoAgendamento situacaoAgendamento)
	{
		this.situacaoAgendamento = situacaoAgendamento;
	}

	public LocalDateTime getDataHoraCriacao()
	{
		return this.dataHoraCriacao;
	}

	public void setDataHoraCriacao(LocalDateTime dataHoraCriacao)
	{
		this.dataHoraCriacao = dataHoraCriacao;
	}

}
