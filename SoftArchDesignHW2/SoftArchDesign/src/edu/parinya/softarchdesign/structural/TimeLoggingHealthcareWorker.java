package edu.parinya.softarchdesign.structural;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {
    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.println("Decorate " + super.getName() + " with TimeLogging.");
    }

    public void service(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        String timeStamp = dateFormat.format(date);
        System.out.print(timeStamp + " : ");
        super.service();
//        : Nicholas Gonzalez performs a surgery.
    }
}
