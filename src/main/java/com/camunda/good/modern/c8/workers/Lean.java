package com.camunda.good.modern.c8.workers;

import com.camunda.ProcessVariables;
import com.camunda.services.HeartofGold;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.VariablesAsType;
import org.springframework.stereotype.Component;

@Component
public class Lean {

    private final HeartofGold heartofGold;

    public Lean(HeartofGold heartofGold) {
        this.heartofGold = heartofGold;
    }

    @JobWorker
    public ProcessVariables adjustBPMN_lean (@VariablesAsType ProcessVariables processVariables) {
        System.out.println(processVariables);
        ProcessVariables pVariables = new ProcessVariables();
        pVariables.setBPMNSideEffect(heartofGold.infiniteImprobabilityDrive());
        return pVariables;
    }

    @JobWorker
    public ProcessVariables adjustDMN_lean (@VariablesAsType ProcessVariables processVariables) {
        System.out.println(processVariables);
        ProcessVariables pVariables = new ProcessVariables();
        pVariables.setDMNSideEffect(heartofGold.infiniteImprobabilityDrive());
        return pVariables;
    }

    @JobWorker
    public ProcessVariables adjustSourceCode_lean (@VariablesAsType ProcessVariables processVariables) {
        System.out.println(processVariables);
        ProcessVariables pVariables = new ProcessVariables();
        pVariables.setDMNSideEffect(heartofGold.infiniteImprobabilityDrive());
        return pVariables;
    }
}
