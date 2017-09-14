package br.com.myGym.model.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UsuarioDto
{
	private Long oid;

	private String nome;

	private LocalDate dataNascimento;

	private LocalDateTime dataCadastro;

	private String usuario;

	private String senha;

	private String email;

	public UsuarioDto()
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

	public LocalDate getDataNascimento()
	{
		return this.dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}

	public LocalDateTime getDataCadastro()
	{
		return this.dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro)
	{
		this.dataCadastro = dataCadastro;
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
}
