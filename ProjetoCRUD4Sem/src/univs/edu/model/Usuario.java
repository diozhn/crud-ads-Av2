package univs.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue
    private int idUsuario;
    
    @Column(nullable = false, length = 100)
    private String nomeUsuario;
    
    @Column(nullable = false, length = 50, unique = true)
    private String login;
    
    @Column(nullable = false, length = 50)
    private String senha;
    
    @Column(nullable = false, length = 50)
    private String areaInteresseUsuario;

    public String getAreaInteresseUsuario() {
        return areaInteresseUsuario;
    }

    public void setAreaInteresseUsuario(String areaInteresseUsuario) {
        this.areaInteresseUsuario = areaInteresseUsuario;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
}
