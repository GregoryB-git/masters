package com.ryanheise.audioservice;

import E5.k.c;
import E5.k.d;
import a0.d;
import a0.d.l;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.MediaBrowserCompat.b;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaDescriptionCompat.d;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.a;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import l5.h;
import l5.p;
import l5.q;
import l5.r;

public class a
  implements A5.a, B5.a
{
  public static String g = "audio_service_engine";
  public static final Set h = new HashSet();
  public static d i;
  public static c j;
  public static final long k = System.currentTimeMillis() - SystemClock.elapsedRealtime();
  public static k.d l;
  public static boolean m;
  public static MediaBrowserCompat n;
  public static MediaControllerCompat o;
  public static final MediaControllerCompat.a p = new a();
  public Context a;
  public A5.a.b b;
  public B5.c c;
  public E5.n d;
  public d e;
  public final MediaBrowserCompat.b f = new b();
  
  public static void A()
  {
    io.flutter.embedding.engine.a locala;
    label77:
    try
    {
      Iterator localIterator = h.iterator();
      Activity localActivity;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localActivity = d.a((d)localIterator.next());
      } while (localActivity == null);
      return;
    }
    finally
    {
      break label77;
      locala = v5.a.b().a(g);
      if (locala != null)
      {
        locala.g();
        v5.a.b().d(g);
      }
      return;
    }
  }
  
  public static io.flutter.embedding.engine.a B(Context paramContext)
  {
    io.flutter.embedding.engine.a locala;
    try
    {
      locala = v5.a.b().a(g);
      localObject1 = locala;
      if (locala != null) {
        break label186;
      }
      locala = new io/flutter/embedding/engine/a;
      locala.<init>(paramContext.getApplicationContext());
      if ((paramContext instanceof u5.i))
      {
        Object localObject2 = (u5.i)paramContext;
        localObject1 = ((u5.i)localObject2).i();
        paramContext = (Context)localObject1;
        if (localObject1 != null) {
          break label147;
        }
        paramContext = (Context)localObject1;
        if (!((u5.i)localObject2).y()) {
          break label147;
        }
        localObject2 = ((Activity)localObject2).getIntent().getData();
        paramContext = (Context)localObject1;
        if (localObject2 == null) {
          break label147;
        }
        localObject1 = ((Uri)localObject2).getPath();
        paramContext = (Context)localObject1;
        if (((Uri)localObject2).getQuery() == null) {
          break label147;
        }
        paramContext = (Context)localObject1;
        if (((Uri)localObject2).getQuery().isEmpty()) {
          break label147;
        }
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramContext.append((String)localObject1);
        paramContext.append("?");
        paramContext.append(((Uri)localObject2).getQuery());
        paramContext = paramContext.toString();
      }
    }
    finally
    {
      break label191;
    }
    paramContext = null;
    label147:
    Object localObject1 = paramContext;
    if (paramContext == null) {
      localObject1 = "/";
    }
    locala.o().c((String)localObject1);
    locala.k().j(w5.a.c.a());
    v5.a.b().c(g, locala);
    localObject1 = locala;
    label186:
    return (io.flutter.embedding.engine.a)localObject1;
    label191:
    throw paramContext;
  }
  
  public static Integer C(Object paramObject)
  {
    if ((paramObject != null) && (!(paramObject instanceof Integer))) {
      paramObject = Integer.valueOf((int)((Long)paramObject).longValue());
    } else {
      paramObject = (Integer)paramObject;
    }
    return (Integer)paramObject;
  }
  
  public static Long D(Object paramObject)
  {
    if ((paramObject != null) && (!(paramObject instanceof Long))) {
      paramObject = Long.valueOf(((Integer)paramObject).intValue());
    } else {
      paramObject = (Long)paramObject;
    }
    return (Long)paramObject;
  }
  
  public static Map F(Object... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    for (int i1 = 0; i1 < paramVarArgs.length; i1 += 2) {
      localHashMap.put((String)paramVarArgs[i1], paramVarArgs[(i1 + 1)]);
    }
    return localHashMap;
  }
  
  public static Bundle G(Map paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap.get(str);
      if ((localObject instanceof Integer)) {
        localBundle.putInt(str, ((Integer)localObject).intValue());
      } else if ((localObject instanceof Long)) {
        localBundle.putLong(str, ((Long)localObject).longValue());
      } else if ((localObject instanceof Double)) {
        localBundle.putDouble(str, ((Double)localObject).doubleValue());
      } else if ((localObject instanceof Boolean)) {
        localBundle.putBoolean(str, ((Boolean)localObject).booleanValue());
      } else if ((localObject instanceof String)) {
        localBundle.putString(str, (String)localObject);
      }
    }
    return localBundle;
  }
  
  public static Map H(MediaMetadataCompat paramMediaMetadataCompat)
  {
    if (paramMediaMetadataCompat == null) {
      return null;
    }
    MediaDescriptionCompat localMediaDescriptionCompat = paramMediaMetadataCompat.e();
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", localMediaDescriptionCompat.g());
    localHashMap.put("title", I(paramMediaMetadataCompat, "android.media.metadata.TITLE"));
    localHashMap.put("album", I(paramMediaMetadataCompat, "android.media.metadata.ALBUM"));
    if (localMediaDescriptionCompat.e() != null) {
      localHashMap.put("artUri", localMediaDescriptionCompat.e().toString());
    }
    localHashMap.put("artist", I(paramMediaMetadataCompat, "android.media.metadata.ARTIST"));
    localHashMap.put("genre", I(paramMediaMetadataCompat, "android.media.metadata.GENRE"));
    if (paramMediaMetadataCompat.a("android.media.metadata.DURATION")) {
      localHashMap.put("duration", Long.valueOf(paramMediaMetadataCompat.f("android.media.metadata.DURATION")));
    }
    boolean bool;
    if (paramMediaMetadataCompat.f("playable_long") != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    localHashMap.put("playable", Boolean.valueOf(bool));
    localHashMap.put("displayTitle", I(paramMediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
    localHashMap.put("displaySubtitle", I(paramMediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
    localHashMap.put("displayDescription", I(paramMediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
    if (paramMediaMetadataCompat.a("android.media.metadata.RATING")) {
      localHashMap.put("rating", J(paramMediaMetadataCompat.h("android.media.metadata.RATING")));
    }
    paramMediaMetadataCompat = w(paramMediaMetadataCompat.d());
    if (paramMediaMetadataCompat.size() > 0) {
      localHashMap.put("extras", paramMediaMetadataCompat);
    }
    return localHashMap;
  }
  
  public static String I(MediaMetadataCompat paramMediaMetadataCompat, String paramString)
  {
    paramMediaMetadataCompat = paramMediaMetadataCompat.j(paramString);
    if (paramMediaMetadataCompat != null) {
      return paramMediaMetadataCompat.toString();
    }
    return null;
  }
  
  public static HashMap J(RatingCompat paramRatingCompat)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", Integer.valueOf(paramRatingCompat.d()));
    if (paramRatingCompat.g()) {
      switch (paramRatingCompat.d())
      {
      default: 
        break;
      case 6: 
      case 3: 
      case 4: 
      case 5: 
        for (float f1 = paramRatingCompat.b();; f1 = paramRatingCompat.e())
        {
          paramRatingCompat = Float.valueOf(f1);
          localHashMap.put("value", paramRatingCompat);
          break;
        }
      case 2: 
      case 1: 
        for (boolean bool = paramRatingCompat.h();; bool = paramRatingCompat.f())
        {
          paramRatingCompat = Boolean.valueOf(bool);
          break;
        }
      }
    } else {
      localHashMap.put("value", null);
    }
    return localHashMap;
  }
  
  public static List K(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    for (int i1 = 0; paramList.hasNext(); i1++)
    {
      Map localMap = (Map)paramList.next();
      localArrayList.add(new MediaSessionCompat.QueueItem(v(y(localMap).e(), (Map)localMap.get("extras")), i1));
    }
    return localArrayList;
  }
  
  public static RatingCompat L(Map paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    Integer localInteger = (Integer)paramMap.get("type");
    paramMap = paramMap.get("value");
    if (paramMap != null)
    {
      switch (localInteger.intValue())
      {
      default: 
        return RatingCompat.m(localInteger.intValue());
      case 6: 
        return RatingCompat.j(((Double)paramMap).floatValue());
      case 3: 
      case 4: 
      case 5: 
        return RatingCompat.k(localInteger.intValue(), ((Integer)paramMap).intValue());
      case 2: 
        return RatingCompat.l(((Boolean)paramMap).booleanValue());
      }
      return RatingCompat.i(((Boolean)paramMap).booleanValue());
    }
    return RatingCompat.m(localInteger.intValue());
  }
  
  public static MediaBrowserCompat.MediaItem M(Map paramMap)
  {
    MediaDescriptionCompat localMediaDescriptionCompat = v(y(paramMap).e(), (Map)paramMap.get("extras"));
    int i1;
    if (((Boolean)paramMap.get("playable")).booleanValue()) {
      i1 = 2;
    } else {
      i1 = 1;
    }
    return new MediaBrowserCompat.MediaItem(localMediaDescriptionCompat, i1);
  }
  
  public static MediaDescriptionCompat v(MediaDescriptionCompat paramMediaDescriptionCompat, Map paramMap)
  {
    Object localObject = paramMediaDescriptionCompat;
    if (paramMap != null) {
      if (paramMap.isEmpty())
      {
        localObject = paramMediaDescriptionCompat;
      }
      else
      {
        localObject = new Bundle();
        if (paramMediaDescriptionCompat.c() != null) {
          ((Bundle)localObject).putAll(paramMediaDescriptionCompat.c());
        }
        ((Bundle)localObject).putAll(G(paramMap));
        localObject = new MediaDescriptionCompat.d().i(paramMediaDescriptionCompat.j()).h(paramMediaDescriptionCompat.i()).b(paramMediaDescriptionCompat.b()).d(paramMediaDescriptionCompat.d()).e(paramMediaDescriptionCompat.e()).f(paramMediaDescriptionCompat.g()).g(paramMediaDescriptionCompat.h()).c((Bundle)localObject).a();
      }
    }
    return (MediaDescriptionCompat)localObject;
  }
  
  public static Map w(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Serializable localSerializable = paramBundle.getSerializable(str);
      if (localSerializable != null) {
        localHashMap.put(str, localSerializable);
      }
    }
    return localHashMap;
  }
  
  public static MediaMetadataCompat y(Map paramMap)
  {
    return AudioService.R.F((String)paramMap.get("id"), (String)paramMap.get("title"), (String)paramMap.get("album"), (String)paramMap.get("artist"), (String)paramMap.get("genre"), D(paramMap.get("duration")), (String)paramMap.get("artUri"), (Boolean)paramMap.get("playable"), (String)paramMap.get("displayTitle"), (String)paramMap.get("displaySubtitle"), (String)paramMap.get("displayDescription"), L((Map)paramMap.get("rating")), (Map)paramMap.get("extras"));
  }
  
  public final void N()
  {
    B5.c localc = c;
    l5.i locali = new l5.i(this);
    d = locali;
    localc.g(locali);
  }
  
  public final void O()
  {
    Activity localActivity = d.a(e);
    if ((j != null) && (localActivity.getIntent().getAction() != null))
    {
      boolean bool = localActivity.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK");
      j.R("onNotificationClicked", F(new Object[] { "clicked", Boolean.valueOf(bool) }));
    }
  }
  
  public void onAttachedToActivity(B5.c paramc)
  {
    c = paramc;
    d.b(e, paramc.c());
    d.c(e, paramc.c());
    io.flutter.embedding.engine.a locala = B(paramc.c());
    paramc = e;
    boolean bool;
    if (b.b() != locala.k()) {
      bool = true;
    } else {
      bool = false;
    }
    paramc.g(bool);
    i = e;
    N();
    if (o != null) {
      MediaControllerCompat.f(d.a(i), o);
    }
    if (n == null) {
      x();
    }
    paramc = d.a(i);
    if (e.h()) {
      paramc.setIntent(new Intent("android.intent.action.MAIN"));
    }
    O();
  }
  
  public void onAttachedToEngine(A5.a.b paramb)
  {
    b = paramb;
    paramb = new d(paramb.b());
    e = paramb;
    d.c(paramb, b.a());
    h.add(e);
    if (a == null) {
      a = b.a();
    }
    if (j == null)
    {
      paramb = new c(b.b());
      j = paramb;
      AudioService.Q(paramb);
    }
    if (n == null) {
      x();
    }
  }
  
  public void onDetachedFromActivity()
  {
    c.i(d);
    c = null;
    d = null;
    d.b(e, null);
    d.c(e, b.a());
    if (h.size() == 1) {
      z();
    }
    if (e == i) {
      i = null;
    }
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    c.i(d);
    c = null;
    d.b(e, null);
    d.c(e, b.a());
  }
  
  public void onDetachedFromEngine(A5.a.b paramb)
  {
    paramb = h;
    if (paramb.size() == 1) {
      z();
    }
    paramb.remove(e);
    d.c(e, null);
    e = null;
    a = null;
    paramb = j;
    if ((paramb != null) && (a == b.b()))
    {
      System.out.println("### destroying audio handler interface");
      c.P(j);
      j = null;
    }
    b = null;
  }
  
  public void onReattachedToActivityForConfigChanges(B5.c paramc)
  {
    c = paramc;
    d.b(e, paramc.c());
    d.c(e, paramc.c());
    N();
  }
  
  public final void x()
  {
    if (n == null)
    {
      MediaBrowserCompat localMediaBrowserCompat = new MediaBrowserCompat(a, new ComponentName(a, AudioService.class), f, null);
      n = localMediaBrowserCompat;
      localMediaBrowserCompat.a();
    }
  }
  
  public final void z()
  {
    Object localObject = i;
    if (localObject != null) {
      localObject = d.a((d)localObject);
    } else {
      localObject = null;
    }
    if (localObject != null) {
      ((Activity)localObject).setIntent(new Intent("android.intent.action.MAIN"));
    }
    localObject = o;
    if (localObject != null)
    {
      ((MediaControllerCompat)localObject).g(p);
      o = null;
    }
    localObject = n;
    if (localObject != null)
    {
      ((MediaBrowserCompat)localObject).b();
      n = null;
    }
  }
  
  public class a
    extends MediaControllerCompat.a
  {}
  
  public class b
    extends MediaBrowserCompat.b
  {
    public b() {}
    
    public void a()
    {
      if (a.b(a.this) == null) {
        return;
      }
      Object localObject2;
      try
      {
        Object localObject1 = a.m().c();
        localObject2 = new android/support/v4/media/session/MediaControllerCompat;
        ((MediaControllerCompat)localObject2).<init>(a.b(a.this), (MediaSessionCompat.Token)localObject1);
        a.o((MediaControllerCompat)localObject2);
        if (a.p() != null) {
          localObject1 = a.d.a(a.p());
        }
      }
      catch (Exception localException)
      {
        break label110;
      }
      Activity localActivity = null;
      if (localActivity != null) {
        MediaControllerCompat.f(localActivity, a.n());
      }
      a.n().d(a.r());
      if (a.s() != null)
      {
        a.s().a(a.F(new Object[0]));
        a.t(null);
        return;
        label110:
        localObject2 = System.out;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("onConnected error: ");
        localStringBuilder.append(localActivity.getMessage());
        ((PrintStream)localObject2).println(localStringBuilder.toString());
        localActivity.printStackTrace();
        if (a.s() != null)
        {
          localObject2 = a.s();
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("onConnected error: ");
          localStringBuilder.append(localActivity.getMessage());
          ((k.d)localObject2).b(localStringBuilder.toString(), null, null);
        }
        else
        {
          a.u(a.this).f(true);
        }
      }
    }
    
    public void b()
    {
      if (a.s() != null) {
        a.s().b("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
      } else {
        a.u(a.this).f(true);
      }
    }
    
    public void c()
    {
      System.out.println("### UNHANDLED: onConnectionSuspended");
    }
  }
  
  public static class c
    implements k.c, AudioService.e
  {
    public E5.c a;
    public E5.k b;
    public AudioTrack c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public List e = new LinkedList();
    
    public c(E5.c paramc)
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
    
    public void a0(E5.c paramc)
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
  
  public static class d
    implements k.c
  {
    public Context a;
    public Activity b;
    public final E5.c c;
    public final E5.k d;
    public boolean e;
    public boolean f;
    
    public d(E5.c paramc)
    {
      c = paramc;
      paramc = new E5.k(paramc, "com.ryanheise.audio_service.client.methods");
      d = paramc;
      paramc.e(this);
    }
    
    private void d(Activity paramActivity)
    {
      b = paramActivity;
    }
    
    public final void e(Context paramContext)
    {
      a = paramContext;
    }
    
    public void f(boolean paramBoolean)
    {
      f = paramBoolean;
    }
    
    public void g(boolean paramBoolean)
    {
      e = paramBoolean;
    }
    
    public boolean h()
    {
      boolean bool;
      if ((b.getIntent().getFlags() & 0x100000) == 1048576) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void onMethodCall(E5.j paramj, k.d paramd)
    {
      Map localMap;
      int i;
      try
      {
        if (e) {
          break label530;
        }
        localObject = a;
        if ((((String)localObject).hashCode() != -804429082) || (!((String)localObject).equals("configure"))) {
          return;
        }
        if (f) {
          break label517;
        }
        a.d(true);
        localMap = (Map)((Map)b).get("config");
        paramj = new l5/h;
        paramj.<init>(a.getApplicationContext());
        i = ((Boolean)localMap.get("androidNotificationClickStartsActivity")).booleanValue();
        j = ((Boolean)localMap.get("androidNotificationOngoing")).booleanValue();
        b = ((Boolean)localMap.get("androidResumeOnClick")).booleanValue();
        c = ((String)localMap.get("androidNotificationChannelId"));
        d = ((String)localMap.get("androidNotificationChannelName"));
        e = ((String)localMap.get("androidNotificationChannelDescription"));
        localObject = localMap.get("notificationColor");
        i = -1;
        if (localObject == null) {
          j = -1;
        } else {
          j = a.C(localMap.get("notificationColor")).intValue();
        }
        f = j;
        g = ((String)localMap.get("androidNotificationIcon"));
        h = ((Boolean)localMap.get("androidShowNotificationBadge")).booleanValue();
        k = ((Boolean)localMap.get("androidStopForegroundOnPause")).booleanValue();
        if (localMap.get("artDownscaleWidth") != null) {
          j = ((Integer)localMap.get("artDownscaleWidth")).intValue();
        }
      }
      catch (Exception paramj)
      {
        break label543;
      }
      int j = -1;
      l = j;
      j = i;
      if (localMap.get("artDownscaleHeight") != null) {
        j = ((Integer)localMap.get("artDownscaleHeight")).intValue();
      }
      m = j;
      paramj.c((Map)localMap.get("androidBrowsableRootExtras"));
      Object localObject = b;
      if (localObject != null) {
        n = localObject.getClass().getName();
      }
      paramj.b();
      localObject = AudioService.R;
      if (localObject != null) {
        ((AudioService)localObject).B(paramj);
      }
      a.q(this);
      if (a.e() == null)
      {
        paramj = new com/ryanheise/audioservice/a$c;
        paramj.<init>(c);
        a.f(paramj);
        AudioService.Q(a.e());
      }
      else
      {
        if (ea != c) {
          a.e().a0(c);
        }
        a.e().T();
      }
      if (a.n() != null)
      {
        paramd.a(a.F(new Object[0]));
      }
      else
      {
        a.t(paramd);
        return;
        label517:
        paramj = new java/lang/IllegalStateException;
        paramj.<init>("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
        throw paramj;
        label530:
        paramj = new java/lang/IllegalStateException;
        paramj.<init>("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
        throw paramj;
        label543:
        paramj.printStackTrace();
        paramd.b(paramj.getMessage(), null, null);
      }
    }
  }
  
  public static class e
  {
    public final String a;
    public final Object b;
    public final k.d c;
    
    public e(String paramString, Object paramObject, k.d paramd)
    {
      a = paramString;
      b = paramObject;
      c = paramd;
    }
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */