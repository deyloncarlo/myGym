package br.com.myGym.model.dto;

public class QuadraDto
{
	private Long oid;

	private String nome;

	private Integer numeroMaximoUsuarios;

	private Float laguraQuadra;

	private Float comprimentoQuadra;

	private Float precoAluguel;

	private String endereco;

	/**
	 * Construtor
	 */
	public QuadraDto()
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

	public String getEndereco()
	{
		return this.endereco;
	}

	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}

}
