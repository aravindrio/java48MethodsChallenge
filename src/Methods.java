public class Methods {

    public static void main(String args[]){

        int pos1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", pos1);

        int pos2 = calculateHighScorePosition(900);
        displayHighScorePosition("Charles", pos2);

        int pos3 = calculateHighScorePosition(400);
        displayHighScorePosition("Alex", pos3);

        int pos4 = calculateHighScorePosition(50);
        displayHighScorePosition("Armin", pos4);



    }
    //First Challenge
    // Create a method called displayHighScorePosition

    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table

    // You should display the players name along with a message like " managed to get into position " and the

    // position they got and a further message " on the high score table".

    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){

        if(score >= 1000){
            return 1;
        } else if(score >= 500 && score <= 1000){
            return 2;
        } else if(score >= 100 && score <= 500){
            return 3;
        } else {
            return 4;
        }

    }
}
