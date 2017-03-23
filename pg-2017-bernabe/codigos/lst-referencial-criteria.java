
	public List<Administrador> findByName(String param) {	
		
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		
		CriteriaQuery<Administrador> cq = cb.createQuery(Administrador.class);
		
		Root<Administrador> root = cq.from(Administrador.class);
		
		cq.where( cb.like(cb.lower(root.get(Administrador_.nome)), param.toLowerCase()+"%")) ;
		
		TypedQuery<Administrador> query = entityManager.createQuery(cq);
		
		List<Administrador> result = query.getResultList();
		
		return result;
	}
