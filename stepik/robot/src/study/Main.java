package study;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты стартовой точки");
        int inputX = scanner.nextInt();
        int inputY = scanner.nextInt();

	    Robot robot = new Robot(inputX, inputY);

        System.out.println("Введите координаты точки назначения");
        inputX = scanner.nextInt();
        inputY = scanner.nextInt();
        Robot.moveRobot(robot, inputX, inputY);

    }
}
