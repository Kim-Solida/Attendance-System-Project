
import java.util.ArrayList;

public class AttendanceManagement {

    private ArrayList<Attendance> attendanceRecords;

    public AttendanceManagement() {
        this.attendanceRecords = new ArrayList<>();
    }

    public void addAttendance(Attendance attendance) {
        attendanceRecords.add(attendance);
    }

    public void displayAllAttendance() {
        for (Attendance a : attendanceRecords) {
            a.displayAttendance();
            System.out.println("----------------------");
        }
    }
}
