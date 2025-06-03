/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.lang.reflect.Method
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 */
package com.squareup.otto;

import com.squareup.otto.EventHandler;
import com.squareup.otto.EventProducer;
import com.squareup.otto.Produce;
import com.squareup.otto.Subscribe;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class AnnotatedHandlerFinder {
    private static final ConcurrentMap<Class<?>, Map<Class<?>, Method>> PRODUCERS_CACHE = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, Map<Class<?>, Set<Method>>> SUBSCRIBERS_CACHE = new ConcurrentHashMap();

    private AnnotatedHandlerFinder() {
    }

    public static Map<Class<?>, EventProducer> findAllProducers(Object object) {
        Map map;
        Class clazz2 = object.getClass();
        HashMap hashMap = new HashMap();
        Object object2 = map = (Map)PRODUCERS_CACHE.get((Object)clazz2);
        if (map == null) {
            object2 = new HashMap();
            AnnotatedHandlerFinder.loadAnnotatedProducerMethods(clazz2, object2);
        }
        if (!object2.isEmpty()) {
            for (Class clazz2 : object2.entrySet()) {
                object2 = new EventProducer(object, (Method)clazz2.getValue());
                hashMap.put(clazz2.getKey(), object2);
            }
        }
        return hashMap;
    }

    public static Map<Class<?>, Set<EventHandler>> findAllSubscribers(Object object) {
        Map map3;
        Class clazz = object.getClass();
        HashMap hashMap = new HashMap();
        Map map2 = map3 = (Map)SUBSCRIBERS_CACHE.get((Object)clazz);
        if (map3 == null) {
            map2 = new HashMap();
            AnnotatedHandlerFinder.loadAnnotatedSubscriberMethods(clazz, map2);
        }
        if (!map2.isEmpty()) {
            for (Map map3 : map2.entrySet()) {
                map2 = new HashSet();
                Iterator iterator = ((Set)map3.getValue()).iterator();
                while (iterator.hasNext()) {
                    map2.add((Object)new EventHandler(object, (Method)iterator.next()));
                }
                hashMap.put(map3.getKey(), (Object)map2);
            }
        }
        return hashMap;
    }

    private static void loadAnnotatedMethods(Class<?> stringBuilder, Map<Class<?>, Method> map, Map<Class<?>, Set<Method>> map2) {
        for (Method method : stringBuilder.getDeclaredMethods()) {
            Class[] classArray;
            if (method.isBridge()) continue;
            if (method.isAnnotationPresent(Subscribe.class)) {
                classArray = method.getParameterTypes();
                if (classArray.length == 1) {
                    Class clazz = classArray[0];
                    if (!clazz.isInterface()) {
                        if ((1 & method.getModifiers()) != 0) {
                            Set set = (Set)map2.get((Object)clazz);
                            classArray = set;
                            if (set == null) {
                                classArray = new HashSet();
                                map2.put((Object)clazz, (Object)classArray);
                            }
                            classArray.add((Object)method);
                            continue;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Method ");
                        stringBuilder.append((Object)method);
                        stringBuilder.append(" has @Subscribe annotation on ");
                        stringBuilder.append((Object)clazz);
                        stringBuilder.append(" but is not 'public'.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Method ");
                    stringBuilder.append((Object)method);
                    stringBuilder.append(" has @Subscribe annotation on ");
                    stringBuilder.append((Object)clazz);
                    stringBuilder.append(" which is an interface.  Subscription must be on a concrete class type.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Method ");
                stringBuilder.append((Object)method);
                stringBuilder.append(" has @Subscribe annotation but requires ");
                throw new IllegalArgumentException(z2.q(stringBuilder, classArray.length, " arguments.  Methods must require a single argument."));
            }
            if (!method.isAnnotationPresent(Produce.class)) continue;
            classArray = method.getParameterTypes();
            if (classArray.length == 0) {
                if (method.getReturnType() != Void.class) {
                    classArray = method.getReturnType();
                    if (!classArray.isInterface()) {
                        if (!classArray.equals((Object)Void.TYPE)) {
                            if ((1 & method.getModifiers()) != 0) {
                                if (!map.containsKey((Object)classArray)) {
                                    map.put((Object)classArray, (Object)method);
                                    continue;
                                }
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Producer for type ");
                                stringBuilder.append((Object)classArray);
                                stringBuilder.append(" has already been registered.");
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Method ");
                            stringBuilder.append((Object)method);
                            stringBuilder.append(" has @Produce annotation on ");
                            stringBuilder.append((Object)classArray);
                            stringBuilder.append(" but is not 'public'.");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Method ");
                        stringBuilder.append((Object)method);
                        stringBuilder.append(" has @Produce annotation but has no return type.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Method ");
                    stringBuilder.append((Object)method);
                    stringBuilder.append(" has @Produce annotation on ");
                    stringBuilder.append((Object)classArray);
                    stringBuilder.append(" which is an interface.  Producers must return a concrete class type.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Method ");
                stringBuilder.append((Object)method);
                stringBuilder.append(" has a return type of void.  Must declare a non-void type.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Method ");
            stringBuilder.append((Object)method);
            stringBuilder.append("has @Produce annotation but requires ");
            throw new IllegalArgumentException(z2.q(stringBuilder, classArray.length, " arguments.  Methods must require zero arguments."));
        }
        PRODUCERS_CACHE.put(stringBuilder, map);
        SUBSCRIBERS_CACHE.put(stringBuilder, map2);
    }

    private static void loadAnnotatedProducerMethods(Class<?> clazz, Map<Class<?>, Method> map) {
        AnnotatedHandlerFinder.loadAnnotatedMethods(clazz, map, new HashMap());
    }

    private static void loadAnnotatedSubscriberMethods(Class<?> clazz, Map<Class<?>, Set<Method>> map) {
        AnnotatedHandlerFinder.loadAnnotatedMethods(clazz, new HashMap(), map);
    }
}

