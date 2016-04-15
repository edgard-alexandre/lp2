package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class UsuarioService {

	
	private UsuarioRepository db;
	
	public UsuarioService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(UsuarioRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Usuario> getUsuarioAll() {
		try {
			
			List<Usuario> usuarios = (List<Usuario>) db.findAll();
					
			return usuarios;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Usuario>();

		}
	}


	public Usuario getUsuarioId(Long id) {
		try {
			
			return db.findOne(id);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	public List<Usuario> getUsuarioNome(String p) {
		try {
			
			return db.findByNome(p);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}





}
