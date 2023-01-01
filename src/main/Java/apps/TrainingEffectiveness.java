package apps;

import interfaces.SmartWatch;

public class TrainingEffectiveness {
    private SmartWatch smartWatch;

    public TrainingEffectiveness(SmartWatch smartWatch) {
        this.smartWatch = smartWatch;
    }

    String getTrainingEvaluation() {
        double evaluation = ((double) (getTrainingLengthEvaluation() + getTrainingBurnedCaloriesEvaluation() * 2 + getAverageHeartRateEvaluation() * 3)) / 6;
        if (evaluation < 1.2) {
            return "niska";
        } else if (evaluation >= 1.2 && evaluation < 2) {
            return "dobra";
        } else if (evaluation >= 1.2 && evaluation < 3) {
            return "bardzo dobra";
        } else if (evaluation == 3) {
            return "doskonała";
        }
        throw new RuntimeException("Input data problems!");
    }


    public int getTrainingLengthEvaluation() {
        int trainingTimeInMinutes = smartWatch.getTrainingTimeInMinutes();
        if (trainingTimeInMinutes < 30) {
            return 1;
        } else if (trainingTimeInMinutes > 30 && trainingTimeInMinutes <= 60) {
            return 2;
        } else if (trainingTimeInMinutes > 60) {
            return 3;
        }
        throw new RuntimeException("Input data problems!");
    }

    public int getTrainingBurnedCaloriesEvaluation() {
        int burnedCalories = smartWatch.getNumberOfBurnedCalories();
        if (burnedCalories <= 300) {
            return 1;
        } else if (burnedCalories > 300 && burnedCalories < 400) {
            return 2;
        } else if (burnedCalories >= 400) {
            return 3;
        }
        throw new RuntimeException("Input data problems!");
    }

    public int getAverageHeartRateEvaluation() {
        int heartRate = smartWatch.getAverageHeartRate();
        if (heartRate < 160) {
            return 3;
        } else if (heartRate >= 160 && heartRate <= 175) {
            return 2;
        } else if (heartRate > 175) {
            return 1;
        }
        throw new RuntimeException("Input data problems!");
    }
}
