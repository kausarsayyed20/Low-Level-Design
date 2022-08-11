package service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class SplitwiseTest {
    /**
     * Method under test: default or parameterless constructor of {@link Splitwise}
     */
    @Test
    void testConstructor() {
        new Splitwise();
        assertTrue(Splitwise.owes.isEmpty());
    }

    /**
     * Method under test: {@link Splitwise#equals(String, int, int, List)}
     */
    @Test
    void testEquals() {
        assertEquals(4, Splitwise.equals("Main User", 10, 1, new ArrayList<>()).size());
        assertThrows(ArithmeticException.class, () -> Splitwise.equals("Main User", 10, 0, new ArrayList<>()));
    }

    /**
     * Method under test: {@link Splitwise#equals(String, int, int, List)}
     */
    @Test
    void testEquals2() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");
        stringList.add("foo");
        stringList.add("foo");
        stringList.add("foo");
        stringList.add("foo");
        stringList.add("foo");
        stringList.add("foo");
        stringList.add("foo");
        stringList.add("foo");
        assertEquals(4, Splitwise.equals("foo", 1, 1, stringList).size());
    }

    /**
     * Method under test: {@link Splitwise#equals(String, int, int, List)}
     */
    @Test
    void testEquals3() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");
        assertEquals(4, Splitwise.equals("Main User", 10, 1, stringList).size());
    }

    /**
     * Method under test: {@link Splitwise#equals(String, int, int, List)}
     */
    @Test
    void testEquals4() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");
        stringList.add("foo");
        assertEquals(4, Splitwise.equals("Main User", 10, 1, stringList).size());
    }

    /**
     * Method under test: {@link Splitwise#equals(String, int, int, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at service.Splitwise.equals(Splitwise.java:34)
        //   In order to prevent equals(String, int, int, List)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   equals(String, int, int, List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");
        Splitwise.equals("java.lang.String", 10, 1, stringList);
    }

    /**
     * Method under test: {@link Splitwise#exact(String, int, int, List, List)}
     */
    @Test
    void testExact() {
        ArrayList<String> userslist = new ArrayList<>();
        assertEquals(4, Splitwise.exact("Main User", 10, 1, userslist, new ArrayList<>()).size());
    }

    /**
     * Method under test: {@link Splitwise#exact(String, int, int, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExact2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //       at java.util.Objects.checkIndex(Objects.java:372)
        //       at java.util.ArrayList.get(ArrayList.java:458)
        //       at service.Splitwise.exact(Splitwise.java:63)
        //   In order to prevent exact(String, int, int, List, List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   exact(String, int, int, List, List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");
        Splitwise.exact("Main User", 10, 1, stringList, new ArrayList<>());
    }

    /**
     * Method under test: {@link Splitwise#exact(String, int, int, List, List)}
     */
    @Test
    void testExact3() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Main User");
        assertEquals(4, Splitwise.exact("Main User", 10, 1, stringList, new ArrayList<>()).size());
    }

    /**
     * Method under test: {@link Splitwise#exact(String, int, int, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExact4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at service.Splitwise.exact(Splitwise.java:62)
        //   In order to prevent exact(String, int, int, List, List)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   exact(String, int, int, List, List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");
        Splitwise.exact("java.lang.String", 10, 1, stringList, new ArrayList<>());
    }

    /**
     * Method under test: {@link Splitwise#exact(String, int, int, List, List)}
     */
    @Test
    void testExact5() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        assertEquals(4, Splitwise.exact("Main User", 10, 1, stringList, integerList).size());
    }

    /**
     * Method under test: {@link Splitwise#percentage(String, int, int, List, List)}
     */
    @Test
    void testPercentage() {
        ArrayList<String> userslist = new ArrayList<>();
        assertEquals(4, Splitwise.percentage("Main User", 10, 1, userslist, new ArrayList<>()).size());
    }

    /**
     * Method under test: {@link Splitwise#percentage(String, int, int, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPercentage2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //       at java.util.Objects.checkIndex(Objects.java:372)
        //       at java.util.ArrayList.get(ArrayList.java:458)
        //       at service.Splitwise.percentage(Splitwise.java:93)
        //   In order to prevent percentage(String, int, int, List, List)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   percentage(String, int, int, List, List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");
        Splitwise.percentage("Main User", 10, 1, stringList, new ArrayList<>());
    }

    /**
     * Method under test: {@link Splitwise#percentage(String, int, int, List, List)}
     */
    @Test
    void testPercentage3() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Main User");
        assertEquals(4, Splitwise.percentage("Main User", 10, 1, stringList, new ArrayList<>()).size());
    }

    /**
     * Method under test: {@link Splitwise#percentage(String, int, int, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPercentage4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at service.Splitwise.percentage(Splitwise.java:91)
        //   In order to prevent percentage(String, int, int, List, List)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   percentage(String, int, int, List, List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");
        Splitwise.percentage("java.lang.String", 10, 1, stringList, new ArrayList<>());
    }

    /**
     * Method under test: {@link Splitwise#percentage(String, int, int, List, List)}
     */
    @Test
    void testPercentage5() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        assertEquals(4, Splitwise.percentage("Main User", 10, 1, stringList, integerList).size());
    }

    /**
     * Method under test: {@link Splitwise#percentage(String, int, int, List, List)}
     */
    @Test
    void testPercentage6() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        assertThrows(ArithmeticException.class, () -> Splitwise.percentage("Main User", 0, 1, stringList, integerList));
    }
}

