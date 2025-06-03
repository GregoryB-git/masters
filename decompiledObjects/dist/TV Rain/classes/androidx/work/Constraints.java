package androidx.work;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public final class Constraints
{
  public static final Constraints NONE = new Builder().build();
  @ColumnInfo(name="content_uri_triggers")
  private ContentUriTriggers mContentUriTriggers = new ContentUriTriggers();
  @ColumnInfo(name="required_network_type")
  private NetworkType mRequiredNetworkType = NetworkType.NOT_REQUIRED;
  @ColumnInfo(name="requires_battery_not_low")
  private boolean mRequiresBatteryNotLow;
  @ColumnInfo(name="requires_charging")
  private boolean mRequiresCharging;
  @ColumnInfo(name="requires_device_idle")
  private boolean mRequiresDeviceIdle;
  @ColumnInfo(name="requires_storage_not_low")
  private boolean mRequiresStorageNotLow;
  @ColumnInfo(name="trigger_content_update_delay")
  private long mTriggerContentUpdateDelay = -1L;
  @ColumnInfo(name="trigger_max_content_delay")
  private long mTriggerMaxContentDelay = -1L;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Constraints() {}
  
  public Constraints(Builder paramBuilder)
  {
    mRequiresCharging = mRequiresCharging;
    boolean bool;
    if (mRequiresDeviceIdle) {
      bool = true;
    } else {
      bool = false;
    }
    mRequiresDeviceIdle = bool;
    mRequiredNetworkType = mRequiredNetworkType;
    mRequiresBatteryNotLow = mRequiresBatteryNotLow;
    mRequiresStorageNotLow = mRequiresStorageNotLow;
    mContentUriTriggers = mContentUriTriggers;
    mTriggerContentUpdateDelay = mTriggerContentUpdateDelay;
    mTriggerMaxContentDelay = mTriggerContentMaxDelay;
  }
  
  public Constraints(@NonNull Constraints paramConstraints)
  {
    mRequiresCharging = mRequiresCharging;
    mRequiresDeviceIdle = mRequiresDeviceIdle;
    mRequiredNetworkType = mRequiredNetworkType;
    mRequiresBatteryNotLow = mRequiresBatteryNotLow;
    mRequiresStorageNotLow = mRequiresStorageNotLow;
    mContentUriTriggers = mContentUriTriggers;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Constraints.class == paramObject.getClass()))
    {
      paramObject = (Constraints)paramObject;
      if (mRequiresCharging != mRequiresCharging) {
        return false;
      }
      if (mRequiresDeviceIdle != mRequiresDeviceIdle) {
        return false;
      }
      if (mRequiresBatteryNotLow != mRequiresBatteryNotLow) {
        return false;
      }
      if (mRequiresStorageNotLow != mRequiresStorageNotLow) {
        return false;
      }
      if (mTriggerContentUpdateDelay != mTriggerContentUpdateDelay) {
        return false;
      }
      if (mTriggerMaxContentDelay != mTriggerMaxContentDelay) {
        return false;
      }
      if (mRequiredNetworkType != mRequiredNetworkType) {
        return false;
      }
      return mContentUriTriggers.equals(mContentUriTriggers);
    }
    return false;
  }
  
  @NonNull
  @RequiresApi(24)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public ContentUriTriggers getContentUriTriggers()
  {
    return mContentUriTriggers;
  }
  
  @NonNull
  public NetworkType getRequiredNetworkType()
  {
    return mRequiredNetworkType;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public long getTriggerContentUpdateDelay()
  {
    return mTriggerContentUpdateDelay;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public long getTriggerMaxContentDelay()
  {
    return mTriggerMaxContentDelay;
  }
  
  @RequiresApi(24)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public boolean hasContentUriTriggers()
  {
    boolean bool;
    if (mContentUriTriggers.size() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i = mRequiredNetworkType.hashCode();
    int j = mRequiresCharging;
    int k = mRequiresDeviceIdle;
    int m = mRequiresBatteryNotLow;
    int n = mRequiresStorageNotLow;
    long l = mTriggerContentUpdateDelay;
    int i1 = (int)(l ^ l >>> 32);
    l = mTriggerMaxContentDelay;
    int i2 = (int)(l ^ l >>> 32);
    return mContentUriTriggers.hashCode() + ((((((i * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31;
  }
  
  public boolean requiresBatteryNotLow()
  {
    return mRequiresBatteryNotLow;
  }
  
  public boolean requiresCharging()
  {
    return mRequiresCharging;
  }
  
  @RequiresApi(23)
  public boolean requiresDeviceIdle()
  {
    return mRequiresDeviceIdle;
  }
  
  public boolean requiresStorageNotLow()
  {
    return mRequiresStorageNotLow;
  }
  
  @RequiresApi(24)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void setContentUriTriggers(@Nullable ContentUriTriggers paramContentUriTriggers)
  {
    mContentUriTriggers = paramContentUriTriggers;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void setRequiredNetworkType(@NonNull NetworkType paramNetworkType)
  {
    mRequiredNetworkType = paramNetworkType;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void setRequiresBatteryNotLow(boolean paramBoolean)
  {
    mRequiresBatteryNotLow = paramBoolean;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void setRequiresCharging(boolean paramBoolean)
  {
    mRequiresCharging = paramBoolean;
  }
  
  @RequiresApi(23)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void setRequiresDeviceIdle(boolean paramBoolean)
  {
    mRequiresDeviceIdle = paramBoolean;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void setRequiresStorageNotLow(boolean paramBoolean)
  {
    mRequiresStorageNotLow = paramBoolean;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void setTriggerContentUpdateDelay(long paramLong)
  {
    mTriggerContentUpdateDelay = paramLong;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void setTriggerMaxContentDelay(long paramLong)
  {
    mTriggerMaxContentDelay = paramLong;
  }
  
  public static final class Builder
  {
    public ContentUriTriggers mContentUriTriggers;
    public NetworkType mRequiredNetworkType;
    public boolean mRequiresBatteryNotLow;
    public boolean mRequiresCharging;
    public boolean mRequiresDeviceIdle;
    public boolean mRequiresStorageNotLow;
    public long mTriggerContentMaxDelay;
    public long mTriggerContentUpdateDelay;
    
    public Builder()
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
    public Builder(@NonNull Constraints paramConstraints)
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
}

/* Location:
 * Qualified Name:     androidx.work.Constraints
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */