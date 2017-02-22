package kz.start;

import kz.inter.Hand;
import kz.inter.Head;
import kz.inter.Leg;

/**
 * Created by НургалиевД on 22.02.2017.
 */
public class Robot {

    private Head head ;
    private Leg leg ;
    private Hand hand ;


    public Robot(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }



    public void Action(){
        head.calc();
        hand.catchSomething();
        leg.go();
    }
}
