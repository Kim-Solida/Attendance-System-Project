public class Class {
    
    private String classId;
    private String className;
    private String teacherName;
    private String startTime;
    private String endTime;
    private String location;

    public Class(String classId, String className, String teacherName, String startTime, String endTime, String location) 
    {
        this.classId = classId;
        this.className = className;
        this.teacherName = teacherName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }
}
