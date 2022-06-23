package DepositAmount;

import AccountWithTest.AccountWithTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
       account=new Account("Test",2.0);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
      account=null;
    }

    @Test
    void deposit() {
        assertEquals(2.0,account.getBalance());
        account.deposit(2.0);
        assertEquals(4.0,account.getBalance());
    }

    @Test
    void getBalance() {
    }

    @Test
    void setName() {
    }

    @Test
    void getName() {
    }
}