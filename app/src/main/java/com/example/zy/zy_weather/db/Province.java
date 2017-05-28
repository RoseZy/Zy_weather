package com.example.zy.zy_weather.db;


import org.litepal.crud.DataSupport;

/**
 * Created by zy on 17-5-28.
 */

public class Province extends DataSupport {
    //记录省名
    private String provinceName;
    //记录省代号
    private int provinceCode;
    private int id;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }



}
