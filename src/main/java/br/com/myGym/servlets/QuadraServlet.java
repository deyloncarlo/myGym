package br.com.myGym.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mapstruct.factory.Mappers;

import br.com.myGym.enums.RequestMethod;
import br.com.myGym.mappers.QuadraMapper;
import br.com.myGym.model.Quadra;
import br.com.myGym.model.dao.QuadraDao;
import br.com.myGym.model.dto.QuadraDto;
import br.com.myGym.util.JsonConverter;

/**
 * Servlet implementation class QuadraServlet
 */
@WebServlet("/Quadra")
public class QuadraServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	private static QuadraMapper m_quadraMapper = Mappers.getMapper(QuadraMapper.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuadraServlet()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 * response)
	 */
	@Override
	protected void doGet(HttpServletRequest p_request, HttpServletResponse p_response)
			throws ServletException, IOException
	{
		String p_method = p_request.getParameter("method");
		RequestMethod v_requestMethod = RequestMethod.valueOf(p_method);
		definirQualMetodoAtender(v_requestMethod, p_response);
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

	public void definirQualMetodoAtender(RequestMethod p_requestMethod, HttpServletResponse p_response)
			throws IOException
	{
		String p_json = null;
		switch (p_requestMethod)
		{
			case GET_ALL:
				List<Quadra> v_lista = QuadraDao.getInstance().obterTodas();
				List<QuadraDto> v_listaDto = m_quadraMapper.toListDto(v_lista);
				p_json = JsonConverter.toJson(v_listaDto);
				p_response.getWriter().write(p_json);
				break;

			default:
				break;
		}
	}

}
