package Repository;

import com.pluralsight.bookstore.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BookRepository {

    @PersistenceContext(unitName = "bookStorePU")
    private EntityManager em;

    public Book find(Long id) {
        return em.find(Book.class, id);
    }

    public Book create(Book book) {
        em.persist(book);
        return book;
    }

    public void delete(Long id) {
        em.remove(em.getReference(Book.class, id));
    }

}
