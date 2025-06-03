package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class Trackers
{
  private static Trackers sInstance;
  private BatteryChargingTracker mBatteryChargingTracker;
  private BatteryNotLowTracker mBatteryNotLowTracker;
  private NetworkStateTracker mNetworkStateTracker;
  private StorageNotLowTracker mStorageNotLowTracker;
  
  private Trackers(@NonNull Context paramContext, @NonNull TaskExecutor paramTaskExecutor)
  {
    paramContext = paramContext.getApplicationContext();
    mBatteryChargingTracker = new BatteryChargingTracker(paramContext, paramTaskExecutor);
    mBatteryNotLowTracker = new BatteryNotLowTracker(paramContext, paramTaskExecutor);
    mNetworkStateTracker = new NetworkStateTracker(paramContext, paramTaskExecutor);
    mStorageNotLowTracker = new StorageNotLowTracker(paramContext, paramTaskExecutor);
  }
  
  @NonNull
  public static Trackers getInstance(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    try
    {
      if (sInstance == null)
      {
        Trackers localTrackers = new androidx/work/impl/constraints/trackers/Trackers;
        localTrackers.<init>(paramContext, paramTaskExecutor);
        sInstance = localTrackers;
      }
      paramContext = sInstance;
      return paramContext;
    }
    finally {}
  }
  
  @VisibleForTesting
  public static void setInstance(@NonNull Trackers paramTrackers)
  {
    try
    {
      sInstance = paramTrackers;
      return;
    }
    finally
    {
      paramTrackers = finally;
      throw paramTrackers;
    }
  }
  
  @NonNull
  public BatteryChargingTracker getBatteryChargingTracker()
  {
    return mBatteryChargingTracker;
  }
  
  @NonNull
  public BatteryNotLowTracker getBatteryNotLowTracker()
  {
    return mBatteryNotLowTracker;
  }
  
  @NonNull
  public NetworkStateTracker getNetworkStateTracker()
  {
    return mNetworkStateTracker;
  }
  
  @NonNull
  public StorageNotLowTracker getStorageNotLowTracker()
  {
    return mStorageNotLowTracker;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.trackers.Trackers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */