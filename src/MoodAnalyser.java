public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        System.out.println(moodAnalyser.analyseMood("I am in Sad Mood")); // SAD
        System.out.println(moodAnalyser.analyseMood("I am in Any Mood")); // HAPPY
    }
}