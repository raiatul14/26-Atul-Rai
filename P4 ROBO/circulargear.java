import ch.aplu.robotsim.*;

public class circulargear {
    circulargear() {
        NxtRobot robot = new NxtRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        gear.forward(200);
        gear.setSpeed(20);
        gear.leftArc(0.2, 7000);
        gear.forward(200);
        gear.leftArc(0.2, 7000);
        gear.forward(200);
        gear.leftArc(0.2, 7000);
        gear.forward(200);
        gear.leftArc(0.2, 7000);
        gear.forward(200);
        robot.exit();
    }

    public static void main(String args[]) {
        circulargear m = new circulargear();
        NxtContext.setStartPosition(250, 200);
        NxtContext.setStartDirection(90);
    }
}
