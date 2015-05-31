package br.facisa.cesed.webservicenewswear.servicos;

import br.facisa.cesed.webservicenewswear.dao.NotificacaoDAO;
import br.facisa.cesed.webservicenewswear.entidades.Notificacao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Collection;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;



@Path("/notificacao")
public class NotificacaoResource {
    
    public NotificacaoResource(){
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void cadastrar(String dados){
        Gson gson = new GsonBuilder().create();
        Notificacao notificacao = gson.fromJson(dados, Notificacao.class);
        NotificacaoDAO.getInstance().cadastrar(notificacao);        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String listarTodos(){
        Gson gson = new GsonBuilder().create();
        Collection<Notificacao> notificacoes = NotificacaoDAO.getInstance().listarTodos();
        return gson.toJson(notificacoes);
    }

}
