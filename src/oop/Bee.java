
package oop;


public class Bee extends ABee{

    private Bee  partner;
    
    
    @Override
    public boolean sex(IBee partner) {
        this.partner =(Bee) partner;
        return true;
    }

    public Bee getPartner() {
        return partner;
    }

    public void setPartner(Bee partner) {
        this.partner = partner;
    }


    
}
