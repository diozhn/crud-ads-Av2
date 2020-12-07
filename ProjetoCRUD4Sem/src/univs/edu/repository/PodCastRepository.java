package univs.edu.repository;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import univs.edu.model.PodCast;
import univs.edu.model.Usuario;
import univs.edu.util.HibernateUtil;

public class PodCastRepository {

    Session sessao;
    Transaction transacao;

    public void salvar(PodCast pc) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();

        if (pc.getIdPC() == 0) {
            sessao.save(pc);
            JOptionPane.showMessageDialog(null, "PodCast Cadastrado!");
        } else {
            sessao.update(pc);
        }

        transacao.commit();
        sessao.close();
    }

    public void deletar(PodCast pc) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(pc);
        transacao.commit();
        sessao.close();
    }

    public List<PodCast> listarPodCast() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<PodCast> pc
                = sessao.createCriteria(PodCast.class).list();
        return pc;
    }

    public PodCast pesquisarPorId(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();

        PodCast pc = (PodCast) sessao.createCriteria(PodCast.class)
                .add(Restrictions.eq("idPC", id)).uniqueResult();

        sessao.close();
        return pc;
    }

    public List<PodCast> pesquisarPorNome(String termo) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();

        List<PodCast> pc = sessao.createCriteria(PodCast.class)
                .add(Restrictions.like("nomePC", "%" + termo + "%")).list();

        sessao.close();
        return pc;
    }

    public List<PodCast> listarAvaliados() {
        List<PodCast> lista = new ArrayList<>();
            
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        
        lista = sessao.createCriteria(PodCast.class).addOrder(Order.desc("avaliacoesPC")).list();
            
        sessao.close(); 
        return lista;
    }
    
    public List<PodCast> listarRecomendados(Usuario user) {
        List<PodCast> lista = new ArrayList<>();
            
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        
        lista = sessao.createCriteria(PodCast.class).add(Restrictions.eq("categoriaPC", user.getAreaInteresseUsuario())).addOrder(Order.desc("avaliacoesPC")).list();
            
        sessao.close(); 
        return lista;
    }

}
