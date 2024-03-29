package br.com.amil.repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;

public abstract class Repository<T, I extends Serializable> {
	
	protected final Session session;
	protected final Class<T> clazz;

	protected Repository(Session session) {
		this.session = session;
		
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		this.clazz = clazz;
	}
	
	public void create(T entity) {
		session.persist(entity);
	}
	
	@SuppressWarnings("unchecked")
	public T update(T entity) {
		return (T) session.merge(entity);
	}
	
	public void destroy(T entity) {
		session.delete(entity);
	}
	
	@SuppressWarnings("unchecked")
	public T find(I id) {
		return (T) session.get(clazz, id);
	}
	
	public List<T> findAll() {
		Query query = session.createQuery("from " + clazz.getName());

		@SuppressWarnings("unchecked")
		List<T> resultList = query.list();

		return resultList;
	}
	
	public List<T> findByParameters(T entity){
		return session
				.createCriteria(clazz)
				.add(Example.create(entity).enableLike(MatchMode.ANYWHERE).ignoreCase())
				.list();
	}
}