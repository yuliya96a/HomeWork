public class Main {
    public static void main(String[] args) {
        Lesson lessons1 = new Lesson();
		
        lessons1.setCourse("2");
        lessons1.setGroup("Economic Cybernetics");
        lessons1.setTeacher("Fedorov N.");
        lessons1.setAudience(407);
        lessons1.setTime(9.20);

        System.out.println(lessons1.read());
    }
}
