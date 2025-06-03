package androidx.core.location;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

public final class LocationRequestCompat$Builder
{
  private long mDurationMillis;
  private long mIntervalMillis;
  private long mMaxUpdateDelayMillis;
  private int mMaxUpdates;
  private float mMinUpdateDistanceMeters;
  private long mMinUpdateIntervalMillis;
  private int mQuality;
  
  public LocationRequestCompat$Builder(long paramLong)
  {
    setIntervalMillis(paramLong);
    mQuality = 102;
    mDurationMillis = Long.MAX_VALUE;
    mMaxUpdates = Integer.MAX_VALUE;
    mMinUpdateIntervalMillis = -1L;
    mMinUpdateDistanceMeters = 0.0F;
    mMaxUpdateDelayMillis = 0L;
  }
  
  public LocationRequestCompat$Builder(@NonNull LocationRequestCompat paramLocationRequestCompat)
  {
    mIntervalMillis = mIntervalMillis;
    mQuality = mQuality;
    mDurationMillis = mDurationMillis;
    mMaxUpdates = mMaxUpdates;
    mMinUpdateIntervalMillis = mMinUpdateIntervalMillis;
    mMinUpdateDistanceMeters = mMinUpdateDistanceMeters;
    mMaxUpdateDelayMillis = mMaxUpdateDelayMillis;
  }
  
  @NonNull
  public LocationRequestCompat build()
  {
    boolean bool;
    if ((mIntervalMillis == Long.MAX_VALUE) && (mMinUpdateIntervalMillis == -1L)) {
      bool = false;
    } else {
      bool = true;
    }
    Preconditions.checkState(bool, "passive location requests must have an explicit minimum update interval");
    long l = mIntervalMillis;
    return new LocationRequestCompat(l, mQuality, mDurationMillis, mMaxUpdates, Math.min(mMinUpdateIntervalMillis, l), mMinUpdateDistanceMeters, mMaxUpdateDelayMillis);
  }
  
  @NonNull
  public Builder clearMinUpdateIntervalMillis()
  {
    mMinUpdateIntervalMillis = -1L;
    return this;
  }
  
  @NonNull
  public Builder setDurationMillis(@IntRange(from=1L) long paramLong)
  {
    mDurationMillis = Preconditions.checkArgumentInRange(paramLong, 1L, Long.MAX_VALUE, "durationMillis");
    return this;
  }
  
  @NonNull
  public Builder setIntervalMillis(@IntRange(from=0L) long paramLong)
  {
    mIntervalMillis = Preconditions.checkArgumentInRange(paramLong, 0L, Long.MAX_VALUE, "intervalMillis");
    return this;
  }
  
  @NonNull
  public Builder setMaxUpdateDelayMillis(@IntRange(from=0L) long paramLong)
  {
    mMaxUpdateDelayMillis = paramLong;
    mMaxUpdateDelayMillis = Preconditions.checkArgumentInRange(paramLong, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
    return this;
  }
  
  @NonNull
  public Builder setMaxUpdates(@IntRange(from=1L, to=2147483647L) int paramInt)
  {
    mMaxUpdates = Preconditions.checkArgumentInRange(paramInt, 1, Integer.MAX_VALUE, "maxUpdates");
    return this;
  }
  
  @NonNull
  public Builder setMinUpdateDistanceMeters(@FloatRange(from=0.0D, to=3.4028234663852886E38D) float paramFloat)
  {
    mMinUpdateDistanceMeters = paramFloat;
    mMinUpdateDistanceMeters = Preconditions.checkArgumentInRange(paramFloat, 0.0F, Float.MAX_VALUE, "minUpdateDistanceMeters");
    return this;
  }
  
  @NonNull
  public Builder setMinUpdateIntervalMillis(@IntRange(from=0L) long paramLong)
  {
    mMinUpdateIntervalMillis = Preconditions.checkArgumentInRange(paramLong, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
    return this;
  }
  
  @NonNull
  public Builder setQuality(int paramInt)
  {
    boolean bool;
    if ((paramInt != 104) && (paramInt != 102) && (paramInt != 100)) {
      bool = false;
    } else {
      bool = true;
    }
    Preconditions.checkArgument(bool, "quality must be a defined QUALITY constant, not %d", new Object[] { Integer.valueOf(paramInt) });
    mQuality = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationRequestCompat.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */