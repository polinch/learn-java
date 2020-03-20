package study;

public class Robot {

    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y) {
        direction = Direction.UP;
        this.x = x;
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (getDirection()) {
            case UP:
                this.direction = Direction.LEFT;
                break;
            case DOWN:
                this.direction = Direction.RIGHT;
                break;
            case LEFT:
                this.direction = Direction.DOWN;
                break;
            case RIGHT:
                this.direction = Direction.UP;
                break;
        }
        System.out.println("Поворот влево");
    }

    public void turnRight() {
        switch (getDirection()) {
            case UP:
                this.direction = Direction.RIGHT;
                break;
            case DOWN:
                this.direction = Direction.LEFT;
                break;
            case LEFT:
                this.direction = Direction.UP;
                break;
            case RIGHT:
                this.direction = Direction.DOWN;
                break;
        }
        System.out.println("Поворот вправо");
    }

    public void stepForward() {
        switch (getDirection()) {
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
        }
        System.out.println("Шаг");
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction xDir = Direction.LEFT;
        Direction yDir = Direction.UP;
        int xDiff = toX - robot.getX();
        int yDiff = toY - robot.getY();

        if (xDiff < 0)
            xDir = Direction.LEFT;
        else if (xDiff > 0)
            xDir = Direction.RIGHT;

        while (robot.getDirection() != xDir) {
            robot.turnRight();
        }
        System.out.println(robot.getDirection());

        for (int i = 0; i < Math.abs(xDiff); i++) {
            robot.stepForward();
        }

        if (yDiff < 0)
            yDir = Direction.DOWN;
        else if (yDiff > 0)
            yDir = Direction.UP;

        while (robot.getDirection() != yDir) {
            robot.turnLeft();
        }
        System.out.println(robot.getDirection());

        for (int i = 0; i < Math.abs(yDiff); i++) {
            robot.stepForward();
        }

        System.out.println("x " + robot.getX());
        System.out.println("y " + robot.getY());

    }

}

