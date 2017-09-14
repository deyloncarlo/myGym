package br.com.myGym.model.dao;

import br.com.myGym.model.Estabelecimento;

public class EstabelecimentoDao extends Dao
{

	@Override
	protected Class getDoaminClass()
	{
		return Estabelecimento.class;
	}

}
