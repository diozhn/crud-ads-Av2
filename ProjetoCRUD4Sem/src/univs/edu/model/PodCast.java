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
    
    @Column(nullable = false, length = 300)
    private String nomePC;
    
    @Column(nullable = false, length = 300, unique = true)
    private String linkPC;
    
    @Column(nullable = false, length = 300)
    private String descriptionPC;
    
    @Column(nullable = false, length = 300)
    private String categoriaPC;
    
    @Column(nullable = false)
    private int idCadastrante;
    
    @Column(nullable = false, length = 300)
    private String dataPC;
    
    @Column(nullable = false, length = 300)
    private int avaliacoesPC;

    public int getAvaliacoesPC() {
        return avaliacoesPC;
    }

    public void setAvaliacoesPC(int avaliacoesPC) {
        this.avaliacoesPC = avaliacoesPC;
    }
    
    public int getIdCadastrante() {
        return idCadastrante;
    }

    public void setIdCadastrante(int idCadastrante) {
        this.idCadastrante = idCadastrante;
    }
    

    public String getCategoriaPC() {
        return categoriaPC;
    }

    public void setCategoriaPC(String categoriaPC) {
        this.categoriaPC = categoriaPC;
    }

    public int getIdPC() {
        return idPC;
    }

    public void setIdPC(int idPC) {
        this.idPC = idPC;
    }

    public String getNomePC() {
        return nomePC;
    }

    public void setNomePC(String nomePc) {
        this.nomePC = nomePc;
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
