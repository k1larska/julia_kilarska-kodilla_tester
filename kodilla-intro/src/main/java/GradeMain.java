public class GradeMain {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(2);
        grades.add(4);
        grades.add(4);
        int last = grades.getLast();
        System.out.println(last);
        double average = grades.getAverage();
        System.out.println(average);
    }
}
