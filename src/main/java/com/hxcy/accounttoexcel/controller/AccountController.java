package com.hxcy.accounttoexcel.controller;

import com.alibaba.excel.EasyExcel;
import com.hxcy.accounttoexcel.entity.Account;
import com.hxcy.accounttoexcel.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author kevin
 * @date 2022/5/7
 * @desc
 */
@RestController
@RequestMapping("/api")
@Api(value = "Account查询接口")
public class AccountController {

    @Autowired
    AccountService accountService;

    @ApiOperation(notes = "导航页",value = "index")
    @GetMapping("/index")
    public ModelAndView index(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @ApiOperation("获取对应日期Accounts")
    @ApiImplicitParam(name="date",value="日期",required=true,paramType="string")
    @RequestMapping("/getAccounts")
    public void getAccounts(@RequestParam(value ="date") String date, HttpServletResponse response) throws IOException {
        List<Account> accountList = accountService.getAccounts(date);
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码
        String fileName = URLEncoder.encode("account_" + date, "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(),Account.class).sheet("data").doWrite(accountList);
    }
}
