class Student {
    String name;
    int rollNo;
    int marks;

    Student(String n, int r, int m) {
        name = n;
        rollNo = r;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Anu", 1, 95);
        Student s2 = new Student("Ravi", 2, 70);

        s1.display();
        s2.display();
    }
}

