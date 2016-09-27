package PokemonGo;

import java.util.Scanner;

public class PokemonDemo 
{

	static Scanner sc = new Scanner(System.in);
	static Scanner ssc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Pokemon Name :");
		String sName = ssc.nextLine();
		System.out.println("Enter Pokemon ID :");
		int ID = sc.nextInt();
		System.out.println("Enter Pokemon Type :");
		String sType = ssc.nextLine();
		System.out.println("Enter number of matches won :");
		int iwon = sc.nextInt();
		System.out.println("Enter number of matches lost :");
		int ilost = sc.nextInt();
		System.out.println("Enter Initial CP :");
		int iCP = sc.nextInt(); 
		Pokemon pk = new Pokemon(ID,iCP,iwon,ilost,sName,sType);
		pk.calPokemonCP();
		pk.display();
	}

}
