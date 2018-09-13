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
public class Medico extends Pessoa{

    String especialidades;
    int crm;
    String senhaMedico;
    double salario;

    Medico(String nome) {
        this.setNome(nome);
    }

//metodos get e set do atributo especialidades
    public String getEspecialidades() {
        return this.especialidades;
    }

    public void setEspecialidades(String Especialidades) {
        this.especialidades = especialidades;
    }

//metodos get e set do atributo crm
    public int getCrm() {
        return this.crm;
    }

    public void setCrm(int Crm) {
        this.crm = crm;
    }

//metodos get e set do atributo senhaMedico
    public String getSenhaMedico() {
        return this.senhaMedico;
    }

    public void setSenhaMedico(String senhaMedico) {
        this.senhaMedico = senhaMedico;
    }

//metodos get e set do atributo salario
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double Salario) {
        this.salario = salario;
    }
//metodo booleano do logar

    public boolean logar(String senha) {
        if (senhaMedico == "medik42") {
            return true;
        } else {
            return false;
        }
    }
}
