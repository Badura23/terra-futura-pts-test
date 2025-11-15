package main.java.com.terrafutura.cards.effects;

import main.java.com.terrafutura.cards.Effect;
import main.java.com.terrafutura.resources.Resource;

import java.util.HashSet;
import java.util.List;

public class ArbitraryOutput implements Effect {
    private final List<Resource> from;
    private final int to;

    public ArbitraryOutput(List<Resource> from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean check(List<Resource> input, List<Resource> output, int pollution) {
        if (new HashSet<>(input).containsAll(from) && pollution == 0) {
            //TODO pridat do Resource stav Any?? vyriesilo by co tobit s takymito efektami...
            return true;
        }
        else return false;
    }

    @Override
    public String state() {
        return "";
    }
}
