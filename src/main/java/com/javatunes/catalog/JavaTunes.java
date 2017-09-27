/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2006-12 LearningPatterns Inc.
 */

package com.javatunes.catalog;

import com.javatunes.catalog.Catalog;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class JavaTunes
{
   public static void main(String[] args)
   {
   
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Look up the javaTunesCatalog bean as before
		Catalog cat = (Catalog)ctx.getBean("javaTunesCatalog");
		

		// TODO - the following compiles, but will only run properly when you finish the JDBC-based DAO

		// Find by id - tests DAO's get 
		System.out.println("*** findById = 2 ***");
		System.out.println(cat.findById(new Long(2)));
		System.out.println("*** findById = 2 finished ***\n");
		
		ctx.close();  // Close the context		
   }
}
