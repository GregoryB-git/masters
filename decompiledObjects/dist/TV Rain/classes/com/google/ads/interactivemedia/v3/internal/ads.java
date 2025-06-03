package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorType;
import com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import com.google.ads.interactivemedia.v3.impl.data.b;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public final class ads
  extends aeb
  implements AdsManager
{
  private List<CompanionData> g;
  private List<Float> h;
  private afe i;
  
  public ads(String paramString, afc paramafc, afb paramafb, BaseDisplayContainer paramBaseDisplayContainer, ContentProgressProvider paramContentProgressProvider, List<Float> paramList, SortedSet<Float> paramSortedSet, afd paramafd, Context paramContext, boolean paramBoolean)
    throws AdError
  {
    this(paramString, paramafc, paramafb, paramBaseDisplayContainer, paramContentProgressProvider, paramList, paramSortedSet, null, null, null, paramafd, paramContext, paramBoolean);
  }
  
  private ads(String paramString, afc paramafc, afb paramafb, BaseDisplayContainer paramBaseDisplayContainer, ContentProgressProvider paramContentProgressProvider, List<Float> paramList, SortedSet<Float> paramSortedSet, afe paramafe, aff paramaff, aet paramaet, afd paramafd, Context paramContext, boolean paramBoolean)
    throws AdError
  {
    super(paramString, paramafc, paramBaseDisplayContainer, null, paramafd, paramContext, paramBoolean);
    h = paramList;
    if ((paramSortedSet != null) && (!paramSortedSet.isEmpty())) {
      if (paramContentProgressProvider != null)
      {
        e = new aff(paramContentProgressProvider, paramafb.a());
        paramContentProgressProvider = new aei(paramafc, paramSortedSet, paramString);
        d = paramContentProgressProvider;
        e.a(paramContentProgressProvider);
        e.a();
      }
      else
      {
        throw new AdError(AdError.AdErrorType.PLAY, AdError.AdErrorCode.PLAYLIST_NO_CONTENT_TRACKING, "Unable to handle cue points, no content progress provider configured.");
      }
    }
    paramafb = new afe(paramString, paramafb, paramafc, this, (AdDisplayContainer)paramBaseDisplayContainer, paramContext);
    i = paramafb;
    addAdErrorListener(paramafb);
    paramafc.a(i, paramString);
  }
  
  private final void b(Map<String, CompanionData> paramMap)
  {
    if (paramMap != null)
    {
      g = ahw.a(paramMap.values());
      return;
    }
    g = null;
  }
  
  private final List<CompanionData> getCurrentCompanions()
  {
    return g;
  }
  
  private final void onCompanionRendered(String paramString)
  {
    a.a(paramString, b);
  }
  
  public final void a()
  {
    i.f();
  }
  
  public final void a(ResizeAndPositionVideoMsgData paramResizeAndPositionVideoMsgData)
  {
    i.a(paramResizeAndPositionVideoMsgData);
  }
  
  public final void a(aev paramaev)
  {
    AdEvent.AdEventType localAdEventType = a;
    int j = localAdEventType.ordinal();
    if (j != 0)
    {
      if (j != 6)
      {
        if (j != 14)
        {
          if (j == 15)
          {
            b localb = b;
            i.a(localb);
          }
        }
        else {
          i.d();
        }
      }
      else
      {
        i.d();
        i.a();
      }
    }
    else
    {
      b();
      if (!f) {
        a(aer.destroy);
      }
    }
    if ((localAdEventType == AdEvent.AdEventType.COMPLETED) || (localAdEventType == AdEvent.AdEventType.SKIPPED)) {
      b(null);
    }
    super.a(paramaev);
  }
  
  public final void a(Map<String, CompanionData> paramMap)
  {
    b(paramMap);
  }
  
  public final void b()
  {
    g = null;
    i.b();
    super.b();
  }
  
  public final void clicked()
  {
    a.b(new aeq(aes.adsManager, aer.click, b));
  }
  
  public final void destroy()
  {
    aff localaff = e;
    if (localaff != null) {
      localaff.b();
    }
    a(aer.destroy);
    f = true;
  }
  
  public final void discardAdBreak()
  {
    a(aer.discardAdBreak);
  }
  
  public final void focus()
  {
    a(b);
  }
  
  public final void focusSkipButton()
  {
    if ((getCurrentAd() != null) && (getCurrentAd().isSkippable())) {
      a(b);
    }
  }
  
  public final List<Float> getAdCuePoints()
  {
    return h;
  }
  
  public final VideoProgressUpdate getAdProgress()
  {
    if (f) {
      return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }
    return i.getAdProgress();
  }
  
  public final void init(AdsRenderingSettings paramAdsRenderingSettings)
  {
    super.init(paramAdsRenderingSettings);
    i.a(c.getDisableUi());
  }
  
  public final boolean isCustomPlaybackUsed()
  {
    return i.c();
  }
  
  public final void pause()
  {
    a(aer.pause);
  }
  
  public final void requestNextAdBreak()
  {
    if (e != null)
    {
      a.b(new aeq(aes.contentTimeUpdate, aer.contentTimeUpdate, b, e.c()));
      a(aer.requestNextAdBreak);
    }
  }
  
  public final void resume()
  {
    a(aer.resume);
  }
  
  public final void skip()
  {
    a(aer.skip);
  }
  
  public final void start()
  {
    a(aer.start);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ads
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */