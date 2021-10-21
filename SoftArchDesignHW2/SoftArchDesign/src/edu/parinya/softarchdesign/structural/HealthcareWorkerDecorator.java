package edu.parinya.softarchdesign.structural;

public class HealthcareWorkerDecorator extends HealthcareWorker{

    protected HealthcareWorker worker ;

    public HealthcareWorkerDecorator(HealthcareWorker newWorker) {
        super(newWorker);
        worker = newWorker;
    }

    public void service(){
        worker.service();
    }

}
