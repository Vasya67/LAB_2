public class Coach {
    private String name;
    private int experienceYears;

    public Coach(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public void performActionWithCoach(Coach otherCoach) {
        // Виклик методу із переданого екземпляра класу
        System.out.println("Інший тренер: " + otherCoach.getName());
        // Виклик змінної із переданого екземпляра класу
        System.out.println("Тривалість досвіду: " + otherCoach.experienceYears + " років");
    }

    // Новий метод, який повертає об'єкт Coach з новими значеннями
    public static Coach updateCoachInfo(Coach coach, String newName, int newExperienceYears) {
        coach.name = newName;
        coach.experienceYears = newExperienceYears;
        return coach;
    }
}