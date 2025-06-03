package com.google.firebase.messaging;

import V2.j;
import V2.k;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public abstract class i
  extends Service
{
  static final long MESSAGE_TIMEOUT_S = 20L;
  private static final String TAG = "EnhancedIntentService";
  private Binder binder;
  final ExecutorService executor = o.d();
  private int lastStartId;
  private final Object lock = new Object();
  private int runningTasks = 0;
  
  public final void c(Intent arg1)
  {
    if (??? != null) {
      j0.c(???);
    }
    synchronized (lock)
    {
      int i = runningTasks - 1;
      runningTasks = i;
      if (i == 0) {
        stopSelfResultHook(lastStartId);
      }
    }
    return;
    throw ((Throwable)localObject);
  }
  
  public final j f(Intent paramIntent)
  {
    if (handleIntentOnMainThread(paramIntent)) {
      return V2.m.e(null);
    }
    k localk = new k();
    executor.execute(new h(this, paramIntent, localk));
    return localk.a();
  }
  
  public abstract Intent getStartCommandIntent(Intent paramIntent);
  
  public abstract void handleIntent(Intent paramIntent);
  
  public boolean handleIntentOnMainThread(Intent paramIntent)
  {
    return false;
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    try
    {
      if (Log.isLoggable("EnhancedIntentService", 3)) {
        Log.d("EnhancedIntentService", "Service received bind request");
      }
    }
    finally
    {
      break label65;
    }
    if (binder == null)
    {
      paramIntent = new com/google/firebase/messaging/l0;
      a locala = new com/google/firebase/messaging/i$a;
      locala.<init>(this);
      paramIntent.<init>(locala);
      binder = paramIntent;
    }
    paramIntent = binder;
    return paramIntent;
    label65:
    throw paramIntent;
  }
  
  public void onDestroy()
  {
    executor.shutdown();
    super.onDestroy();
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    synchronized (lock)
    {
      lastStartId = paramInt2;
      runningTasks += 1;
      ??? = getStartCommandIntent(paramIntent);
      if (??? == null)
      {
        c(paramIntent);
        return 2;
      }
      ??? = f((Intent)???);
      if (((j)???).m())
      {
        c(paramIntent);
        return 2;
      }
      ((j)???).c(new r1.m(), new g(this, paramIntent));
      return 3;
    }
  }
  
  public boolean stopSelfResultHook(int paramInt)
  {
    return stopSelfResult(paramInt);
  }
  
  public class a
    implements l0.a
  {
    public a() {}
    
    public j a(Intent paramIntent)
    {
      return i.access$000(i.this, paramIntent);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */