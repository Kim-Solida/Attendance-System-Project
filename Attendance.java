public class Attendance {
    
    private String attendanceId;
    private String studentId;
    private String classDate;
    private String status; 

    public Attendance(String attendanceId, String studentId, String classDate, String status) 
    {
        this.attendanceId = attendanceId;
        this.studentId = studentId;
        this.classDate = classDate;
        this.status = status;
    }
}
