package com.google.ads.interactivemedia.v3.impl.data;

final class f
  implements c
{
  private String appState;
  private String eventId;
  private Long nativeTime;
  private Boolean nativeViewAttached;
  private y nativeViewBounds;
  private Boolean nativeViewHidden;
  private y nativeViewVisibleBounds;
  private Double nativeVolume;
  private String queryId;
  private String vastEvent;
  
  public final c appState(String paramString)
  {
    if (paramString != null)
    {
      appState = paramString;
      return this;
    }
    throw new NullPointerException("Null appState");
  }
  
  public final a build()
  {
    Object localObject1 = queryId;
    Object localObject2 = "";
    if (localObject1 == null) {
      localObject2 = "".concat(" queryId");
    }
    localObject1 = localObject2;
    if (eventId == null) {
      localObject1 = String.valueOf(localObject2).concat(" eventId");
    }
    localObject2 = localObject1;
    if (vastEvent == null) {
      localObject2 = String.valueOf(localObject1).concat(" vastEvent");
    }
    localObject1 = localObject2;
    if (appState == null) {
      localObject1 = String.valueOf(localObject2).concat(" appState");
    }
    localObject2 = localObject1;
    if (nativeTime == null) {
      localObject2 = String.valueOf(localObject1).concat(" nativeTime");
    }
    localObject1 = localObject2;
    if (nativeVolume == null) {
      localObject1 = String.valueOf(localObject2).concat(" nativeVolume");
    }
    Object localObject3 = localObject1;
    if (nativeViewAttached == null) {
      localObject3 = String.valueOf(localObject1).concat(" nativeViewAttached");
    }
    localObject2 = localObject3;
    if (nativeViewHidden == null) {
      localObject2 = String.valueOf(localObject3).concat(" nativeViewHidden");
    }
    localObject1 = localObject2;
    if (nativeViewBounds == null) {
      localObject1 = String.valueOf(localObject2).concat(" nativeViewBounds");
    }
    localObject2 = localObject1;
    if (nativeViewVisibleBounds == null) {
      localObject2 = String.valueOf(localObject1).concat(" nativeViewVisibleBounds");
    }
    if (!((String)localObject2).isEmpty())
    {
      if (((String)localObject2).length() != 0) {
        localObject2 = "Missing required properties:".concat((String)localObject2);
      } else {
        localObject2 = new String("Missing required properties:");
      }
      throw new IllegalStateException((String)localObject2);
    }
    return new d(queryId, eventId, vastEvent, appState, nativeTime.longValue(), nativeVolume.doubleValue(), nativeViewAttached.booleanValue(), nativeViewHidden.booleanValue(), nativeViewBounds, nativeViewVisibleBounds, null);
  }
  
  public final c eventId(String paramString)
  {
    if (paramString != null)
    {
      eventId = paramString;
      return this;
    }
    throw new NullPointerException("Null eventId");
  }
  
  public final c nativeTime(long paramLong)
  {
    nativeTime = Long.valueOf(paramLong);
    return this;
  }
  
  public final c nativeViewAttached(boolean paramBoolean)
  {
    nativeViewAttached = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final c nativeViewBounds(y paramy)
  {
    if (paramy != null)
    {
      nativeViewBounds = paramy;
      return this;
    }
    throw new NullPointerException("Null nativeViewBounds");
  }
  
  public final c nativeViewHidden(boolean paramBoolean)
  {
    nativeViewHidden = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final c nativeViewVisibleBounds(y paramy)
  {
    if (paramy != null)
    {
      nativeViewVisibleBounds = paramy;
      return this;
    }
    throw new NullPointerException("Null nativeViewVisibleBounds");
  }
  
  public final c nativeVolume(double paramDouble)
  {
    nativeVolume = Double.valueOf(paramDouble);
    return this;
  }
  
  public final c queryId(String paramString)
  {
    if (paramString != null)
    {
      queryId = paramString;
      return this;
    }
    throw new NullPointerException("Null queryId");
  }
  
  public final c vastEvent(String paramString)
  {
    if (paramString != null)
    {
      vastEvent = paramString;
      return this;
    }
    throw new NullPointerException("Null vastEvent");
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */