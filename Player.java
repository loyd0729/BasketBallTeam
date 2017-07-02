/*
* By: Lawrence Babay
* Date: 07/02/2017
* This application is designed to inherit the
* team name, annual income, and number of employees
* from Team class. Also the application will output
* the Team, State, and Player information.
*/


public class Player extends Team {

    private String playerName;

    public Player() {
        playerName = "Loyd";
    }

    public String setStarPlayer(String starPlayer) {
        return starPlayer;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        String str3 = "Team Name: " + getTeamName() + "\n" +
                        "Player Name: " + getPlayerName() + "\n" +
                        "Player Annual Income: " + getAnnualIncome() + "\n" +
                        "Number of Personal Trainer: " + getNumberOfEmployees();
        return str3;
    }
}
