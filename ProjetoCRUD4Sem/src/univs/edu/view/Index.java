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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import univs.edu.model.PodCast;
import univs.edu.model.Usuario;
import univs.edu.repository.PodCastRepository;
import univs.edu.repository.UsuarioRepository;

/**
 *
 * @author Lucas
 */
public class Index extends javax.swing.JFrame {

    Usuario logado = new Usuario();
    UsuarioRepository repo = new UsuarioRepository();
    PodCastRepository repoPC = new PodCastRepository();
    URI linkA1;
    URI linkA2;
    URI linkA3;
    URI linkR1;
    URI linkR2;
    URI linkR3;

    public Index(Usuario usuario) {
        initComponents();
        logado = usuario;
        lNome.setText("Bem-vindo(a) " + usuario.getNomeUsuario());
        atualizarAvaliados();
        if(logado.getAdm() == 1){
            jButton1.setVisible(true);
        }else{
            jButton1.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        tfTitulo = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JLabel();
        tfPostado = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tfTitulo1 = new javax.swing.JLabel();
        tfDescricao1 = new javax.swing.JLabel();
        tfPostado1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        tfTitulo2 = new javax.swing.JLabel();
        tfDescricao2 = new javax.swing.JLabel();
        tfPostado2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        tfTituloR = new javax.swing.JLabel();
        tfDescricaoR = new javax.swing.JLabel();
        tfPostadoR = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        tfTituloR1 = new javax.swing.JLabel();
        tfDescricaoR1 = new javax.swing.JLabel();
        tfPostadoR1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        tfTituloR2 = new javax.swing.JLabel();
        tfDescricaoR2 = new javax.swing.JLabel();
        tfPostadoR2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(26, 24, 34));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(26, 24, 34));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/pc.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(23, 22, 50, 50);

        jLabel2.setBackground(new java.awt.Color(26, 24, 34));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/nome_dessa_buceta.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(79, 22, 235, 64);

        lNome.setBackground(new java.awt.Color(26, 24, 34));
        lNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lNome.setForeground(new java.awt.Color(204, 204, 204));
        lNome.setText("Olá");
        jPanel1.add(lNome);
        lNome.setBounds(40, 90, 320, 70);

        jLabel5.setBackground(new java.awt.Color(26, 24, 34));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mais vistos");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(531, 22, 98, 24);

        jLabel6.setBackground(new java.awt.Color(26, 24, 34));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Recomendados");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(852, 22, 137, 24);

        jButton1.setBackground(new java.awt.Color(58, 45, 110));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(143, 132, 183));
        jButton1.setText("Editar usuários");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 340, 291, 35);

        jButton2.setBackground(new java.awt.Color(58, 45, 110));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(143, 132, 183));
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(23, 487, 291, 35);

        jButton3.setBackground(new java.awt.Color(58, 45, 110));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(143, 132, 183));
        jButton3.setText("Pesquisar podcast");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(23, 440, 291, 35);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(743, 36, 25, 486);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(397, 46, 25, 486);

        jPanel2.setBackground(new java.awt.Color(37, 34, 43));

        tfTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfTitulo.setForeground(new java.awt.Color(255, 255, 255));
        tfTitulo.setText("Titulo");

        tfDescricao.setForeground(new java.awt.Color(255, 255, 255));
        tfDescricao.setText("Descrição");

        tfPostado.setForeground(new java.awt.Color(255, 255, 255));
        tfPostado.setText("Postado por");

        jButton5.setBackground(new java.awt.Color(58, 45, 110));
        jButton5.setForeground(new java.awt.Color(143, 132, 183));
        jButton5.setText("Abrir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfPostado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfDescricao))
                            .addComponent(tfTitulo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(tfPostado)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(430, 50, 280, 150);

        jPanel3.setBackground(new java.awt.Color(37, 34, 43));

        tfTitulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        tfTitulo1.setText("Titulo");

        tfDescricao1.setForeground(new java.awt.Color(255, 255, 255));
        tfDescricao1.setText("Descrição");

        tfPostado1.setForeground(new java.awt.Color(255, 255, 255));
        tfPostado1.setText("Postado por");

        jButton6.setBackground(new java.awt.Color(58, 45, 110));
        jButton6.setForeground(new java.awt.Color(143, 132, 183));
        jButton6.setText("Abrir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfPostado1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfDescricao1))
                            .addComponent(tfTitulo1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfTitulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescricao1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(tfPostado1)))
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(430, 220, 266, 146);

        jPanel4.setBackground(new java.awt.Color(37, 34, 43));

        tfTitulo2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        tfTitulo2.setText("Titulo");

        tfDescricao2.setForeground(new java.awt.Color(255, 255, 255));
        tfDescricao2.setText("Descrição");

        tfPostado2.setForeground(new java.awt.Color(255, 255, 255));
        tfPostado2.setText("Postado por");

        jButton7.setBackground(new java.awt.Color(58, 45, 110));
        jButton7.setForeground(new java.awt.Color(143, 132, 183));
        jButton7.setText("Abrir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tfPostado2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfDescricao2))
                            .addComponent(tfTitulo2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tfTitulo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescricao2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfPostado2)))
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(430, 390, 280, 150);

        jPanel5.setBackground(new java.awt.Color(37, 34, 43));

        tfTituloR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfTituloR.setForeground(new java.awt.Color(255, 255, 255));
        tfTituloR.setText("Titulo");

        tfDescricaoR.setForeground(new java.awt.Color(255, 255, 255));
        tfDescricaoR.setText("Descrição");

        tfPostadoR.setForeground(new java.awt.Color(255, 255, 255));
        tfPostadoR.setText("Postado por");

        jButton8.setBackground(new java.awt.Color(58, 45, 110));
        jButton8.setForeground(new java.awt.Color(143, 132, 183));
        jButton8.setText("Abrir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(tfPostadoR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfDescricaoR))
                            .addComponent(tfTituloR))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(tfTituloR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescricaoR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(tfPostadoR)))
                .addContainerGap())
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(770, 50, 266, 146);

        jPanel6.setBackground(new java.awt.Color(37, 34, 43));

        tfTituloR1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfTituloR1.setForeground(new java.awt.Color(255, 255, 255));
        tfTituloR1.setText("Titulo");

        tfDescricaoR1.setForeground(new java.awt.Color(255, 255, 255));
        tfDescricaoR1.setText("Descrição");

        tfPostadoR1.setForeground(new java.awt.Color(255, 255, 255));
        tfPostadoR1.setText("Postado por");

        jButton9.setBackground(new java.awt.Color(58, 45, 110));
        jButton9.setForeground(new java.awt.Color(143, 132, 183));
        jButton9.setText("Abrir");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tfPostadoR1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(jButton9))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfDescricaoR1))
                            .addComponent(tfTituloR1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tfTituloR1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescricaoR1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(tfPostadoR1)))
                .addContainerGap())
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(770, 220, 266, 146);

        jPanel7.setBackground(new java.awt.Color(37, 34, 43));

        tfTituloR2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfTituloR2.setForeground(new java.awt.Color(255, 255, 255));
        tfTituloR2.setText("Titulo");

        tfDescricaoR2.setForeground(new java.awt.Color(255, 255, 255));
        tfDescricaoR2.setText("Descrição");

        tfPostadoR2.setForeground(new java.awt.Color(255, 255, 255));
        tfPostadoR2.setText("Postado por");

        jButton10.setBackground(new java.awt.Color(58, 45, 110));
        jButton10.setForeground(new java.awt.Color(143, 132, 183));
        jButton10.setText("Abrir");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(tfPostadoR2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(jButton10))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfDescricaoR2))
                            .addComponent(tfTituloR2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton10))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(tfTituloR2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescricaoR2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(tfPostadoR2)))
                .addContainerGap())
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(770, 390, 266, 146);

        jButton4.setBackground(new java.awt.Color(58, 45, 110));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(143, 132, 183));
        jButton4.setText("Cadastrar podcast");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 390, 291, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new PesquisaUsuarioView().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new PesquisaPodcasts(repoPC.listarPodCast(), logado).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            Desktop.getDesktop().browse(linkA1);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            Desktop.getDesktop().browse(linkA2);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            Desktop.getDesktop().browse(linkA3);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            Desktop.getDesktop().browse(linkR1);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            Desktop.getDesktop().browse(linkR1);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            Desktop.getDesktop().browse(linkR1);
        } catch (IOException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new CadastrarPodCast(logado).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    public void atualizarAvaliados() {
        List<PodCast> listaAvaliados = new ArrayList<>();
        listaAvaliados = repoPC.listarAvaliados();
        List<PodCast> listaRecomendados = new ArrayList<>();
        listaRecomendados = repoPC.listarRecomendados(logado);

        if (listaAvaliados.size() <= 0) {
            JOptionPane.showMessageDialog(null, "Sem podcasts cadastrados!");
        } else {
            
            
            tfTitulo.setText(listaAvaliados.get(0).getNomePC());
            tfDescricao.setText(listaAvaliados.get(0).getDescriptionPC());
            Usuario user = new Usuario();
            user = repo.pesquisarPorId(listaAvaliados.get(0).getIdCadastrante());
            tfPostado.setText("Postado por: " + user.getNomeUsuario());
            try {
                URI link = new URI(listaAvaliados.get(0).getLinkPC());
                linkA1 = link;
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível abrir o link! Notifique o suporte para resolução de erros!");
            }
            
            
            tfTitulo1.setText(listaAvaliados.get(1).getNomePC());
            tfDescricao1.setText(listaAvaliados.get(1).getDescriptionPC());
            user = repo.pesquisarPorId(listaAvaliados.get(1).getIdCadastrante());
            tfPostado1.setText("Postado por: " + user.getNomeUsuario());
            try {
                URI link = new URI(listaAvaliados.get(1).getLinkPC());
                linkA2 = link;
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível abrir o link! Notifique o suporte para resolução de erros!");
            }
            
            
            tfTitulo2.setText(listaAvaliados.get(2).getNomePC());
            tfDescricao2.setText(listaAvaliados.get(2).getDescriptionPC());
            user = repo.pesquisarPorId(listaAvaliados.get(2).getIdCadastrante());
            tfPostado2.setText("Postado por: " + user.getNomeUsuario());
            try {
                URI link = new URI(listaAvaliados.get(2).getLinkPC());
                linkA3 = link;
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível abrir o link! Notifique o suporte para resolução de erros!");
            }
            
            
            
            
            
            
           //RECOMENDADOS
           
           
           
           tfTituloR.setText(listaAvaliados.get(0).getNomePC());
            tfDescricaoR.setText(listaAvaliados.get(0).getDescriptionPC());
            user = repo.pesquisarPorId(listaAvaliados.get(0).getIdCadastrante());
            tfPostadoR.setText("Postado por: " + user.getNomeUsuario());
            try {
                URI link = new URI(listaAvaliados.get(0).getLinkPC());
                linkR1 = link;
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível abrir o link! Notifique o suporte para resolução de erros!");
            }
           
           tfTituloR1.setText(listaAvaliados.get(1).getNomePC());
            tfDescricaoR1.setText(listaAvaliados.get(1).getDescriptionPC());
            user = repo.pesquisarPorId(listaAvaliados.get(1).getIdCadastrante());
            tfPostadoR1.setText("Postado por: " + user.getNomeUsuario());
            try {
                URI link = new URI(listaAvaliados.get(1).getLinkPC());
                linkR2 = link;
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível abrir o link! Notifique o suporte para resolução de erros!");
            }
           
           tfTituloR2.setText(listaAvaliados.get(2).getNomePC());
            tfDescricaoR2.setText(listaAvaliados.get(2).getDescriptionPC());
            user = repo.pesquisarPorId(listaAvaliados.get(2).getIdCadastrante());
            tfPostadoR2.setText("Postado por: " + user.getNomeUsuario());
            try {
                URI link = new URI(listaAvaliados.get(2).getLinkPC());
                linkR3 = link;
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível abrir o link! Notifique o suporte para resolução de erros!");
            }
           
           
           
           
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel tfDescricao;
    private javax.swing.JLabel tfDescricao1;
    private javax.swing.JLabel tfDescricao2;
    private javax.swing.JLabel tfDescricaoR;
    private javax.swing.JLabel tfDescricaoR1;
    private javax.swing.JLabel tfDescricaoR2;
    private javax.swing.JLabel tfPostado;
    private javax.swing.JLabel tfPostado1;
    private javax.swing.JLabel tfPostado2;
    private javax.swing.JLabel tfPostadoR;
    private javax.swing.JLabel tfPostadoR1;
    private javax.swing.JLabel tfPostadoR2;
    private javax.swing.JLabel tfTitulo;
    private javax.swing.JLabel tfTitulo1;
    private javax.swing.JLabel tfTitulo2;
    private javax.swing.JLabel tfTituloR;
    private javax.swing.JLabel tfTituloR1;
    private javax.swing.JLabel tfTituloR2;
    // End of variables declaration//GEN-END:variables
}
