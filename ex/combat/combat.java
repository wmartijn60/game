package combat;
// import
import ex.screen;
/////////////imports////////////////////
import java.util.Random;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.input.*;
///////////////////////////////////////

public class combat{

	// public static screen myScreen = new screen();
	public static screen myScreen;// = new screen();
	public void Slakhorst() {

		// System objects/random generator //
		Scanner in = new Scanner(System.in);
		Random rand = new Random();

		///Game variables////////////////////////////////////////////////////////////////////////////////////////////////
		String[] enemies = { "aggresive neighbor", "Dirty man", "Naked Hobo", "Mc Donalds worker", "Bruce Villanch"};
		String boss1 = "Testmannetje";
		String boss2 ="Ongegetemde Theo";
		int maxEnemyHealth = 125;
		int enemyAttackDamage = 40;
		int bossHealth1 = 200;
		int bosssDamage1 = 45;
		int bossHealth2 = 230;
		int bosssDamage2 = 50;
		int killCount = 0;
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////


		///Player variables///
		int health = 125;
		int attackDmg = 50;
		//////////////////////

		boolean running = true;

//intro
		System.out.println("*-------------------------------------------------*");
		System.out.println("*                Hello and welcome.               *");
		System.out.println("*            this is the game survivor,           *");
		System.out.println("*          brought to you by Sem, Martijn         *");
		System.out.println("*               and Brandon have fun.             *");
		System.out.println("*-------------------------------------------------*");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("do you want to play the game?");
		System.out.println("yes or no");
		String option = in.nextLine();
		if (option.equals("yes")){
			System.out.println("let's begin");
		} else if (option.equals("no")){

		} else {
			System.out.println("invalid answer");
			String option1 = in.nextLine();
		}

		// een manier om veel regels over te slaan (fake cls)
		// for (int i=0; i<50; i++){
		// 		System.out.print("\n");
		// }

		for (int i=0; i<50; i++){
		    System.out.print("\n");
		}



		// Label
		GAME:
		while (running) {
			System.out.println("\n");

			myScreen.see();
			int enemyHealth = rand.nextInt(maxEnemyHealth);
			String enemy = enemies[rand.nextInt(enemies.length)];
			System.out.println("\t# " + enemy + " has appeared! #\n");

			while (enemyHealth > 0) {
				// myScreen.see();
				System.out.println("\tYour HP: " + health);
				System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1. Slam");
				System.out.println("\t2. Amulet of Lifesteal");
				System.out.println("\t3. FastAttack");

				String input = in.nextLine();
				myScreen = new screen();
				if (input.equals("1")) {
					int damageDealt = 25;
					int damageTaken = rand.nextInt(enemyAttackDamage);

					enemyHealth -= damageDealt;
					health -= damageTaken;

					System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage");
					System.out.println("\t> You recieved " + damageTaken + " in retaliation");

					if (health < 1) {
						System.out.println("\t You have taken too much damage, you are too weak to go on");
						break;
					}
				}
				if (input.equals("2")) {
					int damageDealt = 0;
					int damageTaken = rand.nextInt(enemyAttackDamage) - 20;


					enemyHealth -= damageDealt;
					health -= damageTaken;

					System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage");
					System.out.println("\t> You recieved " + damageTaken + " in retaliation");

					if (health < 1) {
						System.out.println("\t You have taken too much damage, you are too weak to go on");
						break;
					}
				}

				if (input.equals("3")) {
					int damageDealt = rand.nextInt(attackDmg);
					int damageTaken = rand.nextInt(enemyAttackDamage);

					enemyHealth -= damageDealt;
					health -= damageTaken;

					System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage");
					System.out.println("\t> You recieved " + damageTaken + " in retaliation");

					if (health < 1) {
						System.out.println("\t You have taken too much damage, you are too weak to go on");
						break;
					}
				}
			}
			if (health < 1) {
				break;}
			++killCount;
			if (killCount < 2) {
				health =+125;
			} else {health =+150;
			}

			System.out.println("--------------------------------------");
			System.out.println(" # " + enemy + " was defeated! # ");
			System.out.println(" # After the fight you regenerated your health");
			System.out.println(" # Your killCount = " + killCount + "");
			System.out.println("--------------------------------------");

			if (killCount == 2){
				System.out.println("upgraded to level 2 \n begin health upgraded to 150");
			}

			System.out.println("What would you like to do now?");
			System.out.println("1. Continue fighting");
			System.out.println("2. Run away like a chicken ");
			String input = in.nextLine();

			while (!input.equals("1") && !input.equals("2")) {
				System.out.println("invalid command");
				input = in.nextLine();

			}
			if (input.equals("1")) {
				System.out.println("You continue your adventure to defeat them all.");
			} else if (input.equals("2")) {
				System.out.println("You ran away like a coward.");
				break;
			}
			//////////////////////////boss1////////////////////////////////////
			// if (killCount == 5) {
			// 	System.out.println("\t# " + boss1 + " has appeared !!# \n");
			// }
			//////////////////////////////////////////////////////////////////
		}
		System.out.println("*-----------------------------*");
		System.out.println("* THANKS FOR PLAYING OUR GAME *");
		System.out.println("*-----------------------------*");

	}
}
