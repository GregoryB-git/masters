package p2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.a.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import b1.u.a;
import b1.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import o2.j;
import o2.j.a;
import y2.e;
import y2.k;

public final class k0
  extends o2.p
{
  public static k0 k = null;
  public static k0 l = null;
  public static final Object m = new Object();
  public Context a;
  public a b;
  public WorkDatabase c;
  public a3.b d;
  public List<t> e;
  public r f;
  public y2.p g;
  public boolean h = false;
  public BroadcastReceiver.PendingResult i;
  public final v2.n j;
  
  static
  {
    j.f("WorkManagerImpl");
  }
  
  public k0(Context paramContext, a parama, a3.b paramb, WorkDatabase paramWorkDatabase, List<t> paramList, r paramr, v2.n paramn)
  {
    paramContext = paramContext.getApplicationContext();
    if ((Build.VERSION.SDK_INT >= 24) && (a.a(paramContext))) {
      throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }
    j.a locala = new j.a(g);
    synchronized (j.a)
    {
      j.b = locala;
      a = paramContext;
      d = paramb;
      c = paramWorkDatabase;
      f = paramr;
      j = paramn;
      b = parama;
      e = paramList;
      g = new y2.p(paramWorkDatabase);
      paramb = paramb.c();
      paramn = c;
      paramWorkDatabase = w.a;
      paramr.a(new u(paramb, paramList, parama, paramn));
      d.d(new ForceStopRunnable(paramContext, this));
      return;
    }
  }
  
  public static k0 d(Context paramContext)
  {
    synchronized (m)
    {
      try
      {
        k0 localk01 = k;
        if (localk01 != null) {}
        for (;;)
        {
          break;
          localk01 = l;
        }
        k0 localk02 = localk01;
        if (localk01 == null)
        {
          paramContext = paramContext.getApplicationContext();
          if ((paramContext instanceof a.b))
          {
            f(paramContext, ((a.b)paramContext).a());
            localk02 = d(paramContext);
          }
          else
          {
            paramContext = new java/lang/IllegalStateException;
            paramContext.<init>("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            throw paramContext;
          }
        }
        return localk02;
      }
      finally {}
      throw paramContext;
    }
  }
  
  public static void f(Context paramContext, a parama)
  {
    synchronized (m)
    {
      k0 localk0 = k;
      if ((localk0 != null) && (l != null))
      {
        paramContext = new java/lang/IllegalStateException;
        paramContext.<init>("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
        throw paramContext;
      }
      if (localk0 == null)
      {
        paramContext = paramContext.getApplicationContext();
        if (l == null) {
          l = m0.v(paramContext, parama);
        }
        k = l;
      }
      return;
    }
  }
  
  public final o b(List paramList)
  {
    if (!paramList.isEmpty())
    {
      paramList = new y(this, paramList);
      Object localObject;
      if (!i)
      {
        localObject = new y2.f(paramList);
        d.d((Runnable)localObject);
        j = b;
      }
      else
      {
        j localj = j.d();
        localObject = y.k;
        StringBuilder localStringBuilder = f.l("Already enqueued work ids (");
        localStringBuilder.append(TextUtils.join(", ", f));
        localStringBuilder.append(")");
        localj.g((String)localObject, localStringBuilder.toString());
      }
      return j;
    }
    throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
  }
  
  public final o c(UUID paramUUID)
  {
    paramUUID = new y2.b(this, paramUUID);
    d.d(paramUUID);
    return a;
  }
  
  public final b1.u e(UUID paramUUID)
  {
    p1.n localn = c.u().v(Collections.singletonList(paramUUID.toString()));
    Object localObject1 = new j0();
    Object localObject2 = d;
    Object localObject3 = new Object();
    paramUUID = new b1.u();
    localObject2 = new k((a3.b)localObject2, localObject3, (j0)localObject1, paramUUID);
    if (localn != null)
    {
      localObject1 = new u.a(localn, (k)localObject2);
      localObject3 = (u.a)a.h(localn, localObject1);
      if ((localObject3 != null) && (b != localObject2)) {
        throw new IllegalArgumentException("This source was already added with the different observer");
      }
      if ((localObject3 == null) && (paramUUID.hasActiveObservers())) {
        localn.observeForever((x)localObject1);
      }
      return paramUUID;
    }
    throw new NullPointerException("source cannot be null");
  }
  
  public final void g()
  {
    synchronized (m)
    {
      h = true;
      BroadcastReceiver.PendingResult localPendingResult = i;
      if (localPendingResult != null)
      {
        localPendingResult.finish();
        i = null;
      }
      return;
    }
  }
  
  public final void h()
  {
    Object localObject1 = a;
    Object localObject2 = s2.b.f;
    localObject2 = (JobScheduler)((Context)localObject1).getSystemService("jobscheduler");
    if (localObject2 != null)
    {
      localObject1 = s2.b.f((Context)localObject1, (JobScheduler)localObject2);
      if ((localObject1 != null) && (!((ArrayList)localObject1).isEmpty()))
      {
        localObject1 = ((ArrayList)localObject1).iterator();
        while (((Iterator)localObject1).hasNext()) {
          s2.b.a((JobScheduler)localObject2, ((JobInfo)((Iterator)localObject1).next()).getId());
        }
      }
    }
    c.u().B();
    w.b(b, c, e);
  }
  
  public static final class a
  {
    public static boolean a(Context paramContext)
    {
      return b0.f.q(paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     p2.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */