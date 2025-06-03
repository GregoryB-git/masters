package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorType;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.AdProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import com.google.ads.interactivemedia.v3.impl.data.ag;
import com.google.ads.interactivemedia.v3.impl.data.b;
import java.util.Map;

public final class afe
  implements adm, afn
{
  private final VideoAdPlayer a;
  private final ads b;
  private final afc c;
  private final String d;
  private final afp e;
  private final adk f;
  private final ahn<aes, AdMediaInfo> g = ahn.a(2);
  private boolean h;
  private boolean i = false;
  private boolean j = false;
  private boolean k = false;
  
  public afe(String paramString, afb paramafb, afc paramafc, ads paramads, AdDisplayContainer paramAdDisplayContainer, Context paramContext)
    throws AdError
  {
    this(paramString, paramafb, paramafc, paramads, paramAdDisplayContainer, null, paramContext);
  }
  
  private afe(String paramString, afb paramafb, afc paramafc, ads paramads, AdDisplayContainer paramAdDisplayContainer, afp paramafp, Context paramContext)
    throws AdError
  {
    if (paramAdDisplayContainer.getPlayer() != null)
    {
      a = paramAdDisplayContainer.getPlayer();
      h = true;
    }
    else
    {
      a = new afs(paramafb, paramContext, paramAdDisplayContainer.getAdContainer());
      h = false;
    }
    b = paramads;
    c = paramafc;
    d = paramString;
    e = new afp(paramafc.b(), paramAdDisplayContainer.getAdContainer());
    f = new adk(this);
  }
  
  private final void g()
  {
    if (!j)
    {
      a.addCallback(f);
      j = true;
    }
  }
  
  private final void h()
  {
    a.removeCallback(f);
    j = false;
  }
  
  public final void a()
  {
    h();
  }
  
  public final void a(ResizeAndPositionVideoMsgData paramResizeAndPositionVideoMsgData)
  {
    if (!h)
    {
      ((afs)a).a(paramResizeAndPositionVideoMsgData);
      return;
    }
    Log.e("IMASDK", "Positioning the video is not supported with custom video players.");
  }
  
  public final void a(b paramb)
  {
    if ((i) && (paramb.canDisableUi()))
    {
      paramb.setUiDisabled(true);
      return;
    }
    paramb.setUiDisabled(false);
    if ((afz.a) && (paramb.isLinear()))
    {
      e.c();
      return;
    }
    e.a(paramb);
  }
  
  public final void a(aer paramaer, AdMediaInfo paramAdMediaInfo, Object paramObject)
  {
    paramAdMediaInfo = (aes)g.b().get(paramAdMediaInfo);
    if (paramAdMediaInfo == null)
    {
      paramAdMediaInfo = String.valueOf(paramaer);
      paramaer = new StringBuilder(paramAdMediaInfo.length() + 113);
      paramaer.append("The adMediaInfo for the ");
      paramaer.append(paramAdMediaInfo);
      paramaer.append(" event is not active. This may occur if callbacks are triggered after the ad is unloaded.");
      Log.d("SDK_DEBUG", paramaer.toString());
      return;
    }
    if (k) {
      paramAdMediaInfo = aes.videoDisplay;
    }
    paramaer = new aeq(paramAdMediaInfo, paramaer, d, paramObject);
    c.b(paramaer);
  }
  
  public final void a(aes paramaes, aer paramaer, ag paramag)
  {
    AdMediaInfo localAdMediaInfo = (AdMediaInfo)g.get(paramaes);
    int m = paramaer.ordinal();
    if (m != 35)
    {
      if (m != 43)
      {
        if (m != 44)
        {
          if ((m == 65) || (m == 66))
          {
            a.stopAd(localAdMediaInfo);
            g.remove(paramaes);
          }
        }
        else
        {
          a.playAd(localAdMediaInfo);
          g();
        }
      }
      else {
        a.pauseAd(localAdMediaInfo);
      }
    }
    else
    {
      if ((paramag != null) && (videoUrl != null))
      {
        g();
        localAdMediaInfo = new AdMediaInfo(videoUrl);
        paramaer = null;
        paramag = adPodInfo;
        if (paramag != null) {
          paramaer = paramag;
        }
        g.put(paramaes, localAdMediaInfo);
        a.loadAd(localAdMediaInfo, paramaer);
        return;
      }
      b.a(new adi(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    i = paramBoolean;
  }
  
  public final void b()
  {
    Log.d("SDK_DEBUG", "Destroying NativeVideoDisplay");
    if (afz.a) {
      e.d();
    } else {
      e.b();
    }
    h();
    a.release();
  }
  
  public final boolean c()
  {
    return h;
  }
  
  public final void d()
  {
    if (afz.a)
    {
      e.d();
      return;
    }
    e.a();
  }
  
  public final void e()
  {
    k = true;
  }
  
  public final void f()
  {
    if (!h)
    {
      ((afs)a).a();
      return;
    }
    Log.e("IMASDK", "Positioning the video is not supported with custom video players.");
  }
  
  public final VideoProgressUpdate getAdProgress()
  {
    return a.getAdProgress();
  }
  
  public final void onAdError(AdErrorEvent paramAdErrorEvent)
  {
    d();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */