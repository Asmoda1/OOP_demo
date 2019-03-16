
package oop;


public abstract class ABee implements IBee{
    private String name;
    
    @Override
    public void fly() {
        System.out.println("Пчела летает");
    }

    @Override
    public void catchHoney() {
        System.out.println("Собирает мёд");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
