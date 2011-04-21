package org.atomes.vaadin.todo.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractSecureObject implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 4630638289797260365L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * @param pId
     *            the id to set
     */
    public void setId(Long pId)
    {
        id = pId;
    }

}
