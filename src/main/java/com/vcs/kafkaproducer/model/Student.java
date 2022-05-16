package com.vcs.kafkaproducer.model;

public class Student {
	private int ID;
	private String firstName;
	private String lastName;
	public int getId() {
		return ID;
	}
	public void setId(int id) {
		this.ID = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [id=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 */
	public Student(int id, String firstName, String lastName) {
		super();
		this.ID = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * 
	 */
	public Student() {
		super();
	}
	

}
