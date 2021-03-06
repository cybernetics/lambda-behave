package com.insightfullogic.lambdabehave.generators;

import com.insightfullogic.lambdabehave.specifications.ThreeColumnDataSpecification;

/**
 * Represents a three column table of data that has been automatically generated.
 */
public interface CompleteThreeColumns<F, S, T> {

    /**
     * Specify the actual behaviour.
     *
     * @param description a human readable description of the behaviour you're expecting.
     * @param specification a function which describes in code the expected behaviour.
     * @return this
     */
    CompleteThreeColumns toShow(String description, ThreeColumnDataSpecification<F, S, T> specification);

}
