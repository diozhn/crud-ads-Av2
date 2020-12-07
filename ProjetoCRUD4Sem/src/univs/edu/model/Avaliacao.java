
package univs.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Avaliacao {
    
    @Id
    @GeneratedValue
    private int idAvaliacao;
    
    
    @Column(nullable = false, length = 300)
    private int idUsuario;
    
    @Column(nullable = false, length = 300)
    private int idPodcast;
    
    public void avaliar(Usuario usuario, PodCast pc){
        pc.setAvaliacoesPC(pc.getAvaliacoesPC()+1);
        idUsuario = usuario.getIdUsuario();
        idPodcast = pc.getIdPC();
    }

    public int getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPodcast() {
        return idPodcast;
    }

    public void setIdPodcast(int idPodcast) {
        this.idPodcast = idPodcast;
    }
    
    
    
}
