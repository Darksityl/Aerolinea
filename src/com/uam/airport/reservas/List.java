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
public class List {
    
    private node head;
    private node tail;
    
    public List(){
        this.head=null;
        this.tail=null;        
    }
    /**This method return True or false empty list.
     * 
     * @return 
     */
    public boolean isempty(){
        return this.tail==null;     
    }
    
    
    /**This method insert a new head as value.
     * 
     *
     * @param p_value
     */
    public void insertHead(Class p_value){
		node newLink = new node(p_value); //Create a new link with a value attached to it
		if(isempty()) //Set the first element added to be the tail
			this.tail = newLink;
		else
			this.head.setPrevious(newLink);// newLink <-- currenthead(head)
		newLink.setNext(this.head); // newLink <--> currenthead(head)
		this.head = newLink; // newLink(head) <--> oldhead
	}
    
     /**This method insert a int at the tail.
      * 
      * @param x 
      */          
    public void insertTail(Class x){
            node newtail = new node(x);
            newtail.setNext(null);
            this.tail.setNext(newtail);
            newtail.setPrevious(this.tail);
            this.tail=newtail;
            
        }
        
    /**This method insert a value a N position
     *      * 
     * @param p_position
     * @param p_newvalue
     * @return 
     */
    public node insertNposition(int p_position,Class p_newvalue){
        node newvalue=new node(p_newvalue);    
        node current =this.head;
       
        if((p_position==0)||(p_position==1)){
            insertHead(p_newvalue);
        }else{
            while(--p_position>1){
                current=current.getNext();
            }
            newvalue.setNext(current.getNext());
            newvalue.setPrevious(current);            
            current.setNext(newvalue);
            return this.head;
        }
   
         return current;  
        }
    
    
        
    /**This method deletes at head position
     * 
     * 
     * @return 
     */        
    public node deleteHead(){
            node temp = this.head;
            this.head=this.head.getNext();
            return temp;
            
        }
    
    /**This method deletes at tail position
     * 
     * 
     * @return 
     */    
    public node deleteTail(){
            node temp= this.head;
            this.tail=this.tail.getPrevious();
            this.tail.setNext(null);
            return temp;
        }
    
    /**This method deletes at N position
         * 
         * 
         * 
         *
     * @param p_position
     * @return  */
    public node deleteNposition(int p_position){         
        node current = this.head;
        
        if((p_position==0)||(p_position==1)){ //Replace the head
            deleteHead();
        }else{
            while(--p_position>0){                //find the positision
            current=current.getNext();
        }
        current.getPrevious().setNext(current.getNext());

        }
        return current;
    }


    public int Size(){
        int size=0;
        
        node current =this.head;
            while(current!=null){
            current=current.getNext();
            size++;
            }
        return size;
    }
    


    /**Show the list at the node.
 * 
 * 
 */
    public void showList(){
        node current = this.head;
        while(current!=null){
            current.showLink();
            current= current.getNext();
            
        }
        
        
        
    }  
    
    public node ordenLongList(){
        node temp;
        node current = this.head;
        current=current.getNext().getNext();
//        for(int x=0; x>Size();x++)
     
      
            
            temp=current.getNext();
            current.setNext(current.getNext().getNext());
            temp.setPrevious(current.getPrevious());
            current.getPrevious().setNext(temp);
            temp.setNext(current);
            current.setPrevious(temp);
            
            
            
//            temp.setNext(current);
//            temp.setPrevious(current.getPrevious());
//            current.setPrevious(temp);
            
            
            
            
//        newLink.previous = current.previous; // 1 <-- newLink
//        current.previous.next = newLink; // 1 <--> newLink
//        newLink.next = current; // 1 <--> newLink --> 2(current) <--> 3
//        current.previous = newLink; // 1 <--> newLink <--> 2(current) <--> 3

            
     
        
        
        

            
            return head;
        
        
        
    }
    
    
    /**This method delete foward values if are less than head.
     * 
     * 
     * @return 
     */    
    public node deleteifisLess(){
        node temp;
        node current = this.head;
        
//        for(int x=0; x>Size();x++)
     
        /*while((current.getValue()>current.getNext().getValue())&&(current.getNext()!=null)){
            temp=current.getNext();
            current.setNext(current.getNext().getNext());            
        }
        
        
        

      */      
            return head;
        
        
        
    }    
      
        
   
}
