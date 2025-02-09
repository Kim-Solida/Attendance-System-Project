
public class Schedule {

    private String scheduleId;
    private String classId;
    private String day;
    private String time;

    public Schedule(String scheduleId, String classId, String day, String time) {
        this.scheduleId = scheduleId;
        this.classId = classId;
        this.day = day;
        this.time = time;
    }

    // Getters and Setters
    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
