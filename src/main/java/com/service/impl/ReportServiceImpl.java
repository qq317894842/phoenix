package com.service.impl;

import com.entity.BaggageLineData;
import com.entity.Bpms;
import com.entity.QueryParam;
import com.mapper.ReportMapper;
import com.service.ReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: HuangRui
 * @Date: 2021/2/25 15:16
 * @Description:
 */
@Service
public class ReportServiceImpl implements ReportService {

    @Resource
    private ReportMapper mapper;

    @Override
    public List<Object> getAllReport() {
        return mapper.selectAll();
    }

    @Override
    public int addBpms(Bpms bpms) {
        return mapper.addBpms(bpms);
    }

    @Override
    public List<BaggageLineData> countByCompany(QueryParam queryParam) {
        return mapper.countByCompany(queryParam);
    }


}
