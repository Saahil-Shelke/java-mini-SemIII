import java.util.*;

class patient {
    String pa_id, name_p, disease, gender, admit_status;
    int age_p;

    void new_patient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Patient id:-");
        pa_id = input.nextLine();
        System.out.print("Patient Name:-");
        name_p = input.nextLine();
        System.out.print("Patient's Age:-");
        age_p = input.nextInt();
        System.out.print("Disease Caused:-");
        disease = input.nextLine();
        System.out.print("Sex:-");
        gender = input.nextLine();
        System.out.print("Admission Status:-");
        admit_status = input.nextLine();

    }

    void patient_info() {
        System.out.println(pa_id + "\t\t" + name_p + " \t\t" + disease + "    ]\t\t" + gender + "     \t\t"
                + admit_status + "\t\t" + age_p);
    }
}

class doctor {
    String id_d, name_doc, specialist, appoint_time, doc_qual;
    int droom;

    void new_doctor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Id:-");
        id_d = input.nextLine();
        System.out.print("Name:-");
        name_doc = input.nextLine();
        System.out.print("Specilization:-");
        specialist = input.nextLine();
        System.out.print("Work Time:-");
        appoint_time = input.nextLine();
        System.out.print("Qualification:-");
        doc_qual = input.nextLine();
        System.out.print("Room No.:-");
        droom = input.nextInt();
    }

    void doctor_info() {
        System.out.println(id_d + "\t" + name_doc + "  \t" + specialist + "     \t" + appoint_time + "    \t" + doc_qual
                + "       \t" + droom);
    }
}

class nurse{
    String id_n, name_n, gender_n, department_n, shifts;
    int salary_n;

    void new_nurse(){
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        id_n = input.nextLine();
        System.out.print("name:-");
        name_n = input.nextLine();
        System.out.print("Gender:-");
        gender_n = input.nextLine();
        System.out.print("Department: ");
        department_n = input.nextLine();
        System.out.print("Shift:-");
        shifts = input.nextLine();
        System.out.print("Salary");
        salary_n = input.nextInt();

    }
    void nurse_info() {
        System.out.println(id_n + "\t" + name_n + "\t" + gender_n + "\t" + department_n + "\t" + shifts + "\t" + salary_n);
    }
}

class staff {
    String id_s, name_s, gender_s, department_s, time_s; 
    int salary_s;

    void new_staff() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        id_s = input.nextLine();
        System.out.print("name:-");
        name_s = input.nextLine();
        System.out.print("Gender:-");
        gender_s = input.nextLine();
        System.out.print("Department: ");
        department_s = input.nextLine();
        System.out.print("salary:-");
        salary_s = input.nextInt();

    }

    void staff_info() {
        System.out.println(id_s + "\t" + name_s + "\t" + gender_s + "\t" + department + "\t" + salary);
    }
}

public class Main {
    public static void main(String args[]) {
        int count1 = 0, count2 = 0, count3 = 7, count4 = 0, count5 = 0, count6 = 0, count7 = 0;
        System.out.println("\n_________________________________________________________________________________________________________________________________________________________");
        System.out.println(" \n                                   \t\t\t\t\t  SemIII Java Mini Project                                        ");
        System.out.println("___________________________________________________________________________________________________________________________________________________________");

        patient[] p = new patient[100];
        for (int i = 0; i < 100; i++)
            p[i] = new patient();
        doctor[] d = new doctor[25];
        for (int i = 0; i < 25; i++)
            d[i] = new doctor();
        staff[] s = new staff[100];
        for (int i = 0; i < 100; i++)
            s[i] = new staff();
        nurse[] n = new nurse[100];
        for (int i = 0; i < 100; i++)
            n[i] = new nurse();
        

            s[0].id_s = "101";
            s[0].name_s = "Rani";
            s[0].department = "Cleaning";
            s[0].gender_s = "Female";
            s[0].salary = 20000;
            s[1].id_s = "102";
            s[1].name_s = "Rani";
            s[1].department = "Cleaning";
            s[1].gender_s = "Female";
            s[1].salary = 20000;
            s[2].id_s = "1001";
            s[2].name_s = "Rani";
            s[2].department = "Security";
            s[2].gender_s = "Female";
            s[2].salary = 20000;
            s[3].id_s = "1002";
            s[3].name_s = "Rani";
            s[3].department = "Security";
            s[3].gender_s = "Female";
            s[3].salary = 20000;

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1, s7 = 1;
        while (status == 1) {
            System.out.println("\n                                                     MAIN MENU                                                                          ");
            System.out.println("_________________________________________________________________________________________________________________________________________");
            System.out.println("\n1.Patient   2.Doctor   3.Staff   4.Medical  5.Facilities ");
            System.out.println("_________________________________________________________________________________________________________________________________________");
            choice = input.nextInt();
            switch (choice) {
            case 1: {
                System.out.println("_____________________________________________________________________________________________________________________________________");
                System.out.println("        \n             **PATIENT SECTION**");
                System.out.println("_____________________________________________________________________________________________________________________________________");
                s1 = 1;
                while (s1 == 1) {
                    System.out.println("1. Add New Patient Entries\n2.Check Existing Patient List");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        p[count1].new_patient();
                        count1++;
                        break;
                    }
                    case 2: {
                        System.out.println(
                                "_______________________________________________________________________________________");
                        System.out.println("\n Id \t Name \t Disease \t Gender \t Admit Status \t Age");
                        System.out.println(
                                "_______________________________________________________________________________________");
                        for (j = 0; j < count1; j++) {
                            p[j].patient_info();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s1 = input.nextInt();
                }
                break;
            }
            case 2: {
                System.out.println(
                        "_______________________________________________________________________________________");
                System.out.println("        \n             **Doctor SECTION**");
                System.out.println(
                        "_______________________________________________________________________________________");
                s2 = 1;
                while (s2 == 1) {
                    System.out.println("1.Add New Entry\n2.Existing Doctors List");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        d[count2].new_doctor();
                        count2++;
                        break;
                    }
                    case 2: {
                        System.out.println(
                                "_______________________________________________________________________________________________");
                        System.out.println("\nId \t Name\t\t Specilist \t Timing \t Qualification \t Room No.");
                        System.out.println(
                                "_______________________________________________________________________________________________");
                        for (j = 0; j < count2; j++) {
                            d[j].doctor_info();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s2 = input.nextInt();
                }
                break;

            }
            case 3:
            {
                
                System.out.println("_________________________________________________________________________________________________________________________________");
                System.out.println("              \n       **STAFF SECTION**");
                System.out.println("_________________________________________________________________________________________________________________________________");

                s3 = 1;
                while (s3 == 1)
                {
                    System.out.println("1.Add New Entry\n2.Check Existing entries of the Staff"); 
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        s[count3].new_staff();
                        count3++;
                        break;
                    }
                    case 2: {
                        System.out.println("_______________________________________________________________________________________________");
                        System.out.println("\nId \t Name \t\t\t           Gender \t\t          Department       \t Salary ");
                        System.out.println(
                                "_______________________________________________________________________________________________");
                        for (j = 0; j < count3; j++) {
                            s[j].staff_info();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s3 = input.nextInt();
                }
                break;
                }
            }
        }
    }
}