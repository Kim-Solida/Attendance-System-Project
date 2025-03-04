public class Class {

    private String classId;
    private String className;
    private String teacherName;
    private String startTime;
    private String endTime;
    private String location;

    public Class(String classId, String className, String teacherName, String startTime, String endTime, String location) {
        this.classId = classId;
        this.className = className;
        this.teacherName = teacherName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

    // Getters and Setters
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
        Class otherClass = (Class) obj;
        return classId.equals(otherClass.classId);
    }

    // toString Method
    @Override
    public String toString() {
        return "Class ID: " + classId
                + ", Name: " + className
                + ", Teacher: " + teacherName
                + ", Start Time: " + startTime
                + ", End Time: " + endTime
                + ", Location: " + location;
    }
}
