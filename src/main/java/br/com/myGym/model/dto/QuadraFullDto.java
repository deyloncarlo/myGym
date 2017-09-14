package br.com.myGym.model.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.myGym.enums.TipoModalidadeEsporte;

public class QuadraFullDto
{

	private Long oid;

	private String nome;

	private Integer numeroMaximoUsuarios;

	private Float laguraQuadra;

	private Float comprimentoQuadra;

	private Float precoAluguel;

	private List<AgendamentoDto> listaAgendamento = new ArrayList<AgendamentoDto>();

	private List<TipoModalidadeEsporte> listaModalidade = new ArrayList<TipoModalidadeEsporte>();

	private EstabelecimentoDto estabelecimento;

	/**
	 * Contrutor
	 */
	public QuadraFullDto()
	{

	}

	public void setOid(Long oid)
	{
		this.oid = oid;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public Integer getNumeroMaximoUsuarios()
	{
		return this.numeroMaximoUsuarios;
	}

	public void setNumeroMaximoUsuarios(Integer numeroMaximoUsuarios)
	{
		this.numeroMaximoUsuarios = numeroMaximoUsuarios;
	}

	public Float getLaguraQuadra()
	{
		return this.laguraQuadra;
	}

	public void setLaguraQuadra(Float laguraQuadra)
	{
		this.laguraQuadra = laguraQuadra;
	}

	public Float getComprimentoQuadra()
	{
		return this.comprimentoQuadra;
	}

	public void setComprimentoQuadra(Float comprimentoQuadra)
	{
		this.comprimentoQuadra = comprimentoQuadra;
	}

	public Float getPrecoAluguel()
	{
		return this.precoAluguel;
	}

	public void setPrecoAluguel(Float precoAluguel)
	{
		this.precoAluguel = precoAluguel;
	}

	public List<AgendamentoDto> getListaAgendamento()
	{
		return this.listaAgendamento;
	}

	public void setListaAgendamento(List<AgendamentoDto> listaAgendamento)
	{
		this.listaAgendamento = listaAgendamento;
	}

	public List<TipoModalidadeEsporte> getListaModalidade()
	{
		return this.listaModalidade;
	}

	public void setListaModalidade(List<TipoModalidadeEsporte> listaModalidade)
	{
		this.listaModalidade = listaModalidade;
	}

	public EstabelecimentoDto getEstabelecimento()
	{
		return this.estabelecimento;
	}

	public void setEstabelecimento(EstabelecimentoDto estabelecimento)
	{
		this.estabelecimento = estabelecimento;
	}

	public Long getOid()
	{
		return this.oid;
	}

}
