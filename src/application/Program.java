package application;

import model.dao.SellerDao;
import model.dao.impl.DaoFactory;
import model.entities.Department;

public class Program {
	
	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(obj);
	}

}
