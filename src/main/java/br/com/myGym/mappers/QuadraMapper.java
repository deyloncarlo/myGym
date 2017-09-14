package br.com.myGym.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import br.com.myGym.model.Quadra;
import br.com.myGym.model.dto.QuadraDto;
import br.com.myGym.model.dto.QuadraFullDto;

@Mapper(uses = { AgendamentoMapper.class, EstabelecimentoMapper.class })
public interface QuadraMapper
{
	QuadraDto toDto(Quadra p_quandra);

	QuadraFullDto toFullDto(Quadra p_quadra);

	List<QuadraDto> toListDto(List<Quadra> p_lista);

	List<QuadraFullDto> toListFullDto(List<Quadra> p_lista);
}
