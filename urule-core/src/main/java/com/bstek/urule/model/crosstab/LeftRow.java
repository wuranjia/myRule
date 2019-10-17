package com.bstek.urule.model.crosstab;

public class LeftRow implements CrossRow {
    private int rowNumber;

    public LeftRow() {
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String getType() {
        return "left";
    }
}
