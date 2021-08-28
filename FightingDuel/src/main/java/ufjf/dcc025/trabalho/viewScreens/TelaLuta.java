/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author danie
 */
public class TelaLuta extends JFrame {

    static JFrame tela;
    static Jogador jogador;
    ImageIcon cenario;

    public TelaLuta() {
        //this.jogador = jogador;
        this.cenario = new ImageIcon(getClass().getResource("cenario1.png"));
        this.tela = new JFrame("Luta");
    }

    public JPanel desenha() {
        JPanel painel = new JPanel();

        JLabel fundo = new JLabel(this.cenario);

        painel.add(fundo, BorderLayout.CENTER);

        return painel;
    }

    public JPanel desenhaBotoes() {
        JPanel painel = new JPanel();

        JButton ataque1 = new JButton("Ataque1");
        JButton ataque2 = new JButton("Ataque2");
        JButton ataque3 = new JButton("Ataque3");
        JButton desistir = new JButton("Desistir");

        painel.add(ataque1);
        painel.add(ataque2);
        painel.add(ataque3);
        painel.add(desistir);

        return painel;
    }

    public static void main(String[] args) {
        TelaLuta luta = new TelaLuta();

        tela.setLayout(new BorderLayout());
        tela.setSize(1280, 720);

        tela.add(luta.desenha(), BorderLayout.CENTER);
        tela.add(luta.desenhaBotoes(), BorderLayout.SOUTH);

        tela.setLocationRelativeTo(null);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}