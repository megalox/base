package br.com.engine.model;

public class Answer {

	private long id;
	private String value;
	private Question question;

	public Answer(String value, Question question) {
		this.value = value;
		this.question = question;
	}
}
