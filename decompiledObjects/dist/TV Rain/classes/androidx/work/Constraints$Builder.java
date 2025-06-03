package androidx.work;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public final class Constraints$Builder
{
  public ContentUriTriggers mContentUriTriggers;
  public NetworkType mRequiredNetworkType;
  public boolean mRequiresBatteryNotLow;
  public boolean mRequiresCharging;
  public boolean mRequiresDeviceIdle;
  public boolean mRequiresStorageNotLow;
  public long mTriggerContentMaxDelay;
  public long mTriggerContentUpdateDelay;
  
  public Constraints$Builder()
  {
    mRequiresCharging = false;
    mRequiresDeviceIdle = false;
    mRequiredNetworkType = NetworkType.NOT_REQUIRED;
    mRequiresBatteryNotLow = false;
    mRequiresStorageNotLow = false;
    mTriggerContentUpdateDelay = -1L;
    mTriggerContentMaxDelay = -1L;
    mContentUriTriggers = new ContentUriTriggers();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Constraints$Builder(@NonNull Constraints paramConstraints)
  {
    boolean bool = false;
    mRequiresCharging = false;
    mRequiresDeviceIdle = false;
    mRequiredNetworkType = NetworkType.NOT_REQUIRED;
    mRequiresBatteryNotLow = false;
    mRequiresStorageNotLow = false;
    mTriggerContentUpdateDelay = -1L;
    mTriggerContentMaxDelay = -1L;
    mContentUriTriggers = new ContentUriTriggers();
    mRequiresCharging = paramConstraints.requiresCharging();
    if (paramConstraints.requiresDeviceIdle()) {
      bool = true;
    }
    mRequiresDeviceIdle = bool;
    mRequiredNetworkType = paramConstraints.getRequiredNetworkType();
    mRequiresBatteryNotLow = paramConstraints.requiresBatteryNotLow();
    mRequiresStorageNotLow = paramConstraints.requiresStorageNotLow();
    mTriggerContentUpdateDelay = paramConstraints.getTriggerContentUpdateDelay();
    mTriggerContentMaxDelay = paramConstraints.getTriggerMaxContentDelay();
    mContentUriTriggers = paramConstraints.getContentUriTriggers();
  }
  
  @NonNull
  @RequiresApi(24)
  public Builder addContentUriTrigger(@NonNull Uri paramUri, boolean paramBoolean)
  {
    mContentUriTriggers.add(paramUri, paramBoolean);
    return this;
  }
  
  @NonNull
  public Constraints build()
  {
    return new Constraints(this);
  }
  
  @NonNull
  public Builder setRequiredNetworkType(@NonNull NetworkType paramNetworkType)
  {
    mRequiredNetworkType = paramNetworkType;
    return this;
  }
  
  @NonNull
  public Builder setRequiresBatteryNotLow(boolean paramBoolean)
  {
    mRequiresBatteryNotLow = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setRequiresCharging(boolean paramBoolean)
  {
    mRequiresCharging = paramBoolean;
    return this;
  }
  
  @NonNull
  @RequiresApi(23)
  public Builder setRequiresDeviceIdle(boolean paramBoolean)
  {
    mRequiresDeviceIdle = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setRequiresStorageNotLow(boolean paramBoolean)
  {
    mRequiresStorageNotLow = paramBoolean;
    return this;
  }
  
  @NonNull
  @RequiresApi(24)
  public Builder setTriggerContentMaxDelay(long paramLong, @NonNull TimeUnit paramTimeUnit)
  {
    mTriggerContentMaxDelay = paramTimeUnit.toMillis(paramLong);
    return this;
  }
  
  @NonNull
  @RequiresApi(26)
  public Builder setTriggerContentMaxDelay(Duration paramDuration)
  {
    mTriggerContentMaxDelay = paramDuration.toMillis();
    return this;
  }
  
  @NonNull
  @RequiresApi(24)
  public Builder setTriggerContentUpdateDelay(long paramLong, @NonNull TimeUnit paramTimeUnit)
  {
    mTriggerContentUpdateDelay = paramTimeUnit.toMillis(paramLong);
    return this;
  }
  
  @NonNull
  @RequiresApi(26)
  public Builder setTriggerContentUpdateDelay(Duration paramDuration)
  {
    mTriggerContentUpdateDelay = paramDuration.toMillis();
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.work.Constraints.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */