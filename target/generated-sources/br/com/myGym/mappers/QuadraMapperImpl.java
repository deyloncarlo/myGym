package br.com.myGym.mappers;

import br.com.myGym.enums.TipoModalidadeEsporte;
import br.com.myGym.model.Quadra;
import br.com.myGym.model.dto.AgendamentoDto;
import br.com.myGym.model.dto.QuadraDto;
import br.com.myGym.model.dto.QuadraFullDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-09-09T21:51:52-0300",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_91 (Oracle Corporation)"
)
public class QuadraMapperImpl implements QuadraMapper {

    private final AgendamentoMapper agendamentoMapper = Mappers.getMapper( AgendamentoMapper.class );
    private final EstabelecimentoMapper estabelecimentoMapper = Mappers.getMapper( EstabelecimentoMapper.class );

    @Override
    public QuadraDto toDto(Quadra p_quandra) {
        if ( p_quandra == null ) {
            return null;
        }

        QuadraDto quadraDto = new QuadraDto();

        quadraDto.setOid( p_quandra.getOid() );
        quadraDto.setNome( p_quandra.getNome() );
        quadraDto.setNumeroMaximoUsuarios( p_quandra.getNumeroMaximoUsuarios() );
        quadraDto.setLaguraQuadra( p_quandra.getLaguraQuadra() );
        quadraDto.setComprimentoQuadra( p_quandra.getComprimentoQuadra() );
        quadraDto.setPrecoAluguel( p_quandra.getPrecoAluguel() );
        quadraDto.setEndereco( p_quandra.getEndereco() );

        return quadraDto;
    }

    @Override
    public QuadraFullDto toFullDto(Quadra p_quadra) {
        if ( p_quadra == null ) {
            return null;
        }

        QuadraFullDto quadraFullDto = new QuadraFullDto();

        quadraFullDto.setOid( p_quadra.getOid() );
        quadraFullDto.setNome( p_quadra.getNome() );
        quadraFullDto.setNumeroMaximoUsuarios( p_quadra.getNumeroMaximoUsuarios() );
        quadraFullDto.setLaguraQuadra( p_quadra.getLaguraQuadra() );
        quadraFullDto.setComprimentoQuadra( p_quadra.getComprimentoQuadra() );
        quadraFullDto.setPrecoAluguel( p_quadra.getPrecoAluguel() );
        List<AgendamentoDto> list = agendamentoMapper.toListDto( p_quadra.getListaAgendamento() );
        if ( list != null ) {
            quadraFullDto.setListaAgendamento( list );
        }
        List<TipoModalidadeEsporte> list_ = p_quadra.getListaModalidade();
        if ( list_ != null ) {
            quadraFullDto.setListaModalidade(       new ArrayList<TipoModalidadeEsporte>( list_ )
            );
        }
        quadraFullDto.setEstabelecimento( estabelecimentoMapper.toDto( p_quadra.getEstabelecimento() ) );

        return quadraFullDto;
    }

    @Override
    public List<QuadraDto> toListDto(List<Quadra> p_lista) {
        if ( p_lista == null ) {
            return null;
        }

        List<QuadraDto> list = new ArrayList<QuadraDto>();
        for ( Quadra quadra : p_lista ) {
            list.add( toDto( quadra ) );
        }

        return list;
    }

    @Override
    public List<QuadraFullDto> toListFullDto(List<Quadra> p_lista) {
        if ( p_lista == null ) {
            return null;
        }

        List<QuadraFullDto> list = new ArrayList<QuadraFullDto>();
        for ( Quadra quadra : p_lista ) {
            list.add( toFullDto( quadra ) );
        }

        return list;
    }
}
