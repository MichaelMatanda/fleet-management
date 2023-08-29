package com.fleet_management_System.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date invoiceDate;
    private InvoiceStatus invoiceStatus;
    @ManyToOne
    @JoinColumn(name="invoicestatusid", insertable=false, updatable=false)
    private Integer invoicestatusid;
    @ManyToOne
    @JoinColumn(name="clientid", insertable=false, updatable=false)
    private Client client;
    private Integer clientid;
    private String remarks;
}
