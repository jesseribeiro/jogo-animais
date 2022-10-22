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

public class Jogo {

    private Jogo peixe;
    private Jogo macaco;
    private String valor;

    public Jogo() {

    }

    public Jogo(String valor) {
        this.valor = valor;
    }
    
    public Jogo getPeixe() {
        return peixe;
    }

    public void setPeixe(Jogo peixe) {
        this.peixe = peixe;
    }

    public void setPeixe(String valor) {
        this.peixe = new Jogo(valor);
    }

    public Jogo getMacaco() {
        return macaco;
    }

    public void setMacaco(Jogo macaco) {
        this.macaco = macaco;
    }
   
    public void setMacaco(String valor) {
        this.macaco = new Jogo(valor);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}