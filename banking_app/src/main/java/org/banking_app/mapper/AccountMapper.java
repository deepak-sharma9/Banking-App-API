package org.banking_app.mapper;

import org.banking_app.dto.AccountDto;
import org.banking_app.entities.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        Account account=new Account(
                accountDto.id(),
                accountDto.accountHolderName(),
                accountDto.balance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }


}
