package androidx.work.impl.background.systemjob;

import a0.e;
import a3.b;
import android.app.Application;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import androidx.work.WorkerParameters.a;
import b0.f;
import d2.k;
import e0.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import o2.j;
import p2.d;
import p2.i0;
import p2.k0;
import p2.r;
import p2.x;
import y2.s;

public class SystemJobService
  extends JobService
  implements d
{
  public static final String e = j.f("SystemJobService");
  public k0 a;
  public final HashMap b = new HashMap();
  public final l.l c = new l.l(2);
  public i0 d;
  
  public static x2.l b(JobParameters paramJobParameters)
  {
    try
    {
      paramJobParameters = paramJobParameters.getExtras();
      if ((paramJobParameters != null) && (paramJobParameters.containsKey("EXTRA_WORK_SPEC_ID")))
      {
        paramJobParameters = new x2.l(paramJobParameters.getString("EXTRA_WORK_SPEC_ID"), paramJobParameters.getInt("EXTRA_WORK_SPEC_GENERATION"));
        return paramJobParameters;
      }
    }
    catch (NullPointerException paramJobParameters)
    {
      for (;;) {}
    }
    return null;
  }
  
  public final void a(x2.l paraml, boolean paramBoolean)
  {
    ??? = j.d();
    Object localObject2 = e;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(" executed on JobScheduler");
    ((j)???).a((String)localObject2, localStringBuilder.toString());
    synchronized (b)
    {
      localObject2 = (JobParameters)b.remove(paraml);
      c.f(paraml);
      if (localObject2 != null) {
        jobFinished((JobParameters)localObject2, paramBoolean);
      }
      return;
    }
  }
  
  public final void onCreate()
  {
    super.onCreate();
    try
    {
      k0 localk0 = k0.d(getApplicationContext());
      a = localk0;
      r localr = f;
      i0 locali0 = new p2/i0;
      locali0.<init>(localr, d);
      d = locali0;
      localr.a(this);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      if (!Application.class.equals(getApplication().getClass())) {
        break label76;
      }
    }
    j.d().g(e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
    return;
    label76:
    throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", localIllegalStateException);
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    ??? = a;
    if (??? != null)
    {
      r localr = f;
      synchronized (k)
      {
        j.remove(this);
      }
    }
  }
  
  public final boolean onStartJob(JobParameters paramJobParameters)
  {
    if (a == null)
    {
      j.d().a(e, "WorkManager is not initialized; requesting retry.");
      jobFinished(paramJobParameters, true);
      return false;
    }
    x2.l locall = b(paramJobParameters);
    if (locall == null)
    {
      j.d().b(e, "WorkSpec id not found!");
      return false;
    }
    synchronized (b)
    {
      if (b.containsKey(locall))
      {
        localObject2 = j.d();
        paramJobParameters = e;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append("Job is already being executed by SystemJobService: ");
        ((StringBuilder)localObject3).append(locall);
        ((j)localObject2).a(paramJobParameters, ((StringBuilder)localObject3).toString());
        return false;
      }
      Object localObject3 = j.d();
      Object localObject2 = e;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("onStartJob for ");
      localStringBuilder.append(locall);
      ((j)localObject3).a((String)localObject2, localStringBuilder.toString());
      b.put(locall, paramJobParameters);
      ??? = null;
      int i = Build.VERSION.SDK_INT;
      if (i >= 24)
      {
        localObject2 = new WorkerParameters.a();
        if (a.b(paramJobParameters) != null) {
          b = Arrays.asList(a.b(paramJobParameters));
        }
        if (a.a(paramJobParameters) != null) {
          a = Arrays.asList(a.a(paramJobParameters));
        }
        ??? = localObject2;
        if (i >= 28)
        {
          b.a(paramJobParameters);
          ??? = localObject2;
        }
      }
      paramJobParameters = d;
      localObject2 = c.h(locall);
      ??? = new s(a, (x)localObject2, (WorkerParameters.a)???);
      b.d((Runnable)???);
      return true;
    }
  }
  
  public final boolean onStopJob(JobParameters arg1)
  {
    if (a == null)
    {
      j.d().a(e, "WorkManager is not initialized; requesting retry.");
      return true;
    }
    Object localObject1 = b(???);
    if (localObject1 == null)
    {
      j.d().b(e, "WorkSpec id not found!");
      return false;
    }
    j localj = j.d();
    String str = e;
    ??? = new StringBuilder();
    ((StringBuilder)???).append("onStopJob for ");
    ((StringBuilder)???).append(localObject1);
    localj.a(str, ((StringBuilder)???).toString());
    synchronized (b)
    {
      b.remove(localObject1);
      ??? = c.f((x2.l)localObject1);
      if (??? != null)
      {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
          i = c.a(???);
        } else {
          i = 65024;
        }
        ??? = d;
        ???.getClass();
        ???.c((x)???, i);
      }
      ??? = a.f;
      localObject1 = a;
      synchronized (k)
      {
        boolean bool = i.contains(localObject1);
        return bool ^ true;
      }
    }
  }
  
  public static final class a
  {
    public static String[] a(JobParameters paramJobParameters)
    {
      return f.r(paramJobParameters);
    }
    
    public static Uri[] b(JobParameters paramJobParameters)
    {
      return e.l(paramJobParameters);
    }
  }
  
  public static final class b
  {
    public static Network a(JobParameters paramJobParameters)
    {
      return k.b(paramJobParameters);
    }
  }
  
  public static final class c
  {
    public static int a(JobParameters paramJobParameters)
    {
      int i = h0.b(paramJobParameters);
      paramJobParameters = SystemJobService.e;
      int j = i;
      switch (i)
      {
      default: 
        j = 65024;
      }
      return j;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemjob.SystemJobService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */