package Service;

import Bean.Applicant;
import Util.MBSInterface;
import Exception.*;

import java.util.*;

public class MarriageBookingSystem implements MBSInterface {

    private ArrayList<Applicant> applicantList = new ArrayList<>();

    @Override
    public boolean addApplication(Applicant a) {

        applicantList.add(a);
            return true;
    }

    @Override
    public ArrayList<Applicant> findMatch(Applicant a) throws ApplicationNotFound {
        ArrayList<Applicant> matchList = new ArrayList<>();
        for(Applicant k : applicantList) {
            if(k.getPartner() == null)
            if (!(k.getSex().equalsIgnoreCase(a.getSex())) && (k.getAge() >= a.getAge())) {
                matchList.add(k);
            }
        }
        if(matchList != null)
            return matchList;

        throw new ApplicationNotFound();
    }

    @Override
    public boolean assignApplicant(int applicantId, Applicant a) {
        for(Applicant k : applicantList)
            if(k.getApplicantId() == applicantId)
            {
                k.setPartner(a);
                return true;
            }
        return false;
    }

    @Override
    public boolean dropPraposal(int applicantId) {
        for (Applicant k : applicantList)
            if(k.getApplicantId() == applicantId)
            {
                k.setPartner(null);
                return true;
            }
        return false;
    }

    @Override
    public Map<String, Integer> findApplicantSummary() {
        int f=0;
        int m=0;
        for(Applicant k : applicantList)
        {
            if(k.getPartner() == null)
            {
                if(k.getSex().equalsIgnoreCase("male"))
                    m++;
                else
                    f++;
            }
        }
        TreeMap<String, Integer> appSum = new TreeMap<>();
        appSum.put("Female",f);
        appSum.put("Male",m);

        return appSum;
    }


}
