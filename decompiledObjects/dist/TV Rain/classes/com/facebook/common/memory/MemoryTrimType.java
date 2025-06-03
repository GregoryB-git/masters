package com.facebook.common.memory;

public enum MemoryTrimType
{
  private double mSuggestedTrimRatio;
  
  static
  {
    MemoryTrimType localMemoryTrimType1 = new MemoryTrimType("OnCloseToDalvikHeapLimit", 0, 0.5D);
    OnCloseToDalvikHeapLimit = localMemoryTrimType1;
    MemoryTrimType localMemoryTrimType2 = new MemoryTrimType("OnSystemLowMemoryWhileAppInForeground", 1, 0.5D);
    OnSystemLowMemoryWhileAppInForeground = localMemoryTrimType2;
    MemoryTrimType localMemoryTrimType3 = new MemoryTrimType("OnSystemLowMemoryWhileAppInBackground", 2, 1.0D);
    OnSystemLowMemoryWhileAppInBackground = localMemoryTrimType3;
    MemoryTrimType localMemoryTrimType4 = new MemoryTrimType("OnAppBackgrounded", 3, 1.0D);
    OnAppBackgrounded = localMemoryTrimType4;
    $VALUES = new MemoryTrimType[] { localMemoryTrimType1, localMemoryTrimType2, localMemoryTrimType3, localMemoryTrimType4 };
  }
  
  private MemoryTrimType(double paramDouble)
  {
    mSuggestedTrimRatio = paramDouble;
  }
  
  public double getSuggestedTrimRatio()
  {
    return mSuggestedTrimRatio;
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.memory.MemoryTrimType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */