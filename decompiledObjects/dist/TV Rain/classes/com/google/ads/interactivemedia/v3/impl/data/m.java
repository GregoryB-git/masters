package com.google.ads.interactivemedia.v3.impl.data;

final class m
  extends ab
{
  private final int experimentId;
  private final boolean shouldReport;
  
  public m(int paramInt, boolean paramBoolean)
  {
    experimentId = paramInt;
    shouldReport = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof ab))
    {
      paramObject = (ab)paramObject;
      if ((experimentId == ((ab)paramObject).experimentId()) && (shouldReport == ((ab)paramObject).shouldReport())) {
        return true;
      }
    }
    return false;
  }
  
  public final int experimentId()
  {
    return experimentId;
  }
  
  public final int hashCode()
  {
    int i = experimentId;
    int j;
    if (shouldReport) {
      j = 1231;
    } else {
      j = 1237;
    }
    return (i ^ 0xF4243) * 1000003 ^ j;
  }
  
  public final boolean shouldReport()
  {
    return shouldReport;
  }
  
  public final String toString()
  {
    int i = experimentId;
    boolean bool = shouldReport;
    StringBuilder localStringBuilder = new StringBuilder(65);
    localStringBuilder.append("ExperimentLayerData{experimentId=");
    localStringBuilder.append(i);
    localStringBuilder.append(", shouldReport=");
    localStringBuilder.append(bool);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */