/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginae;

import classes.First;
import classes.Second;
import classes.Third;

/**
 *
 * @author pupil
 */
public class Imaginae {

    //public String alt;  
    public static void main(String[] args) {
      
        First first1=new First("go","checkingOut");
        Second second1=new Second(1,2,3);
        Third third1= new Third("anyplace", "anywhere","anytime");
        //public int sum= second1[0]+second1[1];
        
        System.out.println(first1.getName()+" "+first1.getDescription());
        System.out.println(second1.getOne()+second1.getTwo()+" "+second1.getThree()); // bez probela proishodit arifmeti4eskoe deystvie
        System.out.println(third1.getWord1()+", "+third1.getWord2()+", "+third1.getWord3());
        //System.out.println(sum);

//    @Override
//    public String toString() {
//        return "Imaginae{" + "alt=" + alt + first1.getName()+" "+first1.getDescription()+" "+second1.getThree()+
//                second1.getTwo()+second1.getOne()+'}';
//    }
    
}
}
