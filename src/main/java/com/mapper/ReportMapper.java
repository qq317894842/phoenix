package com.mapper;

import com.entity.BaggageLineData;
import com.entity.Bpms;
import com.entity.QueryParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReportMapper {

    public int addBpms(Bpms bpms);

    public List<BaggageLineData> countByCompany(QueryParam queryParam);

}
