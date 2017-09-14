package br.com.myGym.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import br.com.myGym.model.Agendamento;
import br.com.myGym.model.dto.AgendamentoDto;

@Mapper
public interface AgendamentoMapper
{

	AgendamentoDto toDto(Agendamento p_agendamento);

	List<AgendamentoDto> toListDto(List<Agendamento> p_lista);
}
