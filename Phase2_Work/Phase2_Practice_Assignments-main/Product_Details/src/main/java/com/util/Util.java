package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.entity.EProduct;


public class Util {

	public static SessionFactory buildSessionFactory() {
		
		// Step 1
		Configuration cfg = new Configuration();
		cfg.configure("local.cfg.xml");
		cfg.addAnnotatedClass(EProduct.class);
		//Step 2
		SessionFactory sf = cfg.buildSessionFactory();

		return sf;
	}

}
