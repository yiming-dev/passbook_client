package com.passbook.passbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * <h1>商户对象模型</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "merchants")
public class Merchants {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Basic
    @Column(name = "logo_url",nullable = false)
    private String logoUrl;

    @Basic
    @Column(name = "business_licenses_url",nullable = false)
    private String businessLicensesUrl;

    @Basic
    @Column(name = "phone",nullable = false)
    private String phone;

    @Basic
    @Column(name = "address",nullable = false)
    private String address;

    @Basic
    @Column(name = "is_audit",nullable = false)
    private Boolean isAudit = false;

}
