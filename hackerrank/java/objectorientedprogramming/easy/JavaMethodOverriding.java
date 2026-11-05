package objectorientedprogramming.easy;

/**
 * Platform: HackerRank
 * Challenge: Java Method Overriding
 * Problem: https://www.hackerrank.com/challenges/java-method-overriding/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaMethodOverriding {
    public static void main(String[] args) {

        Sports genericSports = new Sports();
        System.out.println(genericSports.getName());
        genericSports.getNumberOfTeamMembers();

        Sports soccer = new Soccer();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();

    }

    private static class Sports {
        public String getName() { return "Generic Sports"; }
        public void getNumberOfTeamMembers() { System.out.println( "Each team has n players in " + getName() ); }
    }

    private static class Soccer extends Sports {
        @Override
        public String getName() { return "Soccer Class"; }

        @Override
        public void getNumberOfTeamMembers() { System.out.println( "Each team has 11 players in " + getName() ); }
    }
}
