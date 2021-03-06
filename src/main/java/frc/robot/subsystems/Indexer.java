/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Indexer extends SingleMotorMechanism {
  public TimeOfFlight timeOfFlight1, timeofFlight2, timeOfFlight3;

  /**
   * Creates a new Indexer.
   */
  public Indexer() {
    super(RobotMap.kIndexerID, "Indexer", true, false);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
