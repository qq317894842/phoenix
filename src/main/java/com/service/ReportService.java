package com.service;

import com.entity.BaggageLineData;
import com.entity.Bpms;
import com.entity.JimuReport;
import com.entity.QueryParam;

import java.util.List;

public interface ReportService {

    public List<Object> getAllReport();

    public int addBpms(Bpms bpms);

    public List<BaggageLineData> countByCompany(QueryParam queryParam);


}
