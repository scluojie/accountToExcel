package com.hxcy.accounttoexcel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kevin
 * @date 2022/5/7
 * @desc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("account")
public class Account extends Model<Account> {
    @ApiModelProperty(value="主键ID")
    @TableId(value = "id",type = IdType.AUTO)
    @ExcelProperty(value = "id", index = 0)
    private Long id;
    @ExcelProperty(value = "email", index = 1)
    private String email;
    @ExcelProperty(value = "gst", index = 2)
    private Long gst;
    @ExcelProperty(value = "gmt", index = 3)
    private Long gmt;
    @ExcelProperty(value = "sol", index = 4)
    private Long sol;
    @ExcelProperty(value = "bnb", index = 5)
    private Long bnb;
    @ExcelProperty(value = "date", index = 6)
    private String date;
}
