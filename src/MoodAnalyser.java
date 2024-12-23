public class MoodAnalyser {
    private String message;
    public MoodAnalyser() {
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
        System.out.println(moodAnalyser1.analyseMood()); // SAD

        MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in Any Mood");
        System.out.println(moodAnalyser2.analyseMood()); // HAPPY
    }
}
