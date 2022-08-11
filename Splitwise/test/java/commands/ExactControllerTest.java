package commands;

import org.junit.jupiter.api.Test;
import service.Splitwise;

class ExactControllerTest {
    /**
     * Method under test: {@link ExactController#ExactController(Splitwise)}
     */
    @Test
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        new ExactController(new Splitwise());
    }

    /**
     * Method under test: {@link ExactController#execute()}
     */
    @Test
    void testExecute() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        (new ExactController(new Splitwise())).execute();
    }

    /**
     * Method under test: {@link ExactController#execute()}
     */
    @Test
    void testExecute2() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        (new ExactController(null)).execute();
    }
}

