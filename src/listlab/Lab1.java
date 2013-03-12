/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           List hobby = new ArrayList();
     hobby.add("Gun");
     hobby.add("Ammo");
     hobby.add("FourWheeler");
     hobby.add("Ammo");
     
    
     
     for(int i = 0; i < hobby.size(); i++){
         String s = (String)hobby.get(i);
         System.out.println(s);
     }
     
     
     
    }
}
