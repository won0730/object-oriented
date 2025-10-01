import java.util.Scanner;

class Student {
    long studentId;
    String name;
    String major;
    long phone;

    public long getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public String getMajor() {
        return major;
    }
    public long getPhone() {
        return phone;
    }
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            long studentId = scanner.nextLong();
            String name = scanner.next();
            String major = scanner.next();
            long phone = scanner.nextLong();

            students[i] = new Student();
            students[i].setStudentId(studentId);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhone(phone);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        String[] order = {"첫번째", "두번째", "세번째"};

        for (int i = 0; i < 3; i++) {
            String phoneStr = "0" + Long.toString(students[i].getPhone());
            String phoneResult = phoneStr.substring(0, 3) + "-" +
                    phoneStr.substring(3, 7) + "-" +
                    phoneStr.substring(7);

            System.out.printf("%s 학생: %d %s %s %s\n",
                    order[i], students[i].getStudentId(), students[i].getName(),
                    students[i].getMajor(), phoneResult);
        }
    }
}
