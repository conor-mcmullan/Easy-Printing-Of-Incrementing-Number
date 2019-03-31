import java.util.ArrayList;
import java.util.Scanner;


public class Challenge {

    private Scanner scan;
    private ArrayList<Integer> numbers;
    private StringBuilder sb;

    private Challenge() {
        this.scan = new Scanner(System.in);
        this.numbers = new ArrayList<>();
        this.sb = new StringBuilder();
    }

    private void printf(String str) {
        System.out.println(str);
    }

    private String preformChallenge(){
        for(int i=0; i < this.numbers.size(); i++){
            int value = this.numbers.get(i) + 1;
            this.numbers.set(i, value);
        }

        for (Integer i: this.numbers){
            this.sb.append(i);
        }
        return this.sb.toString();
    }

    private String scanl() {
        printf("Enter Sequence: ");
        if (validate(this.scan.nextLine())){
            return preformChallenge();
        }
        return  "Sequence Contains Non Int Type Characters";
    }

    private Boolean validate(String seq) {
        try {
            if (seq.length()>0) {
                for (String s: seq.split("")){
                    int tmp = Integer.parseInt(s);
                    this.numbers.add(tmp);
                }
                return true;
            }
            return false;
        }
        catch (NumberFormatException e){
            return false;
        }
    }



    public static void main(String[] args) {

        Challenge m = new Challenge();
        m.printf("Reddit Challenge");
        m.printf("https://www.reddit.com/r/dailyprogrammer/comments/aphavc/20190211_challenge_375_easy_print_a_new_number_by/");
        String sequence = m.scanl();
        m.printf(sequence);

    }

}