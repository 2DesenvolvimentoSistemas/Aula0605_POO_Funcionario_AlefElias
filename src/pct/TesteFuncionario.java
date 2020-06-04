/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Alef
 */
public class TesteFuncionario {
    
    public static void main(String[] args) {
        
        //Criação em instancia do objeto da classe funcionário.
        Funcionario meuFuncionario = new Funcionario();
        
        //Construção do objeto.
        meuFuncionario.setNumMatricula(0) ;
        
        meuFuncionario.setNome("Rene Strickler") ;
        
        meuFuncionario.setNivel('J') ;
        
        meuFuncionario.setSalario(3000.00) ;
        
        meuFuncionario.setAfastado(false) ;
        
        //Apresentando meu Funcionário.
        System.out.println("\n\t\t\t --- Funcionário.\n");
        meuFuncionario.apresentarFuncionario();
        
        //Calculando o INSS.
        meuFuncionario.calcularInss();
        
        //Apresentando meu Funcionário.
        System.out.println("\n\t\t\t --- Funcionário.\n");
        meuFuncionario.apresentarFuncionario();
        
        //Criação em instancia do objeto da classe outro Funcionário.
        Funcionario outroFuncionario = new Funcionario(69, "Hyuga", 'S', 9990.90, true);
        
        //Apresentando meu outro Funcionário.
        System.out.println("\n\t\t\t --- Outro Funcionário ---\n");
        outroFuncionario.apresentarFuncionario();
    }
    
}
