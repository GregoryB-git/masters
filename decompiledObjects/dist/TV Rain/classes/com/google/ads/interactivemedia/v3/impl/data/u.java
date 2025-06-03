package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.aib;

final class u
  extends TestingConfiguration
{
  private final boolean disableOnScreenDetection;
  private final boolean enableMonitorAppLifecycle;
  private final aib<String, Object> extraParams;
  private final boolean forceTvMode;
  private final boolean ignoreStrictModeFalsePositives;
  private final boolean useTestStreamManager;
  private final boolean useVideoElementMock;
  private final float videoElementMockDuration;
  
  private u(boolean paramBoolean1, boolean paramBoolean2, float paramFloat, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, aib<String, Object> paramaib)
  {
    disableOnScreenDetection = paramBoolean1;
    useVideoElementMock = paramBoolean2;
    videoElementMockDuration = paramFloat;
    useTestStreamManager = paramBoolean3;
    enableMonitorAppLifecycle = paramBoolean4;
    forceTvMode = paramBoolean5;
    ignoreStrictModeFalsePositives = paramBoolean6;
    extraParams = paramaib;
  }
  
  public final boolean disableOnScreenDetection()
  {
    return disableOnScreenDetection;
  }
  
  public final boolean enableMonitorAppLifecycle()
  {
    return enableMonitorAppLifecycle;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof TestingConfiguration))
    {
      TestingConfiguration localTestingConfiguration = (TestingConfiguration)paramObject;
      if ((disableOnScreenDetection == localTestingConfiguration.disableOnScreenDetection()) && (useVideoElementMock == localTestingConfiguration.useVideoElementMock()) && (Float.floatToIntBits(videoElementMockDuration) == Float.floatToIntBits(localTestingConfiguration.videoElementMockDuration())) && (useTestStreamManager == localTestingConfiguration.useTestStreamManager()) && (enableMonitorAppLifecycle == localTestingConfiguration.enableMonitorAppLifecycle()) && (forceTvMode == localTestingConfiguration.forceTvMode()) && (ignoreStrictModeFalsePositives == localTestingConfiguration.ignoreStrictModeFalsePositives()))
      {
        paramObject = extraParams;
        if (paramObject == null ? localTestingConfiguration.extraParams() == null : ((aib)paramObject).equals(localTestingConfiguration.extraParams())) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final aib<String, Object> extraParams()
  {
    return extraParams;
  }
  
  public final boolean forceTvMode()
  {
    return forceTvMode;
  }
  
  public final int hashCode()
  {
    boolean bool = disableOnScreenDetection;
    int i = 1231;
    int j;
    if (bool) {
      j = 1231;
    } else {
      j = 1237;
    }
    int k;
    if (useVideoElementMock) {
      k = 1231;
    } else {
      k = 1237;
    }
    int m = Float.floatToIntBits(videoElementMockDuration);
    int n;
    if (useTestStreamManager) {
      n = 1231;
    } else {
      n = 1237;
    }
    int i1;
    if (enableMonitorAppLifecycle) {
      i1 = 1231;
    } else {
      i1 = 1237;
    }
    int i2;
    if (forceTvMode) {
      i2 = 1231;
    } else {
      i2 = 1237;
    }
    if (!ignoreStrictModeFalsePositives) {
      i = 1237;
    }
    aib localaib = extraParams;
    int i3;
    if (localaib == null) {
      i3 = 0;
    } else {
      i3 = localaib.hashCode();
    }
    return (((((((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i) * 1000003 ^ i3;
  }
  
  public final boolean ignoreStrictModeFalsePositives()
  {
    return ignoreStrictModeFalsePositives;
  }
  
  public final String toString()
  {
    boolean bool1 = disableOnScreenDetection;
    boolean bool2 = useVideoElementMock;
    float f = videoElementMockDuration;
    boolean bool3 = useTestStreamManager;
    boolean bool4 = enableMonitorAppLifecycle;
    boolean bool5 = forceTvMode;
    boolean bool6 = ignoreStrictModeFalsePositives;
    String str = String.valueOf(extraParams);
    StringBuilder localStringBuilder = new StringBuilder(str.length() + 253);
    localStringBuilder.append("TestingConfiguration{disableOnScreenDetection=");
    localStringBuilder.append(bool1);
    localStringBuilder.append(", useVideoElementMock=");
    localStringBuilder.append(bool2);
    localStringBuilder.append(", videoElementMockDuration=");
    localStringBuilder.append(f);
    localStringBuilder.append(", useTestStreamManager=");
    localStringBuilder.append(bool3);
    localStringBuilder.append(", enableMonitorAppLifecycle=");
    localStringBuilder.append(bool4);
    localStringBuilder.append(", forceTvMode=");
    localStringBuilder.append(bool5);
    localStringBuilder.append(", ignoreStrictModeFalsePositives=");
    localStringBuilder.append(bool6);
    localStringBuilder.append(", extraParams=");
    localStringBuilder.append(str);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final boolean useTestStreamManager()
  {
    return useTestStreamManager;
  }
  
  public final boolean useVideoElementMock()
  {
    return useVideoElementMock;
  }
  
  public final float videoElementMockDuration()
  {
    return videoElementMockDuration;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */