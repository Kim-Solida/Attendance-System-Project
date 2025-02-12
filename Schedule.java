import java.util.ArrayList;

// Interface with isEqual method
interface ComparableItem {
    boolean isEqual(Object obj);
}

// Superclass for common fields (abstract class)
abstract class Course {
    private String scheduleId;

    // Constructor
    public Course(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    // Getter for scheduleId
    public String getScheduleId() {
        return scheduleId;
    }

    // Setter for scheduleId
    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    // Abstract method to be implemented in subclasses
    public abstract String toString();
}

// Subclass Schedule extending Course and implementing ComparableItem interface
public class Schedule extends Course implements ComparableItem {
    private String classId;
    private String day;
    private String time;

    // Constructor
    public Schedule(String scheduleId, String classId, String day, String time) {
        super(scheduleId); // Call the constructor of the superclass (Course)
        this.classId = classId;
        this.day = day;
        this.time = time;
    }

    // isEqual method from ComparableCourse interface
    @Override
    public boolean isEqual(Object obj) {
        if (obj instanceof Schedule) {
            Schedule otherSchedule = (Schedule) obj;
            return this.getScheduleId().equals(otherSchedule.getScheduleId()); // Compare by scheduleId
        }
        return false;
    }

    // toString method from Course class
    @Override
    public String toString() {
        return "Schedule ID: " + getScheduleId() + ", Class ID: " + classId + ", Day: " + day + ", Time: " + time;
    }

    
}
