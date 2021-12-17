import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle;
    @Test
    public void checksIfLengthOrBreadthAreNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-4,5));
    }

        @Nested
         class AreaOfRectangle {

        @Test
        public void checkAreaIsSixWhenLengthIsThreeAndBreadthIsTwo() {
            rectangle =new Rectangle(3,2);
            double actualArea= rectangle.area();
            double expectedArea = 6;
            assertEquals(expectedArea,actualArea);
        }

        @Test
        public void checksAreaIsTenWhenLengthIsFiveAndBreadthIsTwo() {
            rectangle =new Rectangle(5,2);
            double actualArea = rectangle.area();
            double expectedArea = 10;
            assertEquals(expectedArea, actualArea);
        }

        @Test
        public void checksAreaIsZeroWhenLengthIsSixAndBreadthIsZero() {
            assertThrows(IllegalArgumentException.class, () -> new Rectangle(6,0));

        }


    }
    @Nested
    class PerimeterOfRectangle {

        @Test
        public void checksPerimeterIsTenWhenLengthIsTwoBreadthIsThree() {
            rectangle =new Rectangle(2,3);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 10;
            assertEquals(expectedPerimeter,actualPerimeter);
        }

        @Test
        public void checksPerimeterIsFourteenWhenLengthIsFourAdBreadthIsThree() {
            rectangle = new Rectangle(4,3);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 14;
            assertEquals(expectedPerimeter,actualPerimeter);
        }

    }

}