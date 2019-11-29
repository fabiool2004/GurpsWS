package com.sensacionalapps.dao;

import java.util.ArrayList;

import com.sensacionalapps.modelo.Personagem;

public class PersonagemDAO {
	
	public PersonagemDAO() {
		
	}
	
	public ArrayList<Personagem> listaPersonagens() {
		ArrayList<Personagem> personagens = null;
		return personagens; 
	}

	public Personagem buscaPersonagem(Integer id) {
		Personagem personagem = null;
		return personagem;
	}

	public boolean removePersonagem(Integer id) {
		return true;
	}

	public boolean inserePersonagem(Personagem personagem) {
		return true;
	}
}
