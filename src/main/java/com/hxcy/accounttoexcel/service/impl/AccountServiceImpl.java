package com.hxcy.accounttoexcel.service.impl;

import com.hxcy.accounttoexcel.entity.Account;
import com.hxcy.accounttoexcel.mapper.AccountMapper;
import com.hxcy.accounttoexcel.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;




/**
 * @author kevin
 * @date 2022/5/7
 * @desc
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> getAccounts(String date) {
        return accountMapper.selectAccounts(date);
    }
}
