/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.internal.SessionMonitor$1
 *  com.twitter.sdk.android.core.internal.SystemCurrentTimeProvider
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Calendar
 *  java.util.TimeZone
 *  java.util.concurrent.ExecutorService
 */
package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.internal.ActivityLifecycleManager;
import com.twitter.sdk.android.core.internal.SessionMonitor;
import com.twitter.sdk.android.core.internal.SessionVerifier;
import com.twitter.sdk.android.core.internal.SystemCurrentTimeProvider;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;

public class SessionMonitor<T extends Session> {
    private final ExecutorService executorService;
    public final MonitorState monitorState;
    private final SessionManager<T> sessionManager;
    private final SessionVerifier sessionVerifier;
    private final SystemCurrentTimeProvider time;

    public SessionMonitor(SessionManager<T> sessionManager, SystemCurrentTimeProvider systemCurrentTimeProvider, ExecutorService executorService, MonitorState monitorState, SessionVerifier sessionVerifier) {
        this.time = systemCurrentTimeProvider;
        this.sessionManager = sessionManager;
        this.executorService = executorService;
        this.monitorState = monitorState;
        this.sessionVerifier = sessionVerifier;
    }

    public SessionMonitor(SessionManager<T> sessionManager, ExecutorService executorService, SessionVerifier<T> sessionVerifier) {
        this(sessionManager, new SystemCurrentTimeProvider(), executorService, new MonitorState(), sessionVerifier);
    }

    public void monitorActivityLifecycle(ActivityLifecycleManager activityLifecycleManager) {
        activityLifecycleManager.registerCallbacks((ActivityLifecycleManager.Callbacks)new 1(this));
    }

    public void triggerVerificationIfNecessary() {
        T t = this.sessionManager.getActiveSession();
        long l = this.time.getCurrentTimeMillis();
        boolean bl = t != null && this.monitorState.beginVerification(l);
        if (bl) {
            this.executorService.submit(new Runnable(this){
                public final SessionMonitor this$0;
                {
                    this.this$0 = sessionMonitor;
                }

                public void run() {
                    this.this$0.verifyAll();
                }
            });
        }
    }

    public void verifyAll() {
        for (Session session : this.sessionManager.getSessionMap().values()) {
            this.sessionVerifier.verifySession(session);
        }
        this.monitorState.endVerification(this.time.getCurrentTimeMillis());
    }

    public static class MonitorState {
        private static final long TIME_THRESHOLD_IN_MILLIS = 21600000L;
        public long lastVerification;
        private final Calendar utcCalendar = Calendar.getInstance((TimeZone)TimeZone.getTimeZone((String)"UTC"));
        public boolean verifying;

        private boolean isOnSameDate(long l, long l2) {
            this.utcCalendar.setTimeInMillis(l);
            int n = this.utcCalendar.get(6);
            Calendar calendar = this.utcCalendar;
            boolean bl = true;
            int n2 = calendar.get(1);
            this.utcCalendar.setTimeInMillis(l2);
            int n3 = this.utcCalendar.get(6);
            int n4 = this.utcCalendar.get(1);
            if (n != n3 || n2 != n4) {
                bl = false;
            }
            return bl;
        }

        public boolean beginVerification(long l) {
            MonitorState monitorState = this;
            synchronized (monitorState) {
                block6: {
                    long l2 = this.lastVerification;
                    boolean bl = l - l2 > 21600000L;
                    boolean bl2 = !this.isOnSameDate(l, l2);
                    if (this.verifying || !bl && !bl2) break block6;
                    this.verifying = true;
                    return true;
                }
                return false;
            }
        }

        public void endVerification(long l) {
            MonitorState monitorState = this;
            synchronized (monitorState) {
                this.verifying = false;
                this.lastVerification = l;
                return;
            }
        }
    }
}

