package com.cheng.application.basic.vo;

import java.io.Serializable;

/**
 * 字段
 * Created by cheshun on 17/8/27.
 */
public class Field implements Serializable {

    /**
     * 字段名
     */
    private String name;

    /**
     * 别名
     */
    private String alias;

    private Field(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }

    public static Field of(String name) {
        return new Field(name, "");
    }

    public static Field of(String name, String alias) {
        return new Field(name, alias);
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Field field = (Field) o;

        if (name != null ? !name.equals(field.name) : field.name != null) return false;
        return alias != null ? alias.equals(field.alias) : field.alias == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        return result;
    }
}
