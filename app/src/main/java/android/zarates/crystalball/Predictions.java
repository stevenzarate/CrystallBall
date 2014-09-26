package android.zarates.crystalball;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;

    private Predictions(){
        answers = new String[]{
                "Yo whishes will come true.........SIKE!!!!! ",
                "Go kill yourself    "
        };
    }
    public static Predictions get(){
        if (predictions == null) {
            predictions = new Predictions();
        }
        return predictions;
    }

    public String getPredictions(){
        return answers[1];
        
    }
}
