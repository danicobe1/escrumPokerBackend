package com.escrum.poquer.escrum.tables;

public class Card {
	private Integer idCard;
	private Integer idUser;
	private Integer idGame;
	private Integer value;
	private Integer isReady;
	private Integer show;

	public Integer getIdCard() {
		return idCard;
	}

	public void setIdCard(Integer idCard) {
		this.idCard = idCard;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public Integer getIdGame() {
		return idGame;
	}

	public void setIdGame(Integer idGame) {
		this.idGame = idGame;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getIsReady() {
		return isReady;
	}

	public void setIsReady(Integer isReady) {
		this.isReady = isReady;
	}

	public Integer getShow() {
		return show;
	}

	public void setShow(Integer show) {
		this.show = show;
	}

}
