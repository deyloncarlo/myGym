package br.com.myGym.util;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter
{

	public JsonConverter()
	{
	}

	private static ObjectMapper m_objectMapper = new ObjectMapper();

	public static String toJson(Object p_domain) throws JsonProcessingException
	{
		return m_objectMapper.writeValueAsString(p_domain);
	}

	public static String toJson(List<Object> p_domainList) throws JsonProcessingException
	{
		return m_objectMapper.writeValueAsString(p_domainList);
	}

}
