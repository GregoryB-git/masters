package com.google.android.gms.internal.measurement;

import W2.m;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class i0
{
  public static final Method b = ;
  public static final Method c = d();
  public final JobScheduler a;
  
  public i0(JobScheduler paramJobScheduler)
  {
    a = paramJobScheduler;
  }
  
  public static int a()
  {
    Object localObject = c;
    if (localObject != null)
    {
      try
      {
        localObject = (Integer)((Method)localObject).invoke(UserHandle.class, new Object[0]);
        if (localObject != null)
        {
          int i = ((Integer)localObject).intValue();
          return i;
        }
      }
      catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException) {}
      return 0;
      if (Log.isLoggable("JobSchedulerCompat", 6)) {
        Log.e("JobSchedulerCompat", "myUserId invocation illegal", localIllegalAccessException);
      }
    }
    return 0;
  }
  
  public static int c(Context paramContext, JobInfo paramJobInfo, String paramString1, String paramString2)
  {
    JobScheduler localJobScheduler = (JobScheduler)m.j((JobScheduler)paramContext.getSystemService("jobscheduler"));
    if ((b != null) && (paramContext.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0)) {
      return new i0(localJobScheduler).b(paramJobInfo, paramString1, a(), paramString2);
    }
    return localJobScheduler.schedule(paramJobInfo);
  }
  
  public static Method d()
  {
    if (Build.VERSION.SDK_INT >= 24) {
      try
      {
        Method localMethod = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        return localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        if (Log.isLoggable("JobSchedulerCompat", 6)) {
          Log.e("JobSchedulerCompat", "No myUserId method available");
        }
      }
    }
    return null;
  }
  
  public static Method e()
  {
    if (Build.VERSION.SDK_INT >= 24) {
      try
      {
        Method localMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[] { JobInfo.class, String.class, Integer.TYPE, String.class });
        return localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        if (Log.isLoggable("JobSchedulerCompat", 6)) {
          Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
        }
      }
    }
    return null;
  }
  
  public final int b(JobInfo paramJobInfo, String paramString1, int paramInt, String paramString2)
  {
    Method localMethod = b;
    if (localMethod != null)
    {
      try
      {
        paramString1 = (Integer)localMethod.invoke(a, new Object[] { paramJobInfo, paramString1, Integer.valueOf(paramInt), paramString2 });
        if (paramString1 != null)
        {
          paramInt = paramString1.intValue();
          return paramInt;
        }
      }
      catch (InvocationTargetException paramString1) {}catch (IllegalAccessException paramString1) {}
      return 0;
      Log.e(paramString2, "error calling scheduleAsPackage", paramString1);
    }
    return a.schedule(paramJobInfo);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */