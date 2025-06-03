package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.PackageManagerHelper;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class Schedulers
{
  public static final String GCM_SCHEDULER = "androidx.work.impl.background.gcm.GcmScheduler";
  private static final String TAG = Logger.tagWithPrefix("Schedulers");
  
  @NonNull
  public static Scheduler createBestAvailableBackgroundScheduler(@NonNull Context paramContext, @NonNull WorkManagerImpl paramWorkManagerImpl)
  {
    paramWorkManagerImpl = new SystemJobScheduler(paramContext, paramWorkManagerImpl);
    PackageManagerHelper.setComponentEnabled(paramContext, SystemJobService.class, true);
    Logger.get().debug(TAG, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
    return paramWorkManagerImpl;
  }
  
  public static void schedule(@NonNull Configuration paramConfiguration, @NonNull WorkDatabase paramWorkDatabase, List<Scheduler> paramList)
  {
    if ((paramList != null) && (paramList.size() != 0))
    {
      Object localObject1 = paramWorkDatabase.workSpecDao();
      paramWorkDatabase.beginTransaction();
      try
      {
        Object localObject2 = ((WorkSpecDao)localObject1).getEligibleWorkForScheduling(paramConfiguration.getMaxSchedulerLimit());
        paramConfiguration = ((WorkSpecDao)localObject1).getAllEligibleWorkSpecsForScheduling(200);
        if ((localObject2 != null) && (((List)localObject2).size() > 0))
        {
          long l = System.currentTimeMillis();
          Iterator localIterator = ((List)localObject2).iterator();
          while (localIterator.hasNext()) {
            ((WorkSpecDao)localObject1).markWorkSpecScheduled(nextid, l);
          }
        }
        paramWorkDatabase.setTransactionSuccessful();
        paramWorkDatabase.endTransaction();
        if ((localObject2 != null) && (((List)localObject2).size() > 0))
        {
          localObject2 = (WorkSpec[])((List)localObject2).toArray(new WorkSpec[((List)localObject2).size()]);
          paramWorkDatabase = paramList.iterator();
          while (paramWorkDatabase.hasNext())
          {
            localObject1 = (Scheduler)paramWorkDatabase.next();
            if (((Scheduler)localObject1).hasLimitedSchedulingSlots()) {
              ((Scheduler)localObject1).schedule((WorkSpec[])localObject2);
            }
          }
        }
        if ((paramConfiguration != null) && (paramConfiguration.size() > 0))
        {
          paramConfiguration = (WorkSpec[])paramConfiguration.toArray(new WorkSpec[paramConfiguration.size()]);
          paramList = paramList.iterator();
          while (paramList.hasNext())
          {
            paramWorkDatabase = (Scheduler)paramList.next();
            if (!paramWorkDatabase.hasLimitedSchedulingSlots()) {
              paramWorkDatabase.schedule(paramConfiguration);
            }
          }
        }
        return;
      }
      finally
      {
        paramWorkDatabase.endTransaction();
      }
    }
  }
  
  @Nullable
  private static Scheduler tryCreateGcmBasedScheduler(@NonNull Context paramContext)
  {
    try
    {
      paramContext = (Scheduler)Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[] { Context.class }).newInstance(new Object[] { paramContext });
      Logger.get().debug(TAG, String.format("Created %s", new Object[] { "androidx.work.impl.background.gcm.GcmScheduler" }), new Throwable[0]);
      return paramContext;
    }
    finally
    {
      Logger.get().debug(TAG, "Unable to create GCM Scheduler", new Throwable[] { paramContext });
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.Schedulers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */