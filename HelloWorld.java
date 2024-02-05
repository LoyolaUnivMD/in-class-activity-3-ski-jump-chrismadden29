//Programmers: Christopher Madden
//Course: CS*212
//Due Date:
// Lab Assignment: ski jump
//Problem Statement: find the distance of a ski jump and relate it to par score
//Data In: jump height and exit speed
//Data Out: meters jumped

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What is the height of your jump?");
        int ramp_height = scan.nextInt();
        System.out.println("How fast were you going at the end of the jump?");
        int speed = scan.nextInt();
        int normal_par = 90;
        int large_par = 120;
        double air_time = Math.pow(2, ((2*ramp_height)/9.8));
        double distance = air_time * speed;
        if (ramp_height < 70){
            int ppm = 2;
            double points = 60 + (distance - normal_par) * ppm;
            if (points < 10){
                System.out.println("You went" + distance +" meters, you didn't go very far.");
            }
            else if (points <= 61) {
                System.out.println("You went" + distance +" meters, What happened??");
            }
            else if (points >= normal_par ){
                System.out.println("You went" + distance +" meters, good job for doing better than par!");
            }
        }
        if (ramp_height >= 70){
            double ppm = 1.8;
            double points = 60 + (distance - large_par) * ppm;
            if (points < 10){
                System.out.println("You went" + distance +" meters, you didn't go very far.");
            }
            else if (points <= 61) {
                System.out.println("You went" + distance +" meters, What happened??");
            }
            else if (points >= large_par ){
                System.out.println("You went" + distance +" meters, good job for doing better than par!");
            }
        }



        
    }
}
