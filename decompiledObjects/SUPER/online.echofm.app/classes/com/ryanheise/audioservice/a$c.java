package com.ryanheise.audioservice;

import E5.c;
import E5.k.c;
import E5.k.d;
import a0.d;
import a0.d.l;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import l5.p;
import l5.q;
import l5.r;

public class a$c
  implements k.c, AudioService.e
{
  public c a;
  public E5.k b;
  public AudioTrack c;
  public final Handler d = new Handler(Looper.getMainLooper());
  public List e = new LinkedList();
  
  public a$c(c paramc)
  {
    a = paramc;
    paramc = new E5.k(paramc, "com.ryanheise.audio_service.handler.methods");
    b = paramc;
    paramc.e(this);
  }
  
  public void A()
  {
    R("fastForward", a.F(new Object[0]));
  }
  
  public void B(long paramLong)
  {
    R("seek", a.F(new Object[] { "position", Long.valueOf(paramLong * 1000L) }));
  }
  
  public void C(MediaMetadataCompat paramMediaMetadataCompat)
  {
    R("addQueueItem", a.F(new Object[] { "mediaItem", a.h(paramMediaMetadataCompat) }));
  }
  
  public void D() {}
  
  public void E(String paramString, Bundle paramBundle)
  {
    R("customAction", a.F(new Object[] { "name", paramString, "extras", a.w(paramBundle) }));
  }
  
  public void F(String paramString, Bundle paramBundle)
  {
    R("prepareFromSearch", a.F(new Object[] { "query", paramString, "extras", a.w(paramBundle) }));
  }
  
  public void G(long paramLong)
  {
    R("skipToQueueItem", a.F(new Object[] { "index", Long.valueOf(paramLong) }));
  }
  
  public void H(int paramInt)
  {
    R("androidAdjustRemoteVolume", a.F(new Object[] { "direction", Integer.valueOf(paramInt) }));
  }
  
  public void I(Uri paramUri, Bundle paramBundle)
  {
    R("playFromUri", a.F(new Object[] { "uri", paramUri.toString(), "extras", a.w(paramBundle) }));
  }
  
  public void J(RatingCompat paramRatingCompat, Bundle paramBundle)
  {
    R("setRating", a.F(new Object[] { "rating", a.i(paramRatingCompat), "extras", a.w(paramBundle) }));
  }
  
  public final void Q()
  {
    AudioTrack localAudioTrack = c;
    if (localAudioTrack != null) {
      localAudioTrack.release();
    }
  }
  
  public void R(String paramString, Object paramObject)
  {
    S(paramString, paramObject, null);
  }
  
  public void S(String paramString, Object paramObject, k.d paramd)
  {
    if (a.c()) {
      b.d(paramString, paramObject, paramd);
    } else {
      e.add(new a.e(paramString, paramObject, paramd));
    }
  }
  
  public void T()
  {
    Iterator localIterator = e.iterator();
    while (localIterator.hasNext())
    {
      a.e locale = (a.e)localIterator.next();
      b.d(a, b, c);
    }
    e.clear();
  }
  
  public void a0(c paramc)
  {
    b.e(null);
    a = paramc;
    paramc = new E5.k(paramc, "com.ryanheise.audio_service.handler.methods");
    b = paramc;
    paramc.e(this);
  }
  
  public void b()
  {
    R("onNotificationDeleted", a.F(new Object[0]));
  }
  
  public void c(int paramInt)
  {
    R("setRepeatMode", a.F(new Object[] { "repeatMode", Integer.valueOf(paramInt) }));
  }
  
  public void d(int paramInt)
  {
    R("setShuffleMode", a.F(new Object[] { "shuffleMode", Integer.valueOf(paramInt) }));
  }
  
  public void e()
  {
    R("play", a.F(new Object[0]));
  }
  
  public void f(boolean paramBoolean)
  {
    R("setCaptioningEnabled", a.F(new Object[] { "enabled", Boolean.valueOf(paramBoolean) }));
  }
  
  public void g()
  {
    R("stop", a.F(new Object[0]));
  }
  
  public void h(String paramString, Bundle paramBundle)
  {
    R("prepareFromMediaId", a.F(new Object[] { "mediaId", paramString, "extras", a.w(paramBundle) }));
  }
  
  public void i(String paramString, Bundle paramBundle, final d.l paraml)
  {
    if (a.e() != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("query", paramString);
      localHashMap.put("extras", a.w(paramBundle));
      a.e().S("search", localHashMap, new c(paraml));
    }
    paraml.a();
  }
  
  public void j(q paramq)
  {
    R("click", a.F(new Object[] { "button", Integer.valueOf(paramq.ordinal()) }));
  }
  
  public void k()
  {
    R("skipToPrevious", a.F(new Object[0]));
  }
  
  public void l()
  {
    R("skipToNext", a.F(new Object[0]));
  }
  
  public void m(String paramString, final d.l paraml)
  {
    if (a.e() != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("mediaId", paramString);
      a.e().S("getMediaItem", localHashMap, new b(paraml));
    }
    paraml.a();
  }
  
  public void n(MediaMetadataCompat paramMediaMetadataCompat)
  {
    R("removeQueueItem", a.F(new Object[] { "mediaItem", a.h(paramMediaMetadataCompat) }));
  }
  
  public void o(float paramFloat)
  {
    R("setSpeed", a.F(new Object[] { "speed", Float.valueOf(paramFloat) }));
  }
  
  public void onMethodCall(E5.j paramj, k.d paramd)
  {
    Object localObject1;
    try
    {
      localObject1 = (Map)b;
      paramj = a;
      switch (paramj.hashCode())
      {
      }
    }
    catch (Exception paramj)
    {
      break label1149;
    }
    if (paramj.equals("notifyChildrenChanged"))
    {
      i = 4;
      break label207;
      if (paramj.equals("setState"))
      {
        i = 2;
        break label207;
        if (paramj.equals("setQueue"))
        {
          i = 1;
          break label207;
          if (paramj.equals("stopService"))
          {
            i = 6;
            break label207;
            if (paramj.equals("setAndroidPlaybackInfo"))
            {
              i = 3;
              break label207;
              if (paramj.equals("androidForceEnableMediaButtons"))
              {
                i = 5;
                break label207;
                if (paramj.equals("setMediaItem"))
                {
                  i = 0;
                  break label207;
                }
              }
            }
          }
        }
      }
    }
    int i = -1;
    label207:
    Object localObject2;
    switch (i)
    {
    default: 
      break;
    case 6: 
      paramj = AudioService.R;
      if (paramj != null) {
        paramj.c0();
      }
    case 5: 
    case 4: 
    case 3: 
      for (;;)
      {
        paramd.a(null);
        break;
        if (c == null)
        {
          localObject2 = new byte['ࠀ'];
          paramj = new android/media/AudioTrack;
          paramj.<init>(3, 44100, 2, 3, 2048, 0);
          c = paramj;
          paramj.write((byte[])localObject2, 0, 2048);
        }
        c.reloadStaticData();
        c.play();
        continue;
        paramj = (String)((Map)localObject1).get("parentMediaId");
        localObject2 = (Map)((Map)localObject1).get("options");
        AudioService.R.e(paramj, a.G((Map)localObject2));
        continue;
        localObject1 = (Map)((Map)localObject1).get("playbackInfo");
        i = ((Integer)((Map)localObject1).get("playbackType")).intValue();
        paramj = (Integer)((Map)localObject1).get("volumeControlType");
        localObject2 = (Integer)((Map)localObject1).get("maxVolume");
        localObject1 = (Integer)((Map)localObject1).get("volume");
        AudioService.R.Z(i, paramj, (Integer)localObject2, (Integer)localObject1);
      }
    case 2: 
      Object localObject3 = (Map)((Map)localObject1).get("state");
      l5.a locala = l5.a.values()[((Integer)localObject3.get("processingState")).intValue()];
      boolean bool1 = ((Boolean)((Map)localObject3).get("playing")).booleanValue();
      paramj = (List)((Map)localObject3).get("controls");
      List localList = (List)((Map)localObject3).get("androidCompactActionIndices");
      localObject2 = (List)((Map)localObject3).get("systemActions");
      long l1 = a.D(((Map)localObject3).get("updatePosition")).longValue();
      long l2 = a.D(((Map)localObject3).get("bufferedPosition")).longValue();
      float f = (float)((Double)((Map)localObject3).get("speed")).doubleValue();
      long l3;
      if (((Map)localObject3).get("updateTime") == null) {
        l3 = System.currentTimeMillis();
      } else {
        l3 = a.D(((Map)localObject3).get("updateTime")).longValue();
      }
      localObject1 = (Integer)((Map)localObject3).get("errorCode");
      String str1 = (String)((Map)localObject3).get("errorMessage");
      int j = ((Integer)((Map)localObject3).get("repeatMode")).intValue();
      int k = ((Integer)((Map)localObject3).get("shuffleMode")).intValue();
      Long localLong = a.D(((Map)localObject3).get("queueIndex"));
      boolean bool2 = ((Boolean)((Map)localObject3).get("captioningEnabled")).booleanValue();
      long l4 = a.j();
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      Iterator localIterator = paramj.iterator();
      long l5 = 0L;
      while (localIterator.hasNext())
      {
        paramj = (Map)localIterator.next();
        String str2 = (String)paramj.get("androidIcon");
        String str3 = (String)paramj.get("label");
        long l6 = 1 << ((Integer)paramj.get("action")).intValue();
        l5 |= l6;
        paramj = (Map)paramj.get("customAction");
        if (paramj != null)
        {
          localObject4 = (String)paramj.get("name");
          Map localMap = (Map)paramj.get("extras");
          paramj = new l5/p;
          paramj.<init>((String)localObject4, localMap);
        }
        else
        {
          paramj = null;
        }
        Object localObject4 = new l5/r;
        ((r)localObject4).<init>(str2, str3, l6, paramj);
        ((List)localObject3).add(localObject4);
      }
      paramj = ((List)localObject2).iterator();
      while (paramj.hasNext()) {
        l5 |= 1 << ((Integer)paramj.next()).intValue();
      }
      if (localList != null)
      {
        int m = Math.min(3, localList.size());
        localObject2 = new int[m];
        for (i = 0;; i++)
        {
          paramj = (E5.j)localObject2;
          if (i >= m) {
            break;
          }
          localObject2[i] = ((Integer)localList.get(i)).intValue();
        }
      }
      paramj = null;
      AudioService.R.b0((List)localObject3, l5, paramj, locala, bool1, l1, l2, f, l3 - l4, (Integer)localObject1, str1, j, k, bool2, localLong);
      paramd.a(null);
      break;
    case 1: 
      localObject2 = Executors.newSingleThreadExecutor();
      paramj = new l5/k;
      paramj.<init>(this, (Map)localObject1, paramd);
    }
    for (;;)
    {
      ((Executor)localObject2).execute(paramj);
      break;
      localObject2 = Executors.newSingleThreadExecutor();
      paramj = new l5.j(this, (Map)localObject1, paramd);
    }
    label1149:
    paramj.printStackTrace();
    paramd.b(paramj.getMessage(), null, null);
  }
  
  public void p()
  {
    R("prepare", a.F(new Object[0]));
  }
  
  public void q(Uri paramUri, Bundle paramBundle)
  {
    R("prepareFromUri", a.F(new Object[] { "uri", paramUri.toString(), "extras", a.w(paramBundle) }));
  }
  
  public void r()
  {
    R("rewind", a.F(new Object[0]));
  }
  
  public void s(String paramString, final d.l paraml, Bundle paramBundle)
  {
    if (a.e() != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("parentMediaId", paramString);
      localHashMap.put("options", a.w(paramBundle));
      a.e().S("getChildren", localHashMap, new a(paraml));
    }
    paraml.a();
  }
  
  public void t(RatingCompat paramRatingCompat)
  {
    R("setRating", a.F(new Object[] { "rating", a.i(paramRatingCompat), "extras", null }));
  }
  
  public void u(String paramString, Bundle paramBundle)
  {
    R("playFromSearch", a.F(new Object[] { "query", paramString, "extras", a.w(paramBundle) }));
  }
  
  public void v(MediaMetadataCompat paramMediaMetadataCompat, int paramInt)
  {
    R("insertQueueItem", a.F(new Object[] { "mediaItem", a.h(paramMediaMetadataCompat), "index", Integer.valueOf(paramInt) }));
  }
  
  public void w()
  {
    R("pause", a.F(new Object[0]));
  }
  
  public void x(int paramInt)
  {
    R("androidSetRemoteVolume", a.F(new Object[] { "volumeIndex", Integer.valueOf(paramInt) }));
  }
  
  public void y()
  {
    R("onTaskRemoved", a.F(new Object[0]));
  }
  
  public void z(String paramString, Bundle paramBundle)
  {
    R("playFromMediaId", a.F(new Object[] { "mediaId", paramString, "extras", a.w(paramBundle) }));
  }
  
  public class a
    implements k.d
  {
    public a(d.l paraml) {}
    
    public void a(Object paramObject)
    {
      Object localObject = (List)((Map)paramObject).get("children");
      paramObject = new ArrayList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((List)paramObject).add(a.g((Map)((Iterator)localObject).next()));
      }
      paraml.g(paramObject);
    }
    
    public void b(String paramString1, String paramString2, Object paramObject)
    {
      paraml.f(new Bundle());
    }
    
    public void c()
    {
      paraml.f(new Bundle());
    }
  }
  
  public class b
    implements k.d
  {
    public b(d.l paraml) {}
    
    public void a(Object paramObject)
    {
      paramObject = (Map)((Map)paramObject).get("mediaItem");
      if (paramObject != null)
      {
        paramObject = a.g((Map)paramObject);
        paraml.g(paramObject);
      }
      else
      {
        paraml.g(null);
      }
    }
    
    public void b(String paramString1, String paramString2, Object paramObject)
    {
      paraml.f(new Bundle());
    }
    
    public void c()
    {
      paraml.f(new Bundle());
    }
  }
  
  public class c
    implements k.d
  {
    public c(d.l paraml) {}
    
    public void a(Object paramObject)
    {
      Object localObject = (List)((Map)paramObject).get("mediaItems");
      paramObject = new ArrayList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((List)paramObject).add(a.g((Map)((Iterator)localObject).next()));
      }
      paraml.g(paramObject);
    }
    
    public void b(String paramString1, String paramString2, Object paramObject)
    {
      paraml.f(new Bundle());
    }
    
    public void c()
    {
      paraml.f(new Bundle());
    }
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */