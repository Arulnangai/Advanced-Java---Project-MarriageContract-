package Bean;

public class Applicant extends Person{
    private int applicantId;
    private Person partner;

    public Applicant(int applicantId, String name, int age, String sex) {
        super(name,age,sex);
        this.applicantId = applicantId;

    }

    @Override
    public int getApplicantId() {
        return applicantId;
    }

    @Override
    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicantId=" + applicantId +
                ", partner=" + partner +
                '}';
    }
}

