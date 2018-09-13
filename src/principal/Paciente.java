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
public class Paciente extends Pessoa{

    int codPaciente;
    String senhaPaciente;

    Paciente(String nome) {
       this.setNome(nome);
    }

//metodos get e set do atributo codPaciente
    public int getCodPaciente() {
        return this.codPaciente;
    }

    public void setCodFuncionario(int CodPaciente) {
        this.codPaciente = codPaciente;
    }

//metodos get e set do atributo senhaPaciente;
    public String getSenhaPaciente() {
        return this.senhaPaciente;
    }

    public void setSenhaPaciente(String SenhaPaciente) {
        this.senhaPaciente = senhaPaciente;
    }
//metodos set do atributo SenhaFuncionario

    public void setSenhaFuncionario(String senhaPaciente) {
        this.senhaPaciente = senhaPaciente;
    }
//metodo booleano do logar

    public boolean logar(String senha) {
        if (senhaPaciente == "01234") {
            return true;
        } else {
            return false;
        }
    }

    void senhaPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
