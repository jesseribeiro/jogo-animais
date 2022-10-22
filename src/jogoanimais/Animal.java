/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jogoanimais;

/**
 *
 * @author Jesse
 */

import javax.swing.JOptionPane;

public class Animal {
    private Jogo objeto;

    public Animal() {
        this.inicio();
    }

    private void inicio() {
        this.objeto = new Jogo("vive na água");
        this.objeto.setMacaco("Macaco");
        this.objeto.setPeixe("Tubarão");
    }

    public void iniciodojogo() {
        while (true) {
            if (JOptionPane.showConfirmDialog(null, "Pensou em um animal? ", "Animal", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 1) {
                break;
            }
            Jogo bichoAtual = this.objeto;
            pergunta(bichoAtual);
        }
    }

    protected boolean pergunta(Jogo bicho) {
        int retorno = JOptionPane.showConfirmDialog(null, "O animal que você pensou "+bicho.getValor()+"?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (retorno == 0) {
            if (bicho.getPeixe().getPeixe() == null) {
                retorno = JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + bicho.getPeixe().getValor()+"!", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if(retorno == 0) {
                    JOptionPane.showMessageDialog(null, "Acertei...");
                    return true;
                } else {
                    retornoErrado(bicho.getPeixe());
                }
            } else {
               return pergunta(bicho.getPeixe());
            }
        } else {
            if (bicho.getMacaco().getMacaco() == null) {
                retorno = JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + bicho.getMacaco().getValor()+"!", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if(retorno == 0) {
                    JOptionPane.showMessageDialog(null, "Acertei...");
                    return true;
                } else {
                    retornoErrado(bicho.getMacaco());
                }
            } else {
                return pergunta(bicho.getMacaco());
            }
        }
        return false;
    }

    protected void retornoErrado(Jogo bicho) {
        String animal = JOptionPane.showInputDialog(null, "Em que animal você estava pensando?");
        String pergunta = JOptionPane.showInputDialog(null, "O que ele faz que um " + bicho.getValor() + " não faz?");
        String animalAtual = bicho.getValor();
        bicho.setValor(pergunta);
        bicho.setPeixe(animal);
        bicho.setMacaco(animalAtual);
    }
}