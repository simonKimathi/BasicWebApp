package com.systech.mmm.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AbstractBean<E,ID> {
  E create(E entity);
  E edit(E entity);
  void remove(E entity);

  void deleteById(ID id);

  E find(ID id);

  Optional<E> findById(ID id);

  boolean existsById(ID id);

  List<E> findAll();
  List<E> findRange(int startPosition, int size);
  List<E> findRange(int startPosition, int size, String entityGraph);
  int count();
  Optional<E> findSingleByNamedQuery(String namedQueryName);
  Optional<E> findSingleByNamedQuery(String namedQueryName, Map<String, Object> parameters);
  Optional<E> findSingleByNamedQuery(String namedQueryName, String entityGraph, Map<String, Object> parameters);
  List<E> findByNamedQuery(String namedQueryName);
  List<E> findByNamedQuery(String namedQueryName, Map<String, Object> parameters);
  List<E> findByNamedQuery(String namedQueryName, int resultLimit);
  List<E> findByNamedQuery(String namedQueryName, Map<String, Object> parameters, int resultLimit);
}
