/**
 * 
 */
package org.atomes.vaadin.todo.service;

import java.util.List;

import org.atomes.vaadin.todo.model.Todo;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Yann Vigara
 */
public interface TodoService
{

    @Transactional(propagation = Propagation.REQUIRED)
    public Todo saveTodo(Todo pTodo);

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteTodo(Todo pTodo);

    public List<Todo> findAllTodos();

    public Todo getTodo(Long id);

}
