/** Representing Complex Types with Classes                        **/
/** Reference Java Fundamentals: The Java Language by Jim Wilson   **/
/** Classes are Reference Type                                     **/

 public class Course {
     // these are fields of the class
    int students;
    int seats;

    // this is constructor of the class
    public  Course() {
        seats = 25;
        students = 0;
    }

    // these are methods of the class
    public void add1Student() {
        if (students < seats)
            students +=1;
        else
            handleTooMany();
    }

    public void add10Student() {
        if (students < seats)
            students +=10;
        else
            handleTooMany();
    }
    private void handleTooMany() {
        System.out.println("Too Many students for this course");

    }

    boolean hasRoom(Course c2) {
        // this.students is for from current class students
        int total = this.students + c2.students;
        return total <= seats;
    }

    public Course createNewWithBoth(Course c2) {
        Course newCourse = new Course();
        newCourse.seats = seats;
        newCourse.students = students + c2.students;
        return  newCourse;
    }

    public static void main(String[] args) throws Exception {

        Course course1 = new Course();

        course1.add1Student();
        System.out.println("Number of students in the course = " + course1.students);
        course1.add1Student();
        System.out.println("Number of students in the course = " + course1.students);
        course1.add1Student();
        System.out.println("Number of students in the course = " + course1.students);


        Course cs1 = new Course();
        Course cs2 = new Course();
        // add students to both courses
        cs1.add10Student();
        cs2.add1Student();
        cs2.add1Student();

        Course cs3 = null;
        if (cs1.hasRoom(cs2))
            cs3 = cs1.createNewWithBoth(cs2);


        System.out.println("cs1 has students = " + cs1.students);
        System.out.println("cs2 has students = " + cs2.students);

        if(cs3 != null)
            System.out.println("cs3 has students = " + cs3.students);

    }


 }

