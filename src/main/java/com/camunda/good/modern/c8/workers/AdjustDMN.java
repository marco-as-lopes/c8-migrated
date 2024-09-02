package com.camunda.good.modern.c8.workers;

import com.camunda.ProcessVariables;
import com.camunda.services.HeartofGold;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AdjustDMN {

    private final HeartofGold heartofGold;

    public AdjustDMN(HeartofGold heartofGold) {
        this.heartofGold = heartofGold;
    }

    @JobWorker(type = "adjustDMN")
    public Map<String, Object> execute(final ActivatedJob job) {

        Map<String, Object> variables = job.getVariablesAsMap();
        variables.put(ProcessVariables.VAR_NAME_DMNSideEffect,heartofGold.infiniteImprobabilityDrive());

        return variables;
    }
}
