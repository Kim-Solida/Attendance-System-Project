import java.util.ArrayList;

// Interface for equality comparison
interface ComparableItem {
    boolean equals(Object obj);
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
    @Override
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

    // Equals method override
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Schedule otherSchedule = (Schedule) obj;
        return this.getScheduleId().equals(otherSchedule.getScheduleId());
    }

    // toString method override
    @Override
    public String toString() {
        return "Schedule ID: " + getScheduleId() + ", Class ID: " + classId + ", Day: " + day + ", Time: " + time;
    }
}
