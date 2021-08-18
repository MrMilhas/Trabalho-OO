/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author danie
 */
public class TelaAdministrador {
    // Construtor --------------------------------------------------------------
    public TelaAdministrador(){
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        painel.setLayout(new GridLayout(0, 2));
        
        JButton botaoEventos = new JButton("Personagem");
        
        JButton botaoConta = new JButton("Conta");
        
        JButton botaoEditar = new JButton("Editar Dados");
        
        painel.add(botaoEventos);
        painel.add(botaoConta);
        painel.add(botaoEditar);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(){
        
        JFrame tela = new JFrame("Administrador");
        TelaAdministrador telaAdministrador = new TelaAdministrador();
        
        tela.setSize(600, 300);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaAdministrador.desenha(), BorderLayout.CENTER);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
