
package rulesforimmutableclass;

import java.time.LocalDate;
import java.util.Date;

public final class NotImmutable  {      //Making class final can't allow any class to extend it ,so none of the calss can Override 
//any method to change the state of value.

//step 2: Make instance variables as final.
    private final Integer immutableField1;
    private final String immutableField2;
    private final Date date1;
    private final StringBuilder builder;
    
    
    public NotImmutable(Integer immutableField1,String immutableField2,Date date1,StringBuilder b){
        
        this.immutableField1=immutableField1;
        this.immutableField2=immutableField2;
        this.date1=new Date(date1.getTime());
        builder=new StringBuilder(b);
    }
    public Integer getImmutableField1(){     //Getters for instance variables ,as we dont provide setters in immutable classes to prevent the change of state.
        return immutableField1;
    }
    public String getImmutableField2(){
        return immutableField2;
    }
    
    public Date getMutableDate(){
        return new Date(date1.getTime());
    }
    public StringBuilder getBuilder(){
        return new StringBuilder(builder);
    }
    
}
