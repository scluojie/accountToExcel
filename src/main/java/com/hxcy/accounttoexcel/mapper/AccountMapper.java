package com.hxcy.accounttoexcel.mapper;

import com.hxcy.accounttoexcel.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author kevin
 * @date 2022/5/7
 * @desc
 */
@Mapper
public interface AccountMapper {

    @Select("select id,email,gst,gmt," +
            "sol,bnb,date " +
            "from account where date=#{date}")
    public List<Account> selectAccounts(String date);
}
