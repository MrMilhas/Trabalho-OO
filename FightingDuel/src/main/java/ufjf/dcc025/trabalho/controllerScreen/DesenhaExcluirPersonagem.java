/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.viewUsers.ExcluiPersonagemGUI;
/**
 *
 * @author Bonorino
 */
public class DesenhaExcluirPersonagem implements ActionListener{
    
    ExcluiPersonagemGUI telaExcluir;
    Jogador jogador = null;
    
    public DesenhaExcluirPersonagem(Jogador jogador){
        telaExcluir = new ExcluiPersonagemGUI(jogador);
        this.jogador = jogador;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        telaExcluir.chama(jogador);
    }
}
