package com.tns.java;

public class Inheritence {
	//concept of multiple inheritance

	interface Event { // first interface
		public void start();
	}

	interface Sports { // second interface
		public void play();
	}

	interface Hockey extends Sports, Event { // third interface
		public void show();
	}

	public class Inheritance {
		public static void main(String[] args) {
			Hockey jockey = new Hockey() {
				public void start() {
					System.out.println("Start Event");
				}

				public void play() {
					System.out.println("Play Sports.");
				}

				public void show() {
					System.out.println("Show Hockey.");
				}
			};

			jockey.start();
			jockey.play();
			jockey.show();
		}
	}
}
