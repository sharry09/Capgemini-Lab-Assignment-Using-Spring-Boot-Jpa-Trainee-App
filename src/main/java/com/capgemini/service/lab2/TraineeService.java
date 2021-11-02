package com.capgemini.service.lab2;

import java.util.List;

import com.capgemini.model.lab2.Trainee;

public interface TraineeService {
	public void addTrainee(Trainee trainee);
	public Trainee findTraineeById(int traineeId);
	public Trainee displayTrainee(int traineeId);
	public    void    removeTrainee(int traineeId);
	public List<Trainee> findAllTrainees();
	
}



