/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.view;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import univs.edu.model.Avaliacao;
import univs.edu.model.PodCast;
import univs.edu.model.Usuario;
import univs.edu.repository.AvaliacaoRepository;
import univs.edu.repository.PodCastRepository;
import univs.edu.repository.UsuarioRepository;
import univs.edu.util.PodcastUtil;

/**
 *
 * @author Lucas
 */
public class PesquisaPodcasts extends javax.swing.JFrame {

    Usuario logado = new Usuario();
    UsuarioRepository repoU = new UsuarioRepository();
    PodCastRepository repo = new PodCastRepository();
    AvaliacaoRepository repoA = new AvaliacaoRepository();
    List<PodCast> pcs = new ArrayList<>();
    List<PodCast> restante = new ArrayList<>();
    URI link1;
    URI link2;
    URI link3;
    URI link4;
    URI link5;
    int id1;
    int id2;
    int id3;
    int id4;
    int id5;

    public PesquisaPodcasts(List<PodCast> pc, Usuario usuario) {
        initComponents();
        this.pcs = pc;
        atualizarPaineis();
        this.logado = usuario;
        
    }

    public List<String> GetInformacoes(int id) {
        List<String> infos = new ArrayList<String>();
        infos.add(pcs.get(id).getNomePC());
        infos.add(pcs.get(id).getDescriptionPC());
        infos.add(pcs.get(id).getDataPC());
        infos.add(pcs.get(id).getCategoriaPC());
        infos.add(Integer.toString(pcs.get(id).getAvaliacoesPC()));

        Usuario user = new Usuario();
        user = repoU.pesquisarPorId(pcs.get(id).getIdCadastrante());

        infos.add(user.getNomeUsuario());
        infos.add(pcs.get(id).getLinkPC());
        infos.add(null);
        infos.add(Integer.toString(pcs.get(id).getIdPC()));
        
        return infos;
    }

    public void atualizarPaineis() {
        List<String> infos = new ArrayList<String>();
        infos = GetInformacoes(0);
        //0= nome, 1= descrição, 2= data, 3= categoria, 4= avaliacoes, 5= postador, 6= Link, 7= avaliado, 8= id

        if (pcs.size() >= 1) {
            tfTitulo1.setText(infos.get(0));
            tfDescricao1.setText("Descrição: " + infos.get(1));
            tfData1.setText("Data de postagem: " + infos.get(2));
            tfCategoria1.setText("Categoria: " + infos.get(3));
            tfAvaliacoes1.setText("Avaliações: " + infos.get(4));
            tfPostado1.setText("Postado por: " + infos.get(5));
            if(infos.get(7) == "true"){
                btAvaliar2.setSelected(true);
            }
            try {
                URI link = new URI(infos.get(6));
                link1 = link;
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível abrir o link! Notifique o suporte para resolução de erros!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum podcast encontrado!");
            dispose();
        }

        if (pcs.size() >= 2) {
            infos = GetInformacoes(1);
            tfTitulo2.setText(infos.get(0));
            tfDescricao2.setText("Descrição: " + infos.get(1));
            tfData1.setText("Data de postagem: " + infos.get(2));
            tfCategoria2.setText("Categoria: " + infos.get(3));
            tfAvaliacoes2.setText("Avaliações: " + infos.get(4));
            tfPostado1.setText("Postado por: " + infos.get(5));
            try {
                URI link = new URI(infos.get(6));
                link2 = link;
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível abrir o link! Notifique o suporte para resolução de erros!");
            }
        } else {
            painel2.setVisible(false);
        }

        if (pcs.size() >= 3) {
            infos = GetInformacoes(2);
            tfTitulo3.setText(infos.get(0));
            tfDescricao3.setText("Descrição: " + infos.get(1));
            tfData3.setText("Data de postagem: " + infos.get(2));
            tfCategoria3.setText("Categoria: " + infos.get(3));
            tfAvaliacoes3.setText("Avaliações: " + infos.get(4));
            tfPostado2.setText("Postado por: " + infos.get(5));
            try {
                URI link = new URI(infos.get(6));
                link3 = link;
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível abrir o link! Notifique o suporte para resolução de erros!");
            }
        } else {
            painel3.setVisible(false);
        }

        if (pcs.size() >= 4) {
            infos = GetInformacoes(3);
            tfTitulo4.setText(infos.get(0));
            tfDescricao4.setText("Descrição: " + infos.get(1));
            tfData4.setText("Data de postagem: " + infos.get(2));
            tfCategoria4.setText("Categoria: " + infos.get(3));
            tfAvaliacoes4.setText("Avaliações: " + infos.get(4));
            tfPostado3.setText("Postado por: " + infos.get(5));
            try {
                URI link = new URI(infos.get(6));
                link4 = link;
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível abrir o link! Notifique o suporte para resolução de erros!");
            }
        } else {
            painel4.setVisible(false);
        }

        if (pcs.size() >= 5) {
            infos = GetInformacoes(4);
            tfTitulo5.setText(infos.get(0));
            tfDescricao5.setText("Descrição: " + infos.get(1));
            tfData5.setText("Data de postagem: " + infos.get(2));
            tfCategoria5.setText("Categoria: " + infos.get(3));
            tfAvaliacoes5.setText("Avaliações: " + infos.get(4));
            tfPostado4.setText("Postado por: " + infos.get(5));
            try {
                URI link = new URI(infos.get(6));
                link5 = link;
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível abrir o link! Notifique o suporte para resolução de erros!");
            }
        } else if (pcs.size() > 5) {
            painel5.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        painel3 = new javax.swing.JPanel();
        tfTitulo3 = new javax.swing.JLabel();
        tfPostado3 = new javax.swing.JLabel();
        tfAvaliacoes3 = new javax.swing.JLabel();
        tfCategoria3 = new javax.swing.JLabel();
        tfData3 = new javax.swing.JLabel();
        tfDescricao3 = new javax.swing.JLabel();
        tfAbrir1 = new javax.swing.JButton();
        btAvaliar3 = new javax.swing.JButton();
        painel2 = new javax.swing.JPanel();
        tfTitulo2 = new javax.swing.JLabel();
        tfPostado2 = new javax.swing.JLabel();
        tfAvaliacoes2 = new javax.swing.JLabel();
        tfCategoria2 = new javax.swing.JLabel();
        tfData2 = new javax.swing.JLabel();
        tfDescricao2 = new javax.swing.JLabel();
        tfAbrir2 = new javax.swing.JButton();
        btAvaliar2 = new javax.swing.JButton();
        painel1 = new javax.swing.JPanel();
        tfTitulo1 = new javax.swing.JLabel();
        tfPostado1 = new javax.swing.JLabel();
        tfAvaliacoes1 = new javax.swing.JLabel();
        tfCategoria1 = new javax.swing.JLabel();
        tfData1 = new javax.swing.JLabel();
        tfDescricao1 = new javax.swing.JLabel();
        tfAbrir = new javax.swing.JButton();
        btAvaliar = new javax.swing.JButton();
        jRadioButton7 = new javax.swing.JButton();
        painel4 = new javax.swing.JPanel();
        tfTitulo4 = new javax.swing.JLabel();
        tfPostado4 = new javax.swing.JLabel();
        tfAvaliacoes4 = new javax.swing.JLabel();
        tfCategoria4 = new javax.swing.JLabel();
        tfData4 = new javax.swing.JLabel();
        tfDescricao4 = new javax.swing.JLabel();
        btAvaliar4 = new javax.swing.JButton();
        tfAbrir3 = new javax.swing.JButton();
        painel5 = new javax.swing.JPanel();
        tfTitulo5 = new javax.swing.JLabel();
        tfPostado5 = new javax.swing.JLabel();
        tfAvaliacoes5 = new javax.swing.JLabel();
        tfCategoria5 = new javax.swing.JLabel();
        tfData5 = new javax.swing.JLabel();
        tfDescricao5 = new javax.swing.JLabel();
        tfAbrir4 = new javax.swing.JButton();
        btAvaliar5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tfPesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(26, 24, 34));
        jPanel1.setMaximumSize(null);
        jPanel1.setMinimumSize(new java.awt.Dimension(693, 553));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/pc.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/nome_dessa_buceta.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jPanel2.setBackground(new java.awt.Color(37, 34, 43));

        painel3.setBackground(new java.awt.Color(37, 34, 43));
        painel3.setMinimumSize(new java.awt.Dimension(494, 235));
        painel3.setPreferredSize(new java.awt.Dimension(494, 235));
        painel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfTitulo3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tfTitulo3.setForeground(new java.awt.Color(219, 219, 219));
        painel3.add(tfTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, -1));

        tfPostado3.setForeground(new java.awt.Color(219, 219, 219));
        painel3.add(tfPostado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 158, -1, -1));

        tfAvaliacoes3.setForeground(new java.awt.Color(219, 219, 219));
        painel3.add(tfAvaliacoes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 83, -1, -1));

        tfCategoria3.setForeground(new java.awt.Color(219, 219, 219));
        painel3.add(tfCategoria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 77, -1, -1));

        tfData3.setForeground(new java.awt.Color(219, 219, 219));
        painel3.add(tfData3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 65, -1, -1));

        tfDescricao3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfDescricao3.setForeground(new java.awt.Color(219, 219, 219));
        painel3.add(tfDescricao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 12, -1, -1));

        tfAbrir1.setBackground(new java.awt.Color(58, 45, 110));
        tfAbrir1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfAbrir1.setForeground(new java.awt.Color(143, 132, 183));
        tfAbrir1.setText("Abrir Podcast");
        tfAbrir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAbrir1ActionPerformed(evt);
            }
        });
        painel3.add(tfAbrir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        btAvaliar3.setBackground(new java.awt.Color(58, 45, 110));
        btAvaliar3.setForeground(new java.awt.Color(143, 132, 183));
        btAvaliar3.setText("Avaliar");
        btAvaliar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvaliar3ActionPerformed(evt);
            }
        });
        painel3.add(btAvaliar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 120, -1));

        painel2.setBackground(new java.awt.Color(37, 34, 43));
        painel2.setMinimumSize(new java.awt.Dimension(494, 235));
        painel2.setPreferredSize(new java.awt.Dimension(494, 235));
        painel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfTitulo2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tfTitulo2.setForeground(new java.awt.Color(219, 219, 219));
        painel2.add(tfTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, -1));

        tfPostado2.setForeground(new java.awt.Color(219, 219, 219));
        painel2.add(tfPostado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 126, -1, -1));

        tfAvaliacoes2.setForeground(new java.awt.Color(219, 219, 219));
        painel2.add(tfAvaliacoes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 89, -1, -1));

        tfCategoria2.setForeground(new java.awt.Color(219, 219, 219));
        painel2.add(tfCategoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 77, -1, -1));

        tfData2.setForeground(new java.awt.Color(219, 219, 219));
        painel2.add(tfData2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 65, -1, -1));

        tfDescricao2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfDescricao2.setForeground(new java.awt.Color(219, 219, 219));
        painel2.add(tfDescricao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 12, -1, -1));

        tfAbrir2.setBackground(new java.awt.Color(58, 45, 110));
        tfAbrir2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfAbrir2.setForeground(new java.awt.Color(143, 132, 183));
        tfAbrir2.setText("Abrir Podcast");
        tfAbrir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAbrir2ActionPerformed(evt);
            }
        });
        painel2.add(tfAbrir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        btAvaliar2.setBackground(new java.awt.Color(58, 45, 110));
        btAvaliar2.setForeground(new java.awt.Color(143, 132, 183));
        btAvaliar2.setText("Avaliar");
        btAvaliar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvaliar2ActionPerformed(evt);
            }
        });
        painel2.add(btAvaliar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 120, -1));

        painel1.setBackground(new java.awt.Color(37, 34, 43));
        painel1.setPreferredSize(new java.awt.Dimension(494, 235));
        painel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfTitulo1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tfTitulo1.setForeground(new java.awt.Color(219, 219, 219));
        painel1.add(tfTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, -1));

        tfPostado1.setForeground(new java.awt.Color(219, 219, 219));
        tfPostado1.setToolTipText("");
        painel1.add(tfPostado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 166, -1, -1));

        tfAvaliacoes1.setForeground(new java.awt.Color(219, 219, 219));
        painel1.add(tfAvaliacoes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 83, -1, -1));

        tfCategoria1.setForeground(new java.awt.Color(219, 219, 219));
        painel1.add(tfCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 77, -1, -1));

        tfData1.setForeground(new java.awt.Color(219, 219, 219));
        painel1.add(tfData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 65, -1, -1));

        tfDescricao1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfDescricao1.setForeground(new java.awt.Color(219, 219, 219));
        painel1.add(tfDescricao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 12, -1, -1));

        tfAbrir.setBackground(new java.awt.Color(58, 45, 110));
        tfAbrir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfAbrir.setForeground(new java.awt.Color(143, 132, 183));
        tfAbrir.setText("Abrir Podcast");
        tfAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAbrirActionPerformed(evt);
            }
        });
        painel1.add(tfAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        btAvaliar.setBackground(new java.awt.Color(58, 45, 110));
        btAvaliar.setForeground(new java.awt.Color(143, 132, 183));
        btAvaliar.setText("Avaliar");
        btAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvaliarActionPerformed(evt);
            }
        });
        painel1.add(btAvaliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 120, -1));

        jRadioButton7.setBackground(new java.awt.Color(58, 45, 110));
        jRadioButton7.setForeground(new java.awt.Color(143, 132, 183));
        jRadioButton7.setText("Avaliar");
        painel1.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 120, -1));

        painel4.setBackground(new java.awt.Color(37, 34, 43));
        painel4.setMinimumSize(new java.awt.Dimension(494, 235));
        painel4.setPreferredSize(new java.awt.Dimension(494, 235));
        painel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfTitulo4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tfTitulo4.setForeground(new java.awt.Color(219, 219, 219));
        painel4.add(tfTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, -1));

        tfPostado4.setForeground(new java.awt.Color(219, 219, 219));
        painel4.add(tfPostado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 120, -1, -1));

        tfAvaliacoes4.setForeground(new java.awt.Color(219, 219, 219));
        painel4.add(tfAvaliacoes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 83, -1, -1));

        tfCategoria4.setForeground(new java.awt.Color(219, 219, 219));
        painel4.add(tfCategoria4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 77, -1, -1));

        tfData4.setForeground(new java.awt.Color(219, 219, 219));
        painel4.add(tfData4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 65, -1, -1));

        tfDescricao4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfDescricao4.setForeground(new java.awt.Color(219, 219, 219));
        painel4.add(tfDescricao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 12, -1, -1));

        btAvaliar4.setBackground(new java.awt.Color(58, 45, 110));
        btAvaliar4.setForeground(new java.awt.Color(143, 132, 183));
        btAvaliar4.setText("Avaliar");
        btAvaliar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvaliar4ActionPerformed(evt);
            }
        });
        painel4.add(btAvaliar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 120, -1));

        tfAbrir3.setBackground(new java.awt.Color(58, 45, 110));
        tfAbrir3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfAbrir3.setForeground(new java.awt.Color(143, 132, 183));
        tfAbrir3.setText("Abrir Podcast");
        tfAbrir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAbrir3ActionPerformed(evt);
            }
        });
        painel4.add(tfAbrir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        painel5.setBackground(new java.awt.Color(37, 34, 43));
        painel5.setMinimumSize(new java.awt.Dimension(494, 235));
        painel5.setPreferredSize(new java.awt.Dimension(494, 235));
        painel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfTitulo5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tfTitulo5.setForeground(new java.awt.Color(219, 219, 219));
        painel5.add(tfTitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, -1));

        tfPostado5.setForeground(new java.awt.Color(219, 219, 219));
        painel5.add(tfPostado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 120, -1, -1));

        tfAvaliacoes5.setForeground(new java.awt.Color(219, 219, 219));
        painel5.add(tfAvaliacoes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 83, -1, -1));

        tfCategoria5.setForeground(new java.awt.Color(219, 219, 219));
        painel5.add(tfCategoria5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 77, -1, -1));

        tfData5.setForeground(new java.awt.Color(219, 219, 219));
        painel5.add(tfData5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 65, -1, -1));

        tfDescricao5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfDescricao5.setForeground(new java.awt.Color(219, 219, 219));
        painel5.add(tfDescricao5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 12, -1, -1));

        tfAbrir4.setBackground(new java.awt.Color(58, 45, 110));
        tfAbrir4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfAbrir4.setForeground(new java.awt.Color(143, 132, 183));
        tfAbrir4.setText("Abrir Podcast");
        tfAbrir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAbrir4ActionPerformed(evt);
            }
        });
        painel5.add(tfAbrir4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        btAvaliar5.setBackground(new java.awt.Color(58, 45, 110));
        btAvaliar5.setForeground(new java.awt.Color(143, 132, 183));
        btAvaliar5.setText("Avaliar");
        btAvaliar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvaliar5ActionPerformed(evt);
            }
        });
        painel5.add(btAvaliar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 120, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(painel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(painel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(painel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(painel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(painel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(painel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jScrollPane1.setViewportView(jPanel2);

        jButton1.setBackground(new java.awt.Color(58, 45, 110));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(143, 132, 183));
        jButton1.setText("Avançar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(58, 45, 110));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(143, 132, 183));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tfPesquisa.setBackground(new java.awt.Color(37, 32, 56));
        tfPesquisa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tfPesquisa.setForeground(new java.awt.Color(143, 132, 183));
        tfPesquisa.setToolTipText("dfdf");
        tfPesquisa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfPesquisa.setName("sdadsasa"); // NOI18N
        tfPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisaActionPerformed(evt);
            }
        });
        tfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisaKeyPressed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(58, 45, 110));
        jButton3.setForeground(new java.awt.Color(143, 132, 183));
        jButton3.setText("Limpar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Pesquisar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(586, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new PesquisaPodcasts(repo.listarPodCast(),logado).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tfPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaKeyPressed

        pcs = repo.pesquisarPorNome(tfPesquisa.getText());
        atualizarPaineis();
    }//GEN-LAST:event_tfPesquisaKeyPressed

    private void tfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Index(logado).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Queue<PodCast> restanteQueue = new LinkedList<>();

        for (int i = 0; i < pcs.size(); i++) {
            restanteQueue.offer(pcs.get(i));
        }

        for (int i = 1; i <= 5; i++) {
            restanteQueue.poll();
        }

        for (int i = 0; i <= restanteQueue.size(); i++) {
            restante.add(restanteQueue.poll());
        }

        if (restante.size() == 1) {
            JOptionPane.showMessageDialog(null, "Sem mais resultados disponíveis!");
            dispose();
            new Index(logado).setVisible(true);

        } else {
            pcs = restante;
            atualizarPaineis();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btAvaliar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvaliar5ActionPerformed
        Avaliacao av = new Avaliacao();
        av.setIdPodcast(pcs.get(4).getIdPC());
        av.setIdUsuario(logado.getIdUsuario());
        repoA.salvar(av);
        PodCast pc = new PodCast();
        pc = pcs.get(4);
        pc.setAvaliacoesPC(pc.getAvaliacoesPC() + 1);
        repo.salvar(pc);
    }//GEN-LAST:event_btAvaliar5ActionPerformed

    private void tfAbrir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAbrir4ActionPerformed
        try {
            Desktop.getDesktop().browse(link5);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tfAbrir4ActionPerformed

    private void tfAbrir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAbrir3ActionPerformed
        try {
            Desktop.getDesktop().browse(link4);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tfAbrir3ActionPerformed

    private void btAvaliar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvaliar4ActionPerformed
        Avaliacao av = new Avaliacao();
        av.setIdPodcast(pcs.get(3).getIdPC());
        av.setIdUsuario(logado.getIdUsuario());
        repoA.salvar(av);
        PodCast pc = new PodCast();
        pc = pcs.get(3);
        pc.setAvaliacoesPC(pc.getAvaliacoesPC() + 1);
        repo.salvar(pc);
    }//GEN-LAST:event_btAvaliar4ActionPerformed

    private void btAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvaliarActionPerformed
        Avaliacao av = new Avaliacao();
        av.setIdPodcast(pcs.get(0).getIdPC());
        av.setIdUsuario(logado.getIdUsuario());
        repoA.salvar(av);
        PodCast pc = new PodCast();
        pc = pcs.get(0);
        pc.setAvaliacoesPC(pc.getAvaliacoesPC() + 1);
        repo.salvar(pc);
    }//GEN-LAST:event_btAvaliarActionPerformed

    private void tfAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAbrirActionPerformed
        try {
            Desktop.getDesktop().browse(link1);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tfAbrirActionPerformed

    private void btAvaliar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvaliar2ActionPerformed
        Avaliacao av = new Avaliacao();
        av.setIdPodcast(pcs.get(1).getIdPC());
        av.setIdUsuario(logado.getIdUsuario());
        repoA.salvar(av);
        PodCast pc = new PodCast();
        pc = pcs.get(1);
        pc.setAvaliacoesPC(pc.getAvaliacoesPC() + 1);
        repo.salvar(pc);
    }//GEN-LAST:event_btAvaliar2ActionPerformed

    private void tfAbrir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAbrir2ActionPerformed
        try {
            Desktop.getDesktop().browse(link2);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tfAbrir2ActionPerformed

    private void btAvaliar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvaliar3ActionPerformed
        Avaliacao av = new Avaliacao();
        av.setIdPodcast(pcs.get(2).getIdPC());
        av.setIdUsuario(logado.getIdUsuario());
        repoA.salvar(av);
        PodCast pc = new PodCast();
        pc = pcs.get(2);
        pc.setAvaliacoesPC(pc.getAvaliacoesPC() + 1);
        repo.salvar(pc);
    }//GEN-LAST:event_btAvaliar3ActionPerformed

    private void tfAbrir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAbrir1ActionPerformed
        try {
            Desktop.getDesktop().browse(link3);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tfAbrir1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaPodcasts(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvaliar;
    private javax.swing.JButton btAvaliar2;
    private javax.swing.JButton btAvaliar3;
    private javax.swing.JButton btAvaliar4;
    private javax.swing.JButton btAvaliar5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JPanel painel4;
    private javax.swing.JPanel painel5;
    private javax.swing.JButton tfAbrir;
    private javax.swing.JButton tfAbrir1;
    private javax.swing.JButton tfAbrir2;
    private javax.swing.JButton tfAbrir3;
    private javax.swing.JButton tfAbrir4;
    private javax.swing.JLabel tfAvaliacoes1;
    private javax.swing.JLabel tfAvaliacoes2;
    private javax.swing.JLabel tfAvaliacoes3;
    private javax.swing.JLabel tfAvaliacoes4;
    private javax.swing.JLabel tfAvaliacoes5;
    private javax.swing.JLabel tfCategoria1;
    private javax.swing.JLabel tfCategoria2;
    private javax.swing.JLabel tfCategoria3;
    private javax.swing.JLabel tfCategoria4;
    private javax.swing.JLabel tfCategoria5;
    private javax.swing.JLabel tfData1;
    private javax.swing.JLabel tfData2;
    private javax.swing.JLabel tfData3;
    private javax.swing.JLabel tfData4;
    private javax.swing.JLabel tfData5;
    private javax.swing.JLabel tfDescricao1;
    private javax.swing.JLabel tfDescricao2;
    private javax.swing.JLabel tfDescricao3;
    private javax.swing.JLabel tfDescricao4;
    private javax.swing.JLabel tfDescricao5;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JLabel tfPostado1;
    private javax.swing.JLabel tfPostado2;
    private javax.swing.JLabel tfPostado3;
    private javax.swing.JLabel tfPostado4;
    private javax.swing.JLabel tfPostado5;
    private javax.swing.JLabel tfTitulo1;
    private javax.swing.JLabel tfTitulo2;
    private javax.swing.JLabel tfTitulo3;
    private javax.swing.JLabel tfTitulo4;
    private javax.swing.JLabel tfTitulo5;
    // End of variables declaration//GEN-END:variables
}
