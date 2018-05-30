package client.commands;

import client.commands.Command;

public class Task implements Runnable {

	private Thread thread;

	private Command command;

	public void start() {

	}

	public void run() {
		command.execute();
	}

	public void setCommand(Command c) {
		command = c;
	}

}
