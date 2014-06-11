package de.mediamanager.dao.api.hibernate;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.AbstractTransactionalSpringContextTests;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import de.fd.mediamanager.dao.hibernate.AudioBookHibernateDAO;
import de.fd.mediamanager.dao.hibernate.BookHibernateDAO;
import de.fd.mediamanager.model.Author;
import de.fd.mediamanager.model.Lector;
import de.fd.mediamanager.model.audiobook.AudioBook;

@ContextConfiguration
@TransactionConfiguration

public class SpringHibernateAtomicosTest extends AbstractTransactionalSpringContextTests{
	
    private AudioBookHibernateDAO hibernateDAO = null;
	private BookHibernateDAO bookDAO = null;
    
    @Override
    protected String[] getConfigLocations() {
        return new String[]{"classpath:mediamanager-Hibernate-DAO-Test.xml"};
    }
    
    
	@Autowired
	@Qualifier("mediaManagerHibernateSessionFactory")
	SessionFactory sessionFactory;
	
	
	
	@Test
	@Transactional
	@Rollback(false)
	public void testcreateAudioBook() {
		
		Author author = new Author();
	    author.setId(88L);
		author.setFirstname("Test firstname2");
		author.setSurname("Test SureName2");
		
		Lector lector = new Lector();
		lector.setId(44L);
		lector.setFirstname("Lector first2");
		lector.setSurname("lector SureName2");
	
		AudioBook book = new AudioBook();
		book.setId(33L);
		book.setName("Test book");
		book.addAuthor(author);
		book.addLector(lector);
		
		hibernateDAO = new AudioBookHibernateDAO();
		hibernateDAO.setSessionFactory(sessionFactory);
		hibernateDAO.addAudioBook(book);
//		
		
		
		
		
//		Book book = new Book();
//		book.setName("Book name");
//		book.setISBN("isbn");
//		
//		Author author = new Author();
//		author.setFirstname("Test firstname2");
//		author.setSurname("Test SureName2");
//		
//		
//		bookDAO = new BookHibernateDAO();
//		bookDAO.setSessionFactory(sessionFactory);
//		bookDAO.addBook(book);
		
		
//		Collection<IBook> authors = hibernateDAO.findBooks();
//		System.out.println("Size: "+  authors.size());
	}
	
	
	
////	@Test
//	public void testFindAllAuthors() {
//		hibernateDAO = new AudioBookHibernateDAO();
//		hibernateDAO.setSessionFactory(sessionFactory);
//		Collection<IBook> authors = hibernateDAO.findBooks();
//		System.out.println("Size: "+  authors.size());
//	}
//	
////	@Test
//	public void testFindAllAudioBooks() {
//		hibernateDAO = new AudioBookHibernateDAO();
//		hibernateDAO.setSessionFactory(sessionFactory);
//		Collection<IAudioBook> authors = hibernateDAO.findAudioBooks();
//		System.out.println("Size: "+  authors.size());
//	}
//	
	
}
