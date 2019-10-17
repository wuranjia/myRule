package com.bstek.urule.model.crosstab;

import com.bstek.urule.model.rule.Value;

public class ValueCrossCell extends CrossCell {
    private Value value;

    public ValueCrossCell() {
    }

    public String getType() {
        return "value";
    }

    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
