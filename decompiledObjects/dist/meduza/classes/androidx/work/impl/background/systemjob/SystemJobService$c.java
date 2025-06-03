package androidx.work.impl.background.systemjob;

import android.app.job.JobParameters;
import e0.h0;

public final class SystemJobService$c
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

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemjob.SystemJobService.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */