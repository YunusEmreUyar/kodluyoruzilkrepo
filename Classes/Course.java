public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int quiz;
    double quizMultiplier;

    // Added quiz, quizMultiplier vars and calculateNote func.

    public Course(String name, String code, String prefix, double quizMultiplier) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quiz = 0;
        this.quizMultiplier = quizMultiplier;
    }

    public void calculateNote() {
        this.note = (int)(this.note*(1-this.quizMultiplier) + this.quiz*this.quizMultiplier);
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}