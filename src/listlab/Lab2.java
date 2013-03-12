/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab;

import java.util.*;

/**
 *
 * @author chris
 */
public class Lab2 {
    public static void main(String[] args) {
         Employee e1 = new Employee("Bob", "1234");
    Employee e2 = new Employee("Sandy", "0987");
    Employee e3 = new Employee("Bill", "5678");
    
    
    List<Employee> employee = new ArrayList<Employee>();
    employee.add(e1);
    employee.add(e2);
    employee.add(e3);
    
  
    for(int i = 0; i < employee.size(); i++){
       Employee empl = employee.get(i);
        System.out.println(empl);
                
    }
    
        System.out.println(employee.get(2));
    }
   
}
