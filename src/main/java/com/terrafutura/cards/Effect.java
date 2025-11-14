package main.java.com.terrafutura.cards;

import main.java.com.terrafutura.resources.*;
import java.util.List;

public interface Effect {
    /**
     *  Checks input resources, if all required are present, removes them from input and adds
     *  correct resources to output, adds pollution based on effect.
     * @param input Input resources - also works if you give it all resources
     * @param output Puts all gained resources here
     * @param pollution Adds gained pollution to variable
     * @return If exchange was successful, returns true, else returns false.
     */
    boolean check(List<Resource> input, List<Resource> output, int pollution);

    /**
     * Idk yet
     * @return True or false
     */
    boolean hasAssistance();

    /**
     * Idk yet
     * @return Something
     */
    String state();
}