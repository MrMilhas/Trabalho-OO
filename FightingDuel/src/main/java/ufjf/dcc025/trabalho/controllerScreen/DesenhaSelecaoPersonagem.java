
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.viewScreens.TelaSelecaoPersonagem;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class DesenhaSelecaoPersonagem implements ActionListener{
    
    Jogador jogador;
    
    TelaSelecaoPersonagem seleciona;

    public DesenhaSelecaoPersonagem(Jogador jogador) {
        this.jogador = jogador;
        this.seleciona = new TelaSelecaoPersonagem(this.jogador);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(jogador.getPersonagens().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não tem nenhum personagem criado...");
        } else {
            seleciona.chama();
        }
    }
    
}
