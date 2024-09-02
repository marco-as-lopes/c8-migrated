package com.camunda.good.modern.c8.workers;

import com.camunda.ProcessVariables;
import com.camunda.services.HeartofGold;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Component;

@Component
public class AdjustBPMN {

    private final HeartofGold heartofGold;

    public AdjustBPMN(HeartofGold heartofGold) {
        this.heartofGold = heartofGold;
    }

    @JobWorker(type = "adjustBPMN", autoComplete = false)
    public void execute(final JobClient client, final ActivatedJob job) {
        client.newCompleteCommand(job.getKey())
                .variable(ProcessVariables.VAR_NAME_BPMNSideEffect,heartofGold.infiniteImprobabilityDrive())
                .send()
                .join();
    }
}
