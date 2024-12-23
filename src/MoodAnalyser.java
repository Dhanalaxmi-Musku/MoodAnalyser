public class MoodAnalyser {
    private String message;

    // Default Constructor
    public MoodAnalyser() {
    }

    // Parameterized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message == null) {
                throw new MoodAnalysisException(MoodAnalysisException.ErrorType.NULL, "Mood cannot be null");
            }
            if (message.isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisException.ErrorType.EMPTY, "Mood cannot be empty");
            }
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (Exception e) {
            throw new MoodAnalysisException(MoodAnalysisException.ErrorType.NULL, "Unexpected error occurred");
        }
    }

    public static void main(String[] args) {
        try {
            MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
            System.out.println(moodAnalyser1.analyseMood()); // SAD

            MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in Any Mood");
            System.out.println(moodAnalyser2.analyseMood()); // HAPPY

            MoodAnalyser moodAnalyser3 = new MoodAnalyser(null);
            System.out.println(moodAnalyser3.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getMessage() + " - Type: " + e.getErrorType());
        }

        try {
            MoodAnalyser moodAnalyser4 = new MoodAnalyser("");
            System.out.println(moodAnalyser4.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getMessage() + " - Type: " + e.getErrorType());
        }
    }
}
