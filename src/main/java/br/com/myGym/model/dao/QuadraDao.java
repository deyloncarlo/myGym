package br.com.myGym.model.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import br.com.myGym.enums.TipoModalidadeEsporte;
import br.com.myGym.model.Domain;
import br.com.myGym.model.Quadra;

public class QuadraDao extends Dao
{
	private static QuadraDao quadraDao;

	public static QuadraDao getInstance()
	{
		if (quadraDao == null)
		{
			quadraDao = new QuadraDao();
		}
		return quadraDao;
	}

	@Override
	public <Quadra extends Domain> Domain obterPeloOid(Long p_oid)
	{
		return super.obterPeloOid(p_oid);
	}

	@Override
	public <Quadra extends Domain> Domain salvar(Quadra p_domain)
	{
		return super.salvar(p_domain);
	}

	/**
	 * Método que obtém a lista de todas as quadras que possuem pelo menos uma
	 * das modalidade presente na lista passada por parâmetro
	 * 
	 * @param v_lista Lista de modalidades de esporte
	 * @return Quadras encontradas que possuem ao menos uma modalidade da lista
	 * passada por parâmetro
	 */
	public static List<Quadra> obterQuadrasPorModalidades(List<TipoModalidadeEsporte> v_list)
	{
		CriteriaBuilder v_criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Quadra> v_criteriaQuery = v_criteriaBuilder.createQuery(Quadra.class);
		Root<Quadra> v_quadraRoot = v_criteriaQuery.from(Quadra.class);
		Join<Quadra, TipoModalidadeEsporte> v_quadraModalidade = v_quadraRoot.join("listaModalidade");
		v_criteriaQuery.where(v_quadraModalidade.in(v_list)).distinct(true);
		TypedQuery<Quadra> v_typedQuery = getEntityManager().createQuery(v_criteriaQuery);
		return v_typedQuery.getResultList();
	}

	/**
	 * Método que busca por quadras com valor de aluguel menor do que o valor
	 * passado como parâmetro
	 * 
	 * @param p_precoAluguelQuadra Preço de aluguel máximo
	 * @return Lista de quadras encontradas
	 */
	public static List<Quadra> obterQuadrasComPrecoMenorQue(Float p_precoAluguelQuadra)
	{
		CriteriaBuilder v_criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Quadra> v_criteriaQuery = v_criteriaBuilder.createQuery(Quadra.class);
		Root<Quadra> v_root = v_criteriaQuery.from(Quadra.class);

		v_criteriaQuery.select(v_root);
		// v_criteriaQuery.where(v_criteriaBuilder.lessThanOrEqualTo(v_root.get("precoAluguel"),
		// p_precoAluguelQuadra));
		return getEntityManager().createQuery(v_criteriaQuery).getResultList();
	}

	/**
	 * Método que otém os nomes de quadras que possuim o valor de aluguel
	 * menor do que o valor passado por parâmetro
	 * 
	 * @param p_precoAluguelQuadra Preço de aluguel máximo
	 * @return Lista de nomes das quadras encontradas
	 */
	public static List<String> obterNomesDeQuadrasComPrecoAluguelMenorQueDeterminadoValor(Float p_precoAluguelQuadra)
	{
		CriteriaBuilder v_criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<String> v_criteriaQuery = v_criteriaBuilder.createQuery(String.class);
		Root<Quadra> v_root = v_criteriaQuery.from(Quadra.class);
		// v_criteriaQuery.select(v_root.get("nome"));
		// v_criteriaQuery.where(v_criteriaBuilder.lessThanOrEqualTo(v_root.get("precoAluguel"),
		// p_precoAluguelQuadra));

		return getEntityManager().createQuery(v_criteriaQuery).getResultList();
	}

	/**
	 * Obtém todas as quadras do banco
	 * 
	 * @return Lista de quadras encontradas
	 */
	public static List<Quadra> obterTodas()
	{
		CriteriaBuilder v_criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Quadra> v_teste = v_criteriaBuilder.createQuery(Quadra.class);
		v_teste.from(Quadra.class);

		TypedQuery<Quadra> v_typedQuery = getEntityManager().createQuery(v_teste);
		return v_typedQuery.getResultList();
	}

	@Override
	protected Class getDoaminClass()
	{
		return Quadra.class;
	}

}
