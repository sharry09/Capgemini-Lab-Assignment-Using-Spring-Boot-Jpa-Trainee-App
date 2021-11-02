package com.capgemini.service.lab2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.capgemini.dao.lab2.TraineeDao;
import com.capgemini.model.lab2.Trainee;
@Service
@Scope(scopeName = "singleton")

public class TraineeServiceImpl implements TraineeService  {
@Autowired
private TraineeDao dao;
	
    public void addTrainee(Trainee trainee) {
	dao.createTrainee(trainee);
		
	}
    
    public Trainee displayTrainee(int traineeId) {
	return dao.readTrainee(traineeId);
	
    }
    
	public Trainee findTraineeById(int traineeId) {
	  return dao.readTraineeById(traineeId);
	  
	}
    public void removeTrainee(int traineeId) {
	dao.deleteTrainee(traineeId);
		
	}
	public List<Trainee> findAllTrainees() {
	     return dao.readAllTrainees();
	     
	}}


