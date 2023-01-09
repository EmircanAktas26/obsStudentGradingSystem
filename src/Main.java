/*
*@Author Emircan Aktas - 10.January.2023
 */
public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Maths", "MATH101","MAT");
        Course phy = new Course("Physics", "PHYSC101","PHY");
        Course chemis = new Course("Chemistry", "CHMST","CHM");

        Teacher t1 = new Teacher("Mahmut Teacher","90500000","MAT");
        Teacher t2 = new Teacher("Fatma Teacher", "90550000","PHY");
        Teacher t3 = new Teacher("Ali Veli","90555000","CHM");

        mat.addTeacher(t1);
        phy.addTeacher(t2);
        chemis.addTeacher(t3);

        Student s1 = new Student("Inek Saban","4",140144015,mat,phy,chemis);
        s1.addFindExamNote(50,20,30);
        s1.addFindOral(70,50,80);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi","4",221133,mat,phy,chemis);
        s2.addFindExamNote(100,50,40);
        s2.addFindOral(50,70,50);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail","4",221121312,mat,phy,chemis);
        s3.addFindExamNote(50,20,40);
        s3.addFindOral(80,50,70);
        s3.isPass();

    }
}