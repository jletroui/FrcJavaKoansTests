package frc;

public class RobotAutoScore {
    private int notesInSpeaker = 0;
    private int notesInAmp = 0;

    public String toString() {
        if (System.getProperty("locale").equals("fr")) {
            return String.format("ScoreRobot: notes dans le haut parleur = %s; notes dans le amp = %s", notesInSpeaker, notesInAmp);
        }
        return String.format("RobotScore: notes in speaker = %s; notes in amp = %s", notesInSpeaker, notesInAmp);
    }

    public void noteScoredInSpeaker() {
        notesInSpeaker++;
    }

    public void noteScoredInAmp() {
        notesInAmp++;
    }

    public int totalScore() {
        return notesInSpeaker*5 + notesInAmp*2;
    }
}
