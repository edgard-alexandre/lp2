package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Usuario;
import br.com.herbertrausch.domain.UsuarioService;
//import br.com.herbertrausch.domain.Response;

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class UsuarioResource {
	
	public UsuarioService usuarioService = new UsuarioService();
	

	@GET
	public List<Usuario> get() {
		List<Usuario> usuarios = usuarioService.getUsuarioAll();
		return usuarios;
	}

	@GET
	@Path("id/{id}")
	public Usuario get(@PathParam("id") long id) {
		Usuario c = usuarioService.getUsuarioId(id);
		return c;
	}
	
	@GET
	@Path("nome/{nome}")
	public List<Usuario> get(@PathParam("nome") String nome) {
		List<Usuario> d = usuarioService.getUsuarioNome(nome);
		return d;
	}
	
	
	//FAZER
	/*
	@GET
	@Path("/pagina/{pagina}")
	public List<Usuario> getByPagina(@PathParam("pagina") String pagina) {
		List<Usuario> usuarios = usuarioService.getByPagina(pagina);
		return usuarios;
	}*/
	
	/*@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") long id) {
		usuarioService.delete(id);
		return Response.Ok("Usuario deletada com sucesso");
	}
*/
	/*@POST
	public Response post(Usuario c) {
		usuarioService.save(c);
		return Response.Ok("Usuario salvo com sucesso");
	}*/
/*
	@PUT
	public Response put(Usuario c) {
		usuarioService.save(c);
		return Response.Ok("Usuario atualizado com sucesso");
	}
*/
}
