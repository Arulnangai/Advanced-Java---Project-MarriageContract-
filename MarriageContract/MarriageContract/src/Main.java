import Bean.Applicant;
import Service.MarriageBookingSystem;
import Exception.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MarriageBookingSystem mbs = new MarriageBookingSystem();

        Applicant a1 = new Applicant(125,"Anu",25,"f");
        Applicant a2 = new Applicant(154,"Vishali",30,"f");
        Applicant a3 = new Applicant(146,"Senthil",35,"m");
        Applicant a4 = new Applicant(786,"Vino",28,"f");
        Applicant a5 = new Applicant(444,"Muthu",24,"m");
        Applicant a6 = new Applicant(896,"Baskar",30,"m");
        System.out.println(a1.getName()+"IS added to DB? "+mbs.addApplication(a1));
        System.out.println(a2.getName()+"IS added to DB? "+mbs.addApplication(a2));
        System.out.println(a3.getName()+"IS added to DB? "+mbs.addApplication(a3));
        System.out.println(a4.getName()+"IS added to DB? "+mbs.addApplication(a4));
        System.out.println(a5.getName()+"IS added to DB? "+mbs.addApplication(a5));
        System.out.println(a6.getName()+"IS added to DB? "+mbs.addApplication(a6));

        System.out.println(a3.getApplicantId()+"Is partnered ? "+mbs.assignApplicant(123,a3));
        try
        {
            ArrayList<Applicant> m = mbs.findMatch(a4);
            System.out.println(m);
        }catch (ApplicationNotFound a)
        {
            System.out.println(a);
        }


    }
}