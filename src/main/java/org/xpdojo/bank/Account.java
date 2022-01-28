package org.xpdojo.bank;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Account {

    private int balance;

    public static Account emptyAccount() {
        return new Account();
    }
    public int balance() {

        return balance;
    }

    public void deposit(int i) {
        balance += i;
        //self.
    }
    public boolean withdraw(int i) {
        boolean operationPermitted=FALSE;
        if (balance>=i) {
            balance -=i;
            operationPermitted=TRUE;
        }

        return operationPermitted;
    }
}
