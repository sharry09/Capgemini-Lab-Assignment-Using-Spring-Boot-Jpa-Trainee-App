package com.capgemini.model.lab2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(scopeName="prototype")
@Entity
@Table(name="TRAINEES")
public class Trainee {
	@Id
	@Column(name="TRAINEE_ID")
private int traineeId;
	@Column(name="TRAINEE_NAME")
private String traineeName;
	
	@Column(name="TRAINEE_DOMAIN")
private String traineeDomain;
	
	
	@Column(name="TRAINEE_LOCATION")
private String traineeLocation;

public int getTraineeId() {
	return traineeId;
}
public void setTraineeId(int traineeId) {
	this.traineeId = traineeId;
}
public String getTraineeName() {
	return traineeName;
}
public void setTraineeName(String traineeName) {
	this.traineeName = traineeName;
}
public String getTraineeDomain() {
	return traineeDomain;
}
public void setTraineeDomain(String traineeDomain) {
	this.traineeDomain = traineeDomain;
}
public String getTraineeLocation() {
	return traineeLocation;
}
public void setTraineeLocation(String traineeLocation) {
	this.traineeLocation = traineeLocation;
}
@Override
public String toString() {
	return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeDomain=" + traineeDomain
			+ ", traineeLocation=" + traineeLocation + "]";
}

}
