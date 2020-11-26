package univs.edu.repository;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.model.Usuario;
import univs.edu.util.HibernateUtil;

public class UsuarioRepository {

    Session sessao;
    Transaction transacao;

    public void salvar(Usuario usuario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();

        if (usuario.getIdUsuario() == 0) {
            sessao.save(usuario);
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado!!");
        } else {
            sessao.update(usuario);
            JOptionPane.showMessageDialog(null, "Usuário Editado!!");
        }

        transacao.commit();
        sessao.close();
    }

    public void deletar(Usuario usuario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(usuario);
        transacao.commit();
        sessao.close();
    }

    public List<Usuario> listarUsuarios() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Usuario> usuarios
                = sessao.createCriteria(Usuario.class).list();
        return usuarios;
    }
    
    public Usuario pesquisarPorId(int id){
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class)
                .add(Restrictions.eq("idUsuario", id)).uniqueResult();
        
        sessao.close();
        return usuario;
    }
    
    public Usuario autenticar(String login, String senha){
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class)
                .add(Restrictions.eq("login", login))
                .add(Restrictions.eq("senha", senha))
                .uniqueResult();
        
        sessao.close();
        return usuario;
    }

}
