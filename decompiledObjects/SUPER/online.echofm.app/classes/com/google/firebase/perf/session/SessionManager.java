package com.google.firebase.perf.session;

import J4.b;
import J4.c;
import N4.d;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Keep
public class SessionManager
{
  @SuppressLint({"StaticFieldLeak"})
  private static final SessionManager instance = new SessionManager();
  private final B4.a appStateMonitor;
  private final Set<WeakReference<b>> clients = new HashSet();
  private final GaugeManager gaugeManager;
  private J4.a perfSession;
  private Future syncInitFuture;
  
  private SessionManager()
  {
    this(GaugeManager.getInstance(), J4.a.c(""), B4.a.b());
  }
  
  public SessionManager(GaugeManager paramGaugeManager, J4.a parama, B4.a parama1)
  {
    gaugeManager = paramGaugeManager;
    perfSession = parama;
    appStateMonitor = parama1;
  }
  
  public static SessionManager getInstance()
  {
    return instance;
  }
  
  private void logGaugeMetadataIfCollectionEnabled(d paramd)
  {
    if (perfSession.e()) {
      gaugeManager.logGaugeMetadata(perfSession.h(), paramd);
    }
  }
  
  private void startOrStopCollectingGauges(d paramd)
  {
    if (perfSession.e()) {
      gaugeManager.startCollectingGauges(perfSession, paramd);
    } else {
      gaugeManager.stopCollectingGauges();
    }
  }
  
  public Future getSyncInitFuture()
  {
    return syncInitFuture;
  }
  
  public void initializeGaugeCollection()
  {
    d locald = d.q;
    logGaugeMetadataIfCollectionEnabled(locald);
    startOrStopCollectingGauges(locald);
  }
  
  public final J4.a perfSession()
  {
    return perfSession;
  }
  
  public void registerForSessionUpdates(WeakReference<b> paramWeakReference)
  {
    synchronized (clients)
    {
      clients.add(paramWeakReference);
      return;
    }
  }
  
  public void setApplicationContext(Context paramContext)
  {
    J4.a locala = perfSession;
    syncInitFuture = Executors.newSingleThreadExecutor().submit(new c(this, paramContext, locala));
  }
  
  public void setPerfSession(J4.a parama)
  {
    perfSession = parama;
  }
  
  public void stopGaugeCollectionIfSessionRunningTooLong()
  {
    if (perfSession.f()) {
      gaugeManager.stopCollectingGauges();
    }
  }
  
  public void unregisterForSessionUpdates(WeakReference<b> paramWeakReference)
  {
    synchronized (clients)
    {
      clients.remove(paramWeakReference);
      return;
    }
  }
  
  public void updatePerfSession(J4.a parama)
  {
    if (parama.h() == perfSession.h()) {
      return;
    }
    perfSession = parama;
    Iterator localIterator;
    synchronized (clients)
    {
      localIterator = clients.iterator();
      if (localIterator.hasNext())
      {
        b localb = (b)((WeakReference)localIterator.next()).get();
        if (localb != null) {
          localb.a(parama);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.perf.session.SessionManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */