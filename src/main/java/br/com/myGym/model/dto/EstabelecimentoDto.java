package br.com.myGym.model.dto;

import java.time.LocalDateTime;

public class EstabelecimentoDto
{
	private Long oid;

	private String nome;

	private String descricao;

	private LocalDateTime horaInicioFuncionamento;

	private LocalDateTime horaFimFuncionamento;

	private String usuario;

	private String senha;

	private String email;

	private String telefone;

	private String cep;

	private String rua;

	private String numero;

	private String bairro;

	public EstabelecimentoDto()
	{
	}

	public Long getOid()
	{
		return this.oid;
	}

	public void setOid(Long oid)
	{
		this.oid = oid;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getDescricao()
	{
		return this.descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public LocalDateTime getHoraInicioFuncionamento()
	{
		return this.horaInicioFuncionamento;
	}

	public void setHoraInicioFuncionamento(LocalDateTime horaInicioFuncionamento)
	{
		this.horaInicioFuncionamento = horaInicioFuncionamento;
	}

	public LocalDateTime getHoraFimFuncionamento()
	{
		return this.horaFimFuncionamento;
	}

	public void setHoraFimFuncionamento(LocalDateTime horaFimFuncionamento)
	{
		this.horaFimFuncionamento = horaFimFuncionamento;
	}

	public String getUsuario()
	{
		return this.usuario;
	}

	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}

	public String getSenha()
	{
		return this.senha;
	}

	public void setSenha(String senha)
	{
		this.senha = senha;
	}

	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getTelefone()
	{
		return this.telefone;
	}

	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}

	public String getCep()
	{
		return this.cep;
	}

	public void setCep(String cep)
	{
		this.cep = cep;
	}

	public String getRua()
	{
		return this.rua;
	}

	public void setRua(String rua)
	{
		this.rua = rua;
	}

	public String getNumero()
	{
		return this.numero;
	}

	public void setNumero(String numero)
	{
		this.numero = numero;
	}

	public String getBairro()
	{
		return this.bairro;
	}

	public void setBairro(String bairro)
	{
		this.bairro = bairro;
	}

}
