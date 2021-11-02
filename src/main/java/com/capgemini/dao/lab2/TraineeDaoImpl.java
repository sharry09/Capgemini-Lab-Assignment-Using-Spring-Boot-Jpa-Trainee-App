 package com.capgemini.dao.lab2;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.capgemini.model.lab2.Trainee;
@Repository
@Scope(scopeName = "singleton")

public class TraineeDaoImpl implements TraineeDao{
	@PersistenceContext
private EntityManager entityManager=null;
@Transactional
	public void createTrainee(Trainee trainee) {
			entityManager.persist(trainee);
               }

		public Trainee readTrainee(int traineeId) {
		return entityManager.find(Trainee.class, traineeId);
		}

         public Trainee readTraineeById(int traineeId) {
			return entityManager.find(Trainee.class, traineeId);
			}

		public void deleteTrainee(int traineeId) {
		         
			   Trainee t = entityManager.find(Trainee.class, traineeId);
			   if(t != null){
		            entityManager.remove(t);
		        }}
           public List<Trainee> readAllTrainees() {
			TypedQuery<Trainee> tquery=entityManager.createQuery("Select t1 From Trainee t1",Trainee.class);
	         return tquery.getResultList();
		}
}



