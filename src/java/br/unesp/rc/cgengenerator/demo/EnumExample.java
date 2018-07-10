/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.s4lsa.demo;

import br.unesp.rc.s4lsa.model.Cargo;
import br.unesp.rc.s4lsa.model.Funcionario;

/**
 *
 * @author frank
 */
public class EnumExample {
    public static void main(String[] args) {
        System.out.println("CARGO: " + Cargo.GERENTE);
        
        System.out.println("CARGO: " + Cargo.GERENTE.getCargo());
        
        Funcionario f = new Funcionario();
        f.setCargo(Cargo.values()[2]);
        
        System.out.println("CARGO: " + f.getCargo().getCargo());
    }
    
}
