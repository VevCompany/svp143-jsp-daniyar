package kz.start;

import kz.inter.*;

/**
 * Created by НургалиевД on 22.02.2017.
 */
public class ModelT1000 implements kz.inter.Robot{
    private Hand hand;
    private Head head;
    private Leg leg;

    public ModelT1000(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }



    public void action(){
        hand.catchSomething();
        head.calc();
        leg.go();
    }

    @Override
    public void dance() {

    }

}
