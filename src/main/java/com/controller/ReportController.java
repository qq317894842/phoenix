package com.controller;

import com.constant.ResultCode;
import com.entity.BaggageLineData;
import com.entity.QueryParam;
import com.entity.ResultPojo;
import com.service.ReportService;
import com.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: HuangRui
 * @Date: 2021/4/12 16:29
 * @Description:
 */
@RequestMapping("/poc/report")
@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;

    @RequestMapping("/countByCompany")
    public ResultPojo countByCompany(@RequestBody QueryParam param){
        List<BaggageLineData> dataList = reportService.countByCompany(param);
        return  ResultUtil.mix(ResultCode.SUCCESS, dataList);
    }
}
