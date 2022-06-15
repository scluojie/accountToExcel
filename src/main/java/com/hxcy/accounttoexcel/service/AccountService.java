package com.hxcy.accounttoexcel.service;

import com.hxcy.accounttoexcel.entity.Account;

import java.util.List;

/**
 * @author kevin
 * @date 2022/5/7
 * @desc
 */
public interface AccountService {
    List<Account> getAccounts(String date);
}
