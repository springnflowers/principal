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
public class Principal {

    private static String senha;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INSTANCIA DA CLASSE PACIENTE 
        Paciente p = new Paciente("Rodrigo");
        p.codPaciente = 654;
        p.senhaPaciente = "01234";

        p.getCodPaciente();
        p.getSenhaPaciente();
        p.setCodFuncionario(0);
        p.setSenhaFuncionario(senha);
        p.logar(senha);

        //INSTANCIA DA CLASSE MEDICO
        Medico m = new Medico("Jeferson");
        m.especialidades = "Cardiologista";
        m.salario = 8000;
        m.senhaMedico = "medik42";
        m.crm = 98745;

        m.getCrm();
        m.setCrm(0);
        m.getEspecialidades();
        m.setEspecialidades(senha);
        m.getSenhaMedico();
        m.setSenhaMedico(senha);
        m.setSalario(0);
        m.getSalario();
        m.logar(senha);

        //INSTANCIA DA CLASSE ENFERMEIRO
        Enfermeiro e = new Enfermeiro("Pâmela");
        e.corem = 64521;
        e.salario = 2000;
        e.senhaEnfermeiro = "enferm10";

        e.getCorem();
        e.setCorem(0);
        e.getSenhaEnfermeiro();
        e.setSenhaEnfermeiro(senha);
    }
}
