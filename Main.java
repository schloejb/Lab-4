/*
Lab 4
Jacob Schloemer
9/21/21
*/


import java.util.Random;

class Main {
  public static void main(String[] args) {

    Random r = new Random();
    int randomNum = r.nextInt(50) +1;
    int num = r.nextInt();

    System.out.println("The random number is: " + randomNum);

  if (randomNum >= 0){
    while (randomNum >= 0){
      System.out.println(randomNum);
      randomNum--;
    }
  }
  if(randomNum <= 5){
    System.out.println("Ahoy Mateys!");
  }
  else if (randomNum > 25 & randomNum < 42){
    System.out.println("Cannonball!");
    }
  }
}