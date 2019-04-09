package cn.itcast.chapter06.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PokerShuffleCards {

	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<String>();
		color.add("☆");
		color.add("★");
		color.add("□");
		color.add("■");
		
		ArrayList<String> number = new ArrayList<String>();
		
		for (int i = 3; i <= 10; i++) {
			
			number.add(i + "");
			
		}
		
		number.add("J");
		number.add("Q");
		number.add("L");
		number.add("A");
		number.add("2");
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int index = 0;
		
		for (String thisNumber : number) {
			
			for (String thisColor : number) {
				
				map.put(index++, thisColor + thisNumber);
			
			}
		
		}
		
		map.put(index++, "◇");
		map.put(index++, "◆");
		
		ArrayList<Integer> cards = new ArrayList<Integer>();
		
		for (int i = 0; i <=53; i++) {
			
			cards.add(i);
			
		}
		
		Collections.shuffle(cards);
		
		ArrayList<Integer> play1 = new ArrayList<Integer>();
		ArrayList<Integer> play2 = new ArrayList<Integer>();
		ArrayList<Integer> play3 = new ArrayList<Integer>();
		ArrayList<Integer> seccard = new ArrayList<Integer>();
		
		for (int i = 0; i <cards.size(); i++) {
			
			if (i >=51) {
				
				seccard.add(cards.get(i));
				
			} else {
				
				if (i % 3 == 0) {
					
					play1.add(cards.get(i));
				
				} else if (i % 3 == 1) {
					
					play2.add(cards.get(i));
					
				} else {
					
					play3.add(cards.get(i));
					
				}
				
			}
			
		}
		
		Collections.sort(play1);
		Collections.sort(play2);
		Collections.sort(play3);
		
		ArrayList<String> splay1= new ArrayList<String>();
		ArrayList<String> splay2= new ArrayList<String>();
		ArrayList<String> splay3= new ArrayList<String>();
		ArrayList<String> sseccard= new ArrayList<String>();
		
		for (Integer key : play1) {
			
			splay1.add(map.get(key));
		
		}
		
		for (Integer key : play2) {
			
			splay2.add(map.get(key));
		
		}
		
		for (Integer key : play3) {
	
			splay3.add(map.get(key));

		}
		
		for (Integer key : seccard) {
	
			sseccard.add(map.get(key));

		}
		
		System.out.println("玩家1: " + splay1);
		System.out.println("玩家2: " + splay2);
		System.out.println("玩家3: " + splay3);
		System.out.println("底牌: " + sseccard);
		
	}

}
