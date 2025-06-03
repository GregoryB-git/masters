package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.agz;
import com.google.ads.interactivemedia.v3.internal.aib;

@agz(a=u.class, b={"extraParams", "isTv", "ignoreStrictModeFalsePositives"})
public abstract class TestingConfiguration
{
  public static final String PARAMETER_KEY = "tcnfp";
  
  public static Builder builder()
  {
    return new t().disableOnScreenDetection(false).useVideoElementMock(false).videoElementMockDuration(30.0F).useTestStreamManager(false).ignoreStrictModeFalsePositives(false).forceTvMode(false).enableMonitorAppLifecycle(true);
  }
  
  public Builder copy()
  {
    return new t().disableOnScreenDetection(disableOnScreenDetection()).useVideoElementMock(useVideoElementMock()).videoElementMockDuration(videoElementMockDuration()).useTestStreamManager(useTestStreamManager()).enableMonitorAppLifecycle(enableMonitorAppLifecycle()).forceTvMode(forceTvMode()).ignoreStrictModeFalsePositives(ignoreStrictModeFalsePositives()).extraParams(extraParams());
  }
  
  public abstract boolean disableOnScreenDetection();
  
  public abstract boolean enableMonitorAppLifecycle();
  
  public abstract aib<String, Object> extraParams();
  
  public abstract boolean forceTvMode();
  
  public abstract boolean ignoreStrictModeFalsePositives();
  
  public abstract boolean useTestStreamManager();
  
  public abstract boolean useVideoElementMock();
  
  public abstract float videoElementMockDuration();
  
  public static abstract interface Builder
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
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */