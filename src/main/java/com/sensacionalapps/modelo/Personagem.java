package com.sensacionalapps.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Personagem {
	
	@Id
    @GeneratedValue	
	private Integer id;
	private String nome;
	private String descricao;
	private int st;
	private int dx;
	private int iq;
	private int ht;
	
//	private List<VantagemDesvantagem> VantagensDesvantagens;
//	private List<Particularidade> Particularidades;
//	private List<Equipamento> equipamentos;
	
	public Personagem(Integer id, String nome, String descricao, int st, int dx, int iq, int ht) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.st = st;
		this.dx = dx;
		this.iq = iq;
		this.ht = ht;
	}

	public Personagem(@JsonProperty("personagem") String personagem) {
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getSt() {
		return st;
	}
	public void setSt(Integer st) {
		this.st = st;
	}
	public Integer getDx() {
		return dx;
	}
	public void setDx(Integer dx) {
		this.dx = dx;
	}
	public Integer getIq() {
		return iq;
	}
	public void setIq(Integer iq) {
		this.iq = iq;
	}
	public Integer getHt() {
		return ht;
	}
	public void setHt(Integer ht) {
		this.ht = ht;
	}
//	public List<VantagemDesvantagem> getVantagensDesvantagens() {
//		return VantagensDesvantagens;
//	}
//	public void setVantagensDesvantagens(List<VantagemDesvantagem> vantagensDesvantagens) {
//		VantagensDesvantagens = vantagensDesvantagens;
//	}
//	public List<Particularidade> getParticularidades() {
//		return Particularidades;
//	}
//	public void setParticularidades(List<Particularidade> particularidades) {
//		Particularidades = particularidades;
//	}
//	public List<Equipamento> getEquipamentos() {
//		return equipamentos;
//	}
//	public void setEquipamentos(List<Equipamento> equipamentos) {
//		this.equipamentos = equipamentos;
//	}

}
