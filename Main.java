public class Main {
    public static void main(String[] args) {
        Coach coach = new Coach("Шовковський", 40);

        Player player1 = new Player("Ярмоленко", 7);
        Player player2 = new Player("Буяльський", 10);
        Player player3 = new Player("Шапаренко", 22);

        player1.scoreGoal(2.5);
        player2.scoreGoal(1.5);
        player2.scoreGoal(2.0);
        player3.scoreGoal(0.5);
        player3.scoreGoal(1.0);
        player3.scoreGoal(1.5);

        Team team = new Team("Динамо", 11, coach);

        // Виклик методу для Team
        team.performActionWithTeam(new Team("Шахтар", 15, new Coach("Луческу", 20)));

        System.out.println(player1.getPlayerName() + " забив " + player1.getGoalsScored() + " голів.");
        System.out.println(player2.getPlayerName() + " забив " + player2.getGoalsScored() + " голів.");
        System.out.println(player3.getPlayerName() + " забив " + player3.getGoalsScored() + " голів.");

        // Виклик методу для Player
        player1.performActionWithPlayer(new Player("Рибалка", 11));

        // Виклик методу для Coach
        coach.performActionWithCoach(new Coach("Ребров", 15));

        // Виклик методу для оновлення інформації про команду
        Team updatedTeam = Team.updateTeamInfo(new Team("Шахтар", 15, new Coach("Луческу", 20)), "Динамо", 11);
        updatedTeam.displayTeamInfo();  // Вивід інформації про оновлену команду

        // Виклик методу для оновлення інформації про гравця
        Player updatedPlayer = Player.updatePlayerInfo(new Player("Рибалка", 11), "Буяльський", 10);
        System.out.println("Оновлений гравець: " + updatedPlayer.getPlayerName());

        // Виклик методу для оновлення інформації про тренера
        Coach updatedCoach = Coach.updateCoachInfo(new Coach("Ребров", 15), "Шовковський", 40);
        System.out.println("Оновлений тренер: " + updatedCoach.getName());
        player1.recursiveGoalDisplay(player1.getGoalsScored());
    }
}