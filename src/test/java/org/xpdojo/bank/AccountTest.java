package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.FALSE;
import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	//@Disabled
    public void initialAccount_shouldHaveZeroBalance() {
        //account.deposit(10);
        assertThat(Account.emptyAccount().balance()).isEqualTo(0);
        //assertThat("your first test").isBlank();

    }

    @Test
    public void depositAnAmount_shouldIncreaseBalanceBySameAmount() {
        Account account = Account.emptyAccount();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void depositMultipleAmounts() {
        Account account = Account.emptyAccount();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }

    @Test
    public void withdrawAmount() {
        Account account = Account.emptyAccount();
        account.deposit(10);
        account.withdraw(10);
        assertThat(account.balance()).isEqualTo(0);
    }
    @Test
    public void withdrawExceedingAmount() {
        Account account = Account.emptyAccount();
        account.deposit(10);
        assertThat(account.withdraw(11)).isEqualTo(FALSE);
    }

    @Test
    public void transferAmount() {
        Account accountSender = Account.emptyAccount();
        Account accountReceiver = Account.emptyAccount();
        accountSender.deposit(10);
        accountSender.transfer(10,accountReceiver);
        assertThat(accountReceiver.balance()).isEqualTo(10);
    }

    @Test
    public void transferExceedingAmount() {
        Account accountSender = Account.emptyAccount();
        Account accountReceiver = Account.emptyAccount();
        accountSender.deposit(10);
        accountSender.transfer(11,accountReceiver);
        assertThat(accountReceiver.balance()).isEqualTo(0);
    }

}
