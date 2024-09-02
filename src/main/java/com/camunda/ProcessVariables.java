package com.camunda;

import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ProcessVariables {

    public static final String VAR_NAME_BPMNSideEffect = "BPMNSideEffect";
    public static final String VAR_NAME_DMNSideEffect = "DMNSideEffect";
    public static final String VAR_NAME_SourceCodeSideEffect= "sourceCodeSideEffect";

    private String BPMNSideEffect;
    private String DMNSideEffect;
    private String sourceCodeSideEffect;

    public String getBPMNSideEffect() {
        return BPMNSideEffect;
    }

    public void setBPMNSideEffect(String BPMNSideEffect) {
        this.BPMNSideEffect = BPMNSideEffect;
    }

    public String getDMNSideEffect() {
        return DMNSideEffect;
    }

    public void setDMNSideEffect(String DMNSideEffect) {
        this.DMNSideEffect = DMNSideEffect;
    }

    public String getSourceCodeSideEffect() {
        return sourceCodeSideEffect;
    }

    public void setSourceCodeSideEffect(String sourceCodeSideEffect) {
        sourceCodeSideEffect = sourceCodeSideEffect;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(
                this,
                new MultilineRecursiveToStringStyle() {
                    public ToStringStyle withShortPrefixes() {
                        this.setUseShortClassName(true);
                        this.setUseIdentityHashCode(false);
                        return this;
                    }
                }.withShortPrefixes());
    }
}
