package com.company.uilab.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

@NamePattern("%s|label")
@MetaClass(name = "uilab_NewEntity")
public class NewEntity extends BaseUuidEntity {
    private static final long serialVersionUID = 3933274235624813437L;

    @MetaProperty
    protected String label;

    @MetaProperty
    protected Integer serie1;

    @MetaProperty
    protected Integer serie2;

    @MetaProperty
    protected Integer serie3;

    public Integer getSerie3() {
        return serie3;
    }

    public void setSerie3(Integer serie3) {
        this.serie3 = serie3;
    }

    public Integer getSerie2() {
        return serie2;
    }

    public void setSerie2(Integer serie2) {
        this.serie2 = serie2;
    }

    public Integer getSerie1() {
        return serie1;
    }

    public void setSerie1(Integer serie1) {
        this.serie1 = serie1;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}