package com.sensacionalapps.recursos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sensacionalapps.dao.PersonagemDAO;
import com.sensacionalapps.modelo.Personagem;

@RestController
public class PersonagemRecurso {

	private Map<Integer, Personagem> personagens;

	public PersonagemRecurso() {

		personagens = new HashMap<Integer, Personagem>();

		Personagem p1 = new Personagem(1, "Slash", "", 9, 12, 10, 9);
		Personagem p2 = new Personagem(2, "Jean", "", 9, 9, 12, 10);
		Personagem p3 = new Personagem(3, "Eleotério", "", 12, 9, 9, 10);

		personagens.put(1, p1);
		personagens.put(2, p2);
		personagens.put(3, p3);
	}

	@RequestMapping(value = "/personagens", method = RequestMethod.GET)
	public ResponseEntity<List<Personagem>> listar() {

		ArrayList<Personagem> personagens = new PersonagemDAO().listaPersonagens(); 
		return new ResponseEntity<List<Personagem>>(personagens, HttpStatus.OK);

		//return new ResponseEntity<List<Personagem>>(new ArrayList<Personagem>(personagens.values()), HttpStatus.OK);
	  }

	@RequestMapping(value = "/personagens/{chave}", method = RequestMethod.GET)
	public ResponseEntity<Personagem> buscar(@PathVariable("chave") Integer id) {

		Personagem personagem = new PersonagemDAO().buscaPersonagem(id);
		//Personagem personagem = personagens.get(id);

		if (personagem == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Personagem>(personagem, HttpStatus.OK);
	}

	@RequestMapping(value = "/personagens/{chave}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletar(@PathVariable("chave") int id) {

		boolean personagemRemovido = new PersonagemDAO().removePersonagem(id);
		//Personagem personagem = personagens.remove(id);

		//if (personagem == null) {
		if (!personagemRemovido) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/personagens/insere", method = RequestMethod.POST)
	public ResponseEntity<?> inserir(@RequestBody Personagem personagem) {

		boolean personagemIncluido = new PersonagemDAO().inserePersonagem(personagem);
		//personagens.put(personagens.size() + 1, personagem);

		if (!personagemIncluido) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Personagem>(personagem, HttpStatus.OK);
	}
}