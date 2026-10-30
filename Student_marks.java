class Student_marks{
    public static void main(String[] args) {

        int hindi = 80;
        int english = 75;
        int maths = 90;
        int computer = 85;
        int science = 70;

        int total = hindi + english + maths + computer + science;

        double percentage = total / 5.0;

        System.out.println("Hindi: " + hindi);
        System.out.println("English: " + english);
        System.out.println("Maths: " + maths);
        System.out.println("Computer: " + computer);
        System.out.println("Science: " + science);

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

    }
}