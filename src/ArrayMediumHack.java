import java.util.*;

class PossibleStep {

    int position;
    boolean stepForward;
    boolean stepLeap;
    boolean stepBack;
    boolean wasForward = false;
    boolean wasBack = false;
    boolean wasLeap = false;

    public PossibleStep(int position) {
        this.position = position;
        this.stepForward = false;
        this.stepLeap = false;
        this.stepBack = false;
    }

    public PossibleStep(int position, boolean stepForward, boolean stepLeap, boolean stepBack) {
        this.position = position;
        this.stepForward = stepForward;
        this.stepLeap = stepLeap;
        this.stepBack = stepBack;
    }

    public boolean getWasForward() {
        return wasForward;
    }

    public boolean getWasBack() {
        return wasBack;
    }

    public boolean getWasLeap() {
        return wasLeap;
    }

    public void setWasForward() {
        wasForward = true;
    }

    public void setWasBack() {
        wasBack = true;
    }

    public void setWasLeap() {
        wasLeap = true;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isStepForward() {
        return stepForward;
    }

    public void setStepForward(boolean stepForward) {
        this.stepForward = stepForward;
    }

    public boolean isStepLeap() {
        return stepLeap;
    }

    public void setStepLeap(boolean stepLeap) {
        this.stepLeap = stepLeap;
    }

    public boolean isStepBack() {
        return stepBack;
    }

    public void setStepBack(boolean stepBack) {
        this.stepBack = stepBack;
    }

    @Override
    public String toString() {
        return "PossibleStep{" +
                "position=" + position +
                ", stepForward=" + stepForward +
                ", stepLeap=" + stepLeap +
                ", stepBack=" + stepBack +
                '}';
    }
}

public class ArrayMediumHack {

    public static boolean canWin(int leap, int[] game) {
        boolean solution = false;
        List<PossibleStep> possibleSteps = new ArrayList<>(game.length);
        possibleSteps.add(0, new PossibleStep(0));
        if (game[1] == 0) possibleSteps.get(0).setStepForward(true);
        if (game[leap] == 0) possibleSteps.get(0).setStepLeap(true);
        for (int i = 1; i < game.length - 1; i++) {
            possibleSteps.add(i, new PossibleStep(i));
            if (game[i + 1] == 0) possibleSteps.get(i).setStepForward(true);
            if (i + leap < game.length) {
                if (game[i + leap] == 0) possibleSteps.get(i).setStepLeap(true);
            } else possibleSteps.get(i).setStepLeap(true);
            if (game[i - 1] == 0) possibleSteps.get(i).setStepBack(true);
        }

        for (int i = 0; i < game.length; i++) {
            System.out.println(i);

            if (i == game.length - 1) {
                System.out.println("На последней позиции, выход из цикла");
                solution = true;
                break;
            }

            PossibleStep hasStep = possibleSteps.get(i);
            System.out.println(hasStep);
            if (hasStep.isStepForward()) {
                if (!hasStep.getWasForward()) {
                    hasStep.setWasForward();
                    continue;
                } else {
                    if (hasStep.isStepBack()){
                        if (!hasStep.getWasBack()){
                            hasStep.setWasBack();
                            i=i-2;
                            continue;
                        }
                    }
                    if (hasStep.isStepLeap()){
                        if(hasStep.getWasLeap()){
                            solution =false;
                            break;
                        } else {
                            hasStep.setWasLeap();
                            i = i+leap -1;
                            continue;
                        }
                    }
                }
            } else {
                if (hasStep.isStepBack()){
                    if (!hasStep.getWasBack()){
                        hasStep.setWasBack();
                        i=i-2;
                        continue;
                    }
                }
                if (hasStep.isStepLeap()){
                    if(hasStep.getWasLeap()){
                        solution =false;
                        break;
                    } else {
                        hasStep.setWasLeap();
                        i = i+leap -1;
                        continue;
                    }
                }
            }
//            else {
//                if (hasStep.isStepLeap()) {
//                    if ((i + leap) > game.length) {
//                        solution = true;
//                        break;
//                    }
//                    i = i + leap - 1;
//                } else {
//                    if (hasStep.isStepBack()) {
//                        i = i - 2;
//                    } else {
//                        solution = false;
//                        break;
//                    }
//                }
//            }
        }
         /*catch (Exception e) {
            System.out.println(e.getMessage());
            Pattern pat = Pattern.compile("[\\-]");
            System.out.println(pat.matcher(e.getMessage()).find());
            if (pat.matcher(e.getMessage()).find()) {
                solution = false;
            } else {
                solution = true;
            }
        }*/
        System.out.println(possibleSteps);
        return solution;
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
//            for (int i :
//                    game) {
//
//                System.out.print(i + " ");
//            }
            System.out.println();
            System.out.println((canWin(leap, game)) ? "--YES-----------------\n" : "--NO------------------\n");
        }
        scan.close();
    }
}