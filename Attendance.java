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

    // Equals Method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attendance other = (Attendance) obj;
        return attendanceId.equals(other.attendanceId);
    }

    // toString Method
    @Override
    public String toString() {
        return "Attendance ID: " + attendanceId
                + ", Student ID: " + studentId
                + ", Class Date: " + classDate
                + ", Status: " + status;
    }
}
