package learn.data;

public class Company {
    private String companyName;

    public String geCompanyName() {
        return companyName;
    }

    public void setCompanyName(String name) {
        this.companyName = name;
        System.out.println("Successfully update company Name");
    }

    /**
     * InnerCompany
     */
    public class InnerEmplooye {
        private String nameEmplooye;
        private int age;

        public void setEmplooye(String name, int age) {
            this.nameEmplooye = name;
            this.age = age;
            System.out.println("Successfully update age");
        }

        public String getEmplooye() {
            return "Company : " + Company.this.companyName + ", Name emplooye : " + this.nameEmplooye + ", age : "
                    + this.age;
        }
    }
}
