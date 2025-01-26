public class Schedule {
    
    private String scheduleId;
    private String classId;
    private String day;
    private String time;

    public Schedule(String scheduleId, String classId, String day, String time) 
    {
        this.scheduleId = scheduleId;
        this.classId = classId;
        this.day = day;
        this.time = time;
    }
}
