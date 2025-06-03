// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.perf.session;

import java.util.Iterator;
import J4.c;
import java.util.concurrent.Executors;
import N4.d;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Future;
import com.google.firebase.perf.session.gauges.GaugeManager;
import J4.b;
import java.lang.ref.WeakReference;
import java.util.Set;
import B4.a;
import android.annotation.SuppressLint;
import androidx.annotation.Keep;

@Keep
public class SessionManager
{
    @SuppressLint({ "StaticFieldLeak" })
    private static final SessionManager instance;
    private final a appStateMonitor;
    private final Set<WeakReference<b>> clients;
    private final GaugeManager gaugeManager;
    private J4.a perfSession;
    private Future syncInitFuture;
    
    static {
        instance = new SessionManager();
    }
    
    private SessionManager() {
        this(GaugeManager.getInstance(), J4.a.c(""), a.b());
    }
    
    public SessionManager(final GaugeManager gaugeManager, final J4.a perfSession, final a appStateMonitor) {
        this.clients = new HashSet<WeakReference<b>>();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = appStateMonitor;
    }
    
    public static SessionManager getInstance() {
        return SessionManager.instance;
    }
    
    private void logGaugeMetadataIfCollectionEnabled(final d d) {
        if (this.perfSession.e()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.h(), d);
        }
    }
    
    private void startOrStopCollectingGauges(final d d) {
        if (this.perfSession.e()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, d);
            return;
        }
        this.gaugeManager.stopCollectingGauges();
    }
    
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }
    
    public void initializeGaugeCollection() {
        final d q = d.q;
        this.logGaugeMetadataIfCollectionEnabled(q);
        this.startOrStopCollectingGauges(q);
    }
    
    public final J4.a perfSession() {
        return this.perfSession;
    }
    
    public void registerForSessionUpdates(final WeakReference<b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }
    
    public void setApplicationContext(final Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new c(this, context, this.perfSession));
    }
    
    public void setPerfSession(final J4.a perfSession) {
        this.perfSession = perfSession;
    }
    
    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }
    
    public void unregisterForSessionUpdates(final WeakReference<b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }
    
    public void updatePerfSession(final J4.a perfSession) {
        if (perfSession.h() == this.perfSession.h()) {
            return;
        }
        this.perfSession = perfSession;
        final Set<WeakReference<b>> clients = this.clients;
        // monitorenter(clients)
        while (true) {
            try {
                final Iterator<WeakReference<b>> iterator = this.clients.iterator();
                while (iterator.hasNext()) {
                    final b b = iterator.next().get();
                    if (b != null) {
                        b.a(perfSession);
                    }
                    else {
                        iterator.remove();
                    }
                }
                // monitorexit(clients)
                this.logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.a());
                this.startOrStopCollectingGauges(this.appStateMonitor.a());
                return;
                // monitorexit(clients)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
