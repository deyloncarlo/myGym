package br.com.myGym.model.dao;

import br.com.myGym.model.Domain;
import br.com.myGym.model.Usuario;

public class UsuarioDao extends Dao
{

	private static UsuarioDao usuarioDao;

	public static UsuarioDao getInstance()
	{
		if (usuarioDao == null)
		{
			usuarioDao = new UsuarioDao();
		}
		return usuarioDao;
	}

	@Override
	public <Usuario extends Domain> Domain salvar(Usuario p_domain)
	{
		return super.salvar(p_domain);
	}

	@Override
	public <Usuario extends Domain> Domain atualizar(Usuario p_domain)
	{
		return super.atualizar(p_domain);
	}

	@Override
	public void deletar(Domain p_domain)
	{
		super.deletar(p_domain);
	}

	@Override
	public <Usuario extends Domain> Domain obterPeloOid(Long p_oid)
	{
		return super.obterPeloOid(p_oid);
	}

	@Override
	protected Class getDoaminClass()
	{
		return Usuario.class;
	}
}
