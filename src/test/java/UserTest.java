import org.junit.Test;

import static org.junit.Assert.assertEquals;

class UserTest {
    @Test
    public void toStringTest() {
        User user = new User("Test", "Test", "Test");

        assertEquals("Username: Test\nEmail: Test\nPassword: **********\n", user.toString());
    }

}