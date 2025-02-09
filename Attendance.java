
public class Attendance {

    private String attendanceId;
    private String studentId;
    private String classDate;
    private String status;

    public Attendance(String attendanceId, String studentId, String classDate, String status) {
        this.attendanceId = attendanceId;
        this.studentId = studentId;
        this.classDate = classDate;
        this.status = status;
    }

    // Getters and Setters
    public String getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(String attendanceId) {
        this.attendanceId = attendanceId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassDate() {
        return classDate;
    }

    public void setClassDate(String classDate) {
        this.classDate = classDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
