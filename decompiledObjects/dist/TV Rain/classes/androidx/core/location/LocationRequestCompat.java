package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.location.LocationRequest.Builder;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.core.util.TimeUtils;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z2;

public final class LocationRequestCompat
{
  private static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1L;
  public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
  public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
  public static final int QUALITY_HIGH_ACCURACY = 100;
  public static final int QUALITY_LOW_POWER = 104;
  public final long mDurationMillis;
  public final long mIntervalMillis;
  public final long mMaxUpdateDelayMillis;
  public final int mMaxUpdates;
  public final float mMinUpdateDistanceMeters;
  public final long mMinUpdateIntervalMillis;
  public final int mQuality;
  
  public LocationRequestCompat(long paramLong1, int paramInt1, long paramLong2, int paramInt2, long paramLong3, float paramFloat, long paramLong4)
  {
    mIntervalMillis = paramLong1;
    mQuality = paramInt1;
    mMinUpdateIntervalMillis = paramLong3;
    mDurationMillis = paramLong2;
    mMaxUpdates = paramInt2;
    mMinUpdateDistanceMeters = paramFloat;
    mMaxUpdateDelayMillis = paramLong4;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof LocationRequestCompat)) {
      return false;
    }
    paramObject = (LocationRequestCompat)paramObject;
    if ((mQuality != mQuality) || (mIntervalMillis != mIntervalMillis) || (mMinUpdateIntervalMillis != mMinUpdateIntervalMillis) || (mDurationMillis != mDurationMillis) || (mMaxUpdates != mMaxUpdates) || (Float.compare(mMinUpdateDistanceMeters, mMinUpdateDistanceMeters) != 0) || (mMaxUpdateDelayMillis != mMaxUpdateDelayMillis)) {
      bool = false;
    }
    return bool;
  }
  
  @IntRange(from=1L)
  public long getDurationMillis()
  {
    return mDurationMillis;
  }
  
  @IntRange(from=0L)
  public long getIntervalMillis()
  {
    return mIntervalMillis;
  }
  
  @IntRange(from=0L)
  public long getMaxUpdateDelayMillis()
  {
    return mMaxUpdateDelayMillis;
  }
  
  @IntRange(from=1L, to=2147483647L)
  public int getMaxUpdates()
  {
    return mMaxUpdates;
  }
  
  @FloatRange(from=0.0D, to=3.4028234663852886E38D)
  public float getMinUpdateDistanceMeters()
  {
    return mMinUpdateDistanceMeters;
  }
  
  @IntRange(from=0L)
  public long getMinUpdateIntervalMillis()
  {
    long l1 = mMinUpdateIntervalMillis;
    long l2 = l1;
    if (l1 == -1L) {
      l2 = mIntervalMillis;
    }
    return l2;
  }
  
  public int getQuality()
  {
    return mQuality;
  }
  
  public int hashCode()
  {
    int i = mQuality;
    long l = mIntervalMillis;
    int j = (int)(l ^ l >>> 32);
    l = mMinUpdateIntervalMillis;
    return (i * 31 + j) * 31 + (int)(l ^ l >>> 32);
  }
  
  @NonNull
  @RequiresApi(31)
  public LocationRequest toLocationRequest()
  {
    return Api31Impl.toLocationRequest(this);
  }
  
  @SuppressLint({"NewApi"})
  @Nullable
  @RequiresApi(19)
  public LocationRequest toLocationRequest(@NonNull String paramString)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return toLocationRequest();
    }
    return (LocationRequest)Api19Impl.toLocationRequest(this, paramString);
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Request[");
    if (mIntervalMillis != Long.MAX_VALUE)
    {
      localStringBuilder.append("@");
      TimeUtils.formatDuration(mIntervalMillis, localStringBuilder);
      int i = mQuality;
      if (i != 100)
      {
        if (i != 102)
        {
          if (i == 104) {
            localStringBuilder.append(" LOW_POWER");
          }
        }
        else {
          localStringBuilder.append(" BALANCED");
        }
      }
      else {
        localStringBuilder.append(" HIGH_ACCURACY");
      }
    }
    else
    {
      localStringBuilder.append("PASSIVE");
    }
    if (mDurationMillis != Long.MAX_VALUE)
    {
      localStringBuilder.append(", duration=");
      TimeUtils.formatDuration(mDurationMillis, localStringBuilder);
    }
    if (mMaxUpdates != Integer.MAX_VALUE)
    {
      localStringBuilder.append(", maxUpdates=");
      localStringBuilder.append(mMaxUpdates);
    }
    long l = mMinUpdateIntervalMillis;
    if ((l != -1L) && (l < mIntervalMillis))
    {
      localStringBuilder.append(", minUpdateInterval=");
      TimeUtils.formatDuration(mMinUpdateIntervalMillis, localStringBuilder);
    }
    if (mMinUpdateDistanceMeters > 0.0D)
    {
      localStringBuilder.append(", minUpdateDistance=");
      localStringBuilder.append(mMinUpdateDistanceMeters);
    }
    if (mMaxUpdateDelayMillis / 2L > mIntervalMillis)
    {
      localStringBuilder.append(", maxUpdateDelay=");
      TimeUtils.formatDuration(mMaxUpdateDelayMillis, localStringBuilder);
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    private static Method sCreateFromDeprecatedProviderMethod;
    private static Class<?> sLocationRequestClass;
    private static Method sSetExpireInMethod;
    private static Method sSetFastestIntervalMethod;
    private static Method sSetNumUpdatesMethod;
    private static Method sSetQualityMethod;
    
    public static Object toLocationRequest(LocationRequestCompat paramLocationRequestCompat, String paramString)
    {
      try
      {
        if (sLocationRequestClass == null) {
          sLocationRequestClass = Class.forName("android.location.LocationRequest");
        }
        Method localMethod;
        if (sCreateFromDeprecatedProviderMethod == null)
        {
          localMethod = sLocationRequestClass.getDeclaredMethod("createFromDeprecatedProvider", new Class[] { String.class, Long.TYPE, Float.TYPE, Boolean.TYPE });
          sCreateFromDeprecatedProviderMethod = localMethod;
          localMethod.setAccessible(true);
        }
        paramString = sCreateFromDeprecatedProviderMethod.invoke(null, new Object[] { paramString, Long.valueOf(paramLocationRequestCompat.getIntervalMillis()), Float.valueOf(paramLocationRequestCompat.getMinUpdateDistanceMeters()), Boolean.FALSE });
        if (paramString == null) {
          return null;
        }
        if (sSetQualityMethod == null)
        {
          localMethod = sLocationRequestClass.getDeclaredMethod("setQuality", new Class[] { Integer.TYPE });
          sSetQualityMethod = localMethod;
          localMethod.setAccessible(true);
        }
        sSetQualityMethod.invoke(paramString, new Object[] { Integer.valueOf(paramLocationRequestCompat.getQuality()) });
        if (sSetFastestIntervalMethod == null)
        {
          localMethod = sLocationRequestClass.getDeclaredMethod("setFastestInterval", new Class[] { Long.TYPE });
          sSetFastestIntervalMethod = localMethod;
          localMethod.setAccessible(true);
        }
        sSetFastestIntervalMethod.invoke(paramString, new Object[] { Long.valueOf(paramLocationRequestCompat.getMinUpdateIntervalMillis()) });
        if (paramLocationRequestCompat.getMaxUpdates() < Integer.MAX_VALUE)
        {
          if (sSetNumUpdatesMethod == null)
          {
            localMethod = sLocationRequestClass.getDeclaredMethod("setNumUpdates", new Class[] { Integer.TYPE });
            sSetNumUpdatesMethod = localMethod;
            localMethod.setAccessible(true);
          }
          sSetNumUpdatesMethod.invoke(paramString, new Object[] { Integer.valueOf(paramLocationRequestCompat.getMaxUpdates()) });
        }
        if (paramLocationRequestCompat.getDurationMillis() < Long.MAX_VALUE)
        {
          if (sSetExpireInMethod == null)
          {
            localMethod = sLocationRequestClass.getDeclaredMethod("setExpireIn", new Class[] { Long.TYPE });
            sSetExpireInMethod = localMethod;
            localMethod.setAccessible(true);
          }
          sSetExpireInMethod.invoke(paramString, new Object[] { Long.valueOf(paramLocationRequestCompat.getDurationMillis()) });
        }
        return paramString;
      }
      catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException|ClassNotFoundException paramLocationRequestCompat) {}
      return null;
    }
  }
  
  @RequiresApi(31)
  public static class Api31Impl
  {
    @DoNotInline
    public static LocationRequest toLocationRequest(LocationRequestCompat paramLocationRequestCompat)
    {
      return new LocationRequest.Builder(paramLocationRequestCompat.getIntervalMillis()).setQuality(paramLocationRequestCompat.getQuality()).setMinUpdateIntervalMillis(paramLocationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(paramLocationRequestCompat.getDurationMillis()).setMaxUpdates(paramLocationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(paramLocationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(paramLocationRequestCompat.getMaxUpdateDelayMillis()).build();
    }
  }
  
  public static final class Builder
  {
    private long mDurationMillis;
    private long mIntervalMillis;
    private long mMaxUpdateDelayMillis;
    private int mMaxUpdates;
    private float mMinUpdateDistanceMeters;
    private long mMinUpdateIntervalMillis;
    private int mQuality;
    
    public Builder(long paramLong)
    {
      setIntervalMillis(paramLong);
      mQuality = 102;
      mDurationMillis = Long.MAX_VALUE;
      mMaxUpdates = Integer.MAX_VALUE;
      mMinUpdateIntervalMillis = -1L;
      mMinUpdateDistanceMeters = 0.0F;
      mMaxUpdateDelayMillis = 0L;
    }
    
    public Builder(@NonNull LocationRequestCompat paramLocationRequestCompat)
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
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface Quality {}
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationRequestCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */