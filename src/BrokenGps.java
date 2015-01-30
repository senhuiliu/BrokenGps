/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Huige1
 */
import java.util.Random;
public class BrokenGps
{


    public static void main(String[] args) {
        final int TURNS=12;
        //BrokenGps
	
                final int DISTANCE_PER_UNIT=5;
		int x=0, y=0;
		for (int i=0; i<TURNS;i++){
			Random gen = new Random();
			int direction = gen.nextInt(4);
			//0 = North, 1 = East, 2 = South, 3 = West
			switch (direction) {
			case 0:
				y=y+1;//North 
				break;
			case 1:
				x=x+1;//East
				break;
			case 2:
				y=y-1;//South
				break;
			case 3:
				x=x-1;//West
				break;
			}
		}
		double distance = Math.sqrt(x*x+y*y)*DISTANCE_PER_UNIT;//Distance formula
		//initial point is (0,0)
		System.out.print("After one hour driving, ");
		System.out.print("the distance away from the initial point is ");
		System.out.println(distance+" miles.");
	}


    }
    

