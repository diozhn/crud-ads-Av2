
package univs.edu.repository;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.model.Avaliacao;
import univs.edu.util.HibernateUtil;

public class AvaliacaoRepository {
    Session sessao;
    Transaction transacao;

    public void salvar(Avaliacao av) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();

            sessao.save(av);
            JOptionPane.showMessageDialog(null, "Avaliação Cadastrada!!");

        transacao.commit();
        sessao.close();
    }

    public void deletar(Avaliacao av) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(av);
        JOptionPane.showMessageDialog(null, "Avaliação removida!!");
        transacao.commit();
        sessao.close();
    }

    public List<Avaliacao> listarAvaliacoes() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Avaliacao> avs
                = sessao.createCriteria(Avaliacao.class).list();
        return avs;
    }
    
    public Avaliacao pesquisarPorId(int id){
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        
        Avaliacao av = (Avaliacao) sessao.createCriteria(Avaliacao.class)
                .add(Restrictions.eq("idAvaliacao", id)).uniqueResult();
        
        sessao.close();
        return av;
    }
    
    
        
    
    
}
