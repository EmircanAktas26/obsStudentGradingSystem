public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course phy;
    Course chemistry;
    Course oral;
    double average, mathAverage, physAverage,chemisAverage;
    boolean isPass;


    public Student(String name, String stuNo, int classes, Course mat, Course phy, Course chemistry) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.phy = phy;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }

    public void addFindExamNote(int mat, int phy, int chemistry) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (phy >= 0 && phy <= 100) {
            this.phy.note = phy;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }
    }

    public void addFindOral(int mathOral, int phyOral, int chemistryOral) {
        if (mathOral >= 0 && mathOral <= 100) {
            this.mat.oral = mathOral;
        }
        if (phyOral >= 0 && phyOral <= 100) {
            this.phy.oral = phyOral;
        }
        if (chemistryOral >= 0 && chemistryOral <= 100) {
            this.chemistry.oral = chemistryOral;
        }
    }
    public void isPass() {
        if (this.mat.note == 0 || this.phy.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notes not fully entered");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average :" + this.average);
            if (this.average >= 50) {
                System.out.println("Passed Class. ");
            } else {
                System.out.println("Class Lost. ");
            }
        }
    }

    public void calcAverage() {
        this.mathAverage = (this.mat.note * 0.8) + (this.mat.oral * 0.2);
        this.physAverage = (this.phy.note * 0.8) + (this.phy.oral * 0.2);
        this.chemisAverage = (this.chemistry.note * 0.8) + (this.chemistry.oral * 0.2);
        this.average = (this.mathAverage + this.physAverage + this.chemisAverage) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average >= 50;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Note : " + this.mat.note);
        System.out.println("Physics Note : " + this.phy.note);
        System.out.println("Chemistry Note : " + this.chemistry.note);
    }
}
