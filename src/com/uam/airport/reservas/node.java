/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.airport.reservas;

/**
 *
 * @author Kenenth Rojas
 */
public class node {

    private Class value;
    private node previous;
    private node next;

    public node(Class p_value) {
        this.value = p_value;
    }

    public void showLink() {
        System.out.println("The Link is --->" + this.value);
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Class value) {
        this.value = value;
    }

    public node getPrevious() {
        return previous;
    }

    public void setPrevious(node previous) {
        this.previous = previous;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }
    
    

}
