package s2;

import a4.r;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo.TriggerContentUri;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest.Builder;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import c0.b;
import d2.k;
import f;
import java.util.Iterator;
import java.util.Set;
import o2.c;
import o2.c.a;
import p2.m0;
import q0.g;
import x2.s;

public final class a
{
  public static final String c = o2.j.f("SystemJobInfoConverter");
  public final ComponentName a;
  public final o2.a b;
  
  public a(Context paramContext, m0 paramm0)
  {
    b = paramm0;
    a = new ComponentName(paramContext.getApplicationContext(), SystemJobService.class);
  }
  
  public final JobInfo a(s params, int paramInt)
  {
    c localc = j;
    Object localObject1 = new PersistableBundle();
    ((BaseBundle)localObject1).putString("EXTRA_WORK_SPEC_ID", a);
    ((BaseBundle)localObject1).putInt("EXTRA_WORK_SPEC_GENERATION", t);
    ((BaseBundle)localObject1).putBoolean("EXTRA_IS_PERIODIC", params.c());
    localObject1 = new JobInfo.Builder(paramInt, a).setRequiresCharging(b).setRequiresDeviceIdle(c).setExtras((PersistableBundle)localObject1);
    int i = a;
    int j = Build.VERSION.SDK_INT;
    int k = 0;
    Object localObject2;
    Object localObject3;
    if ((j >= 30) && (i == 6))
    {
      k.i((JobInfo.Builder)localObject1, new NetworkRequest.Builder().addCapability(25).build());
    }
    else
    {
      int m = g.c(i);
      if (m != 0)
      {
        if (m != 1) {
          if (m != 2)
          {
            paramInt = 3;
            if (m != 3)
            {
              paramInt = 4;
              if ((m == 4) && (j >= 26)) {
                break label249;
              }
            }
            else
            {
              if (j >= 24) {
                break label249;
              }
            }
            o2.j localj = o2.j.d();
            localObject2 = c;
            localObject3 = f.l("API version too low. Cannot convert network type value ");
            ((StringBuilder)localObject3).append(a0.j.x(i));
            localj.a((String)localObject2, ((StringBuilder)localObject3).toString());
          }
          else
          {
            paramInt = 2;
            break label249;
          }
        }
        paramInt = 1;
      }
      else
      {
        paramInt = 0;
      }
      label249:
      ((JobInfo.Builder)localObject1).setRequiredNetworkType(paramInt);
    }
    if (!c)
    {
      if (l == 2) {
        paramInt = 0;
      } else {
        paramInt = 1;
      }
      ((JobInfo.Builder)localObject1).setBackoffCriteria(m, paramInt);
    }
    long l = Math.max(params.a() - b.a(), 0L);
    if ((j <= 28) || (l > 0L)) {
      ((JobInfo.Builder)localObject1).setMinimumLatency(l);
    } else if (!q) {
      com.google.android.recaptcha.internal.a.l((JobInfo.Builder)localObject1);
    }
    if ((j >= 24) && (localc.a()))
    {
      localObject2 = h.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (c.a)((Iterator)localObject2).next();
        paramInt = b;
        ((JobInfo.Builder)localObject1).addTriggerContentUri(new JobInfo.TriggerContentUri(a, paramInt));
      }
      ((JobInfo.Builder)localObject1).setTriggerContentUpdateDelay(f);
      ((JobInfo.Builder)localObject1).setTriggerContentMaxDelay(g);
    }
    ((JobInfo.Builder)localObject1).setPersisted(false);
    j = Build.VERSION.SDK_INT;
    if (j >= 26)
    {
      com.google.android.gms.internal.base.a.r((JobInfo.Builder)localObject1, d);
      b.r((JobInfo.Builder)localObject1, e);
    }
    if (k > 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (l > 0L) {
      k = 1;
    }
    if ((j >= 31) && (q) && (paramInt == 0) && (k == 0)) {
      r.e((JobInfo.Builder)localObject1);
    }
    return ((JobInfo.Builder)localObject1).build();
  }
}

/* Location:
 * Qualified Name:     s2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */