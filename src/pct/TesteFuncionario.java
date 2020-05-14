/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Almir
 */
public class TesteFuncionario {
    
    public static void main(String[] args) {
        
        //Criação em instancia do objeto da classe funcionário.
        Funcionario meuFuncionario = new Funcionario();
        
        //Construção do objeto.
        meuFuncionario.numMatricula = 0 ;
        meuFuncionario.nome = "Rene Strickler" ;
        meuFuncionario.nivel = 'J' ;
        meuFuncionario.salario = 3000.00 ;
        meuFuncionario.afastado = false ;
        
        //Exibindo o INSS.
        System.out.println("\n\t\t\t --- INSS ---\n");
        meuFuncionario.calcularInss();
        
        //Apresentando meu Funcionário.
        System.out.println("\n\t\t\t --- Funcionário.\n");
        meuFuncionario.apresentarFuncionario();
   
    }
    
}
