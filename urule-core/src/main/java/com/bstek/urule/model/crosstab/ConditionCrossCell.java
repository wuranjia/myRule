package com.bstek.urule.model.crosstab;

import com.bstek.urule.model.table.Joint;

public class ConditionCrossCell extends CrossCell {
    private Joint joint;

    public ConditionCrossCell() {
    }

    public String getType() {
        return "condition";
    }

    public Joint getJoint() {
        return this.joint;
    }

    public void setJoint(Joint joint) {
        this.joint = joint;
    }
}
