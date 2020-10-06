/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author roger
 */
public class PilhaMain {
    
    public static void main(String[] args) {
        
        Pilha p = new Pilha();
      
        p.push(10);
        p.push(9);
        p.push(8);
        p.push(7);
        p.push(6);
        p.push(5);
        p.push(4);
        p.push(3);
        p.push(2);
        p.push(1);
        
        while(!p.isEmpty()){
            int elemento = p.pop();
            System.out.println(elemento + " ");
        }
    }
    
}
