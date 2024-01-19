package College;

import java.util.LinkedList;
import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Student studobj=new Student();
        Section sectionObj=new Section();
        Branch branchobj=new Branch();

        LinkedList<Branch> branchobj1=new LinkedList<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("enter no of students ");
        int size=sc.nextInt();
        for (int i=0;i<size;i++){
            System.out.println("enter student "+ (i+1) + "details ");
        }


        /*for (int i=0;i<size;i++){
            System.out.println("enter student details::");
            System.out.println("enter student name :");
            studobj.studentName=sc.next();
            System.out.println("enter student rollno ");
            studobj.rollNo=sc.next();
            System.out.println("enter student section ");
            sectionObj.section=sc.next();
            System.out.println("enter student branch ");
            branchobj.branchname=sc.next();
        }
         */
        branchobj1.add(0,branchobj);

        for ( int i=0;i<size;i++){
            System.out.println("student name is :: "+studobj.getStudentName());
            System.out.println("section is ::"+sectionObj.getSection());
            System.out.println("bramnch name is ::"+branchobj.getBranchname());
            System.out.println("roll no is :: "+studobj.getRollNo());
        }

    }
}
