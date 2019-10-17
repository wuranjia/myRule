package com.bstek.urule.model.crosstab;

public class TopRow extends BundleData implements CrossRow {
    private int rowNumber;

    public TopRow() {
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String getType() {
        return "top";
    }
}