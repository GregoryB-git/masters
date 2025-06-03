package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzcx
{
  private static final Method zza = ;
  private static final Method zzb = zzb();
  private final JobScheduler zzc;
  
  private zzcx(JobScheduler paramJobScheduler)
  {
    zzc = paramJobScheduler;
  }
  
  private static int zza()
  {
    Object localObject = zzb;
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
        return 0;
      }
      catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException) {}
      if (Log.isLoggable("JobSchedulerCompat", 6)) {
        Log.e("JobSchedulerCompat", "myUserId invocation illegal", localIllegalAccessException);
      }
    }
    return 0;
  }
  
  private final int zza(JobInfo paramJobInfo, String paramString1, int paramInt, String paramString2)
  {
    Method localMethod = zza;
    if (localMethod != null)
    {
      try
      {
        paramString1 = (Integer)localMethod.invoke(zzc, new Object[] { paramJobInfo, paramString1, Integer.valueOf(paramInt), paramString2 });
        if (paramString1 != null)
        {
          paramInt = paramString1.intValue();
          return paramInt;
        }
        return 0;
      }
      catch (InvocationTargetException paramString1) {}catch (IllegalAccessException paramString1) {}
      Log.e(paramString2, "error calling scheduleAsPackage", paramString1);
    }
    return zzc.schedule(paramJobInfo);
  }
  
  public static int zza(Context paramContext, JobInfo paramJobInfo, String paramString1, String paramString2)
  {
    JobScheduler localJobScheduler = (JobScheduler)paramContext.getSystemService("jobscheduler");
    localJobScheduler.getClass();
    if ((zza != null) && (paramContext.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0)) {
      return new zzcx(localJobScheduler).zza(paramJobInfo, paramString1, zza(), paramString2);
    }
    return localJobScheduler.schedule(paramJobInfo);
  }
  
  private static Method zzb()
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
  
  private static Method zzc()
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
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzcx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */