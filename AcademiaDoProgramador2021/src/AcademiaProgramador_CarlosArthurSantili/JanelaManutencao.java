/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcademiaProgramador_CarlosArthurSantili;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class JanelaManutencao extends javax.swing.JFrame {

    /**
     * Creates new form JanelaEquipamento
     */
    int auxAdicionar = 0;
    int qtdElementosTabela = 0;
    ArrayList<Equipamento> listaEquipamento = new ArrayList<Equipamento>();
    
    public JanelaManutencao(ArrayList<Equipamento> listaEquipamento) {
        initComponents();
        this.listaEquipamento = listaEquipamento;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameEquipamento = new javax.swing.JPanel();
        textTitulo = new javax.swing.JTextField();
        textDescricao = new javax.swing.JTextField();
        textDataAbertura = new javax.swing.JTextField();
        bt_Adicionar = new javax.swing.JButton();
        bt_Atualizar = new javax.swing.JButton();
        bt_Deletar = new javax.swing.JButton();
        bt_Fechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaManutencao = new javax.swing.JTable();
        cb_Equipamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bt_Adicionar.setText("Adicionar");
        bt_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AdicionarActionPerformed(evt);
            }
        });

        bt_Atualizar.setText("Atualizar");
        bt_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AtualizarActionPerformed(evt);
            }
        });

        bt_Deletar.setText("Deletar");
        bt_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DeletarActionPerformed(evt);
            }
        });

        bt_Fechar.setText("Fechar");
        bt_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_FecharActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Gerenciador de Manutenções");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Título");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Descrição");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Equipamento");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Data Abertura");

        tabelaManutencao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Descrição", "Equipamento", "Data de Abertura", "Dias de Manutenção"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaManutencao);

        jLabel7.setText("(Usar o formato: aaaa-mm-dd)");

        javax.swing.GroupLayout frameEquipamentoLayout = new javax.swing.GroupLayout(frameEquipamento);
        frameEquipamento.setLayout(frameEquipamentoLayout);
        frameEquipamentoLayout.setHorizontalGroup(
            frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameEquipamentoLayout.createSequentialGroup()
                .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameEquipamentoLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameEquipamentoLayout.createSequentialGroup()
                        .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                            .addGroup(frameEquipamentoLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_Adicionar)
                                .addGap(18, 18, 18)
                                .addComponent(bt_Atualizar)))
                        .addGap(18, 18, 18)))
                .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameEquipamentoLayout.createSequentialGroup()
                        .addComponent(bt_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameEquipamentoLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(51, 51, 51))
                        .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameEquipamentoLayout.createSequentialGroup()
                                .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_Equipamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameEquipamentoLayout.createSequentialGroup()
                                .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textDataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        frameEquipamentoLayout.setVerticalGroup(
            frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameEquipamentoLayout.createSequentialGroup()
                .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameEquipamentoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameEquipamentoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cb_Equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textDataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameEquipamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Adicionar)
                    .addComponent(bt_Atualizar)
                    .addComponent(bt_Deletar)
                    .addComponent(bt_Fechar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AdicionarActionPerformed
        // TODO add your handling code here:
                /*
                //REGEX formato de data
                String patt = "^\\d{4}-\\d{2}-\\d{2}$";
                Pattern r = Pattern.compile(patt);
                Matcher m = r.matcher(textDataAbertura.toString());
                if (!(m.find())) 
                {
                    JOptionPane optionPane = new JOptionPane("Data deve ter o formato aaaa-mm-dd", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("ERRO: DataAbertura_FormatoErrado");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }
                else */
                if (textTitulo.getText().length() < 1)
                {
                    JOptionPane optionPane = new JOptionPane("É necessário adicionar um valor para o campo titulo", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("ERRO: Titulo_QtdCaracteres");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }
                else if (textDescricao.getText().length() < 1)
                {
                    JOptionPane optionPane = new JOptionPane("É necessário adicionar um valor para o campo descrição", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("ERRO: Descricao_QtdCaracteres");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }
                else if (cb_Equipamento.getSelectedIndex()<0)
                {
                    if (cb_Equipamento.getItemCount()==0)
                    {
                        JOptionPane optionPane = new JOptionPane("Não há equipamentos registrados para fazer manutenção\n", JOptionPane.ERROR_MESSAGE);    
                        JDialog dialog = optionPane.createDialog("ERRO: mEquipamento_SelectedIndex<0&&itemCount==0");
                        dialog.setAlwaysOnTop(true);
                        dialog.setVisible(true);
                    }
                    else
                    {
                        JOptionPane optionPane = new JOptionPane("Selecione um equipamento no combobox\n", JOptionPane.ERROR_MESSAGE);    
                        JDialog dialog = optionPane.createDialog("ERRO: mEquipamento_SelectedIndex<0");
                        dialog.setAlwaysOnTop(true);
                        dialog.setVisible(true);
                    }
                }
                else if (textDataAbertura.getText().length() < 1)
                {
                    JOptionPane optionPane = new JOptionPane("É necessário adicionar um valor para o campo data de abertura", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("ERRO: DataAbertura_QtdCaracteres");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }
                else
                {
                    int equipamentoRepetido = 0; //se valor sair de 0, significa que o equipamento já esta em manutenção
                    int linhas = 0; //vai correr as linhas da tabela
                    
                    //model são os "valores atuais" da tabela
                    for(linhas = 0; linhas < qtdElementosTabela; linhas++)
                    {
                        if(cb_Equipamento.getSelectedItem().toString().equals(tabelaManutencao.getModel().getValueAt(linhas, 2).toString()))
                        {
                            equipamentoRepetido++;
                        }
                    }
                        
                    
                    if (equipamentoRepetido > 0)
                    {
                        JOptionPane optionPane = new JOptionPane("Esse tipo de equipamento já está em manutenção", JOptionPane.ERROR_MESSAGE);    
                        JDialog dialog = optionPane.createDialog("ERRO: Equipamento_equipamentoRepetido>0");
                        dialog.setAlwaysOnTop(true);
                        dialog.setVisible(true);
                    }
                    else
                    {
                        //Equipamento e = new Equipamento();
                        
                        Object[] row = new Object[5];

                        row[0] = textTitulo.getText();
                        row[1] = textDescricao.getText();
                        row[2] = cb_Equipamento.getSelectedItem().toString();
                        row[3] = textDataAbertura.getText();
                        row[4] = "";
                        
                        LocalDate hoje = LocalDate.now();
                        LocalDate dataAbertura = LocalDate.parse(textDataAbertura.getText());
                        long diasPassados = ChronoUnit.DAYS.between(hoje, dataAbertura);
                        row[4] = ""+diasPassados;
                        
                        
                        DefaultTableModel model = (DefaultTableModel) tabelaManutencao.getModel();
                        model.addRow(row);
                        qtdElementosTabela++;
                    }
                }
    }//GEN-LAST:event_bt_AdicionarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

    private void bt_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AtualizarActionPerformed
        // TODO add your handling code here:
            int i = tabelaManutencao.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tabelaManutencao.getModel();
            Object[] row = new Object[5];
            
                if (textTitulo.getText().length() < 1)
                {
                    JOptionPane optionPane = new JOptionPane("É necessário adicionar um valor para o campo título", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("ERRO: Titulo_QtdCaracteres");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }
                else if (textDescricao.getText().length() < 1)
                {
                    JOptionPane optionPane = new JOptionPane("É necessário adicionar um valor para o campo descrição", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("ERRO: Descricao_QtdCaracteres");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }
                else if (cb_Equipamento.getSelectedIndex()<0)
                {
                    if (cb_Equipamento.getItemCount()==0)
                    {
                        JOptionPane optionPane = new JOptionPane("Não há equipamentos registrados para fazer manutenção\n", JOptionPane.ERROR_MESSAGE);    
                        JDialog dialog = optionPane.createDialog("ERRO: mEquipamento_SelectedIndex<0&&itemCount==0");
                        dialog.setAlwaysOnTop(true);
                        dialog.setVisible(true);
                    }
                    else
                    {
                        JOptionPane optionPane = new JOptionPane("Selecione um equipamento no combobox\n", JOptionPane.ERROR_MESSAGE);    
                        JDialog dialog = optionPane.createDialog("ERRO: mEquipamento_SelectedIndex<0");
                        dialog.setAlwaysOnTop(true);
                        dialog.setVisible(true);
                    }
                }
                else if (textDataAbertura.getText().length() < 1)
                {
                    JOptionPane optionPane = new JOptionPane("É necessário adicionar um valor para o campo data de abertura", JOptionPane.ERROR_MESSAGE);    
                    JDialog dialog = optionPane.createDialog("ERRO: DataAbertura_QtdCaracteres");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }
                else
                {
                    int equipamentoRepetido = 0; //se valor sair de 0, significa que o equipamento já esta em manutenção
                    int linhas; //vai correr as linhas da tabela
                    
                    //model são os "valores atuais" da tabela
                    for(linhas = 0; linhas < qtdElementosTabela; linhas++)
                    {
                        if(cb_Equipamento.getSelectedItem().toString().equals(tabelaManutencao.getModel().getValueAt(linhas, 2).toString()))
                        {
                            equipamentoRepetido++;
                        }
                    }
                    if (tabelaManutencao.getSelectedRowCount()<0)
                    {
                        JOptionPane optionPane = new JOptionPane("É necessário selecionar o item na tabela que deseja modificar", JOptionPane.ERROR_MESSAGE);    
                        JDialog dialog = optionPane.createDialog("ERRO: NenhumItemSelecionado");
                        dialog.setAlwaysOnTop(true);
                        dialog.setVisible(true);
                    }
                    else if(tabelaManutencao.getSelectedRow()<0)
                    {
                        JOptionPane optionPane = new JOptionPane("É necessário selecionar o item que você deseja alterar", JOptionPane.ERROR_MESSAGE);    
                        JDialog dialog = optionPane.createDialog("ERRO: AlterarManutencao_SelectedRow<0");
                        dialog.setAlwaysOnTop(true);
                        dialog.setVisible(true);
                    }
                    else if (equipamentoRepetido > 0)
                    {
                        if((equipamentoRepetido==1)&&(cb_Equipamento.getSelectedItem().toString().equals(tabelaManutencao.getModel().getValueAt(tabelaManutencao.getSelectedRow(), 2).toString())))
                        {
                            row[0] = textTitulo.getText();
                            row[1] = textDescricao.getText();
                            row[2] = cb_Equipamento.getSelectedItem().toString();
                            row[3] = textDataAbertura.getText();
                            row[4] = "";

                            LocalDate hoje = LocalDate.now();
                            LocalDate dataAbertura = LocalDate.parse(textDataAbertura.getText());
                            long diasPassados = ChronoUnit.DAYS.between(hoje, dataAbertura);
                            diasPassados = diasPassados*(-1);
                            row[4] = ""+diasPassados;

                            model.setValueAt(textTitulo.getText(), i, 0);
                            model.setValueAt(textDescricao.getText(), i, 1);
                            model.setValueAt(cb_Equipamento.getSelectedItem().toString(), i, 2);
                            model.setValueAt(textDataAbertura.getText(), i, 3);
                            model.setValueAt(Long.toString(diasPassados), i, 4);
                        }
                        else
                        {
                        JOptionPane optionPane = new JOptionPane("Esse tipo de equipamento já está em manutenção", JOptionPane.ERROR_MESSAGE);    
                        JDialog dialog = optionPane.createDialog("ERRO: Equipamento_equipamentoRepetido>1");
                        dialog.setAlwaysOnTop(true);
                        dialog.setVisible(true);
                        }
                    }
                    else
                    {
                    
                        row[0] = textTitulo.getText();
                        row[1] = textDescricao.getText();
                        row[2] = cb_Equipamento.getSelectedItem().toString();
                        row[3] = textDataAbertura.getText();
                        row[4] = "";

                        LocalDate hoje = LocalDate.now();
                        LocalDate dataAbertura = LocalDate.parse(textDataAbertura.getText());
                        long diasPassados = ChronoUnit.DAYS.between(hoje, dataAbertura);
                        row[4] = ""+diasPassados;
                        
                        model.setValueAt(textTitulo.getText(), i, 0);
                        model.setValueAt(textDescricao.getText(), i, 1);
                        model.setValueAt(cb_Equipamento.getSelectedItem().toString(), i, 2);
                        model.setValueAt(textDataAbertura.getText(), i, 3);
                        model.setValueAt(Long.toString(diasPassados), i, 4);
                    }
                }
    }//GEN-LAST:event_bt_AtualizarActionPerformed

    private void bt_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DeletarActionPerformed
        // TODO add your handling code here:
        int i = tabelaManutencao.getSelectedRow();
            if(i >= 0)
            {
                listaEquipamento.remove(i);
                DefaultTableModel model = (DefaultTableModel) tabelaManutencao.getModel();
                model.removeRow(i);
                qtdElementosTabela--;
            }
            else
            {
                JOptionPane optionPane = new JOptionPane("Erro ao deletar, selecione um item valido", JOptionPane.ERROR_MESSAGE);    
                JDialog dialog = optionPane.createDialog("ERRO: DeleteManutencao_SelectedRow<0");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
            } 
    }//GEN-LAST:event_bt_DeletarActionPerformed

    private void bt_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_FecharActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_bt_FecharActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        int qtdEquipamento = 0;
        int i = 0;
        
        for (Equipamento aux : listaEquipamento)
        {
            qtdEquipamento++;
        }
        
        Object[] cb_item = new Object[qtdEquipamento];
        
        for (Equipamento aux : listaEquipamento)
        {
            cb_item[i] = aux.getNome();
            i++;
        }
            
            
        DefaultComboBoxModel model = new DefaultComboBoxModel(cb_item);
        cb_Equipamento.setModel(model);
        
    }//GEN-LAST:event_formWindowOpened

    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Adicionar;
    private javax.swing.JButton bt_Atualizar;
    private javax.swing.JButton bt_Deletar;
    private javax.swing.JButton bt_Fechar;
    private javax.swing.JComboBox<String> cb_Equipamento;
    private javax.swing.JPanel frameEquipamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaManutencao;
    private javax.swing.JTextField textDataAbertura;
    private javax.swing.JTextField textDescricao;
    private javax.swing.JTextField textTitulo;
    // End of variables declaration//GEN-END:variables
}