/**
 * 
 */
package org.atomes.vaadin.todo.service;

import javax.inject.Named;
import javax.inject.Singleton;

import com.mycila.event.Dispatcher;
import com.mycila.event.Dispatchers;
import com.mycila.event.Subscriber;
import com.mycila.event.Topic;
import com.mycila.event.Topics;

/**
 * @author Yann Vigara
 */
@Named("eventBuss")
@Singleton
public class EventBus
{

    private final Dispatcher dispatcher = Dispatchers.synchronousSafe();

    /**
     * @param <E>
     * @param pTopic
     * @param pSource
     * @see com.mycila.event.Dispatcher#publish(com.mycila.event.Topic,
     *      java.lang.Object)
     */
    public <E> void publish(Topic pTopic, E pSource)
    {
        dispatcher.publish(pTopic, pSource);
    }

    /**
     * @param <E>
     * @param pMatcher
     * @param pEventType
     * @param pSubscriber
     * @see com.mycila.event.Dispatcher#subscribe(com.mycila.event.Topics,
     *      java.lang.Class, com.mycila.event.Subscriber)
     */
    public <E> void subscribe(Topics pMatcher, Class< ? > pEventType, Subscriber<E> pSubscriber)
    {
        dispatcher.subscribe(pMatcher, pEventType, pSubscriber);
    }

    /**
     * @param <E>
     * @param pSubscriber
     * @see com.mycila.event.Dispatcher#unsubscribe(com.mycila.event.Subscriber)
     */
    public <E> void unsubscribe(Subscriber<E> pSubscriber)
    {
        dispatcher.unsubscribe(pSubscriber);
    }

    /**
     * @param <E>
     * @param pMatcher
     * @param pSubscriber
     * @see com.mycila.event.Dispatcher#unsubscribe(com.mycila.event.Topics,
     *      com.mycila.event.Subscriber)
     */
    public <E> void unsubscribe(Topics pMatcher, Subscriber<E> pSubscriber)
    {
        dispatcher.unsubscribe(pMatcher, pSubscriber);
    }
}
