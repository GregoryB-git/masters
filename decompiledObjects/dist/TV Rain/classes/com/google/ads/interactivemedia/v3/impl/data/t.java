package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.aib;

final class t
  implements TestingConfiguration.Builder
{
  private Boolean disableOnScreenDetection;
  private Boolean enableMonitorAppLifecycle;
  private aib<String, Object> extraParams;
  private Boolean forceTvMode;
  private Boolean ignoreStrictModeFalsePositives;
  private Boolean useTestStreamManager;
  private Boolean useVideoElementMock;
  private Float videoElementMockDuration;
  
  public final TestingConfiguration build()
  {
    Object localObject1 = disableOnScreenDetection;
    Object localObject2 = "";
    if (localObject1 == null) {
      localObject2 = "".concat(" disableOnScreenDetection");
    }
    localObject1 = localObject2;
    if (useVideoElementMock == null) {
      localObject1 = String.valueOf(localObject2).concat(" useVideoElementMock");
    }
    localObject2 = localObject1;
    if (videoElementMockDuration == null) {
      localObject2 = String.valueOf(localObject1).concat(" videoElementMockDuration");
    }
    localObject1 = localObject2;
    if (useTestStreamManager == null) {
      localObject1 = String.valueOf(localObject2).concat(" useTestStreamManager");
    }
    localObject2 = localObject1;
    if (enableMonitorAppLifecycle == null) {
      localObject2 = String.valueOf(localObject1).concat(" enableMonitorAppLifecycle");
    }
    localObject1 = localObject2;
    if (forceTvMode == null) {
      localObject1 = String.valueOf(localObject2).concat(" forceTvMode");
    }
    localObject2 = localObject1;
    if (ignoreStrictModeFalsePositives == null) {
      localObject2 = String.valueOf(localObject1).concat(" ignoreStrictModeFalsePositives");
    }
    if (!((String)localObject2).isEmpty())
    {
      if (((String)localObject2).length() != 0) {
        localObject1 = "Missing required properties:".concat((String)localObject2);
      } else {
        localObject1 = new String("Missing required properties:");
      }
      throw new IllegalStateException((String)localObject1);
    }
    return new u(disableOnScreenDetection.booleanValue(), useVideoElementMock.booleanValue(), videoElementMockDuration.floatValue(), useTestStreamManager.booleanValue(), enableMonitorAppLifecycle.booleanValue(), forceTvMode.booleanValue(), ignoreStrictModeFalsePositives.booleanValue(), extraParams, null);
  }
  
  public final TestingConfiguration.Builder disableOnScreenDetection(boolean paramBoolean)
  {
    disableOnScreenDetection = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final TestingConfiguration.Builder enableMonitorAppLifecycle(boolean paramBoolean)
  {
    enableMonitorAppLifecycle = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final TestingConfiguration.Builder extraParams(aib<String, Object> paramaib)
  {
    extraParams = paramaib;
    return this;
  }
  
  public final TestingConfiguration.Builder forceTvMode(boolean paramBoolean)
  {
    forceTvMode = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final TestingConfiguration.Builder ignoreStrictModeFalsePositives(boolean paramBoolean)
  {
    ignoreStrictModeFalsePositives = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final TestingConfiguration.Builder useTestStreamManager(boolean paramBoolean)
  {
    useTestStreamManager = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final TestingConfiguration.Builder useVideoElementMock(boolean paramBoolean)
  {
    useVideoElementMock = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final TestingConfiguration.Builder videoElementMockDuration(float paramFloat)
  {
    videoElementMockDuration = Float.valueOf(paramFloat);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */