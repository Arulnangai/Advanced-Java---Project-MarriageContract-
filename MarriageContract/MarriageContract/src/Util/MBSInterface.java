package Util;

import Bean.Applicant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Exception.*;

public interface MBSInterface {
    public boolean addApplication(Applicant a);
    public ArrayList<Applicant> findMatch(Applicant a) throws ApplicationNotFound;
    public boolean assignApplicant(int applicantId,Applicant a);
    public boolean dropPraposal(int applicantId);
    public Map<String, Integer> findApplicantSummary();
}
