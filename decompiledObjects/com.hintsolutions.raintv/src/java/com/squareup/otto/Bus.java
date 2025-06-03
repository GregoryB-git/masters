/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.ConcurrentMap
 *  java.util.concurrent.CopyOnWriteArraySet
 */
package com.squareup.otto;

import com.squareup.otto.DeadEvent;
import com.squareup.otto.EventHandler;
import com.squareup.otto.EventProducer;
import com.squareup.otto.HandlerFinder;
import com.squareup.otto.ThreadEnforcer;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class Bus {
    public static final String DEFAULT_IDENTIFIER = "default";
    private final ThreadEnforcer enforcer;
    private final ThreadLocal<ConcurrentLinkedQueue<EventWithHandler>> eventsToDispatch;
    private final ConcurrentMap<Class<?>, Set<Class<?>>> flattenHierarchyCache;
    private final HandlerFinder handlerFinder;
    private final ConcurrentMap<Class<?>, Set<EventHandler>> handlersByType = new ConcurrentHashMap();
    private final String identifier;
    private final ThreadLocal<Boolean> isDispatching;
    private final ConcurrentMap<Class<?>, EventProducer> producersByType = new ConcurrentHashMap();

    public Bus() {
        this(DEFAULT_IDENTIFIER);
    }

    public Bus(ThreadEnforcer threadEnforcer) {
        this(threadEnforcer, DEFAULT_IDENTIFIER);
    }

    public Bus(ThreadEnforcer threadEnforcer, String string2) {
        this(threadEnforcer, string2, HandlerFinder.ANNOTATED);
    }

    public Bus(ThreadEnforcer threadEnforcer, String string2, HandlerFinder handlerFinder) {
        this.eventsToDispatch = new ThreadLocal<ConcurrentLinkedQueue<EventWithHandler>>(this){
            public final Bus this$0;
            {
                this.this$0 = bus;
            }

            public ConcurrentLinkedQueue<EventWithHandler> initialValue() {
                return new ConcurrentLinkedQueue();
            }
        };
        this.isDispatching = new ThreadLocal<Boolean>(this){
            public final Bus this$0;
            {
                this.this$0 = bus;
            }

            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        };
        this.flattenHierarchyCache = new ConcurrentHashMap();
        this.enforcer = threadEnforcer;
        this.identifier = string2;
        this.handlerFinder = handlerFinder;
    }

    public Bus(String string2) {
        this(ThreadEnforcer.MAIN, string2);
    }

    private void dispatchProducerResultToHandler(EventHandler eventHandler, EventProducer object) {
        try {
            Object object2;
            object = object2 = ((EventProducer)object).produceEvent();
        }
        catch (InvocationTargetException invocationTargetException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Producer ");
            stringBuilder.append(object);
            stringBuilder.append(" threw an exception.");
            Bus.throwRuntimeException(stringBuilder.toString(), invocationTargetException);
            object = null;
        }
        if (object == null) {
            return;
        }
        this.dispatch(object, eventHandler);
    }

    private Set<Class<?>> getClassesFor(Class<?> clazz) {
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        linkedList.add(clazz);
        while (!linkedList.isEmpty()) {
            clazz = (Class)linkedList.remove(0);
            hashSet.add((Object)clazz);
            if ((clazz = clazz.getSuperclass()) == null) continue;
            linkedList.add((Object)clazz);
        }
        return hashSet;
    }

    private static void throwRuntimeException(String string2, InvocationTargetException invocationTargetException) {
        Throwable throwable = invocationTargetException.getCause();
        if (throwable != null) {
            string2 = z2.u(string2, ": ");
            string2.append(throwable.getMessage());
            throw new RuntimeException(string2.toString(), throwable);
        }
        string2 = z2.u(string2, ": ");
        string2.append(invocationTargetException.getMessage());
        throw new RuntimeException(string2.toString(), (Throwable)invocationTargetException);
    }

    public void dispatch(Object object, EventHandler eventHandler) {
        try {
            eventHandler.handleEvent(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            StringBuilder stringBuilder = z2.t("Could not dispatch event: ");
            stringBuilder.append((Object)object.getClass());
            stringBuilder.append(" to handler ");
            stringBuilder.append((Object)eventHandler);
            Bus.throwRuntimeException(stringBuilder.toString(), invocationTargetException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void dispatchQueuedEvents() {
        if (((Boolean)this.isDispatching.get()).booleanValue()) {
            return;
        }
        this.isDispatching.set((Object)Boolean.TRUE);
        try {
            while (true) {
                EventWithHandler eventWithHandler;
                if ((eventWithHandler = (EventWithHandler)((ConcurrentLinkedQueue)this.eventsToDispatch.get()).poll()) == null) {
                    return;
                }
                if (!eventWithHandler.handler.isValid()) continue;
                this.dispatch(eventWithHandler.event, eventWithHandler.handler);
            }
        }
        finally {
            this.isDispatching.set((Object)Boolean.FALSE);
        }
    }

    public void enqueueEvent(Object object, EventHandler eventHandler) {
        ((ConcurrentLinkedQueue)this.eventsToDispatch.get()).offer((Object)new EventWithHandler(object, eventHandler));
    }

    public Set<Class<?>> flattenHierarchy(Class<?> set) {
        Set set2;
        Set set3 = set2 = (Set)this.flattenHierarchyCache.get(set);
        if (set2 == null && (set = (Set)this.flattenHierarchyCache.putIfAbsent(set, set3 = this.getClassesFor((Class<?>)set))) != null) {
            set3 = set;
        }
        return set3;
    }

    public Set<EventHandler> getHandlersForEventType(Class<?> clazz) {
        return (Set)this.handlersByType.get(clazz);
    }

    public EventProducer getProducerForEventType(Class<?> clazz) {
        return (EventProducer)this.producersByType.get(clazz);
    }

    public void post(Object object) {
        if (object != null) {
            this.enforcer.enforce(this);
            Iterator iterator = this.flattenHierarchy(object.getClass());
            boolean bl = false;
            iterator = iterator.iterator();
            block0: while (iterator.hasNext()) {
                Iterator iterator2 = this.getHandlersForEventType((Class)iterator.next());
                if (iterator2 == null || iterator2.isEmpty()) continue;
                boolean bl2 = true;
                iterator2 = iterator2.iterator();
                while (true) {
                    bl = bl2;
                    if (!iterator2.hasNext()) continue block0;
                    this.enqueueEvent(object, (EventHandler)iterator2.next());
                }
            }
            if (!bl && !(object instanceof DeadEvent)) {
                this.post(new DeadEvent(this, object));
            }
            this.dispatchQueuedEvents();
            return;
        }
        throw new NullPointerException("Event to post must not be null.");
    }

    public void register(Object object) {
        if (object != null) {
            EventProducer eventProducer;
            Set set2;
            this.enforcer.enforce(this);
            Object object22 = this.handlerFinder.findAllProducers(object);
            for (Set set2 : object22.keySet()) {
                EventProducer eventProducer2 = (EventProducer)this.producersByType.putIfAbsent(set2, (Object)(eventProducer = (EventProducer)object22.get(set2)));
                if (eventProducer2 == null) {
                    if ((set2 = (Set)this.handlersByType.get(set2)) == null || set2.isEmpty()) continue;
                    set2 = set2.iterator();
                    while (set2.hasNext()) {
                        this.dispatchProducerResultToHandler((EventHandler)set2.next(), eventProducer);
                    }
                    continue;
                }
                object = new StringBuilder();
                object.append("Producer method for type ");
                object.append((Object)set2);
                object.append(" found on type ");
                object.append((Object)eventProducer.target.getClass());
                object.append(", but already registered by type ");
                object.append((Object)eventProducer2.target.getClass());
                object.append(".");
                throw new IllegalArgumentException(object.toString());
            }
            set2 = this.handlerFinder.findAllSubscribers(object);
            for (Object object22 : set2.keySet()) {
                eventProducer = (Set)this.handlersByType.get(object22);
                object = eventProducer;
                if (eventProducer == null && (eventProducer = (Set)this.handlersByType.putIfAbsent(object22, object = new CopyOnWriteArraySet())) != null) {
                    object = eventProducer;
                }
                if (object.addAll((Collection)((Set)set2.get(object22)))) continue;
                throw new IllegalArgumentException("Object already registered.");
            }
            block3: for (Iterator iterator : set2.entrySet()) {
                eventProducer = (Class)iterator.getKey();
                if ((eventProducer = (EventProducer)this.producersByType.get((Object)eventProducer)) == null || !eventProducer.isValid()) continue;
                iterator = ((Set)iterator.getValue()).iterator();
                while (iterator.hasNext()) {
                    object22 = (EventHandler)iterator.next();
                    if (!eventProducer.isValid()) continue block3;
                    if (!((EventHandler)object22).isValid()) continue;
                    this.dispatchProducerResultToHandler((EventHandler)object22, eventProducer);
                }
            }
            return;
        }
        throw new NullPointerException("Object to register must not be null.");
    }

    public String toString() {
        return z2.s(z2.t("[Bus \""), this.identifier, "\"]");
    }

    public void unregister(Object object) {
        if (object != null) {
            Set<EventHandler> set;
            Iterator iterator;
            this.enforcer.enforce(this);
            for (Object object2 : this.handlerFinder.findAllProducers(object).entrySet()) {
                iterator = (Class)object2.getKey();
                set = this.getProducerForEventType((Class<?>)iterator);
                if ((object2 = (EventProducer)object2.getValue()) != null && ((EventProducer)object2).equals(set)) {
                    ((EventProducer)this.producersByType.remove((Object)iterator)).invalidate();
                    continue;
                }
                iterator = z2.t("Missing event producer for an annotated method. Is ");
                iterator.append((Object)object.getClass());
                iterator.append(" registered?");
                throw new IllegalArgumentException(iterator.toString());
            }
            iterator = this.handlerFinder.findAllSubscribers(object).entrySet().iterator();
            while (iterator.hasNext()) {
                Iterator iterator2 = (Map.Entry)iterator.next();
                set = this.getHandlersForEventType((Class)iterator2.getKey());
                iterator2 = (Collection)iterator2.getValue();
                if (set != null && set.containsAll((Collection)iterator2)) {
                    for (EventHandler eventHandler : set) {
                        if (!iterator2.contains((Object)eventHandler)) continue;
                        eventHandler.invalidate();
                    }
                    set.removeAll((Collection)iterator2);
                    continue;
                }
                iterator = z2.t("Missing event handler for an annotated method. Is ");
                iterator.append((Object)object.getClass());
                iterator.append(" registered?");
                throw new IllegalArgumentException(iterator.toString());
            }
            return;
        }
        throw new NullPointerException("Object to unregister must not be null.");
    }

    public static class EventWithHandler {
        public final Object event;
        public final EventHandler handler;

        public EventWithHandler(Object object, EventHandler eventHandler) {
            this.event = object;
            this.handler = eventHandler;
        }
    }
}

