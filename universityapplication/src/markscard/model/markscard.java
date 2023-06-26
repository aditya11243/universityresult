package markscard.model;

import java.util.Scanner;

public class markscard {
    @Autowired
    public String totalmarks;

    public String getTotalmarks() {
        return totalmarks;
    }

    public void setTotalmarks(String totalmarks) {
        this.totalmarks = totalmarks;
    }
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Id
    public String enrollmentno;

    public String getEnrollmentno() {
        return enrollmentno;
    }

    public void setEnrollmentno(String enrollmentno) {
        this.enrollmentno = enrollmentno;
    }

    public static void main(String[] args){
        System.out.println("Enter the name and enrollment number");
        Scanner name=new Scanner(System.in);
        Scanner enrollmentno=new Scanner(System.in);


    }
}
