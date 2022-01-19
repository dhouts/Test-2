// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  private static final String Constants = null;
  Spark leftFront;
  Spark rightFront;
  Spark leftBack;
  Spark rightBack;
  SpeedControllerGroup leftMotors;
  SpeedControllerGroup rightMotors;
  DifferentialDrive drive;
  
  /** Creates a new DriveTrain. */
  public DriveTrain() {
    leftFront = new Spark(Constants.LEFT_FRONT);
    leftFront.setInverted(false);
    rightFront = new Spark(Constants.RIGHT_FRONT);
    rightFront.setInverted(false);
    leftBack = new Spark(Constants.LEFT_BACK);
    leftBack.setInverted(false);
    rightBack = new Spark(Constants.RIGHT_BACK);
    rightBack.setInverted(false);

    leftMotors = new SpeedControllerGroup(leftFront, leftBack);
    rightMotors = new SpeedControllerGroup(rightFront, rightBack);
    drive = new DifferentialDrive(leftMotors, rightMotors);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
