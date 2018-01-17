package com.ssm.po;

import java.util.Date;

public class GoodType {
    private String typeId;

    private String typeName;

    private String typeMess;

    private Date typeTime;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeMess() {
        return typeMess;
    }

    public void setTypeMess(String typeMess) {
        this.typeMess = typeMess == null ? null : typeMess.trim();
    }

    public Date getTypeTime() {
        return typeTime;
    }

    public void setTypeTime(Date typeTime) {
        this.typeTime = typeTime;
    }
}