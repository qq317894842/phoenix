package com.supernode;

import com.PhoenixApplication;
import com.entity.BaggageLineData;
import com.entity.Bpms;
import com.entity.QueryParam;
import com.service.ReportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: HuangRui
 * @Date: 2021/4/1 17:27
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {PhoenixApplication.class})
public class SpringTest {

    @Autowired
    private ReportService reportService;

    @Test
    public void  test(){
        QueryParam queryParam = new QueryParam();
        ZonedDateTime zonedDateTime = LocalDate.now().plusDays(-10).atStartOfDay(ZoneId.systemDefault());
        Date begin = Date.from(zonedDateTime.toInstant());
        zonedDateTime = LocalDate.now().plusDays(2).atStartOfDay(ZoneId.systemDefault());
        Date end = Date.from(zonedDateTime.toInstant());
        queryParam.setBeginTime(begin);
        queryParam.setEndTime(end);
        List<BaggageLineData> list = reportService.countByCompany(queryParam);
        System.out.println(list.size());
    }

    @Test
    public void  test1(){
        Bpms bpms = new Bpms();
        bpms.setId(UUID.randomUUID().toString());
        bpms.setDepartTerminal("ABC");
        bpms.setArrivedTerminal("CDB");
        bpms.setCompanyCode("FC");
        bpms.setBaggageType("normal");
        ZonedDateTime zonedDateTime = LocalDate.now().plusDays(-3).atStartOfDay(ZoneId.systemDefault());
        bpms.setFlightDate(Date.from(zonedDateTime.toInstant()));
        System.out.println(reportService.addBpms(bpms));
    }
}
