package com.capgemini.dao.lab2;

import java.util.List;

import com.capgemini.model.lab2.Trainee;

public interface TraineeDao {
	
		public void createTrainee(Trainee trainee);
		public Trainee readTrainee(int TraineeId);
		public void deleteTrainee(int traineeId);
		public Trainee readTraineeById(int traineeId);
		public List<Trainee> readAllTrainees();
		
}
