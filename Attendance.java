
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

    //isEqual Method
    public boolean isEqual(Attendance otherAttendance) {
        return this.attendanceId.equals(otherAttendance.attendanceId)
                && this.studentId.equals(otherAttendance.studentId)
                && this.classDate.equals(otherAttendance.classDate);
    }

    //toString Method
    @Override
    public String toString() {
        return "Attendance ID: " + attendanceId
                + ", Student ID: " + studentId
                + ", Date: " + classDate
                + ", Status: " + status;
    }

    void displayAttendance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
