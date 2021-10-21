package edu.parinya.softarchdesign.structural;

import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private Set<HealthcareServiceable> members = new LinkedHashSet<HealthcareServiceable>();

    public void addMember(HealthcareServiceable newMember){
        members.add(newMember);
    }

    public void removeMember(HealthcareServiceable removeMember){
        members.remove(removeMember);
    }

    public void service(){
        for (HealthcareServiceable i:members
             ) {
            i.service();
        }
    }

    public double getPrice(){
        double op = 0;
        for (HealthcareServiceable i:members
             ) {
            op += i.getPrice();
        }
        return op;
    }

}
