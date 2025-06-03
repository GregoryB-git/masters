package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.aib;

public abstract interface TestingConfiguration$Builder
{
  public abstract TestingConfiguration build();
  
  public abstract Builder disableOnScreenDetection(boolean paramBoolean);
  
  public abstract Builder enableMonitorAppLifecycle(boolean paramBoolean);
  
  public abstract Builder extraParams(aib<String, Object> paramaib);
  
  public abstract Builder forceTvMode(boolean paramBoolean);
  
  public abstract Builder ignoreStrictModeFalsePositives(boolean paramBoolean);
  
  public abstract Builder useTestStreamManager(boolean paramBoolean);
  
  public abstract Builder useVideoElementMock(boolean paramBoolean);
  
  public abstract Builder videoElementMockDuration(float paramFloat);
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */