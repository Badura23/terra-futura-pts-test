package main.java.com.terrafutura.cards.effects;

import main.java.com.terrafutura.cards.Effect;
import main.java.com.terrafutura.resources.Resource;

import java.util.List;

public class ArbitraryBasic implements Effect {
    private final int from;
    private final List<Resource> to;
    private final int pollution;

    public ArbitraryBasic(int from, List<Resource> resources, int pollution) {
        this.from = from;
        to = resources;
        this.pollution = pollution;
    }

    @Override
    public boolean check(List<Resource> input, List<Resource> output, int pollution) {
        if (input.size() >= from) {
            output.addAll(to);
            pollution += this.pollution;
            return true;
        }
        else return false;
    }

    @Override
    public boolean hasAssistance() {
        // TODO neviem co to robi
        return false;
    }

    //TODO neviem co robi
    @Override
    public String state() {
        return "";
    }
}