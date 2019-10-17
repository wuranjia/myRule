package com.bstek.urule.builder.table;

import com.bstek.urule.model.crosstab.CrossCell;
import com.bstek.urule.model.crosstab.ValueCrossCell;
import com.bstek.urule.model.library.Datatype;

import java.util.ArrayList;
import java.util.List;

class CellRange {
    private int a;
    private int b;
    private boolean c;
    private String d;
    private String e;
    private String f;
    private Datatype g;
    private CellRange h;
    private CrossCell i;
    private List<CellRange> j = new ArrayList();

    CellRange() {
    }

    public int getStart() {
        return this.a;
    }

    public void setStart(int var1) {
        this.a = var1;
    }

    public int getEnd() {
        return this.b;
    }

    public void setEnd(int var1) {
        this.b = var1;
    }

    public String getVariableCategory() {
        return this.d;
    }

    public void setVariableCategory(String var1) {
        this.d = var1;
    }

    public String getVariableName() {
        return this.e;
    }

    public void setVariableName(String var1) {
        this.e = var1;
    }

    public String getVariableLabel() {
        return this.f;
    }

    public void setVariableLabel(String var1) {
        this.f = var1;
    }

    public Datatype getDatatype() {
        return this.g;
    }

    public void setDatatype(Datatype var1) {
        this.g = var1;
    }

    public boolean isValueCell() {
        return this.c;
    }

    public void setValueCell(boolean var1) {
        this.c = var1;
    }

    public CellRange getParentRange() {
        return this.h;
    }

    public void setParentRange(CellRange var1) {
        this.h = var1;
    }

    public CrossCell getCell() {
        return this.i;
    }

    public void setCell(CrossCell var1) {
        if (var1 instanceof ValueCrossCell) {
            this.setValueCell(true);
        }

        this.i = var1;
    }

    public List<CellRange> getChildren() {
        return this.j;
    }

    public void addChildRange(CellRange var1) {
        var1.setParentRange(this);
        this.j.add(var1);
    }
}