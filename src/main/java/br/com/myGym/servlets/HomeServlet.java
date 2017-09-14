package br.com.myGym.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mapstruct.factory.Mappers;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.myGym.mappers.QuadraMapper;
import br.com.myGym.model.Quadra;
import br.com.myGym.model.dao.QuadraDao;
import br.com.myGym.model.dto.QuadraDto;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServlet()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 * response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		List<Quadra> v_listaQuadras = QuadraDao.getInstance().obterTodas();
		QuadraDto v_ta = Mappers.getMapper(QuadraMapper.class).toDto(v_listaQuadras.get(0));
		ObjectMapper v_objectMapper = new ObjectMapper();
		String v_json = v_objectMapper.writeValueAsString(v_ta);
		response.getWriter().append(v_json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 * response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
