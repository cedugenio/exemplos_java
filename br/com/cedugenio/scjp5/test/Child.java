package br.com.cedugenio.scjp5.test;

import br.com.cedugenio.scjp5.Parent;

public class Child extends Parent {
    public void testIt() {
        System.out.println("x is " + x);
        Parent p = new Parent();
       // System.out.println(" X in parent is " + p. x);
    }
}
