public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;

    public Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.sozlu=0;
    }

    public void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix))
        {
            this.courseTeacher=teacher;
            System.out.println(teacher.name + " Ataması Başarılı Bir Şekilde yapıldı ve Bu dersi Verecektir....");
        }
        else
            System.out.println(teacher.name + "Bu Dersi Vermeye Yetkisi Yoktur.");
    }


    public void PrintTeacherInfo(){
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
