/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Elias
 */
public class Funcionario {

    /**
     * @return the numMatricula
     */
    public int getNumMatricula() {
        return numMatricula;
    }

    /**
     * @param numMatricula the numMatricula to set
     */
    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nivel
     */
    public char getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the afastado
     */
    public boolean isAfastado() {
        return afastado;
    }

    /**
     * @param afastado the afastado to set
     */
    public void setAfastado(boolean afastado) {
        this.afastado = afastado;
    }
    //Atributos
    private int numMatricula;
    private String nome;
    private char nivel; // T = Teinee, J = Junior,  P = Pleno, S = Senior.
    private double salario;
    private boolean afastado;
    
    public void calcularInss(){
        setSalario(getSalario() - (getSalario() * 0.1));
    }
    
    public void apresentarFuncionario(){
        System.out.println("Funcionario: " + getNome());
        System.out.println("Matricula: " + getNumMatricula());
        System.out.println("Salario: " + getSalario());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Afastado: " + isAfastado());
    }

    public Funcionario(int numMatricula, String nome, char nivel, double salario, boolean afastado) {
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.nivel = nivel;
        this.salario = salario;
        this.afastado = afastado;
    }

    public Funcionario() {
    }
    
}
