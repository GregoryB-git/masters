/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.atomic.AtomicReference
 */
package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStoreStrategy;
import com.twitter.sdk.android.core.internal.persistence.SerializationStrategy;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class PersistedSessionManager<T extends Session>
implements SessionManager<T> {
    private static final int NUM_SESSIONS = 1;
    private final AtomicReference<T> activeSessionRef;
    private final PreferenceStoreStrategy<T> activeSessionStorage;
    private final String prefKeySession;
    private final PreferenceStore preferenceStore;
    private volatile boolean restorePending = true;
    private final SerializationStrategy<T> serializer;
    private final ConcurrentHashMap<Long, T> sessionMap;
    private final ConcurrentHashMap<Long, PreferenceStoreStrategy<T>> storageMap;

    public PersistedSessionManager(PreferenceStore preferenceStore, SerializationStrategy<T> serializationStrategy, String string2, String string3) {
        this(preferenceStore, serializationStrategy, new ConcurrentHashMap(1), new ConcurrentHashMap(1), new PreferenceStoreStrategy<T>(preferenceStore, serializationStrategy, string2), string3);
    }

    public PersistedSessionManager(PreferenceStore preferenceStore, SerializationStrategy<T> serializationStrategy, ConcurrentHashMap<Long, T> concurrentHashMap, ConcurrentHashMap<Long, PreferenceStoreStrategy<T>> concurrentHashMap2, PreferenceStoreStrategy<T> preferenceStoreStrategy, String string2) {
        this.preferenceStore = preferenceStore;
        this.serializer = serializationStrategy;
        this.sessionMap = concurrentHashMap;
        this.storageMap = concurrentHashMap2;
        this.activeSessionStorage = preferenceStoreStrategy;
        this.activeSessionRef = new AtomicReference();
        this.prefKeySession = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void internalSetSession(long l, T t, boolean bl) {
        this.sessionMap.put((Object)l, t);
        AtomicReference<T> atomicReference = (AtomicReference<T>)this.storageMap.get((Object)l);
        PreferenceStoreStrategy<T> preferenceStoreStrategy = atomicReference;
        if (atomicReference == null) {
            preferenceStoreStrategy = new PreferenceStoreStrategy<T>(this.preferenceStore, this.serializer, this.getPrefKey(l));
            this.storageMap.putIfAbsent((Object)l, preferenceStoreStrategy);
        }
        preferenceStoreStrategy.save(t);
        preferenceStoreStrategy = (Session)this.activeSessionRef.get();
        if (preferenceStoreStrategy == null || ((Session)((Object)preferenceStoreStrategy)).getId() == l || bl) {
            PersistedSessionManager persistedSessionManager = this;
            synchronized (persistedSessionManager) {
                atomicReference = this.activeSessionRef;
                while (!atomicReference.compareAndSet(preferenceStoreStrategy, t) && atomicReference.get() == preferenceStoreStrategy) {
                }
                this.activeSessionStorage.save(t);
            }
        }
    }

    private void restoreActiveSession() {
        Session session = (Session)this.activeSessionStorage.restore();
        if (session != null) {
            this.internalSetSession(session.getId(), session, false);
        }
    }

    private void restoreAllSessions() {
        PersistedSessionManager persistedSessionManager = this;
        synchronized (persistedSessionManager) {
            if (this.restorePending) {
                this.restoreActiveSession();
                this.restoreSessions();
                this.restorePending = false;
            }
            return;
        }
    }

    private void restoreSessions() {
        for (Object object : this.preferenceStore.get().getAll().entrySet()) {
            if (!this.isSessionPreferenceKey((String)object.getKey()) || (object = (Session)this.serializer.deserialize((String)object.getValue())) == null) continue;
            this.internalSetSession(((Session)object).getId(), object, false);
        }
    }

    @Override
    public void clearActiveSession() {
        this.restoreAllSessionsIfNecessary();
        if (this.activeSessionRef.get() != null) {
            this.clearSession(((Session)this.activeSessionRef.get()).getId());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void clearSession(long l) {
        this.restoreAllSessionsIfNecessary();
        if (this.activeSessionRef.get() != null && ((Session)this.activeSessionRef.get()).getId() == l) {
            PersistedSessionManager persistedSessionManager = this;
            synchronized (persistedSessionManager) {
                this.activeSessionRef.set(null);
                this.activeSessionStorage.clear();
            }
        }
        this.sessionMap.remove((Object)l);
        PreferenceStoreStrategy preferenceStoreStrategy = (PreferenceStoreStrategy)this.storageMap.remove((Object)l);
        if (preferenceStoreStrategy != null) {
            preferenceStoreStrategy.clear();
        }
    }

    @Override
    public T getActiveSession() {
        this.restoreAllSessionsIfNecessary();
        return (T)((Session)this.activeSessionRef.get());
    }

    public String getPrefKey(long l) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.prefKeySession);
        stringBuilder.append("_");
        stringBuilder.append(l);
        return stringBuilder.toString();
    }

    @Override
    public T getSession(long l) {
        this.restoreAllSessionsIfNecessary();
        return (T)((Session)this.sessionMap.get((Object)l));
    }

    @Override
    public Map<Long, T> getSessionMap() {
        this.restoreAllSessionsIfNecessary();
        return Collections.unmodifiableMap(this.sessionMap);
    }

    public boolean isSessionPreferenceKey(String string2) {
        return string2.startsWith(this.prefKeySession);
    }

    public void restoreAllSessionsIfNecessary() {
        if (this.restorePending) {
            this.restoreAllSessions();
        }
    }

    @Override
    public void setActiveSession(T t) {
        if (t != null) {
            this.restoreAllSessionsIfNecessary();
            this.internalSetSession(((Session)t).getId(), t, true);
            return;
        }
        throw new IllegalArgumentException("Session must not be null!");
    }

    @Override
    public void setSession(long l, T t) {
        if (t != null) {
            this.restoreAllSessionsIfNecessary();
            this.internalSetSession(l, t, false);
            return;
        }
        throw new IllegalArgumentException("Session must not be null!");
    }
}

