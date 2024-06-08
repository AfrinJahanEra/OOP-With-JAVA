import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class User {
    private String name;
    private String email;
    private String occupation;
    private String focusWork;
    private int focusTimeInSeconds;
    private int points;
    private int totalBreakTimeInSeconds;

    public User(String name, String email, String occupation) {
        this.name = name;
        this.email = email;
        this.occupation = occupation;
        this.points = 0;
        this.totalBreakTimeInSeconds = 0;
    }

    public void setFocusWork(String focusWork) {
        this.focusWork = focusWork;
    }

    public void setFocusTime(int hours, int minutes, int seconds) {
        this.focusTimeInSeconds = hours * 3600 + minutes * 60 + seconds;
    }

    public void startFocusTimer() {
        Timer focusTimer = new Timer();
        Timer breakTimer = new Timer();

        focusTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Focus time is over!");
                handleBreak(breakTimer); 
                if (totalBreakTimeInSeconds <= (0.15 * focusTimeInSeconds)) {
                    addPoints((int) (0.4 * focusTimeInSeconds));
                } else {
                    deductPoints();
                }
            }
        }, focusTimeInSeconds * 1000); 

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Do you want to take a break? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                totalBreakTimeInSeconds += (int) (0.15 * focusTimeInSeconds);
                startBreak(breakTimer);
            } else {
                System.out.println("Focus time started for " + focusWork + ".");
                break;
            }
        }
        scanner.close();
    }

    public void startBreak(Timer breakTimer) {
        TimerTask breakTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Break");
                breakTimer.cancel(); // Stop the break timer after printing "Break"
            }
        };
        breakTimer.schedule(breakTask, (long) (0.15 * focusTimeInSeconds) * 1000); // Schedule break timer for break duration

        try {
            Thread.sleep((long) (0.15 * focusTimeInSeconds) * 1000); // Wait for the break duration
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (totalBreakTimeInSeconds > (0.15 * focusTimeInSeconds)) {
            deductPoints();
        }
    }

    public void handleBreak(Timer breakTimer) {
        breakTimer.cancel(); 
    }

    public void addPoints(int pointsToAdd) {
        points += pointsToAdd;
        System.out.println(pointsToAdd + " points added to your inventory.");
    }

    public void deductPoints() {
        int pointsToDeduct = (int) (0.2 * points);
        points -= pointsToDeduct;
        System.out.println("Too long break! " + pointsToDeduct + " points deducted.");
    }

    public int getPoints() {
        return points;
    }
}

public class FocusTimerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Focus Timer App!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Choose your occupation: ");
        String occupation = scanner.nextLine();

        User user = new User(name, email, occupation);

        System.out.print("Enter the work you want to focus on: ");
        String focusWork = scanner.nextLine();
        user.setFocusWork(focusWork);
        System.out.print("Enter the duration (hours minutes seconds): ");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();
        user.setFocusTime(hours, minutes, seconds);

        System.out.println("Focus started for " + focusWork + " for " + hours + " hours " + minutes + " minutes " + seconds + " seconds.");
        user.startFocusTimer();

        System.out.println("Your current points: " + user.getPoints());

        scanner.close();
    }
}
