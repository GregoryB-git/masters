package io.flutter.plugins.firebase.messaging;

import O5.E;
import O5.F;
import O5.H;
import O5.I;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class a
  extends Service
{
  public static final Object v = new Object();
  public static final HashMap w = new HashMap();
  public b o;
  public i p;
  public a q;
  public boolean r = false;
  public boolean s = false;
  public boolean t = false;
  public final ArrayList u = new ArrayList();
  
  public static void c(Context paramContext, ComponentName paramComponentName, int paramInt, Intent paramIntent, boolean paramBoolean)
  {
    if (paramIntent != null)
    {
      i locali;
      synchronized (v)
      {
        locali = f(paramContext, paramComponentName, true, paramInt, paramBoolean);
        locali.b(paramInt);
      }
      try
      {
        locali.a(paramIntent);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        if (!paramBoolean) {
          break label65;
        }
        f(paramContext, paramComponentName, true, paramInt, false).a(paramIntent);
        return;
        label65:
        throw localIllegalStateException;
      }
      paramContext = finally;
      throw paramContext;
    }
    throw new IllegalArgumentException("work must not be null");
  }
  
  public static void d(Context paramContext, Class paramClass, int paramInt, Intent paramIntent, boolean paramBoolean)
  {
    c(paramContext, new ComponentName(paramContext, paramClass), paramInt, paramIntent, paramBoolean);
  }
  
  public static i f(Context paramContext, ComponentName paramComponentName, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    e locale = new e(paramComponentName, paramBoolean2);
    HashMap localHashMap = w;
    i locali = (i)localHashMap.get(locale);
    Object localObject = locali;
    if (locali == null)
    {
      if ((Build.VERSION.SDK_INT >= 26) && (!paramBoolean2)) {
        if (!paramBoolean1) {}
      }
      for (paramContext = new h(paramContext, paramComponentName, paramInt);; paramContext = new c(paramContext, paramComponentName))
      {
        break;
        throw new IllegalArgumentException("Can't be here without a job id");
      }
      localHashMap.put(locale, paramContext);
      localObject = paramContext;
    }
    return (i)localObject;
  }
  
  public f a()
  {
    ??? = o;
    if (??? != null)
    {
      ??? = ((b)???).a();
      if (??? != null) {
        return (f)???;
      }
    }
    synchronized (u)
    {
      if (u.size() > 0)
      {
        f localf = (f)u.remove(0);
        return localf;
      }
    }
  }
  
  public boolean b()
  {
    a locala = q;
    if (locala != null) {
      locala.cancel(r);
    }
    s = true;
    return h();
  }
  
  public void e(boolean paramBoolean)
  {
    if (q == null)
    {
      q = new a();
      i locali = p;
      if ((locali != null) && (paramBoolean)) {
        locali.d();
      }
      q.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
  }
  
  public abstract void g(Intent paramIntent);
  
  public boolean h()
  {
    return true;
  }
  
  public void i()
  {
    ArrayList localArrayList1 = u;
    if (localArrayList1 != null)
    {
      try
      {
        q = null;
        ArrayList localArrayList2 = u;
        if ((localArrayList2 != null) && (localArrayList2.size() > 0)) {
          e(false);
        }
      }
      finally
      {
        break label63;
      }
      if (!t) {
        p.c();
      }
      return;
      label63:
      throw ((Throwable)localObject);
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    paramIntent = o;
    if (paramIntent != null) {
      return paramIntent.b();
    }
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    if (Build.VERSION.SDK_INT >= 26)
    {
      o = new g(this);
      p = null;
    }
    p = f(this, new ComponentName(this, getClass()), false, 0, true);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    b();
    synchronized (u)
    {
      t = true;
      p.c();
      return;
    }
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    p.e();
    synchronized (u)
    {
      ArrayList localArrayList2 = u;
      d locald = new io/flutter/plugins/firebase/messaging/a$d;
      if (paramIntent == null) {
        paramIntent = new Intent();
      }
      locald.<init>(this, paramIntent, paramInt2);
      localArrayList2.add(locald);
      e(true);
      return 3;
    }
  }
  
  public final class a
    extends AsyncTask
  {
    public a() {}
    
    public Void a(Void... paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs = a();
        if (paramVarArgs == null) {
          break;
        }
        g(paramVarArgs.getIntent());
        paramVarArgs.a();
      }
      return null;
    }
    
    public void b(Void paramVoid)
    {
      i();
    }
    
    public void c(Void paramVoid)
    {
      i();
    }
  }
  
  public static abstract interface b
  {
    public abstract a.f a();
    
    public abstract IBinder b();
  }
  
  public static final class c
    extends a.i
  {
    public final Context d;
    public final PowerManager.WakeLock e;
    public final PowerManager.WakeLock f;
    public boolean g;
    public boolean h;
    
    public c(Context paramContext, ComponentName paramComponentName)
    {
      super();
      d = paramContext.getApplicationContext();
      paramContext = (PowerManager)paramContext.getSystemService("power");
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramComponentName.getClassName());
      ((StringBuilder)localObject).append(":launch");
      localObject = paramContext.newWakeLock(1, ((StringBuilder)localObject).toString());
      e = ((PowerManager.WakeLock)localObject);
      ((PowerManager.WakeLock)localObject).setReferenceCounted(false);
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramComponentName.getClassName());
      ((StringBuilder)localObject).append(":run");
      paramContext = paramContext.newWakeLock(1, ((StringBuilder)localObject).toString());
      f = paramContext;
      paramContext.setReferenceCounted(false);
    }
    
    public void a(Intent paramIntent)
    {
      paramIntent = new Intent(paramIntent);
      paramIntent.setComponent(a);
      if (d.startService(paramIntent) != null)
      {
        try
        {
          if (!g)
          {
            g = true;
            if (!h) {
              e.acquire(60000L);
            }
          }
        }
        finally
        {
          break label72;
        }
        return;
        label72:
        throw paramIntent;
      }
    }
    
    public void c()
    {
      try
      {
        if (!h) {
          break label45;
        }
        if (g) {
          e.acquire(60000L);
        }
      }
      finally
      {
        break label48;
      }
      h = false;
      f.release();
      label45:
      return;
      label48:
      throw ((Throwable)localObject);
    }
    
    public void d()
    {
      try
      {
        if (!h)
        {
          h = true;
          f.acquire(600000L);
          e.release();
        }
      }
      finally
      {
        break label41;
      }
      return;
      label41:
      throw ((Throwable)localObject);
    }
    
    public void e()
    {
      try
      {
        g = false;
        return;
      }
      finally {}
    }
  }
  
  public final class d
    implements a.f
  {
    public final Intent a;
    public final int b;
    
    public d(Intent paramIntent, int paramInt)
    {
      a = paramIntent;
      b = paramInt;
    }
    
    public void a()
    {
      stopSelf(b);
    }
    
    public Intent getIntent()
    {
      return a;
    }
  }
  
  public static class e
  {
    public ComponentName a;
    public boolean b;
    
    public e(ComponentName paramComponentName, boolean paramBoolean)
    {
      a = paramComponentName;
      b = paramBoolean;
    }
  }
  
  public static abstract interface f
  {
    public abstract void a();
    
    public abstract Intent getIntent();
  }
  
  public static final class g
    extends JobServiceEngine
    implements a.b
  {
    public final a a;
    public final Object b = new Object();
    public JobParameters c;
    
    public g(a parama)
    {
      super();
      a = parama;
    }
    
    public a.f a()
    {
      JobWorkItem localJobWorkItem;
      synchronized (b)
      {
        JobParameters localJobParameters1 = c;
        if (localJobParameters1 == null) {
          return null;
        }
      }
    }
    
    public IBinder b()
    {
      return F.a(this);
    }
    
    public boolean onStartJob(JobParameters paramJobParameters)
    {
      c = paramJobParameters;
      a.e(false);
      return true;
    }
    
    public boolean onStopJob(JobParameters arg1)
    {
      boolean bool = a.b();
      synchronized (b)
      {
        c = null;
        return bool;
      }
    }
    
    public final class a
      implements a.f
    {
      public final JobWorkItem a;
      
      public a(JobWorkItem paramJobWorkItem)
      {
        a = paramJobWorkItem;
      }
      
      public void a()
      {
        JobParameters localJobParameters;
        synchronized (b)
        {
          localJobParameters = c;
          if (localJobParameters == null) {
            break label65;
          }
        }
        for (String str = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";; str = "SecurityException: Failed to run mParams.completeWork(mJobWork)!")
        {
          Log.e("JobServiceEngineImpl", str, localSecurityException);
          break;
        }
        label65:
        return;
        throw localSecurityException;
      }
      
      public Intent getIntent()
      {
        return E.a(a);
      }
    }
  }
  
  public static final class h
    extends a.i
  {
    public final JobInfo d;
    public final JobScheduler e;
    
    public h(Context paramContext, ComponentName paramComponentName, int paramInt)
    {
      super();
      b(paramInt);
      d = new JobInfo.Builder(paramInt, a).setOverrideDeadline(0L).build();
      e = ((JobScheduler)paramContext.getApplicationContext().getSystemService("jobscheduler"));
    }
    
    public void a(Intent paramIntent)
    {
      H.a(e, d, I.a(paramIntent));
    }
  }
  
  public static abstract class i
  {
    public final ComponentName a;
    public boolean b;
    public int c;
    
    public i(ComponentName paramComponentName)
    {
      a = paramComponentName;
    }
    
    public abstract void a(Intent paramIntent);
    
    public void b(int paramInt)
    {
      if (!b)
      {
        b = true;
        c = paramInt;
      }
      else
      {
        if (c != paramInt) {
          break label29;
        }
      }
      return;
      label29:
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Given job ID ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" is different than previous ");
      localStringBuilder.append(c);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    
    public void c() {}
    
    public void d() {}
    
    public void e() {}
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */