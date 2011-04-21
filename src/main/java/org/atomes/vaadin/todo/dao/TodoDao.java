/**
 * 
 */
package org.atomes.vaadin.todo.dao;

import org.atomes.vaadin.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yann Vigara
 */
public interface TodoDao extends JpaRepository<Todo, Long>
{

}
