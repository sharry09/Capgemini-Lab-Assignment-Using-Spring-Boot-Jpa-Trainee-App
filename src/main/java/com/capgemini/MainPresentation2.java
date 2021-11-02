package com.capgemini;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.capgemini.model.lab2.Trainee;
import com.capgemini.service.lab2.TraineeService;
@SpringBootApplication
public class MainPresentation2 {
public static void main(String[] args) {
ApplicationContext context=  SpringApplication.run(MainPresentation2.class,args);
				    TraineeService service =context.getBean(TraineeService.class);
				    Trainee trainee =context.getBean(Trainee.class);
				    trainee.setTraineeId(911);
		            trainee.setTraineeName("Sharry Zac");
		            trainee.setTraineeDomain("Web Developer");
		            trainee.setTraineeLocation("Bangalore-BU");
		            service.addTrainee(trainee);
		           
			System.out.println("TRAINEE MANAGEMENT SYSTEM");
			System.out.println("--------------------------");
			String str="adm"
					+ "in";
			String str1="1234";
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Username");
			String s=sc.nextLine();
			System.out.println("Enter your Password");
			String s1=sc.nextLine();
			if(s.equals(str) && (s1.equals(str1))) {
				System.out.println("Welcome Admin! Kindly Choose your choice of operation ");
				System.out.println("-------------------");
			
			
		             System.out.println("1\t Add a trainee ");
			        System.out.println("2\t Find trainee by name");
			        System.out.println("3\t Retrieve a trainee by ID");
			        System.out.println("4\t Delete Trainee");
                    System.out.println("5\t Retrieve all trainees");
                   // System.out.println("6\t Update");
                    int choice=sc.nextInt();
               
        	
                    switch(choice) {
                    case 1:
                    Trainee tr =context.getBean(Trainee.class);
                    	tr.setTraineeId(210);
			            tr.setTraineeName("Drake");
			            tr.setTraineeDomain("Senior Analyst");
			            tr.setTraineeLocation("Chennai-BU");
			            service.addTrainee(tr);
                        System.out.println("Trainee Added Successfully");
                        break;
				
				  case 2:
					 
					       Trainee trainees1=service.findTraineeById(1781);
			               System.out.println(trainees1);
			              
		                   break;

					
				  case 3:
					         Trainee trainees2=service.displayTrainee(91);
					         System.out.println(trainees2);
						     break; 
					  
				 
                    case 4:
                    	      service.removeTrainee(210);
                    	      System.out.println("Trainee deleted Successfully");
                         break;
                         
				      case 5:
					
			                   List<Trainee> trainees=service.findAllTrainees();
			                    for(Trainee t1:trainees)
			                     {
			                    System.out.println(t1);
			                     }
			                       break;
			                       
								/*
								 * case 6: service.includeTrainee("France");
								 * System.out.println("Trainee updated Successfully");
								 * 
								 * 
								 * break;
								 */
                               default:System.out.println("Invalid Choice");
                    }
			}
			else 
			{
				System.out.println("Invalid Username or Password");
			}
			sc.close();
}		
}
