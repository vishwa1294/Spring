package com.xworkz.apartment.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.appartment.AppartmentEntity;
import com.xworkz.dao.AppartmentDAO;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AppartmentDAO dao = context.getBean(AppartmentDAO.class);
		AppartmentEntity entity = new AppartmentEntity();
		entity.setName("Vilas");
		entity.setNoOfFloors(30);
		entity.setFlatPrice(50000);
		entity.setParking(true);
		dao.save(entity);
	}

}