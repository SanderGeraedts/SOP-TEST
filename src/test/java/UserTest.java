import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @org.junit.jupiter.api.Test
    public void toStringTest() {
        User user = new User("Test", "Test", "Test");

        assertEquals("Username: Test\nEmail: Test\nPassword: **********\n", user.toString());
    }

}