package com.bstek.urule.parse.crosstab;

import com.bstek.urule.model.crosstab.CrossRow;
import com.bstek.urule.model.crosstab.LeftRow;
import com.bstek.urule.model.crosstab.TopRow;
import com.bstek.urule.model.library.Datatype;
import com.bstek.urule.parse.Parser;
import org.apache.commons.lang.StringUtils;
import org.dom4j.Element;

public class CrossRowParser implements Parser<CrossRow> {
    public CrossRowParser() {
    }

    public CrossRow parse(Element var1) {
        String var2 = var1.attributeValue("type");
        if (var2.equals("left")) {
            LeftRow var5 = new LeftRow();
            var5.setRowNumber(Integer.valueOf(var1.attributeValue("number")).intValue());
            return var5;
        } else {
            TopRow var3 = new TopRow();
            var3.setRowNumber(Integer.valueOf(var1.attributeValue("number")).intValue());
            String var4 = var1.attributeValue("bundle-data-type");
            if (StringUtils.isNotBlank(var4)) {
                var3.setBundleDataType(var4);
                var3.setVariableCategory(var1.attributeValue("var-category"));
                var3.setVariableName(var1.attributeValue("var"));
                var3.setVariableLabel(var1.attributeValue("var-label"));
                var3.setDatatype(Datatype.valueOf(var1.attributeValue("datatype")));
            }

            return var3;
        }
    }

    public boolean support(String var1) {
        return "row".equals(var1);
    }
}
