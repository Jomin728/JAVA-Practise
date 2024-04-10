package com.jominPractise;

public class motorBikeRunner {
    public static void main(String []args)
    {
      MotorBike ducati = new MotorBike(40);
      MotorBike honda = new MotorBike(30);
      MotorBike royalEnfield = new MotorBike();
      ducati.start();
      honda.start();
      ducati.setSpeed(100);
      honda.setSpeed(80);
      System.out.println(ducati.getSpeed());
      int ducatiSpeed = ducati.getSpeed();
      ducatiSpeed+=100;
      ducati.setSpeed(ducatiSpeed);
      ducati.setSpeed(20);
      honda.setSpeed(0);

    }
}
