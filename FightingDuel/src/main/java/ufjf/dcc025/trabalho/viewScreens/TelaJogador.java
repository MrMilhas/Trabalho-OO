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
import ufjf.dcc025.trabalho.controllerUser.ExibeContaJogador;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author danie
 */
public class TelaJogador {
    
    private static Jogador jogador;
    
    // Construtor --------------------------------------------------------------
    public TelaJogador(){
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        painel.setLayout(new GridLayout(0, 2));
        
        JButton botaoJogar = new JButton("Jogar");
        
        JButton botaoEventos = new JButton("Personagem");
        
        JButton botaoConta = new JButton("Conta");
        botaoConta.addActionListener(new ExibeContaJogador(this.jogador));
        
        JButton botaoEditar = new JButton("Editar Dados");
        
        painel.add(botaoJogar);
        painel.add(botaoEventos);
        painel.add(botaoConta);
        painel.add(botaoEditar);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(Jogador jogador){
        
        this.jogador = jogador;
        
        JFrame tela = new JFrame("Jogador");
        TelaJogador telaJogador = new TelaJogador();
        
        tela.setSize(600, 300);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaJogador.desenha(), BorderLayout.CENTER);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // Getteres ----------------------------------------------------------------
    public Jogador getJogador() {
        return jogador;
    }
    
}
