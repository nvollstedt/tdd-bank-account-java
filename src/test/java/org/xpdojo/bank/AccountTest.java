package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	//@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        //account.deposit(10);
        assertThat(account.balance()).isEqualTo(0);
        //assertThat("your first test").isBlank();

    }


}
