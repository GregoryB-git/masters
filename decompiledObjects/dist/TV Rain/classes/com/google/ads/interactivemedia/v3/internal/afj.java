package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.CuePoint;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamManager;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import com.google.ads.interactivemedia.v3.impl.data.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class afj
  extends aeb
  implements StreamManager
{
  private final String g;
  private List<CuePoint> h = new ArrayList();
  private afl i;
  
  private afj(String paramString1, afc paramafc, afb paramafb, StreamDisplayContainer paramStreamDisplayContainer, String paramString2, afl paramafl, aet paramaet, afd paramafd, Context paramContext, String paramString3, boolean paramBoolean)
    throws AdError
  {
    super(paramString1, paramafc, paramStreamDisplayContainer, null, paramafd, paramContext, paramBoolean);
    g = paramString3;
    paramafb = new afl(paramString1, paramafb, paramafc, this, paramStreamDisplayContainer, paramString2, paramContext);
    i = paramafb;
    paramafb.h();
    addAdErrorListener(i);
    paramafc.a(i, paramString1);
  }
  
  public afj(String paramString1, afc paramafc, afb paramafb, String paramString2, afd paramafd, Context paramContext, String paramString3, boolean paramBoolean, StreamDisplayContainer paramStreamDisplayContainer)
    throws AdError
  {
    this(paramString1, paramafc, paramafb, paramStreamDisplayContainer, paramString2, null, null, paramafd, paramContext, paramString3, paramBoolean);
  }
  
  public final void a() {}
  
  public final void a(ResizeAndPositionVideoMsgData paramResizeAndPositionVideoMsgData) {}
  
  public final void a(aev paramaev)
  {
    int j = a.ordinal();
    if (j != 3)
    {
      if (j != 4)
      {
        Object localObject;
        if (j != 14)
        {
          if (j != 15)
          {
            switch (j)
            {
            default: 
              break;
            case 25: 
              i.g();
              break;
            case 24: 
              i.f();
              break;
            case 23: 
              i.d();
              break;
            case 22: 
              i.c();
              break;
            }
          }
          else
          {
            localObject = b;
            i.a((b)localObject);
          }
        }
        else
        {
          double d = g;
          localObject = new StringBuilder(54);
          ((StringBuilder)localObject).append("Seek time when ad is skipped: ");
          ((StringBuilder)localObject).append(d);
          Log.i("IMASDK", ((StringBuilder)localObject).toString());
          long l = Math.round(g * 1000.0D);
          i.a(l);
        }
      }
      else
      {
        h = d;
      }
    }
    else {
      i.i();
    }
    super.a(paramaev);
  }
  
  public final void destroy()
  {
    a(aer.contentComplete);
    f = true;
    i.b();
    b();
  }
  
  public final VideoProgressUpdate getAdProgress()
  {
    if (f) {
      return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }
    return i.getAdProgress();
  }
  
  public final double getContentTimeForStreamTime(double paramDouble)
  {
    Iterator localIterator = h.iterator();
    double d = paramDouble;
    while (localIterator.hasNext())
    {
      CuePoint localCuePoint = (CuePoint)localIterator.next();
      if (localCuePoint.getStartTime() > localCuePoint.getEndTime()) {
        return 0.0D;
      }
      if (paramDouble >= localCuePoint.getEndTime()) {
        d -= localCuePoint.getEndTime() - localCuePoint.getStartTime();
      } else if ((paramDouble < localCuePoint.getEndTime()) && (paramDouble > localCuePoint.getStartTime())) {
        d -= paramDouble - localCuePoint.getStartTime();
      }
    }
    return d;
  }
  
  public final List<CuePoint> getCuePoints()
  {
    return Collections.unmodifiableList(h);
  }
  
  public final CuePoint getPreviousCuePointForStreamTime(double paramDouble)
  {
    Iterator localIterator = h.iterator();
    Object localObject = null;
    while (localIterator.hasNext())
    {
      CuePoint localCuePoint = (CuePoint)localIterator.next();
      if (localCuePoint.getStartTime() < paramDouble) {
        localObject = localCuePoint;
      }
    }
    return (CuePoint)localObject;
  }
  
  public final String getStreamId()
  {
    return g;
  }
  
  public final double getStreamTimeForContentTime(double paramDouble)
  {
    Iterator localIterator = h.iterator();
    double d1 = paramDouble;
    double d2 = 0.0D;
    CuePoint localCuePoint;
    for (double d3 = d2; localIterator.hasNext(); d3 = localCuePoint.getEndTime())
    {
      localCuePoint = (CuePoint)localIterator.next();
      if (localCuePoint.getStartTime() > localCuePoint.getEndTime()) {
        return 0.0D;
      }
      d2 += localCuePoint.getStartTime() - d3;
      if (d2 > paramDouble) {
        return d1;
      }
      d1 += localCuePoint.getEndTime() - localCuePoint.getStartTime();
    }
    return d1;
  }
  
  public final void init(AdsRenderingSettings paramAdsRenderingSettings)
  {
    super.init(paramAdsRenderingSettings);
    paramAdsRenderingSettings = i;
    c.getDisableUi();
    paramAdsRenderingSettings.a();
  }
  
  public final boolean isCustomPlaybackUsed()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */