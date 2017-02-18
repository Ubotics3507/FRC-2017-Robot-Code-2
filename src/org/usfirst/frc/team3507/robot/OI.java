package org.usfirst.frc.team3507.robot;

import edu.wpi.first.wpilibj.buttons.Button;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team3507.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	
	public Joystick controller;
	public Button A;
	public Button B;
	public Button X;
	public Button Y;
	public Button leftBump;
	public Button rightBump;
	public static Joystick leftStick = new Joystick(1);
	public static Joystick rightStick = new Joystick(4);
	public Button back;
	public Button start;
	public Button leftTrigger;
	public Button rightTrigger;
	
	public XboxController driver = new XboxController(RobotMap.driver);
	
	public OI() {
		
		
		///sets all of the class variables to an integer
		
		/* controller = new Joystick(controllerNumber);
		A = new JoystickButton(controller, 1);
		B = new JoystickButton(controller, 2);
		X = new JoystickButton(controller, 3);
		Y = new JoystickButton(controller, 4);
		leftBump = new JoystickButton(controller, 5);
		rightBump = new JoystickButton(controller, 6);
		back = new JoystickButton(controller, 7);
		start = new JoystickButton(controller, 8);
		*/
	}
	
	public void XboxController() {
		Robot.oi.driver.getRawAxis(4);
		Robot.oi.driver.getRawAxis(5);
		Robot.oi.driver.getRawAxis(1);
		Robot.oi.driver.getRawAxis(2);
	}
}
