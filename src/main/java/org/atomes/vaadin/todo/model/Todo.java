/**
 * 
 */
package org.atomes.vaadin.todo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Yann Vigara
 */
@Entity
public class Todo extends AbstractSecureObject
{

    public enum Priority {
        SUPER_HIGH("Very urgent"), HIGH("Urgent"), NORMAL("Normal"), LOW("Low"), SUPER_LOW(
        "Super Low");

        private final String text;

        Priority(String text)
        {
            this.text = text;
        }

        /**
         * @return the prefix
         */
        public String getText()
        {
            return text;
        }
    }

    private String title;

    private boolean todoDone = false;

    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "priority", nullable = true)
    private Priority priority;

    private Double progress = new Double(0);

    private String description;

    /**
 * 
 */
    public Todo()
    {
    }

    /**
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @param pTitle
     *            the title to set
     */
    public void setTitle(String pTitle)
    {
        title = pTitle;
    }

    /**
     * @return the todoDone
     */
    public boolean isTodoDone()
    {
        return todoDone;
    }

    /**
     * @param pTodoDone
     *            the todoDone to set
     */
    public void setTodoDone(boolean pTodoDone)
    {
        todoDone = pTodoDone;
    }

    /**
     * @return the dueDate
     */
    public Date getDueDate()
    {
        return dueDate;
    }

    /**
     * @param pDueDate
     *            the dueDate to set
     */
    public void setDueDate(Date pDueDate)
    {
        dueDate = pDueDate;
    }

    /**
     * @return the priority
     */
    public Priority getPriority()
    {
        return priority;
    }

    /**
     * @param pPriority
     *            the priority to set
     */
    public void setPriority(Priority pPriority)
    {
        priority = pPriority;
    }

    /**
     * @return the progress
     */
    public Double getProgress()
    {
        return progress;
    }

    /**
     * @param pProgress
     *            the progress to set
     */
    public void setProgress(Double pProgress)
    {
        progress = pProgress;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @param pDescription
     *            the description to set
     */
    public void setDescription(String pDescription)
    {
        description = pDescription;
    }

    // public static List<Todo> fetch(int page, int pageSize) {
    // return Todo.find("from Todo t order by dueDate").fetch(page, pageSize);
    // }
}