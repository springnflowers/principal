/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author User
 */
public class Enfermeiro extends Pessoa{

    int corem;
    double salario;
    String senhaEnfermeiro;

    Enfermeiro(String nome) {
        this.setNome(nome);
    }

//metodos get e set do atributo corem;
    public int getCorem() {
        return this.corem;
    }

    public void setCorem(int corem) {
        this.corem = corem;
    }
//metodo get e set do atributo senhaEnfermeiro

    public String getSenhaEnfermeiro() {
        return this.senhaEnfermeiro;
    }

    public void setSenhaEnfermeiro(String senhaEnfermeiro) {
        this.senhaEnfermeiro = senhaEnfermeiro;
    }
}
