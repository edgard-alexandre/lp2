package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class PublicacaoService {

	
	private PublicacaoRepository db;
	
	public PublicacaoService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(PublicacaoRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Publicacao> getPublicacaoAll() {
		try {
			
			List<Publicacao> publicacoes = (List<Publicacao>) db.findAll();
					
			return publicacoes;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Publicacao>();

		}
	}


	public Publicacao getPublicacaoId(Long id) {
		try {
			
			return db.findOne(id);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	public List<Publicacao> getPublicacaoPagina(String p) {
		try {
			
			return db.findByPagina(p);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}





}
