public class StudentRecordTestHardness {
    public static void main (String [] args) {

        // First register
    StudentRecord sr1 = new StudentRecord("Philip Smith", 12345);
    System.out.println(sr1.getFullName());
    sr1.setFullName("Philip Smythe");
    System.out.println(sr1.getFullName());

    System.out.println("")

    System.out.println(sr1.getStudentNumber());
    sr1.setStudentNumber(12345);
    System.out.println(sr1.getStudentNumber());

        // Second register
    StudentRecord sr2 = new StudentRecord();

    System.out.println(sr2.getFullName());
    sr2.setFullName("Joe");
    System.out.println(sr2.getFullName());

    System.out.println("")

    System.out.println(sr2.getStudentNumber());
    sr2.setStudentNumber(23456);
    System.out.println(sr2.getStudentNumber());

}

}
