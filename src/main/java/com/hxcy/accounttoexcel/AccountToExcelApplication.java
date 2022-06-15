package com.hxcy.accounttoexcel;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@SpringBootApplication
public class AccountToExcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountToExcelApplication.class, args);
    }

}
