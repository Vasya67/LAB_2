public class Player {
    private String playerName;
    private int playerNumber;
    private int goalsScored;

    public Player(String playerName, int playerNumber) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.goalsScored = 6;
    }
    public String getPlayerName(){
        return playerName;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }
    public int getGoalsScored(){
        return goalsScored;
    }

    public void scoreGoal(double goals) {
        goalsScored += (int) goals;
        System.out.println(playerName + " забив гол! Всього голів: " + goalsScored);
    }

    public void performActionWithPlayer(Player otherPlayer) {
        // Виклик методу із переданого екземпляра класу
        otherPlayer.scoreGoal(1.0);
        // Виклик змінної із переданого екземпляра класу
        System.out.println("Інший гравець: " + otherPlayer.playerName);
    }

    // Новий метод, який повертає об'єкт Player з новими значеннями
    public static Player updatePlayerInfo(Player player, String newName, int newNumber) {
        player.playerName = newName;
        player.playerNumber = newNumber;
        return player;
    } public void recursiveGoalDisplay(int currentGoals) {
        // Умова виходу з рекурсії
        if (currentGoals >= 10) {
            System.out.println(playerName + " досягнув 10 голів!");
            return;
        }

        // Виклик рекурсивного методу
        System.out.println(playerName + " забив гол! Всього голів: " + currentGoals);
        recursiveGoalDisplay(currentGoals + 1);
    }

    // інші методи класу
}
