
package org.usfirst.frc.team3793.robot;


import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Ultrasonic;


public class Robot extends SampleRobot {

	Ultrasonic theScreecher = new Ultrasonic (0,1);


    public void autonomousPeriodic() {
    	System.out.println(theScreecher.getRangeInches () + " inches");
  
    }

    public void operatorControl() {
    	
       
    }

    public void test() {
    }
}
