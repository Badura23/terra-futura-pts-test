package main.java.com.terrafutura.cards.effects;

import main.java.com.terrafutura.cards.Effect;
import main.java.com.terrafutura.resources.Resource;

import java.util.List;
// TODO Not done - only generated methods
public class EffectOr implements Effect {
    @Override
    public boolean check(List<Resource> input, List<Resource> output, int pollution) {
        return false;
    }

    @Override
    public boolean hasAssistance() {
        return false;
    }

    @Override
    public String state() {
        return "";
    }
}