
package rulesforimmutableclass;

import java.time.LocalDate;
import java.time.Month;

public class RulesForImmutableClass {

    public static void main(String[] args) {
      //Example 1: and //Example 2:
      
        StringBuilder sb=new StringBuilder("First un-changed Value");
        NotImmutable Object=new NotImmutable(23,"My name is Beenish",new java.util.Date(System.currentTimeMillis()),sb);
        sb.append("  ,value changed");
        StringBuilder gotBuilder=Object.getBuilder();
        gotBuilder.append(", Again changed");
        
        System.out.println(Object.getBuilder());
        
        System.out.println(Object.getImmutableField2());
        System.out.println(Object.getImmutableField1());
        System.out.println(Object.getMutableDate());
       
        
       
        
       
    }
    
}
