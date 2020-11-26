package univs.edu.testes;

import univs.edu.model.Usuario;
import univs.edu.repository.UsuarioRepository;

public class Teste {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        UsuarioRepository repo = new UsuarioRepository();
        
        usuario.setLogin("maria");
        usuario.setNomeUsuario("Maria");
        usuario.setSenha("123");
        
        repo.salvar(usuario);
        
        
        
        
    }
    
}
