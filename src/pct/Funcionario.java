/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Carlos
 */
public class Funcionario {
    //Atributos
    int numMatricula;
    String nome;
    char nivel; // T = Teinee, J = Junior,  P = Pleno, S = Senior.
    double salario;
    boolean afastado;
    
    public void calcularInss(){
        salario = salario - (salario * 0.1);
    }
    
    public void apresentarFuncionario(){
        System.out.println("Funcionario: " + nome);
        System.out.println("Matricula: " + numMatricula);
        System.out.println("Salario: " + salario);
        System.out.println("Nivel: " + nivel);
        System.out.println("Afastado: " + afastado);
    }
}
