/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelUsers.Organizador;
import ufjf.dcc025.trabalho.viewScreens.TelaLogin;

/**
 *
 * @author danie
 */
public class ValidaLogin implements ActionListener{
    TelaLogin telaLogin;
    
    public ValidaLogin (TelaLogin telaLogin){
        this.telaLogin = telaLogin;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        int cont = 0;
        
        for (Jogador jogador1 : Dados.jogadores){
            if((telaLogin.getTfNome().getText().equals(jogador1.getNome())) && (telaLogin.getTfSenha().getText().equals(jogador1.getSenha()))){
                cont = 1;
            }
        }
        
        for (Administrador administrador1 : Dados.administradores){
            if(telaLogin.getTfNome().getText().equals(administrador1.getNome()) && telaLogin.getTfSenha().getText().equals(administrador1.getSenha())){
                cont = 2;
            }
        }
        
        for (Organizador organizador1 : Dados.organizadores){
            if(telaLogin.getTfNome().getText().equals(organizador1.getNome()) && telaLogin.getTfSenha().getText().equals(organizador1.getSenha())){
                cont = 3;
            }
        }
        
        switch(cont){
            case 1:
                JOptionPane.showMessageDialog(null, "Você logou como Jogador");
                break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "Você logou como Administrador");
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "Você logou como Organizador");
                break;
                
            case 0:
                JOptionPane.showMessageDialog(null, "ERRO! Este usuário não existe.");
                break;
        }
    }
}