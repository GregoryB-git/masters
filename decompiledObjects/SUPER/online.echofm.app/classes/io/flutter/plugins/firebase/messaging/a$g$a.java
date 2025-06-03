package io.flutter.plugins.firebase.messaging;

import O5.E;
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.util.Log;

public final class a$g$a
  implements a.f
{
  public final JobWorkItem a;
  
  public a$g$a(a.g paramg, JobWorkItem paramJobWorkItem)
  {
    a = paramJobWorkItem;
  }
  
  public void a()
  {
    JobParameters localJobParameters;
    synchronized (b.b)
    {
      localJobParameters = b.c;
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.a.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */