package main.java.com.terrafutura.cards.effects;

import main.java.com.terrafutura.cards.Effect;
import main.java.com.terrafutura.resources.Resource;

import java.util.List;

public class ArbitraryInOut implements Effect {
    private final int in, out;
    private boolean hasAssistance = false;


    public ArbitraryInOut(int in, int out) {
        this.in = in;
        this.out = out;
    }

    public ArbitraryInOut(int in, int out, boolean hasAssistance) {
        this.in = in;
        this.out = out;
        this.hasAssistance = hasAssistance;
    }

    @Override
    public boolean hasAssistance() {
        return hasAssistance;
    }

    @Override
    public boolean check(List<Resource> desiredInput, List<Resource> desiredOutput, int pollution) {
        return desiredInput.size() == in && desiredOutput.size() == out && pollution == 0;
    }

    @Override
    public String state() {
        return "[(any " + in + " resources) -> (any " +
                out + " resources)]";
    }
}
