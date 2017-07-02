/*
* By: Lawrence Babay
* Date: 07/02/2017
* This application is designed to inherit the
* team name, annual income, and number of employees
* from Team class. Also the application will output
* the Team, State, and Player information.
*/


import java.text.NumberFormat;

public class Team {

    private long annualIncome;
    private int numberOfEmployees;
    private String teamName;
    private int numberOfPlayers;

    public Team() {
        teamName = "BTX";
        numberOfEmployees = 0;
        annualIncome = 0;
        numberOfPlayers = 0;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setAnnualIncome(long annualIncome) {

        this.annualIncome = annualIncome;
    }

    public String getAnnualIncome() {
        NumberFormat dollars = NumberFormat.getCurrencyInstance();
        String annualIncomeFormatted = dollars.format(annualIncome);
        return annualIncomeFormatted;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    @Override
    public String toString() {
        String str1 = " Team Name: " + getTeamName() + "\n" +
                        " Annual Income: " + getAnnualIncome() + "\n" +
                        " Number of Employees: " + getNumberOfEmployees() + "\n" +
                        " Number of Players: " + getNumberOfPlayers();
        return str1;
    }

}
