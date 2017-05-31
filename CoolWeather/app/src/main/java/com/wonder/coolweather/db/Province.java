package com.wonder.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wonder on 17/5/29.
 */

public class Province extends DataSupport {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getPriovinceCode() {
        return priovinceCode;
    }

    public void setPriovinceCode(int priovinceCode) {
        this.priovinceCode = priovinceCode;
    }

    private int id;
    private String provinceName;
    private int priovinceCode;

}
