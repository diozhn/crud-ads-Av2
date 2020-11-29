package univs.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PodCast {
    
    @Id
    @GeneratedValue
    private int idPC;
    
    @Column(nullable = false, length = 100)
    private String nomePC;
    
    @Column(nullable = false, length = 50, unique = true)
    private String linkPC;
    
    @Column(nullable = false, length = 50, unique = true)
    private Usuario cadastrantePC;
    
    @Column(nullable = false, length = 50)
    private String descriptionPC;
    
    @Column(nullable = false, length = 250)
    private String categoriaPC;

    public Usuario getCadastrantePC() {
        return cadastrantePC;
    }

    public void setCadastrantePC(Usuario cadastrantePC) {
        this.cadastrantePC = cadastrantePC;
    }

    public String getCategoriaPC() {
        return categoriaPC;
    }

    public void setCategoriaPC(String categoriaPC) {
        this.categoriaPC = categoriaPC;
    }
    
    @Column(nullable = false, length = 50)
    private String dataPC;

    public int getIdPC() {
        return idPC;
    }

    public void setIdPC(int idPC) {
        this.idPC = idPC;
    }

    public String getNomePC() {
        return nomePC;
    }

    public void setNomePC(String nomePC) {
        this.nomePC = nomePC;
    }

    public String getLinkPC() {
        return linkPC;
    }

    public void setLinkPC(String linkPC) {
        this.linkPC = linkPC;
    }

    public String getDescriptionPC() {
        return descriptionPC;
    }

    public void setDescriptionPC(String descriptionPC) {
        this.descriptionPC = descriptionPC;
    }

    public String getDataPC() {
        return dataPC;
    }

    public void setDataPC(String dataPC) {
        this.dataPC = dataPC;
    }
    
    
}
