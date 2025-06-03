package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class adt
  implements AdsRequest
{
  private String a;
  private AdDisplayContainer b;
  private Map<String, String> c;
  private String d;
  private ContentProgressProvider e;
  private adw f = adw.UNKNOWN;
  private ady g = ady.UNKNOWN;
  private adv h = adv.UNKNOWN;
  private Float i;
  private List<String> j;
  private String k;
  private Integer l;
  private Float m;
  private Float n;
  private transient Object o;
  
  public final adw a()
  {
    return f;
  }
  
  public final ady b()
  {
    return g;
  }
  
  public final adv c()
  {
    return h;
  }
  
  public final Float d()
  {
    return i;
  }
  
  public final List<String> e()
  {
    return j;
  }
  
  public final String f()
  {
    return k;
  }
  
  public final void forceExperimentId(Integer paramInteger)
  {
    l = paramInteger;
  }
  
  public final Float g()
  {
    return m;
  }
  
  public final AdDisplayContainer getAdDisplayContainer()
  {
    return b;
  }
  
  public final String getAdTagUrl()
  {
    return a;
  }
  
  public final String getAdsResponse()
  {
    return d;
  }
  
  public final ContentProgressProvider getContentProgressProvider()
  {
    return e;
  }
  
  public final String getExtraParameter(String paramString)
  {
    Map localMap = c;
    if (localMap == null) {
      return null;
    }
    return (String)localMap.get(paramString);
  }
  
  public final Map<String, String> getExtraParameters()
  {
    return c;
  }
  
  public final Integer getForcedExperimentId()
  {
    return l;
  }
  
  public final Object getUserRequestContext()
  {
    return o;
  }
  
  public final Float h()
  {
    return n;
  }
  
  public final void setAdDisplayContainer(AdDisplayContainer paramAdDisplayContainer)
  {
    b = paramAdDisplayContainer;
  }
  
  public final void setAdTagUrl(String paramString)
  {
    a = paramString;
  }
  
  public final void setAdWillAutoPlay(boolean paramBoolean)
  {
    adw localadw;
    if (paramBoolean) {
      localadw = adw.AUTO;
    } else {
      localadw = adw.CLICK;
    }
    f = localadw;
  }
  
  public final void setAdWillPlayMuted(boolean paramBoolean)
  {
    ady localady;
    if (paramBoolean) {
      localady = ady.MUTED;
    } else {
      localady = ady.UNMUTED;
    }
    g = localady;
  }
  
  public final void setAdsResponse(String paramString)
  {
    d = paramString;
  }
  
  public final void setContentDuration(float paramFloat)
  {
    i = Float.valueOf(paramFloat);
  }
  
  public final void setContentKeywords(List<String> paramList)
  {
    j = paramList;
  }
  
  public final void setContentProgressProvider(ContentProgressProvider paramContentProgressProvider)
  {
    e = paramContentProgressProvider;
  }
  
  public final void setContentTitle(String paramString)
  {
    k = paramString;
  }
  
  public final void setContinuousPlayback(boolean paramBoolean)
  {
    adv localadv;
    if (paramBoolean) {
      localadv = adv.ON;
    } else {
      localadv = adv.OFF;
    }
    h = localadv;
  }
  
  public final void setExtraParameter(String paramString1, String paramString2)
  {
    if (c == null) {
      c = new HashMap();
    }
    c.put(paramString1, paramString2);
  }
  
  public final void setLiveStreamPrefetchSeconds(float paramFloat)
  {
    n = Float.valueOf(paramFloat);
  }
  
  public final void setUserRequestContext(Object paramObject)
  {
    o = paramObject;
  }
  
  public final void setVastLoadTimeout(float paramFloat)
  {
    m = Float.valueOf(paramFloat);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.adt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */