package com.escrum.poquer.escrum.tables;

public class Game {
	private Integer idGame;
	private String nameGame;
	private Integer limitPlayers;
	private String task;
	private String password;

	public Integer getIdGame() {
		return idGame;
	}

	public void setIdGame(Integer idGame) {
		this.idGame = idGame;
	}

	public String getNameGame() {
		return nameGame;
	}

	public void setNameGame(String nameGame) {
		this.nameGame = nameGame;
	}

	public Integer getLimitPlayers() {
		return limitPlayers;
	}

	public void setLimitPlayers(Integer limitPlayers) {
		this.limitPlayers = limitPlayers;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
