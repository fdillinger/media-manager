package de.fd.mediamanager.dao.hibernate;

import de.fd.mediamanager.model.book.Book;

public class BookHibernateDAO extends HibernateDAO {

	public void addBook(Book book){
    	Long id = (Long)getCurrentSession().save(book);
    	System.out.println("ID: " + id);
	}
	
}
