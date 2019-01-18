package de.syed.gradleschool;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointUnitTest {

    @Test
    public void shouldReturnXValue() {
        final Point point = new Point(1, 2);
        assertThat(point.getX()).isEqualTo(1);
    }

}