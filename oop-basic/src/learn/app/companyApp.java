package learn.app;

import learn.data.Company;

public class companyApp {
    public static void main(String[] args) {
        var company = new Company();
        company.setCompanyName("Knixxtzy");

        var companyEmplooye = company.new InnerEmplooye();
        companyEmplooye.setEmplooye("Misbahul Muttaqin", 19);

        // get
        System.out.println(company.geCompanyName());
        System.out.println(companyEmplooye.getEmplooye());
    }
}
