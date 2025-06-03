package com.google.ads.interactivemedia.v3.impl.data;

final class d
  extends a
{
  private final String appState;
  private final String eventId;
  private final long nativeTime;
  private final boolean nativeViewAttached;
  private final y nativeViewBounds;
  private final boolean nativeViewHidden;
  private final y nativeViewVisibleBounds;
  private final double nativeVolume;
  private final String queryId;
  private final String vastEvent;
  
  private d(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, double paramDouble, boolean paramBoolean1, boolean paramBoolean2, y paramy1, y paramy2)
  {
    queryId = paramString1;
    eventId = paramString2;
    vastEvent = paramString3;
    appState = paramString4;
    nativeTime = paramLong;
    nativeVolume = paramDouble;
    nativeViewAttached = paramBoolean1;
    nativeViewHidden = paramBoolean2;
    nativeViewBounds = paramy1;
    nativeViewVisibleBounds = paramy2;
  }
  
  public final String appState()
  {
    return appState;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      if ((queryId.equals(((a)paramObject).queryId())) && (eventId.equals(((a)paramObject).eventId())) && (vastEvent.equals(((a)paramObject).vastEvent())) && (appState.equals(((a)paramObject).appState())) && (nativeTime == ((a)paramObject).nativeTime()) && (Double.doubleToLongBits(nativeVolume) == Double.doubleToLongBits(((a)paramObject).nativeVolume())) && (nativeViewAttached == ((a)paramObject).nativeViewAttached()) && (nativeViewHidden == ((a)paramObject).nativeViewHidden()) && (nativeViewBounds.equals(((a)paramObject).nativeViewBounds())) && (nativeViewVisibleBounds.equals(((a)paramObject).nativeViewVisibleBounds()))) {
        return true;
      }
    }
    return false;
  }
  
  public final String eventId()
  {
    return eventId;
  }
  
  public final int hashCode()
  {
    int i = queryId.hashCode();
    int j = eventId.hashCode();
    int k = vastEvent.hashCode();
    int m = appState.hashCode();
    long l = nativeTime;
    int n = (int)(l ^ l >>> 32);
    int i1 = (int)(Double.doubleToLongBits(nativeVolume) >>> 32 ^ Double.doubleToLongBits(nativeVolume));
    boolean bool = nativeViewAttached;
    int i2 = 1231;
    int i3;
    if (bool) {
      i3 = 1231;
    } else {
      i3 = 1237;
    }
    if (!nativeViewHidden) {
      i2 = 1237;
    }
    return (((((((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i3) * 1000003 ^ i2) * 1000003 ^ nativeViewBounds.hashCode()) * 1000003 ^ nativeViewVisibleBounds.hashCode();
  }
  
  public final long nativeTime()
  {
    return nativeTime;
  }
  
  public final boolean nativeViewAttached()
  {
    return nativeViewAttached;
  }
  
  public final y nativeViewBounds()
  {
    return nativeViewBounds;
  }
  
  public final boolean nativeViewHidden()
  {
    return nativeViewHidden;
  }
  
  public final y nativeViewVisibleBounds()
  {
    return nativeViewVisibleBounds;
  }
  
  public final double nativeVolume()
  {
    return nativeVolume;
  }
  
  public final String queryId()
  {
    return queryId;
  }
  
  public final String toString()
  {
    Object localObject = queryId;
    String str1 = eventId;
    String str2 = vastEvent;
    String str3 = appState;
    long l = nativeTime;
    double d = nativeVolume;
    boolean bool1 = nativeViewAttached;
    boolean bool2 = nativeViewHidden;
    String str4 = String.valueOf(nativeViewBounds);
    String str5 = String.valueOf(nativeViewVisibleBounds);
    int i = a.b(str3, a.b(str2, a.b(str1, a.b((String)localObject, 229))));
    int j = str4.length();
    localObject = a.q(str5.length() + (j + i), "ActivityMonitorData{queryId=", (String)localObject, ", eventId=", str1);
    a.C((StringBuilder)localObject, ", vastEvent=", str2, ", appState=", str3);
    ((StringBuilder)localObject).append(", nativeTime=");
    ((StringBuilder)localObject).append(l);
    ((StringBuilder)localObject).append(", nativeVolume=");
    ((StringBuilder)localObject).append(d);
    ((StringBuilder)localObject).append(", nativeViewAttached=");
    ((StringBuilder)localObject).append(bool1);
    ((StringBuilder)localObject).append(", nativeViewHidden=");
    ((StringBuilder)localObject).append(bool2);
    ((StringBuilder)localObject).append(", nativeViewBounds=");
    ((StringBuilder)localObject).append(str4);
    return a.p((StringBuilder)localObject, ", nativeViewVisibleBounds=", str5, "}");
  }
  
  public final String vastEvent()
  {
    return vastEvent;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */