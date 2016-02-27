public class Lesson {
	
	protected int course;
	protected String group;
	protected String teacher;
	protected int audience;
	protected float time;


  public void setCourse(String course) {
    this.course = course;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public void setTeacher(String teacher) {
    this.teacher = teacher;
  }

  public void setAudience (int audience) {
    this.audience = audience;
  }

  public void setTime (float time) {
    this.time = time;
  }

   public String read() {
      String result = "About Lesson "\nCourse: " + this.course + "\nGroup: " + this.group + "\nTeacher: " + this.teacher + "\nAudience: " + this.audience + "\nTime: " + this.time;
      return result;
   }
}
