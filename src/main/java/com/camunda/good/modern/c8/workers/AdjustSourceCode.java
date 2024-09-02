package com.camunda.good.modern.c8.workers;

import com.camunda.ProcessVariables;
import com.camunda.services.HeartofGold;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AdjustSourceCode {

    private final HeartofGold heartofGold;

    public AdjustSourceCode(HeartofGold heartofGold) {
        this.heartofGold = heartofGold;
    }

    @JobWorker
    public Map<String, Object> adjustSourceCode(final ActivatedJob job) {
        Map<String, Object> variables = job.getVariablesAsMap();
        variables.put(ProcessVariables.VAR_NAME_SourceCodeSideEffect,heartofGold.infiniteImprobabilityDrive());

        return variables;
    }
}
