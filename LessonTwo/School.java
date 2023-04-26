public final class School {
    private final String mascot;
    private static int studentCount;
    
    static {
        studentCount = 0;
        System.out.println("Initializing School...");
    }
    
    public School(String mascot) {
        this.mascot = mascot;
    }
    
    public String getMascot() {
        return mascot;
    }
    
    public void cheer() {
        System.out.println("Go " + mascot + "!");
    }
    
    public static void incrementStudentCount() {
        studentCount++;
    }
    
    public static int getStudentCount() {
        return studentCount;
    }
}
