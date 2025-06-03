/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.squareup.otto.HandlerFinder$1
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Map
 *  java.util.Set
 */
package com.squareup.otto;

import com.squareup.otto.EventHandler;
import com.squareup.otto.EventProducer;
import com.squareup.otto.HandlerFinder;
import java.util.Map;
import java.util.Set;

interface HandlerFinder {
    public static final HandlerFinder ANNOTATED = new 1();

    public Map<Class<?>, EventProducer> findAllProducers(Object var1);

    public Map<Class<?>, Set<EventHandler>> findAllSubscribers(Object var1);
}

