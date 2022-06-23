import AccountWithTest.AccountWithTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountWithTestTest {
    AccountWithTest accountWithTest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        accountWithTest=new AccountWithTest();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        accountWithTest=null;
    }
    @Test
    void createAccountName(){
        accountWithTest.setName("Idris");
        assertEquals("Idris",accountWithTest.getName());
    }
    @Test
    void createAccountBalance(){
        accountWithTest.setBalance(2.0);
        assertEquals(2.0,accountWithTest.getBalance());
    }

}