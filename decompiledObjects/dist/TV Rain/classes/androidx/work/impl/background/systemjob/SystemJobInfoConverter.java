package androidx.work.impl.background.systemjob;

import a3;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo.TriggerContentUri;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest.Builder;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.BuildCompat;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.ContentUriTriggers;
import androidx.work.ContentUriTriggers.Trigger;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.model.WorkSpec;
import g;
import java.util.Iterator;
import java.util.Set;
import p3;

@RequiresApi(api=23)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
class SystemJobInfoConverter
{
  public static final String EXTRA_IS_PERIODIC = "EXTRA_IS_PERIODIC";
  public static final String EXTRA_WORK_SPEC_ID = "EXTRA_WORK_SPEC_ID";
  private static final String TAG = Logger.tagWithPrefix("SystemJobInfoConverter");
  private final ComponentName mWorkServiceComponent;
  
  @VisibleForTesting(otherwise=3)
  public SystemJobInfoConverter(@NonNull Context paramContext)
  {
    mWorkServiceComponent = new ComponentName(paramContext.getApplicationContext(), SystemJobService.class);
  }
  
  @RequiresApi(24)
  private static JobInfo.TriggerContentUri convertContentUriTrigger(ContentUriTriggers.Trigger paramTrigger)
  {
    int i = paramTrigger.shouldTriggerForDescendants();
    return new JobInfo.TriggerContentUri(paramTrigger.getUri(), i);
  }
  
  public static int convertNetworkType(NetworkType paramNetworkType)
  {
    int i = 1.$SwitchMap$androidx$work$NetworkType[paramNetworkType.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if ((i == 5) && (Build.VERSION.SDK_INT >= 26)) {
              return 4;
            }
            Logger.get().debug(TAG, String.format("API version too low. Cannot convert network type value %s", new Object[] { paramNetworkType }), new Throwable[0]);
            return 1;
          }
          return 3;
        }
        return 2;
      }
      return 1;
    }
    return 0;
  }
  
  public static void setRequiredNetwork(@NonNull JobInfo.Builder paramBuilder, @NonNull NetworkType paramNetworkType)
  {
    if ((Build.VERSION.SDK_INT >= 30) && (paramNetworkType == NetworkType.TEMPORARILY_UNMETERED)) {
      a3.r(paramBuilder, new NetworkRequest.Builder().addCapability(25).build());
    } else {
      paramBuilder.setRequiredNetworkType(convertNetworkType(paramNetworkType));
    }
  }
  
  public JobInfo convert(WorkSpec paramWorkSpec, int paramInt)
  {
    Constraints localConstraints = constraints;
    Object localObject = new PersistableBundle();
    ((BaseBundle)localObject).putString("EXTRA_WORK_SPEC_ID", id);
    ((BaseBundle)localObject).putBoolean("EXTRA_IS_PERIODIC", paramWorkSpec.isPeriodic());
    localObject = new JobInfo.Builder(paramInt, mWorkServiceComponent).setRequiresCharging(localConstraints.requiresCharging()).setRequiresDeviceIdle(localConstraints.requiresDeviceIdle()).setExtras((PersistableBundle)localObject);
    setRequiredNetwork((JobInfo.Builder)localObject, localConstraints.getRequiredNetworkType());
    boolean bool = localConstraints.requiresDeviceIdle();
    int i = 0;
    if (!bool)
    {
      if (backoffPolicy == BackoffPolicy.LINEAR) {
        paramInt = 0;
      } else {
        paramInt = 1;
      }
      ((JobInfo.Builder)localObject).setBackoffCriteria(backoffDelayDuration, paramInt);
    }
    long l = Math.max(paramWorkSpec.calculateNextRunTime() - System.currentTimeMillis(), 0L);
    if (Build.VERSION.SDK_INT <= 28) {
      ((JobInfo.Builder)localObject).setMinimumLatency(l);
    } else if (l > 0L) {
      ((JobInfo.Builder)localObject).setMinimumLatency(l);
    } else if (!expedited) {
      a3.q((JobInfo.Builder)localObject);
    }
    if (localConstraints.hasContentUriTriggers())
    {
      Iterator localIterator = localConstraints.getContentUriTriggers().getTriggers().iterator();
      while (localIterator.hasNext()) {
        ((JobInfo.Builder)localObject).addTriggerContentUri(convertContentUriTrigger((ContentUriTriggers.Trigger)localIterator.next()));
      }
      ((JobInfo.Builder)localObject).setTriggerContentUpdateDelay(localConstraints.getTriggerContentUpdateDelay());
      ((JobInfo.Builder)localObject).setTriggerContentMaxDelay(localConstraints.getTriggerMaxContentDelay());
    }
    ((JobInfo.Builder)localObject).setPersisted(false);
    if (Build.VERSION.SDK_INT >= 26)
    {
      p3.o((JobInfo.Builder)localObject, localConstraints.requiresBatteryNotLow());
      p3.A((JobInfo.Builder)localObject, localConstraints.requiresStorageNotLow());
    }
    if (runAttemptCount > 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (l > 0L) {
      i = 1;
    }
    if ((BuildCompat.isAtLeastS()) && (expedited) && (paramInt == 0) && (i == 0)) {
      g.l((JobInfo.Builder)localObject);
    }
    return ((JobInfo.Builder)localObject).build();
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemjob.SystemJobInfoConverter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */