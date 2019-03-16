
package oop;


public class OOP {


    public static void main(String[] args) {
       Bee vasya = new Bee();
       Bee manya = new Bee();
       
       vasya.setName("Вася");
       manya.setName("Маня");
       
        System.out.println(vasya.getName());
        System.out.println(manya.getName());
        
        manya.fly();
        manya.catchHoney();
        vasya.sex(manya);
        System.out.println(vasya.getPartner().getName());
    }
    
}
