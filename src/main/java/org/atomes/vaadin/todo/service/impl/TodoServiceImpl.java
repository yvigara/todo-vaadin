/**
 * 
 */
package org.atomes.vaadin.todo.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.atomes.vaadin.todo.dao.TodoDao;
import org.atomes.vaadin.todo.model.Todo;
import org.atomes.vaadin.todo.service.TodoService;

/**
 * @author Yann Vigara
 */
@Named("todoService")
@Singleton
public class TodoServiceImpl implements TodoService
{

    @Inject
    private TodoDao mTodoDao;

    /*
     * (non-Javadoc)
     * @see
     * org.atomes.vaadin.todo.service.TodoService#addTodo(org.atomes.vaadin.
     * todo.model.Todo)
     */
    @Override
    public Todo saveTodo(Todo pTodo)
    {
        return mTodoDao.save(pTodo);

    }

    /*
     * (non-Javadoc)
     * @see
     * org.atomes.vaadin.todo.service.TodoService#deleteTodo(org.atomes.vaadin
     * .todo.model.Todo)
     */
    @Override
    public void deleteTodo(Todo pTodo)
    {
        mTodoDao.delete(pTodo);
    }

    /*
     * (non-Javadoc)
     * @see org.atomes.vaadin.todo.service.TodoService#findAllTodos()
     */
    @Override
    public List<Todo> findAllTodos()
    {
        return mTodoDao.findAll();
    }

    /*
     * (non-Javadoc)
     * @see org.atomes.vaadin.todo.service.TodoService#getTodo(java.lang.String)
     */
    @Override
    public Todo getTodo(Long id)
    {
        return mTodoDao.findOne(id);
    }

}
