import java.util.Scanner;


public class Challenge_No_String_Type {

    private Scanner scan;
    private StringBuilder sb;

    private Challenge_No_String_Type() {
        this.scan = new Scanner(System.in);
        this.sb = new StringBuilder();
    }

    private void printf(String str) {
        System.out.println(str);
    }

    private void challenge() {
        printf("Length Of Sequence:\t");
        int sequence_length = this.scan.nextInt();

        for(int i=0; i<sequence_length; i++){
            printf("Number:\t");
            this.sb.append(this.scan.nextInt()+1);
        }

        printf(this.sb.toString());

    }

    public static void main(String[] args) {
        Challenge_No_String_Type m = new Challenge_No_String_Type();
        m.printf("Reddit Challenge");
        m.printf("https://www.reddit.com/r/dailyprogrammer/comments/aphavc/20190211_challenge_375_easy_print_a_new_number_by/");
        m.challenge();
    }

}