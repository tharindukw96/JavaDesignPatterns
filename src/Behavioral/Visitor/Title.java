/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Visitor;

/**
 *
 * @author 160278m
 */
public class Title implements IVisitable{
    private final String value;
    
    public Title(String value){
        this.value=value;
    }
    
    public String getValue(){
        return this.value;
    }
    
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
