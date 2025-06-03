package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorType;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener;
import com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener;
import com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType;
import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.BaseManager;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.v3.impl.data.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

abstract class aeb
  implements BaseManager, aey
{
  public final afc a;
  public final String b;
  public AdsRenderingSettings c;
  public aei d;
  public aff e;
  public boolean f = false;
  private final List<AdEvent.AdEventListener> g = new ArrayList(1);
  private final aek h = new aek();
  private final Context i;
  private b j;
  private AdProgressInfo k;
  private aet l;
  private afd m;
  
  public aeb(String paramString, afc paramafc, BaseDisplayContainer paramBaseDisplayContainer, aet paramaet, afd paramafd, Context paramContext, boolean paramBoolean)
    throws AdError
  {
    b = paramString;
    a = paramafc;
    i = paramContext;
    c = new adu();
    if (paramaet != null) {
      l = paramaet;
    } else {
      l = new aet(paramString, paramafc, paramBaseDisplayContainer.getAdContainer());
    }
    l.a(paramBoolean);
    if (paramafd == null)
    {
      paramafd = null;
    }
    else
    {
      paramafd.a(paramString);
      paramafd.b(paramBaseDisplayContainer.getAdContainer());
      addAdEventListener(paramafd);
      addAdErrorListener(paramafd);
      paramBaseDisplayContainer = (adz)paramBaseDisplayContainer;
      paramaet = paramBaseDisplayContainer.b().iterator();
      while (paramaet.hasNext()) {
        paramafd.c((View)paramaet.next());
      }
      paramBaseDisplayContainer.a(paramafd);
    }
    m = paramafd;
    paramafc.a(this, paramString);
    l.a();
  }
  
  private final void a(AdEvent.AdEventType paramAdEventType, Map<String, String> paramMap)
  {
    paramMap = new adh(paramAdEventType, j, paramMap);
    paramAdEventType = g.iterator();
    while (paramAdEventType.hasNext()) {
      ((AdEvent.AdEventListener)paramAdEventType.next()).onAdEvent(paramMap);
    }
  }
  
  private final void b(AdErrorEvent paramAdErrorEvent)
  {
    k = null;
    a(paramAdErrorEvent);
  }
  
  public void a(AdError.AdErrorType paramAdErrorType, int paramInt, String paramString)
  {
    b(new adi(new AdError(paramAdErrorType, paramInt, paramString)));
  }
  
  public void a(AdError.AdErrorType paramAdErrorType, AdError.AdErrorCode paramAdErrorCode, String paramString)
  {
    b(new adi(new AdError(paramAdErrorType, paramAdErrorCode, paramString)));
  }
  
  public final void a(AdErrorEvent paramAdErrorEvent)
  {
    h.a(paramAdErrorEvent);
  }
  
  public final void a(aer paramaer)
  {
    a.b(new aeq(aes.adsManager, paramaer, b));
  }
  
  public void a(aev paramaev)
  {
    AdEvent.AdEventType localAdEventType = a;
    Object localObject = b;
    int n = localAdEventType.ordinal();
    if (n != 2)
    {
      if (n != 3)
      {
        if (n != 5) {
          if (n != 6) {
            if (n != 17)
            {
              if (n == 23) {
                break label223;
              }
              if (n != 19) {
                if (n == 20) {}
              }
            }
          }
        }
        switch (n)
        {
        default: 
          break;
        case 15: 
          if (localObject == null) {
            break;
          }
          j = ((b)localObject);
          break;
        case 13: 
          if (!c.getFocusSkipButtonWhenAvailable()) {
            break;
          }
          a(b);
          break;
          k = e;
          break;
          j = ((b)localObject);
          break;
          if (rp.c(f)) {
            break;
          }
          a.c(f);
          break;
          localObject = e;
          if (localObject != null) {
            ((aff)localObject).a();
          }
          l.d();
          break;
          localObject = e;
          if (localObject != null) {
            ((aff)localObject).b();
          }
          l.c();
          break;
        }
      }
      label223:
      k = null;
    }
    else
    {
      localObject = ((b)localObject).getClickThruUrl();
      if (!rp.c((String)localObject)) {
        a.c((String)localObject);
      }
    }
    paramaev = c;
    if (paramaev != null) {
      a(localAdEventType, paramaev);
    } else {
      a(localAdEventType, null);
    }
    if ((localAdEventType == AdEvent.AdEventType.COMPLETED) || (localAdEventType == AdEvent.AdEventType.SKIPPED)) {
      j = null;
    }
  }
  
  public final void a(String paramString)
  {
    if (afz.a(i, a.c()))
    {
      a.b().requestFocus();
      a.b(new aeq(aes.userInteraction, aer.focusSkipButton, paramString));
    }
  }
  
  public void a(Map<String, CompanionData> paramMap) {}
  
  public void addAdErrorListener(AdErrorEvent.AdErrorListener paramAdErrorListener)
  {
    h.a(paramAdErrorListener);
  }
  
  public void addAdEventListener(AdEvent.AdEventListener paramAdEventListener)
  {
    g.add(paramAdEventListener);
  }
  
  public void b()
  {
    Object localObject = m;
    if ((localObject != null) && (((afd)localObject).d())) {
      Log.d("IMASDK", "OMID ad session ended on BaseManager destroy.");
    }
    localObject = e;
    if (localObject != null) {
      ((aff)localObject).b();
    }
    l.b();
    a.b(b);
    j = null;
  }
  
  public AdProgressInfo getAdProgressInfo()
  {
    return k;
  }
  
  public Ad getCurrentAd()
  {
    return j;
  }
  
  public void init()
  {
    init(null);
  }
  
  public void init(AdsRenderingSettings paramAdsRenderingSettings)
  {
    Object localObject = paramAdsRenderingSettings;
    if (paramAdsRenderingSettings == null) {
      localObject = c;
    }
    c = ((AdsRenderingSettings)localObject);
    paramAdsRenderingSettings = new HashMap();
    paramAdsRenderingSettings.put("adsRenderingSettings", c);
    localObject = e;
    if (localObject != null)
    {
      localObject = ((aff)localObject).c();
      if (!((VideoProgressUpdate)localObject).equals(VideoProgressUpdate.VIDEO_TIME_NOT_READY))
      {
        double d1 = ((VideoProgressUpdate)localObject).getCurrentTime();
        localObject = new StringBuilder(68);
        ((StringBuilder)localObject).append("AdsManager.init -> Setting contentStartTime ");
        ((StringBuilder)localObject).append(d1);
        Log.d("IMASDK", ((StringBuilder)localObject).toString());
        paramAdsRenderingSettings.put("contentStartTime", Double.valueOf(d1));
      }
    }
    if (!isCustomPlaybackUsed()) {
      paramAdsRenderingSettings.put("sdkOwnedPlayer", Boolean.TRUE);
    }
    a.a(c);
    a.b(new aeq(aes.adsManager, aer.init, b, paramAdsRenderingSettings));
  }
  
  public abstract boolean isCustomPlaybackUsed();
  
  public void removeAdErrorListener(AdErrorEvent.AdErrorListener paramAdErrorListener)
  {
    h.b(paramAdErrorListener);
  }
  
  public void removeAdEventListener(AdEvent.AdEventListener paramAdEventListener)
  {
    g.remove(paramAdEventListener);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aeb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */