/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.JOptionPane;
import univs.edu.model.PodCast;
import univs.edu.model.Usuario;
import univs.edu.repository.PodCastRepository;
import univs.edu.repository.UsuarioRepository;
import univs.edu.util.PodcastUtil;

/**
 *
 * @author Lucas
 */
public class PaginaPodcasts extends javax.swing.JFrame {

    Usuario logado = new Usuario();
    UsuarioRepository repoU = new UsuarioRepository();
    PodCastRepository repo = new PodCastRepository();
    List<PodCast> pcs = new ArrayList<>();
    List<PodCast> restante = new ArrayList<>();

    public PaginaPodcasts(List<PodCast> pc) {
        initComponents();
        this.pcs = pc;
        atualizarPaineis();
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
        return infos;
    }

    public void atualizarPaineis() {
        List<String> infos = new ArrayList<String>();
        infos = GetInformacoes(0);
        //0= nome, 1= descrição, 2= data, 3= categoria, 4= avaliacoes, 5= postador

        JOptionPane.showMessageDialog(null, pcs.size());

        if (pcs.size() >= 1) {
            tfTitulo1.setText(infos.get(0));
            tfDescricao1.setText("Descrição: " + infos.get(1));
            tfData1.setText("Data de postagem: " + infos.get(2));
            tfCategoria1.setText("Categoria: " + infos.get(3));
            tfAvaliacoes1.setText("Avaliações: " + infos.get(4));
            tfPostado1.setText("Postado por: " + infos.get(5));
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
        jRadioButton3 = new javax.swing.JRadioButton();
        tfPostado3 = new javax.swing.JLabel();
        tfAvaliacoes3 = new javax.swing.JLabel();
        tfCategoria3 = new javax.swing.JLabel();
        tfData3 = new javax.swing.JLabel();
        tfDescricao3 = new javax.swing.JLabel();
        painel2 = new javax.swing.JPanel();
        tfTitulo2 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        tfPostado2 = new javax.swing.JLabel();
        tfAvaliacoes2 = new javax.swing.JLabel();
        tfCategoria2 = new javax.swing.JLabel();
        tfData2 = new javax.swing.JLabel();
        tfDescricao2 = new javax.swing.JLabel();
        painel1 = new javax.swing.JPanel();
        tfTitulo1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        tfPostado1 = new javax.swing.JLabel();
        tfAvaliacoes1 = new javax.swing.JLabel();
        tfCategoria1 = new javax.swing.JLabel();
        tfData1 = new javax.swing.JLabel();
        tfDescricao1 = new javax.swing.JLabel();
        painel4 = new javax.swing.JPanel();
        tfTitulo4 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        tfPostado4 = new javax.swing.JLabel();
        tfAvaliacoes4 = new javax.swing.JLabel();
        tfCategoria4 = new javax.swing.JLabel();
        tfData4 = new javax.swing.JLabel();
        tfDescricao4 = new javax.swing.JLabel();
        painel5 = new javax.swing.JPanel();
        tfTitulo5 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        tfPostado5 = new javax.swing.JLabel();
        tfAvaliacoes5 = new javax.swing.JLabel();
        tfCategoria5 = new javax.swing.JLabel();
        tfData5 = new javax.swing.JLabel();
        tfDescricao5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 251, 486, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 497, 486, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 761, 486, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1025, 486, 10));

        painel3.setBackground(new java.awt.Color(37, 34, 43));

        tfTitulo3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tfTitulo3.setForeground(new java.awt.Color(219, 219, 219));
        tfTitulo3.setText("Titulo");

        jRadioButton3.setBackground(new java.awt.Color(37, 34, 43));
        jRadioButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton3.setText("Avaliar");

        tfPostado3.setForeground(new java.awt.Color(219, 219, 219));
        tfPostado3.setText("Postado por:");

        tfAvaliacoes3.setForeground(new java.awt.Color(219, 219, 219));
        tfAvaliacoes3.setText("Avaliações:");

        tfCategoria3.setForeground(new java.awt.Color(219, 219, 219));
        tfCategoria3.setText("Categoria");

        tfData3.setForeground(new java.awt.Color(219, 219, 219));
        tfData3.setText("Data:");

        tfDescricao3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfDescricao3.setForeground(new java.awt.Color(219, 219, 219));
        tfDescricao3.setText("Descrição");

        javax.swing.GroupLayout painel3Layout = new javax.swing.GroupLayout(painel3);
        painel3.setLayout(painel3Layout);
        painel3Layout.setHorizontalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton3)
                .addGap(41, 41, 41))
            .addGroup(painel3Layout.createSequentialGroup()
                .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tfTitulo3))
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAvaliacoes3)
                            .addComponent(tfPostado3)
                            .addComponent(tfCategoria3)
                            .addComponent(tfData3)
                            .addComponent(tfDescricao3))))
                .addContainerGap(438, Short.MAX_VALUE))
        );
        painel3Layout.setVerticalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescricao3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(tfData3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCategoria3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(tfAvaliacoes3))
                .addGap(5, 5, 5)
                .addComponent(tfPostado3)
                .addContainerGap())
        );

        jPanel2.add(painel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        painel2.setBackground(new java.awt.Color(37, 34, 43));

        tfTitulo2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tfTitulo2.setForeground(new java.awt.Color(219, 219, 219));
        tfTitulo2.setText("Titulo");

        jRadioButton2.setBackground(new java.awt.Color(37, 34, 43));
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setText("Avaliar");

        tfPostado2.setForeground(new java.awt.Color(219, 219, 219));
        tfPostado2.setText("Postado por:");

        tfAvaliacoes2.setForeground(new java.awt.Color(219, 219, 219));
        tfAvaliacoes2.setText("Avaliações:");

        tfCategoria2.setForeground(new java.awt.Color(219, 219, 219));
        tfCategoria2.setText("Categoria");

        tfData2.setForeground(new java.awt.Color(219, 219, 219));
        tfData2.setText("Data:");

        tfDescricao2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfDescricao2.setForeground(new java.awt.Color(219, 219, 219));
        tfDescricao2.setText("Descrição");

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                .addContainerGap(416, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(41, 41, 41))
            .addGroup(painel2Layout.createSequentialGroup()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tfTitulo2))
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAvaliacoes2)
                            .addComponent(tfPostado2)
                            .addComponent(tfCategoria2)
                            .addComponent(tfData2)
                            .addComponent(tfDescricao2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescricao2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(tfData2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCategoria2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(tfAvaliacoes2))
                .addGap(5, 5, 5)
                .addComponent(tfPostado2)
                .addContainerGap())
        );

        jPanel2.add(painel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        painel1.setBackground(new java.awt.Color(37, 34, 43));

        tfTitulo1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tfTitulo1.setForeground(new java.awt.Color(219, 219, 219));
        tfTitulo1.setText("Titulo");

        jRadioButton1.setBackground(new java.awt.Color(37, 34, 43));
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setText("Avaliar");

        tfPostado1.setForeground(new java.awt.Color(219, 219, 219));
        tfPostado1.setText("Postado por:");

        tfAvaliacoes1.setForeground(new java.awt.Color(219, 219, 219));
        tfAvaliacoes1.setText("Avaliações:");

        tfCategoria1.setForeground(new java.awt.Color(219, 219, 219));
        tfCategoria1.setText("Categoria");

        tfData1.setForeground(new java.awt.Color(219, 219, 219));
        tfData1.setText("Data:");

        tfDescricao1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfDescricao1.setForeground(new java.awt.Color(219, 219, 219));
        tfDescricao1.setText("Descrição");

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tfTitulo1))
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPostado1)
                            .addComponent(tfDescricao1)
                            .addComponent(tfCategoria1)
                            .addComponent(tfData1)
                            .addComponent(tfAvaliacoes1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                .addComponent(jRadioButton1))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescricao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(tfData1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCategoria1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(tfAvaliacoes1))
                .addGap(51, 51, 51)
                .addComponent(tfPostado1)
                .addContainerGap())
        );

        jPanel2.add(painel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painel4.setBackground(new java.awt.Color(37, 34, 43));

        tfTitulo4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tfTitulo4.setForeground(new java.awt.Color(219, 219, 219));
        tfTitulo4.setText("Titulo");

        jRadioButton4.setBackground(new java.awt.Color(37, 34, 43));
        jRadioButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton4.setText("Avaliar");

        tfPostado4.setForeground(new java.awt.Color(219, 219, 219));
        tfPostado4.setText("Postado por:");

        tfAvaliacoes4.setForeground(new java.awt.Color(219, 219, 219));
        tfAvaliacoes4.setText("Avaliações:");

        tfCategoria4.setForeground(new java.awt.Color(219, 219, 219));
        tfCategoria4.setText("Categoria");

        tfData4.setForeground(new java.awt.Color(219, 219, 219));
        tfData4.setText("Data:");

        tfDescricao4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfDescricao4.setForeground(new java.awt.Color(219, 219, 219));
        tfDescricao4.setText("Descrição");

        javax.swing.GroupLayout painel4Layout = new javax.swing.GroupLayout(painel4);
        painel4.setLayout(painel4Layout);
        painel4Layout.setHorizontalGroup(
            painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel4Layout.createSequentialGroup()
                .addContainerGap(416, Short.MAX_VALUE)
                .addComponent(jRadioButton4)
                .addGap(41, 41, 41))
            .addGroup(painel4Layout.createSequentialGroup()
                .addGroup(painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tfTitulo4))
                    .addGroup(painel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAvaliacoes4)
                            .addComponent(tfPostado4)
                            .addComponent(tfCategoria4)
                            .addComponent(tfData4)
                            .addComponent(tfDescricao4))))
                .addContainerGap(441, Short.MAX_VALUE))
        );
        painel4Layout.setVerticalGroup(
            painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfTitulo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescricao4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(tfData4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCategoria4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(tfAvaliacoes4))
                .addGap(5, 5, 5)
                .addComponent(tfPostado4)
                .addContainerGap())
        );

        jPanel2.add(painel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, 550, -1));

        painel5.setBackground(new java.awt.Color(37, 34, 43));

        tfTitulo5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tfTitulo5.setForeground(new java.awt.Color(219, 219, 219));
        tfTitulo5.setText("Titulo");

        jRadioButton5.setBackground(new java.awt.Color(37, 34, 43));
        jRadioButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton5.setText("Avaliar");

        tfPostado5.setForeground(new java.awt.Color(219, 219, 219));
        tfPostado5.setText("Postado por:");

        tfAvaliacoes5.setForeground(new java.awt.Color(219, 219, 219));
        tfAvaliacoes5.setText("Avaliações:");

        tfCategoria5.setForeground(new java.awt.Color(219, 219, 219));
        tfCategoria5.setText("Categoria");

        tfData5.setForeground(new java.awt.Color(219, 219, 219));
        tfData5.setText("Data:");

        tfDescricao5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfDescricao5.setForeground(new java.awt.Color(219, 219, 219));
        tfDescricao5.setText("Descrição");

        javax.swing.GroupLayout painel5Layout = new javax.swing.GroupLayout(painel5);
        painel5.setLayout(painel5Layout);
        painel5Layout.setHorizontalGroup(
            painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel5Layout.createSequentialGroup()
                .addContainerGap(416, Short.MAX_VALUE)
                .addComponent(jRadioButton5)
                .addGap(41, 41, 41))
            .addGroup(painel5Layout.createSequentialGroup()
                .addGroup(painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAvaliacoes5)
                            .addComponent(tfPostado5)
                            .addComponent(tfCategoria5)
                            .addComponent(tfData5)))
                    .addGroup(painel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfDescricao5))
                            .addComponent(tfTitulo5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel5Layout.setVerticalGroup(
            painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfTitulo5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescricao5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(tfData5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCategoria5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(tfAvaliacoes5))
                .addGap(5, 5, 5)
                .addComponent(tfPostado5)
                .addContainerGap())
        );

        jPanel2.add(painel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1040, -1, -1));

        jScrollPane1.setViewportView(jPanel2);

        jButton1.setBackground(new java.awt.Color(58, 45, 110));
        jButton1.setForeground(new java.awt.Color(143, 132, 183));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 181, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

        dispose();
        PaginaPodcasts tela = new PaginaPodcasts(restante);
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPodcasts(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
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
