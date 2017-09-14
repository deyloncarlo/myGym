package br.com.myGym.mappers;

import br.com.myGym.model.Estabelecimento;
import br.com.myGym.model.dto.EstabelecimentoDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-09-09T21:51:52-0300",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_91 (Oracle Corporation)"
)
public class EstabelecimentoMapperImpl implements EstabelecimentoMapper {

    @Override
    public EstabelecimentoDto toDto(Estabelecimento p_estabelecimento) {
        if ( p_estabelecimento == null ) {
            return null;
        }

        EstabelecimentoDto estabelecimentoDto = new EstabelecimentoDto();

        estabelecimentoDto.setOid( p_estabelecimento.getOid() );
        estabelecimentoDto.setNome( p_estabelecimento.getNome() );
        estabelecimentoDto.setDescricao( p_estabelecimento.getDescricao() );
        estabelecimentoDto.setHoraInicioFuncionamento( p_estabelecimento.getHoraInicioFuncionamento() );
        estabelecimentoDto.setHoraFimFuncionamento( p_estabelecimento.getHoraFimFuncionamento() );
        estabelecimentoDto.setUsuario( p_estabelecimento.getUsuario() );
        estabelecimentoDto.setSenha( p_estabelecimento.getSenha() );
        estabelecimentoDto.setEmail( p_estabelecimento.getEmail() );
        estabelecimentoDto.setTelefone( p_estabelecimento.getTelefone() );
        estabelecimentoDto.setCep( p_estabelecimento.getCep() );
        estabelecimentoDto.setRua( p_estabelecimento.getRua() );
        estabelecimentoDto.setNumero( p_estabelecimento.getNumero() );
        estabelecimentoDto.setBairro( p_estabelecimento.getBairro() );

        return estabelecimentoDto;
    }
}
