package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import java.util.Map;

public final class DefaultBandwidthMeter$Builder
{
  private Clock clock;
  @Nullable
  private final Context context;
  @Nullable
  private Handler eventHandler;
  @Nullable
  private BandwidthMeter.EventListener eventListener;
  private SparseArray<Long> initialBitrateEstimates;
  private int slidingWindowMaxWeight;
  
  @Deprecated
  public DefaultBandwidthMeter$Builder()
  {
    this(null);
  }
  
  public DefaultBandwidthMeter$Builder(@Nullable Context paramContext)
  {
    Context localContext;
    if (paramContext == null) {
      localContext = null;
    } else {
      localContext = paramContext.getApplicationContext();
    }
    context = localContext;
    initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.getCountryCode(paramContext));
    slidingWindowMaxWeight = 2000;
    clock = Clock.DEFAULT;
  }
  
  private static int[] getCountryGroupIndices(String paramString)
  {
    int[] arrayOfInt = (int[])DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_COUNTRY_GROUPS.get(paramString);
    paramString = arrayOfInt;
    if (arrayOfInt == null)
    {
      paramString = new int[4];
      paramString[0] = 2;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 2;
      paramString;
    }
    return paramString;
  }
  
  private static SparseArray<Long> getInitialBitrateEstimatesForCountry(String paramString)
  {
    paramString = getCountryGroupIndices(paramString);
    SparseArray localSparseArray = new SparseArray(6);
    localSparseArray.append(0, Long.valueOf(1000000L));
    long[] arrayOfLong = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
    localSparseArray.append(2, Long.valueOf(arrayOfLong[paramString[0]]));
    localSparseArray.append(3, Long.valueOf(DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G[paramString[1]]));
    localSparseArray.append(4, Long.valueOf(DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G[paramString[2]]));
    localSparseArray.append(5, Long.valueOf(DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G[paramString[3]]));
    localSparseArray.append(7, Long.valueOf(arrayOfLong[paramString[0]]));
    return localSparseArray;
  }
  
  public DefaultBandwidthMeter build()
  {
    Object localObject1 = (Long)initialBitrateEstimates.get(Util.getNetworkType(context));
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = (Long)initialBitrateEstimates.get(0);
    }
    localObject2 = new DefaultBandwidthMeter(((Long)localObject2).longValue(), slidingWindowMaxWeight, clock, null);
    localObject1 = eventHandler;
    if (localObject1 != null)
    {
      BandwidthMeter.EventListener localEventListener = eventListener;
      if (localEventListener != null) {
        ((DefaultBandwidthMeter)localObject2).addEventListener((Handler)localObject1, localEventListener);
      }
    }
    return (DefaultBandwidthMeter)localObject2;
  }
  
  public Builder setClock(Clock paramClock)
  {
    clock = paramClock;
    return this;
  }
  
  public Builder setEventListener(Handler paramHandler, BandwidthMeter.EventListener paramEventListener)
  {
    boolean bool;
    if ((paramHandler != null) && (paramEventListener != null)) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    eventHandler = paramHandler;
    eventListener = paramEventListener;
    return this;
  }
  
  public Builder setInitialBitrateEstimate(int paramInt, long paramLong)
  {
    initialBitrateEstimates.put(paramInt, Long.valueOf(paramLong));
    return this;
  }
  
  public Builder setInitialBitrateEstimate(long paramLong)
  {
    for (int i = 0; i < initialBitrateEstimates.size(); i++) {
      initialBitrateEstimates.setValueAt(i, Long.valueOf(paramLong));
    }
    return this;
  }
  
  public Builder setInitialBitrateEstimate(String paramString)
  {
    initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.toUpperInvariant(paramString));
    return this;
  }
  
  public Builder setSlidingWindowMaxWeight(int paramInt)
  {
    slidingWindowMaxWeight = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */