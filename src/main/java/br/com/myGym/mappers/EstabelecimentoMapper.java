package br.com.myGym.mappers;

import org.mapstruct.Mapper;

import br.com.myGym.model.Estabelecimento;
import br.com.myGym.model.dto.EstabelecimentoDto;

@Mapper
public interface EstabelecimentoMapper
{

	EstabelecimentoDto toDto(Estabelecimento p_estabelecimento);
}
