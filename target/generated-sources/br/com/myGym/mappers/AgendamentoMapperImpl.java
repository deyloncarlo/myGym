package br.com.myGym.mappers;

import br.com.myGym.model.Agendamento;
import br.com.myGym.model.dto.AgendamentoDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-09-09T21:51:52-0300",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_91 (Oracle Corporation)"
)
public class AgendamentoMapperImpl implements AgendamentoMapper {

    @Override
    public AgendamentoDto toDto(Agendamento p_agendamento) {
        if ( p_agendamento == null ) {
            return null;
        }

        AgendamentoDto agendamentoDto = new AgendamentoDto();

        agendamentoDto.setOid( p_agendamento.getOid() );
        agendamentoDto.setValorCobrado( p_agendamento.getValorCobrado() );
        agendamentoDto.setDataHoraInicio( p_agendamento.getDataHoraInicio() );
        agendamentoDto.setDataHoraFim( p_agendamento.getDataHoraFim() );
        agendamentoDto.setNumeroUtilizadores( p_agendamento.getNumeroUtilizadores() );
        agendamentoDto.setSituacaoAgendamento( p_agendamento.getSituacaoAgendamento() );
        agendamentoDto.setDataHoraCriacao( p_agendamento.getDataHoraCriacao() );

        return agendamentoDto;
    }

    @Override
    public List<AgendamentoDto> toListDto(List<Agendamento> p_lista) {
        if ( p_lista == null ) {
            return null;
        }

        List<AgendamentoDto> list = new ArrayList<AgendamentoDto>();
        for ( Agendamento agendamento : p_lista ) {
            list.add( toDto( agendamento ) );
        }

        return list;
    }
}
