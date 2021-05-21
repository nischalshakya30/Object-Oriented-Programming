/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iims.oops.polymorphism.overriding;

/**
 *
 * @author msii
 */
public class MethodOverridingDemo {
    public static void main(String[] args) {
        
        Shopping shopping = new Shopping();
        shopping.shopping();
        
        shopping = new OnlineShopping();
        shopping.shopping();
    }
}
