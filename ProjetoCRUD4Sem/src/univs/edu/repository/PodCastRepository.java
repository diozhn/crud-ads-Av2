package univs.edu.repository;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.model.PodCast;
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
            JOptionPane.showMessageDialog(null, "PodCast Editado");
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
    
    public PodCast pesquisarPorId(int id){
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        
        PodCast pc = (PodCast) sessao.createCriteria(PodCast.class)
                .add(Restrictions.eq("idPC", id)).uniqueResult();
        
        sessao.close();
        return pc;
    }
    
}
