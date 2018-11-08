package frc.team4131.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {
    TalonSRX motor1 = new TalonSRX(1);
    TalonSRX motor2 = new TalonSRX(2);
    TalonSRX motor3 = new TalonSRX(3);
    TalonSRX motor4 = new TalonSRX(4);
    XboxController controller = new XboxController(1);


    @Override
    public void robotInit() { }

    @Override
    public void teleopInit() { }

    
    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        drive();
    }

public void drive() {
    double straight = controller.getRawAxis(0);
    double rotate = controller.getRawAxis(5);
    motor1.set(ControlMode.PercentOutput, rotate + straight);
    motor2.set(ControlMode.PercentOutput, rotate + straight);
    motor3.set(ControlMode.PercentOutput, rotate - straight);
    motor4.set(ControlMode.PercentOutput, rotate - straight);
}
}