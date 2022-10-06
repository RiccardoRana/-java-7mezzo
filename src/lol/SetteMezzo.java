package lol;

import java.util.Random;
import java.util.Scanner;

public class SetteMezzo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int[] carte = new int[40];
		String[] carteVal = new String[40];

		for (int i = 0; i < carte.length; i++) {
			carte[i] = r.nextInt(40) + 1;
			for (int j = 0; j < i; j++) {
				if (carte[i] == carte[j]) {
					i--; // Rifai l'outerloop!!!
					break;
				}
			}
		}

		for (int i = 0; i < carteVal.length; i++) {
			for (int k = 0; k < carte.length; k++) {
				if (carte[i] >= 1 && carte[i] <= 10) {
					carteVal[i] = "" + carte[i] + " di bastoni";
				} else if (carte[i] >= 11 && carte[i] <= 20) {
					carteVal[i] = "" + (carte[i] - 10) + " di coppe";
				} else if (carte[i] >= 21 && carte[i] <= 30) {
					carteVal[i] = "" + (carte[i] - 20) + " di denari";
				} else {
					carteVal[i] = "" + (carte[i] - 30) + " di spade";
				}
			}
		}

		System.out.println(java.util.Arrays.toString(carte));
		System.out.println(java.util.Arrays.toString(carteVal));
		in.close();

	}

}