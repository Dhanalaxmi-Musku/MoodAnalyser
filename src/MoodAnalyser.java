public class MoodAnalyser {
    private String message;

    // Default Constructor
    public MoodAnalyser() {
    }

    // Parameterized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message == null || message.isEmpty()) {
                return "HAPPY";
            }
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (Exception e) {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
        System.out.println(moodAnalyser1.analyseMood()); // SAD

        MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in Any Mood");
        System.out.println(moodAnalyser2.analyseMood()); // HAPPY

        MoodAnalyser moodAnalyser3 = new MoodAnalyser(null);
        System.out.println(moodAnalyser3.analyseMood()); // HAPPY
    }
}
