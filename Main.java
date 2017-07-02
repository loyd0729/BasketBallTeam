/*
* By: Lawrence Babay
* Date: 07/02/2017
* This application is designed to inherit the
* team name, annual income, and number of employees
* from Team class. Also the application will output
* the Team, State, and Player information.
*/


public class Main {

    public static void main(String[] args) {
	// write your code here
        Team team = new Team();
        team.setTeamName("BTX");
        team.setAnnualIncome(2000000000);
        team.setNumberOfEmployees(12);
        team.setNumberOfPlayers(12);

        States state = new States();
        state.setTeamName("Broadway BTX");
        state.setAnnualIncome(1000000000);
        state.setNumberOfEmployees(12);

        Player player = new Player();
        player.setTeamName("Broadway BTX");
        player.setAnnualIncome(100000);
        player.setNumberOfEmployees(5);
        player.setStarPlayer("Loyd");

        System.out.println(" Team Information:");
        System.out.println(team.toString() + "\n");
        System.out.println("Team Home State Information:");
        System.out.println(state.toString() + "\n");
        System.out.println("Player Information");
        System.out.println(player.toString());
    }
}
