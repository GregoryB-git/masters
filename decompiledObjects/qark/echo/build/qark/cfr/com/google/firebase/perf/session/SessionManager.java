/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 */
package com.google.firebase.perf.session;

import B4.a;
import J4.b;
import J4.c;
import N4.d;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Keep
public class SessionManager {
    @SuppressLint(value={"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<b>> clients = new HashSet();
    private final GaugeManager gaugeManager;
    private J4.a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), J4.a.c(""), a.b());
    }

    public SessionManager(GaugeManager gaugeManager, J4.a a8, a a9) {
        this.gaugeManager = gaugeManager;
        this.perfSession = a8;
        this.appStateMonitor = a9;
    }

    public static /* synthetic */ void a(SessionManager sessionManager, Context context, J4.a a8) {
        sessionManager.lambda$setApplicationContext$0(context, a8);
    }

    public static SessionManager getInstance() {
        return instance;
    }

    private /* synthetic */ void lambda$setApplicationContext$0(Context context, J4.a a8) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (a8.e()) {
            this.gaugeManager.logGaugeMetadata(a8.h(), d.q);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(d d8) {
        if (this.perfSession.e()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.h(), d8);
        }
    }

    private void startOrStopCollectingGauges(d d8) {
        if (this.perfSession.e()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, d8);
            return;
        }
        this.gaugeManager.stopCollectingGauges();
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        d d8 = d.q;
        this.logGaugeMetadataIfCollectionEnabled(d8);
        this.startOrStopCollectingGauges(d8);
    }

    public final J4.a perfSession() {
        return this.perfSession;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void registerForSessionUpdates(WeakReference<b> weakReference) {
        Set<WeakReference<b>> set = this.clients;
        synchronized (set) {
            this.clients.add(weakReference);
            return;
        }
    }

    public void setApplicationContext(Context context) {
        J4.a a8 = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit((Runnable)new c(this, context, a8));
    }

    public void setPerfSession(J4.a a8) {
        this.perfSession = a8;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void unregisterForSessionUpdates(WeakReference<b> weakReference) {
        Set<WeakReference<b>> set = this.clients;
        synchronized (set) {
            this.clients.remove(weakReference);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void updatePerfSession(J4.a a8) {
        if (a8.h() == this.perfSession.h()) {
            return;
        }
        this.perfSession = a8;
        Set<WeakReference<b>> set = this.clients;
        // MONITORENTER : set
        Iterator iterator = this.clients.iterator();
        while (iterator.hasNext()) {
            b b8 = (b)((WeakReference)iterator.next()).get();
            if (b8 != null) {
                b8.a(a8);
                continue;
            }
            iterator.remove();
        }
        // MONITOREXIT : set
        this.logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.a());
        this.startOrStopCollectingGauges(this.appStateMonitor.a());
    }
}

