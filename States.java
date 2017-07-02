/*
* By: Lawrence Babay
* Date: 07/02/2017
* This application is designed to inherit the
* team name, annual income, and number of employees
* from Team class. Also the application will output
* the Team, State, and Player information.
*/


public class States extends Team {

    public States() {

    }

    @Override
    public String toString() {
        String str2 = "Team State: " + getTeamName() + "\n" +
                        "Annual Income: " + getAnnualIncome() + "\n" +
                        "Number of Owners: " + getNumberOfEmployees();
        return str2;
    }
}
