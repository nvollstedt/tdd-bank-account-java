package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	//@Disabled
    public void initialAccount_shouldHaveZeroBalance() {
        //account.deposit(10);
        assertThat(Account.emptyAccount().balance()).isEqualTo(0);
        //assertThat("your first test").isBlank();

    }


}
