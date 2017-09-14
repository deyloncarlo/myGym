package br.com.myGym.model.dto;

import br.com.myGym.enums.TipoAvaliacaoEstabelecimento;

public class AvaliacaoEstabelecimentoDto
{
	private Long oid;

	private TipoAvaliacaoEstabelecimento tipoAvaliacaoEstabelecimento;

	private Integer notaAvalicao;

	public AvaliacaoEstabelecimentoDto()
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

	public TipoAvaliacaoEstabelecimento getTipoAvaliacaoEstabelecimento()
	{
		return this.tipoAvaliacaoEstabelecimento;
	}

	public void setTipoAvaliacaoEstabelecimento(TipoAvaliacaoEstabelecimento tipoAvaliacaoEstabelecimento)
	{
		this.tipoAvaliacaoEstabelecimento = tipoAvaliacaoEstabelecimento;
	}

	public Integer getNotaAvalicao()
	{
		return this.notaAvalicao;
	}

	public void setNotaAvalicao(Integer notaAvalicao)
	{
		this.notaAvalicao = notaAvalicao;
	}

}
