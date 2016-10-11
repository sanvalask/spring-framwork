package org.jpa.emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateEmployee {

	   public static void main( String[ ] args ) {
		   
		   
		   
		   
	   
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Demo");
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      Employ employee = new Employ( ); 
	      employee.setEid( 1201 );
	      employee.setEname( "Gopal" );
	      employee.setSalary( 40000 );
	      employee.setDeg( "Technical Manager" );
	      
	      entitymanager.persist( employee );
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
	   }
	}
