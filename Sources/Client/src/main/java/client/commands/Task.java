package client.commands;

import client.commands.Command;
/**
 * Task implementiert den Thread
 * @author SEEMANN Manuel, Koiner Oskar
 * @version 2018-04-25
 */

public class Task implements Runnable {

	private Thread thread;

	private Command command;

	public void start() {

	}

	/**
	 * run führt exceute aus
	 */
	public void run() {
		command.execute();
	}

	/**
	 * setMethode für das command
	 * @param c
	 */
	public void setCommand(Command c) {
		command = c;
	}

}
