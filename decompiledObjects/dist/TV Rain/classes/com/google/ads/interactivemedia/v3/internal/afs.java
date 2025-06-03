package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import z2;

public final class afs
  implements VideoAdPlayer, aft
{
  private final cq a;
  private final SurfaceView b;
  private final tj c;
  private final FrameLayout d;
  private final ViewGroup e;
  private final List<VideoAdPlayer.VideoAdPlayerCallback> f;
  private final HashSet<AdMediaInfo> g;
  private final afr h;
  private final afv i;
  private final afx j;
  private final ArrayList<AdMediaInfo> k = new ArrayList();
  private final ud l;
  private mb m;
  private AdPodInfo n;
  private afu o;
  
  public afs(afb paramafb, Context paramContext, ViewGroup paramViewGroup)
  {
    this(paramafb, null, paramContext, paramViewGroup, az.a(paramContext, new co(paramContext), new sp()));
  }
  
  private afs(afb paramafb, afr paramafr, Context paramContext, ViewGroup paramViewGroup, cq paramcq)
  {
    e = paramViewGroup;
    a = paramcq;
    l = new ud(paramContext, wl.a(paramContext, "IMA SDK ExoPlayer"));
    f = new ArrayList(1);
    Object localObject = new afv(this);
    i = ((afv)localObject);
    g = aim.a(4);
    paramafr = new afx(this, (byte)0);
    j = paramafr;
    h = new afr(this, paramafb.a());
    paramcq.a((da)localObject);
    paramcq.a(paramafr);
    paramafb = new FrameLayout(paramContext);
    d = paramafb;
    paramafb.setBackgroundColor(-16777216);
    paramafr = new tj(paramContext);
    c = paramafr;
    localObject = new FrameLayout.LayoutParams(-1, -1);
    gravity = 17;
    paramafr.setLayoutParams((ViewGroup.LayoutParams)localObject);
    o = afu.a;
    paramContext = new SurfaceView(paramContext);
    b = paramContext;
    paramContext.setZOrderMediaOverlay(true);
    paramcq.a(paramContext);
    paramafr.addView(paramContext);
    paramafb.addView(paramafr);
    paramViewGroup.addView(paramafb, new ViewGroup.LayoutParams(-1, -1));
  }
  
  private final AdMediaInfo a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < k.size())) {
      return (AdMediaInfo)k.get(paramInt);
    }
    return null;
  }
  
  private final void a(AdMediaInfo paramAdMediaInfo)
  {
    Object localObject = Uri.parse(paramAdMediaInfo.getUrl());
    int i1 = wl.b((Uri)localObject);
    if (i1 != 0)
    {
      if (i1 != 2)
      {
        if (i1 == 3) {
          localObject = new nq(l, new afw()).a((Uri)localObject);
        } else {
          throw new IllegalStateException(z2.k(29, "Unsupported type: ", i1));
        }
      }
      else {
        localObject = new rc(l).a((Uri)localObject);
      }
    }
    else {
      localObject = new pg(l).a((Uri)localObject);
    }
    m.a((mq)localObject);
    k.add(paramAdMediaInfo);
  }
  
  private final int b(AdMediaInfo paramAdMediaInfo)
  {
    return k.indexOf(paramAdMediaInfo);
  }
  
  private final void c()
  {
    d.setVisibility(8);
    b.setVisibility(4);
    m = null;
    h.b();
    o = afu.a;
    a.a(false);
    a.a(null);
    g.clear();
  }
  
  private final AdMediaInfo d()
  {
    int i1 = a.e();
    if (m == null) {
      return null;
    }
    return a(i1);
  }
  
  public final void a()
  {
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
    c.setLayoutParams(localLayoutParams);
  }
  
  public final void a(ResizeAndPositionVideoMsgData paramResizeAndPositionVideoMsgData)
  {
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramResizeAndPositionVideoMsgData.width().intValue(), paramResizeAndPositionVideoMsgData.height().intValue());
    leftMargin = paramResizeAndPositionVideoMsgData.x().intValue();
    topMargin = paramResizeAndPositionVideoMsgData.y().intValue();
    c.setLayoutParams(localLayoutParams);
  }
  
  public final void addCallback(VideoAdPlayer.VideoAdPlayerCallback paramVideoAdPlayerCallback)
  {
    f.add(paramVideoAdPlayerCallback);
  }
  
  public final void b()
  {
    AdMediaInfo localAdMediaInfo = d();
    VideoProgressUpdate localVideoProgressUpdate = getAdProgress();
    Iterator localIterator = f.iterator();
    while (localIterator.hasNext()) {
      ((VideoAdPlayer.VideoAdPlayerCallback)localIterator.next()).onAdProgress(localAdMediaInfo, localVideoProgressUpdate);
    }
  }
  
  public final VideoProgressUpdate getAdProgress()
  {
    if (((a.a() != 2) && (a.a() != 3)) || (a.d() <= 0L)) {
      return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }
    return new VideoProgressUpdate(a.g(), a.d());
  }
  
  public final int getVolume()
  {
    return 100;
  }
  
  public final void loadAd(AdMediaInfo paramAdMediaInfo, AdPodInfo paramAdPodInfo)
  {
    Object localObject = m;
    int i1 = 0;
    if (localObject != null)
    {
      localObject = n;
      int i2 = i1;
      if (localObject != null) {
        if (paramAdPodInfo == null)
        {
          i2 = i1;
        }
        else
        {
          i2 = i1;
          if (((AdPodInfo)localObject).getPodIndex() == paramAdPodInfo.getPodIndex()) {
            i2 = 1;
          }
        }
      }
      if (i2 != 0)
      {
        a(paramAdMediaInfo);
        return;
      }
      throw new IllegalStateException("Called loadAd on an ad from a different ad break.");
    }
    a.a(false);
    localObject = a;
    ((cf)localObject).a(((cf)localObject).e(), 0L);
    k.clear();
    m = new mb(new mq[0]);
    n = paramAdPodInfo;
    a(paramAdMediaInfo);
    a.b(false);
    a.a(m);
    o = afu.b;
  }
  
  public final void pauseAd(AdMediaInfo paramAdMediaInfo)
  {
    h.b();
    o = afu.d;
    a.b(false);
    Iterator localIterator = f.iterator();
    while (localIterator.hasNext()) {
      ((VideoAdPlayer.VideoAdPlayerCallback)localIterator.next()).onPause(paramAdMediaInfo);
    }
  }
  
  public final void playAd(AdMediaInfo paramAdMediaInfo)
  {
    if ((m != null) && (k.contains(paramAdMediaInfo)))
    {
      d.setVisibility(0);
      b.setVisibility(0);
      int i1 = o.ordinal();
      if (i1 != 0)
      {
        Iterator localIterator;
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 != 3) {
              break label153;
            }
            localIterator = f.iterator();
            while (localIterator.hasNext()) {
              ((VideoAdPlayer.VideoAdPlayerCallback)localIterator.next()).onPlay(paramAdMediaInfo);
            }
          }
        }
        else
        {
          localIterator = f.iterator();
          while (localIterator.hasNext()) {
            ((VideoAdPlayer.VideoAdPlayerCallback)localIterator.next()).onPlay(paramAdMediaInfo);
          }
          a.a(b.getHolder());
        }
        label153:
        h.a();
        o = afu.c;
        a.b(true);
        return;
      }
      throw new IllegalStateException("Call to playAd when player state is not LOADED.");
    }
    throw new IllegalStateException("Call to playAd without appropriate call to loadAd first.");
  }
  
  public final void release()
  {
    c();
    a.b(i);
    a.b(j);
    a.c();
    h.b();
    e.removeView(d);
  }
  
  public final void removeCallback(VideoAdPlayer.VideoAdPlayerCallback paramVideoAdPlayerCallback)
  {
    f.remove(paramVideoAdPlayerCallback);
  }
  
  public final void stopAd(AdMediaInfo paramAdMediaInfo)
  {
    if (m == null)
    {
      Log.e("IMASDK", "Attempting to stop when no current ad source");
      return;
    }
    g.add(paramAdMediaInfo);
    int i1 = b(paramAdMediaInfo);
    int i2 = a.e();
    if (i1 == i2)
    {
      if (b(paramAdMediaInfo) == k.size() - 1)
      {
        c();
        return;
      }
      i2 = a.e();
      a.a(i2 + 1, 0L);
      return;
    }
    if (i1 > i2)
    {
      i2 = b(paramAdMediaInfo);
      m.a(i2);
      k.remove(paramAdMediaInfo);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */