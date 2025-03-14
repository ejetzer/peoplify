package io.github.shuoros.peoplify.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class FaceComponent extends AbstractTypeBasedComponent {

    @Override
    public Integer getX() {
        return 226;
    }

    @Override
    public Integer getY() {
        return calculateYPosition(185);
    }
}
