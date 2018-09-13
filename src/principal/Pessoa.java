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
public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;

    //metodos get e set do atributo nome           
    public String getNome() {
        return this.nome;
    }

    public void setNome(String Nome) {
        this.nome = nome;
    }

    //metodos get e set do atributo sobrenome
    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.sobrenome = sobrenome;
    }

    //metodos get e set do atributo CPF
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String Cpf) {
        this.cpf = cpf;
    }

    //metodos get e set do atributo RG
    public String getRg() {
        return this.rg;
    }

    public void setRg(String Rg) {
        this.rg = rg;
    }
}
