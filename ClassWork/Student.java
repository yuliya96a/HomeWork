import com.company.Exam;

public class Student {

    protected String subject;
    protected int mark;
    protected Exam[] examArray;
    protected int number;

    public Student() {
        this.examArray = new Exam[10];
        this.number = 0;
    }

    public String getSubject() {
        return subject;

    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getMark() {
        return mark;

    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    public void addExam(Exam exam) {
        this.examArray[this.number] = exam;
        this.number++;
    }
    public String toString() {
        String result = this.subject + " " + this.mark + " mark" + "\n--------\n";
        for(int i = 0; i < this.number; i++) {
            result += this.examArray[i].toString();
        }

        return result;
    }
}
