package com.entity;

import lombok.Data;

@Data
public class Bpms {

  private String id;
  private String messageId;
  private String companyCode;
  private String flightNo;
  private String departTerminal;
  private String arrivedTerminal;
  private String baggageNo;
  private String baggageType;
  private String baggageStatus;
  private java.util.Date flightDate;
  private java.sql.Time createTime;

}
