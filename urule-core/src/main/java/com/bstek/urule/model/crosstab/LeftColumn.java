package com.bstek.urule.model.crosstab;

public class LeftColumn extends BundleData implements CrossColumn {
    private int columnNumber;

    public LeftColumn() {
    }

    public int getColumnNumber() {
        return this.columnNumber;
    }

    public void setColumnNumber(int var1) {
        this.columnNumber = var1;
    }

    public String getType() {
        return "left";
    }
}