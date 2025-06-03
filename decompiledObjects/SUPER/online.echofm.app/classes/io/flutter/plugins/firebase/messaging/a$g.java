package io.flutter.plugins.firebase.messaging;

import O5.E;
import O5.F;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public final class a$g
  extends JobServiceEngine
  implements a.b
{
  public final a a;
  public final Object b = new Object();
  public JobParameters c;
  
  public a$g(a parama)
  {
    super(parama);
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */