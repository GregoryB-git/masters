package com.ryanheise.audioservice;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes.Builder;
import android.media.AudioTrack;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Token;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.MediaBrowserCompat.c;
import android.support.v4.media.MediaBrowserCompat.d;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.MediaMetadataCompat.b;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.a;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.MediaSessionCompat.c;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.PlaybackStateCompat.CustomAction;
import android.text.TextUtils;
import android.util.Log;
import g1.c;
import g1.c.e;
import g1.h;
import g1.y;
import g1.y.a;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.NewIntentListener;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import q0.g;
import ta.e;
import ta.f;
import u.n;

public class b
  implements FlutterPlugin, ActivityAware
{
  public static final HashSet o = new HashSet();
  public static d p;
  public static c q;
  public static final long r = System.currentTimeMillis() - SystemClock.elapsedRealtime();
  public static MethodChannel.Result s;
  public static boolean t;
  public static MediaBrowserCompat u;
  public static MediaControllerCompat v;
  public static final a w = new a();
  public Context a;
  public FlutterPlugin.FlutterPluginBinding b;
  public ActivityPluginBinding c;
  public ta.b d;
  public d e;
  public final b f = new b();
  
  public static MediaBrowserCompat.MediaItem a(Map paramMap)
  {
    MediaDescriptionCompat localMediaDescriptionCompat = d(g(paramMap).a(), (Map)paramMap.get("extras"));
    int i;
    if (((Boolean)paramMap.get("playable")).booleanValue()) {
      i = 2;
    } else {
      i = 1;
    }
    return new MediaBrowserCompat.MediaItem(localMediaDescriptionCompat, i);
  }
  
  public static HashMap b(MediaMetadataCompat paramMediaMetadataCompat)
  {
    HashMap localHashMap = null;
    Object localObject1 = null;
    if (paramMediaMetadataCompat == null)
    {
      paramMediaMetadataCompat = localHashMap;
    }
    else
    {
      Object localObject2 = paramMediaMetadataCompat.a();
      localHashMap = new HashMap();
      localHashMap.put("id", a);
      localHashMap.put("title", m(paramMediaMetadataCompat, "android.media.metadata.TITLE"));
      localHashMap.put("album", m(paramMediaMetadataCompat, "android.media.metadata.ALBUM"));
      localObject2 = f;
      if (localObject2 != null) {
        localHashMap.put("artUri", ((Uri)localObject2).toString());
      }
      localHashMap.put("artist", m(paramMediaMetadataCompat, "android.media.metadata.ARTIST"));
      localHashMap.put("genre", m(paramMediaMetadataCompat, "android.media.metadata.GENRE"));
      if (a.containsKey("android.media.metadata.DURATION")) {
        localHashMap.put("duration", Long.valueOf(a.getLong("android.media.metadata.DURATION", 0L)));
      }
      boolean bool;
      if (a.getLong("playable_long", 0L) != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      localHashMap.put("playable", Boolean.valueOf(bool));
      localHashMap.put("displayTitle", m(paramMediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
      localHashMap.put("displaySubtitle", m(paramMediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
      localHashMap.put("displayDescription", m(paramMediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
      if (a.containsKey("android.media.metadata.RATING"))
      {
        try
        {
          localObject2 = RatingCompat.a(a.getParcelable("android.media.metadata.RATING"));
          localObject1 = localObject2;
        }
        catch (Exception localException)
        {
          Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", localException);
        }
        localHashMap.put("rating", n((RatingCompat)localObject1));
      }
      paramMediaMetadataCompat = e(new Bundle(a));
      if (paramMediaMetadataCompat.size() > 0) {
        localHashMap.put("extras", paramMediaMetadataCompat);
      }
      paramMediaMetadataCompat = localHashMap;
    }
    return paramMediaMetadataCompat;
  }
  
  public static ArrayList c(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    for (int i = 0; localIterator.hasNext(); i++)
    {
      paramList = (Map)localIterator.next();
      localArrayList.add(new MediaSessionCompat.QueueItem(null, d(g(paramList).a(), (Map)paramList.get("extras")), i));
    }
    return localArrayList;
  }
  
  public static MediaDescriptionCompat d(MediaDescriptionCompat paramMediaDescriptionCompat, Map<?, ?> paramMap)
  {
    Object localObject1 = paramMediaDescriptionCompat;
    if (paramMap != null) {
      if (paramMap.isEmpty())
      {
        localObject1 = paramMediaDescriptionCompat;
      }
      else
      {
        localObject1 = new Bundle();
        Object localObject2 = o;
        if (localObject2 != null) {
          ((Bundle)localObject1).putAll((Bundle)localObject2);
        }
        ((Bundle)localObject1).putAll(l(paramMap));
        CharSequence localCharSequence1 = b;
        CharSequence localCharSequence2 = c;
        localObject2 = d;
        paramMap = e;
        Uri localUri = f;
        localObject1 = new MediaDescriptionCompat(a, localCharSequence1, localCharSequence2, (CharSequence)localObject2, paramMap, localUri, (Bundle)localObject1, p);
      }
    }
    return (MediaDescriptionCompat)localObject1;
  }
  
  public static HashMap e(Bundle paramBundle)
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
  
  public static MediaMetadataCompat g(Map<?, ?> paramMap)
  {
    Object localObject1 = AudioService.F;
    String str1 = (String)paramMap.get("id");
    String str2 = (String)paramMap.get("title");
    String str3 = (String)paramMap.get("album");
    String str4 = (String)paramMap.get("artist");
    String str5 = (String)paramMap.get("genre");
    Long localLong = j(paramMap.get("duration"));
    String str6 = (String)paramMap.get("artUri");
    Boolean localBoolean = (Boolean)paramMap.get("playable");
    String str7 = (String)paramMap.get("displayTitle");
    String str8 = (String)paramMap.get("displaySubtitle");
    String str9 = (String)paramMap.get("displayDescription");
    Object localObject2 = (Map)paramMap.get("rating");
    if (localObject2 == null) {}
    float f1;
    for (;;)
    {
      localObject3 = null;
      break label411;
      localObject3 = (Integer)((Map)localObject2).get("type");
      localObject2 = ((Map)localObject2).get("value");
      if (localObject2 == null) {
        break;
      }
      switch (((Integer)localObject3).intValue())
      {
      default: 
        break;
      case 6: 
        f1 = ((Double)localObject2).floatValue();
        if ((f1 >= 0.0F) && (f1 <= 100.0F))
        {
          localObject3 = new RatingCompat(f1, 6);
          break label411;
        }
        Log.e("Rating", "Invalid percentage-based rating value");
      }
    }
    int i = ((Integer)localObject3).intValue();
    Object localObject3 = RatingCompat.b(((Integer)localObject2).intValue(), i);
    break label411;
    if (((Boolean)localObject2).booleanValue()) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    localObject3 = new RatingCompat(f1, 2);
    break label411;
    if (((Boolean)localObject2).booleanValue()) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    localObject3 = new RatingCompat(f1, 1);
    break label411;
    localObject3 = RatingCompat.c(((Integer)localObject3).intValue());
    label411:
    localObject2 = (Map)paramMap.get("extras");
    localObject1.getClass();
    localObject1 = new MediaMetadataCompat.b();
    ((MediaMetadataCompat.b)localObject1).d("android.media.metadata.MEDIA_ID", str1);
    ((MediaMetadataCompat.b)localObject1).d("android.media.metadata.TITLE", str2);
    if (str3 != null) {
      ((MediaMetadataCompat.b)localObject1).d("android.media.metadata.ALBUM", str3);
    }
    if (str4 != null) {
      ((MediaMetadataCompat.b)localObject1).d("android.media.metadata.ARTIST", str4);
    }
    if (str5 != null) {
      ((MediaMetadataCompat.b)localObject1).d("android.media.metadata.GENRE", str5);
    }
    if (localLong != null) {
      ((MediaMetadataCompat.b)localObject1).b("android.media.metadata.DURATION", localLong.longValue());
    }
    if (str6 != null) {
      ((MediaMetadataCompat.b)localObject1).d("android.media.metadata.DISPLAY_ICON_URI", str6);
    }
    long l;
    if (localBoolean != null)
    {
      if (localBoolean.booleanValue()) {
        l = 1L;
      } else {
        l = 0L;
      }
      ((MediaMetadataCompat.b)localObject1).b("playable_long", l);
    }
    if (str7 != null) {
      ((MediaMetadataCompat.b)localObject1).d("android.media.metadata.DISPLAY_TITLE", str7);
    }
    if (str8 != null) {
      ((MediaMetadataCompat.b)localObject1).d("android.media.metadata.DISPLAY_SUBTITLE", str8);
    }
    if (str9 != null) {
      ((MediaMetadataCompat.b)localObject1).d("android.media.metadata.DISPLAY_DESCRIPTION", str9);
    }
    if (localObject3 != null) {
      ((MediaMetadataCompat.b)localObject1).c("android.media.metadata.RATING", (RatingCompat)localObject3);
    }
    if (localObject2 != null)
    {
      localObject3 = ((Map)localObject2).keySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        str8 = (String)((Iterator)localObject3).next();
        paramMap = ((Map)localObject2).get(str8);
        if ((paramMap instanceof Long))
        {
          l = ((Long)paramMap).longValue();
        }
        else if ((paramMap instanceof Integer))
        {
          l = ((Integer)paramMap).intValue();
        }
        else
        {
          if ((paramMap instanceof String))
          {
            paramMap = (String)paramMap;
            break label757;
          }
          if (!(paramMap instanceof Boolean)) {
            break label745;
          }
          if (((Boolean)paramMap).booleanValue()) {
            l = 1L;
          } else {
            l = 0L;
          }
        }
        ((MediaMetadataCompat.b)localObject1).b(str8, l);
        continue;
        label745:
        if ((paramMap instanceof Double))
        {
          paramMap = paramMap.toString();
          label757:
          ((MediaMetadataCompat.b)localObject1).d(str8, paramMap);
        }
      }
    }
    paramMap = new MediaMetadataCompat(a);
    AudioService.J.put(str1, paramMap);
    return paramMap;
  }
  
  /* Error */
  public static void h()
  {
    // Byte code:
    //   0: getstatic 386	com/ryanheise/audioservice/b:p	Lcom/ryanheise/audioservice/b$d;
    //   3: astore_0
    //   4: aload_0
    //   5: ifnull +11 -> 16
    //   8: aload_0
    //   9: getfield 389	com/ryanheise/audioservice/b$d:b	Landroid/app/Activity;
    //   12: astore_0
    //   13: goto +5 -> 18
    //   16: aconst_null
    //   17: astore_0
    //   18: aload_0
    //   19: ifnull +17 -> 36
    //   22: aload_0
    //   23: new 391	android/content/Intent
    //   26: dup
    //   27: ldc_w 393
    //   30: invokespecial 396	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   33: invokevirtual 402	android/app/Activity:setIntent	(Landroid/content/Intent;)V
    //   36: getstatic 404	com/ryanheise/audioservice/b:v	Landroid/support/v4/media/session/MediaControllerCompat;
    //   39: astore_1
    //   40: aload_1
    //   41: ifnull +74 -> 115
    //   44: getstatic 72	com/ryanheise/audioservice/b:w	Lcom/ryanheise/audioservice/b$a;
    //   47: astore_0
    //   48: aload_0
    //   49: ifnull +55 -> 104
    //   52: aload_1
    //   53: getfield 409	android/support/v4/media/session/MediaControllerCompat:c	Ljava/util/concurrent/ConcurrentHashMap;
    //   56: aload_0
    //   57: invokevirtual 414	java/util/concurrent/ConcurrentHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   60: ifnonnull +16 -> 76
    //   63: ldc_w 416
    //   66: ldc_w 418
    //   69: invokestatic 420	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   72: pop
    //   73: goto +16 -> 89
    //   76: aload_1
    //   77: getfield 423	android/support/v4/media/session/MediaControllerCompat:a	Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;
    //   80: aload_0
    //   81: invokevirtual 428	android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21:b	(Landroid/support/v4/media/session/MediaControllerCompat$a;)V
    //   84: aload_0
    //   85: aconst_null
    //   86: invokevirtual 433	android/support/v4/media/session/MediaControllerCompat$a:b	(Landroid/os/Handler;)V
    //   89: aconst_null
    //   90: putstatic 404	com/ryanheise/audioservice/b:v	Landroid/support/v4/media/session/MediaControllerCompat;
    //   93: goto +22 -> 115
    //   96: astore_1
    //   97: aload_0
    //   98: aconst_null
    //   99: invokevirtual 433	android/support/v4/media/session/MediaControllerCompat$a:b	(Landroid/os/Handler;)V
    //   102: aload_1
    //   103: athrow
    //   104: new 435	java/lang/IllegalArgumentException
    //   107: dup
    //   108: ldc_w 437
    //   111: invokespecial 438	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   114: athrow
    //   115: getstatic 440	com/ryanheise/audioservice/b:u	Landroid/support/v4/media/MediaBrowserCompat;
    //   118: astore_0
    //   119: aload_0
    //   120: ifnull +11 -> 131
    //   123: aload_0
    //   124: invokevirtual 444	android/support/v4/media/MediaBrowserCompat:a	()V
    //   127: aconst_null
    //   128: putstatic 440	com/ryanheise/audioservice/b:u	Landroid/support/v4/media/MediaBrowserCompat;
    //   131: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	121	0	localObject1	Object
    //   39	38	1	localMediaControllerCompat	MediaControllerCompat
    //   96	7	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   76	84	96	finally
  }
  
  public static FlutterEngine i(Context paramContext)
  {
    try
    {
      FlutterEngine localFlutterEngine = FlutterEngineCache.getInstance().get("audio_service_engine");
      Object localObject1 = localFlutterEngine;
      if (localFlutterEngine == null)
      {
        localFlutterEngine = new io/flutter/embedding/engine/FlutterEngine;
        localFlutterEngine.<init>(paramContext.getApplicationContext());
        localObject1 = null;
        if ((paramContext instanceof FlutterActivity))
        {
          Object localObject2 = (FlutterActivity)paramContext;
          paramContext = ((FlutterActivity)localObject2).getInitialRoute();
          localObject1 = paramContext;
          if (paramContext == null)
          {
            localObject1 = paramContext;
            if (((FlutterActivity)localObject2).shouldHandleDeeplinking())
            {
              localObject2 = ((Activity)localObject2).getIntent().getData();
              localObject1 = paramContext;
              if (localObject2 != null)
              {
                paramContext = ((Uri)localObject2).getPath();
                localObject1 = paramContext;
                if (((Uri)localObject2).getQuery() != null)
                {
                  localObject1 = paramContext;
                  if (!((Uri)localObject2).getQuery().isEmpty())
                  {
                    localObject1 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject1).<init>();
                    ((StringBuilder)localObject1).append(paramContext);
                    ((StringBuilder)localObject1).append("?");
                    ((StringBuilder)localObject1).append(((Uri)localObject2).getQuery());
                    localObject1 = ((StringBuilder)localObject1).toString();
                  }
                }
              }
            }
          }
        }
        paramContext = (Context)localObject1;
        if (localObject1 == null) {
          paramContext = "/";
        }
        localFlutterEngine.getNavigationChannel().setInitialRoute(paramContext);
        localFlutterEngine.getDartExecutor().executeDartEntrypoint(DartExecutor.DartEntrypoint.createDefault());
        FlutterEngineCache.getInstance().put("audio_service_engine", localFlutterEngine);
        localObject1 = localFlutterEngine;
      }
      return (FlutterEngine)localObject1;
    }
    finally {}
  }
  
  public static Long j(Object paramObject)
  {
    if ((paramObject != null) && (!(paramObject instanceof Long))) {
      paramObject = Long.valueOf(((Integer)paramObject).intValue());
    } else {
      paramObject = (Long)paramObject;
    }
    return (Long)paramObject;
  }
  
  public static HashMap k(Object... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < paramVarArgs.length; i += 2) {
      localHashMap.put((String)paramVarArgs[i], paramVarArgs[(i + 1)]);
    }
    return localHashMap;
  }
  
  public static Bundle l(Map<?, ?> paramMap)
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
  
  public static String m(MediaMetadataCompat paramMediaMetadataCompat, String paramString)
  {
    paramMediaMetadataCompat = a.getCharSequence(paramString);
    if (paramMediaMetadataCompat != null) {
      return paramMediaMetadataCompat.toString();
    }
    return null;
  }
  
  public static HashMap<String, Object> n(RatingCompat paramRatingCompat)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", Integer.valueOf(a));
    float f1 = b;
    int i = 1;
    boolean bool1 = true;
    int j = 1;
    boolean bool2 = false;
    int k;
    if (f1 >= 0.0F) {
      k = 1;
    } else {
      k = 0;
    }
    if (k != 0)
    {
      k = a;
      switch (k)
      {
      default: 
        break;
      case 6: 
        if (k == 6)
        {
          if (f1 >= 0.0F) {
            k = j;
          } else {
            k = 0;
          }
          if (k != 0) {
            break label187;
          }
        }
      case 3: 
      case 4: 
      case 5: 
        do
        {
          do
          {
            f1 = -1.0F;
            break;
          } while ((k != 3) && (k != 4) && (k != 5));
          if (f1 >= 0.0F) {
            k = i;
          } else {
            k = 0;
          }
        } while (k == 0);
        paramRatingCompat = Float.valueOf(f1);
        break;
      case 2: 
        if (k == 2) {
          if (f1 == 1.0F) {
            bool2 = bool1;
          }
        }
        break;
      case 1: 
        label187:
        for (bool2 = false;; bool2 = bool1)
        {
          break label245;
          if (k != 1) {
            break label245;
          }
          if (f1 != 1.0F) {
            break;
          }
        }
        label245:
        paramRatingCompat = Boolean.valueOf(bool2);
        localHashMap.put("value", paramRatingCompat);
        break;
      }
    }
    localHashMap.put("value", null);
    return localHashMap;
  }
  
  public final void f()
  {
    if (u == null)
    {
      MediaBrowserCompat localMediaBrowserCompat = new MediaBrowserCompat(a, new ComponentName(a, AudioService.class), f);
      u = localMediaBrowserCompat;
      Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
      a.b.connect();
    }
  }
  
  public final void o()
  {
    Activity localActivity = e.b;
    if (localActivity.getIntent().getAction() != null)
    {
      boolean bool = localActivity.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK");
      q.a("onNotificationClicked", k(new Object[] { "clicked", Boolean.valueOf(bool) }), null);
    }
  }
  
  public final void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    c = paramActivityPluginBinding;
    e.b = paramActivityPluginBinding.getActivity();
    e.a = paramActivityPluginBinding.getActivity();
    Object localObject1 = i(paramActivityPluginBinding.getActivity());
    paramActivityPluginBinding = e;
    Object localObject2 = b.getBinaryMessenger();
    localObject1 = ((FlutterEngine)localObject1).getDartExecutor();
    int i = 1;
    boolean bool;
    if (localObject2 != localObject1) {
      bool = true;
    } else {
      bool = false;
    }
    d = bool;
    p = e;
    paramActivityPluginBinding = c;
    localObject2 = new ta.b(this);
    d = ((ta.b)localObject2);
    paramActivityPluginBinding.addOnNewIntentListener((PluginRegistry.NewIntentListener)localObject2);
    paramActivityPluginBinding = v;
    if (paramActivityPluginBinding != null) {
      MediaControllerCompat.b(pb, paramActivityPluginBinding);
    }
    if (u == null) {
      f();
    }
    paramActivityPluginBinding = pb;
    if ((e.b.getIntent().getFlags() & 0x100000) != 1048576) {
      i = 0;
    }
    if (i != 0) {
      paramActivityPluginBinding.setIntent(new Intent("android.intent.action.MAIN"));
    }
    o();
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    b = paramFlutterPluginBinding;
    paramFlutterPluginBinding = new d(paramFlutterPluginBinding.getBinaryMessenger());
    e = paramFlutterPluginBinding;
    a = b.getApplicationContext();
    o.add(e);
    if (a == null) {
      a = b.getApplicationContext();
    }
    if (q == null)
    {
      paramFlutterPluginBinding = new c(b.getBinaryMessenger());
      q = paramFlutterPluginBinding;
      AudioService.H = paramFlutterPluginBinding;
    }
    if (u == null) {
      f();
    }
  }
  
  public final void onDetachedFromActivity()
  {
    c.removeOnNewIntentListener(d);
    c = null;
    d = null;
    d locald = e;
    b = null;
    a = b.getApplicationContext();
    if (o.size() == 1) {
      h();
    }
    if (e == p) {
      p = null;
    }
  }
  
  public final void onDetachedFromActivityForConfigChanges()
  {
    c.removeOnNewIntentListener(d);
    c = null;
    d locald = e;
    b = null;
    a = b.getApplicationContext();
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    paramFlutterPluginBinding = o;
    if (paramFlutterPluginBinding.size() == 1) {
      h();
    }
    paramFlutterPluginBinding.remove(e);
    e.a = null;
    e = null;
    a = null;
    paramFlutterPluginBinding = q;
    if ((paramFlutterPluginBinding != null) && (a == b.getBinaryMessenger()))
    {
      System.out.println("### destroying audio handler interface");
      paramFlutterPluginBinding = qc;
      if (paramFlutterPluginBinding != null) {
        paramFlutterPluginBinding.release();
      }
      q = null;
    }
    b = null;
  }
  
  public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    c = paramActivityPluginBinding;
    e.b = paramActivityPluginBinding.getActivity();
    e.a = paramActivityPluginBinding.getActivity();
    ActivityPluginBinding localActivityPluginBinding = c;
    paramActivityPluginBinding = new ta.b(this);
    d = paramActivityPluginBinding;
    localActivityPluginBinding.addOnNewIntentListener(paramActivityPluginBinding);
  }
  
  public final class a
    extends MediaControllerCompat.a
  {}
  
  public final class b
    extends MediaBrowserCompat.c
  {
    public b() {}
    
    public final void a()
    {
      try
      {
        Object localObject1 = ua;
        if (h == null)
        {
          MediaSession.Token localToken = b.getSessionToken();
          if (localToken != null)
          {
            localObject2 = new android/support/v4/media/session/MediaSessionCompat$Token;
            ((MediaSessionCompat.Token)localObject2).<init>(localToken, null, null);
          }
          else
          {
            localObject2 = null;
          }
          h = ((MediaSessionCompat.Token)localObject2);
        }
        Object localObject2 = h;
        localObject1 = new android/support/v4/media/session/MediaControllerCompat;
        ((MediaControllerCompat)localObject1).<init>(a, (MediaSessionCompat.Token)localObject2);
        b.v = (MediaControllerCompat)localObject1;
        localObject2 = b.p;
        if (localObject2 != null) {
          localObject2 = b;
        } else {
          localObject2 = null;
        }
        if (localObject2 != null) {
          MediaControllerCompat.b((Activity)localObject2, b.v);
        }
        b.v.a(b.w);
        localObject2 = b.s;
        if (localObject2 != null)
        {
          ((MethodChannel.Result)localObject2).success(b.k(new Object[0]));
          b.s = null;
        }
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        throw new RuntimeException(localException);
      }
    }
    
    public final void b()
    {
      MethodChannel.Result localResult = b.s;
      if (localResult != null) {
        localResult.error("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
      } else {
        e.e = true;
      }
    }
    
    public final void c()
    {
      System.out.println("### UNHANDLED: onConnectionSuspended");
    }
  }
  
  public static final class c
    implements MethodChannel.MethodCallHandler, AudioService.c
  {
    public BinaryMessenger a;
    public MethodChannel b;
    public AudioTrack c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public LinkedList e = new LinkedList();
    
    public c(BinaryMessenger paramBinaryMessenger)
    {
      a = paramBinaryMessenger;
      paramBinaryMessenger = new MethodChannel(paramBinaryMessenger, "com.ryanheise.audio_service.handler.methods");
      b = paramBinaryMessenger;
      paramBinaryMessenger.setMethodCallHandler(this);
    }
    
    public final void a(String paramString, HashMap paramHashMap, MethodChannel.Result paramResult)
    {
      if (b.t) {
        b.invokeMethod(paramString, paramHashMap, paramResult);
      } else {
        e.add(new b.e(paramString, paramHashMap, paramResult));
      }
    }
    
    public final void onMethodCall(MethodCall arg1, MethodChannel.Result paramResult)
    {
      Object localObject1 = (Map)arguments;
      ??? = method;
      ???.getClass();
      switch (???.hashCode())
      {
      }
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    i = -1;
                    break;
                  } while (!???.equals("notifyChildrenChanged"));
                  i = 6;
                  break;
                } while (!???.equals("setState"));
                i = 5;
                break;
              } while (!???.equals("setQueue"));
              i = 4;
              break;
            } while (!???.equals("stopService"));
            i = 3;
            break;
          } while (!???.equals("setAndroidPlaybackInfo"));
          i = 2;
          break;
        } while (!???.equals("androidForceEnableMediaButtons"));
        i = 1;
        break;
      } while (!???.equals("setMediaItem"));
      int i = 0;
      Object localObject2;
      int k;
      boolean bool2;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      boolean bool3;
      boolean bool4;
      int j;
      label1577:
      boolean bool5;
      int i2;
      switch (i)
      {
      default: 
      case 6: 
      case 5: 
        for (;;)
        {
          break label2836;
          ??? = (String)((Map)localObject1).get("parentMediaId");
          localObject1 = (Map)((Map)localObject1).get("options");
          localObject2 = AudioService.F;
          localObject1 = b.l((Map)localObject1);
          localObject2.getClass();
          if (??? != null)
          {
            if (localObject1 != null)
            {
              localObject2 = a;
              ((c.e)localObject2).a((Bundle)localObject1, ???);
              d.e.post(new h((c.e)localObject2, ???, (Bundle)localObject1));
              paramResult.success(null);
            }
            else
            {
              throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
            }
          }
          else
          {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
            localObject1 = (Map)((Map)localObject1).get("state");
            k = g.d(6)[((Integer)localObject1.get("processingState")).intValue()];
            bool2 = ((Boolean)((Map)localObject1).get("playing")).booleanValue();
            ??? = (List)((Map)localObject1).get("controls");
            localObject3 = (List)((Map)localObject1).get("androidCompactActionIndices");
            localObject4 = (List)((Map)localObject1).get("systemActions");
            long l1 = b.j(((Map)localObject1).get("updatePosition")).longValue();
            long l2 = b.j(((Map)localObject1).get("bufferedPosition")).longValue();
            float f = (float)((Double)((Map)localObject1).get("speed")).doubleValue();
            long l3;
            if (((Map)localObject1).get("updateTime") == null) {
              l3 = System.currentTimeMillis();
            } else {
              l3 = b.j(((Map)localObject1).get("updateTime")).longValue();
            }
            localObject5 = (Integer)((Map)localObject1).get("errorCode");
            localObject2 = (String)((Map)localObject1).get("errorMessage");
            int m = ((Integer)((Map)localObject1).get("repeatMode")).intValue();
            int n = ((Integer)((Map)localObject1).get("shuffleMode")).intValue();
            Object localObject6 = b.j(((Map)localObject1).get("queueIndex"));
            bool3 = ((Boolean)((Map)localObject1).get("captioningEnabled")).booleanValue();
            long l4 = b.r;
            Object localObject7 = new ArrayList();
            long l5 = 0L;
            ??? = ???.iterator();
            Object localObject8;
            String str1;
            while (???.hasNext())
            {
              localObject1 = (Map)???.next();
              localObject8 = (String)((Map)localObject1).get("androidIcon");
              str1 = (String)((Map)localObject1).get("label");
              l6 = 1 << ((Integer)((Map)localObject1).get("action")).intValue();
              l5 |= l6;
              localObject1 = (Map)((Map)localObject1).get("customAction");
              if (localObject1 != null) {
                localObject1 = new e((String)((Map)localObject1).get("name"), (Map)((Map)localObject1).get("extras"));
              } else {
                localObject1 = null;
              }
              ((ArrayList)localObject7).add(new f((String)localObject8, str1, l6, (e)localObject1));
            }
            ??? = ((List)localObject4).iterator();
            while (???.hasNext()) {
              l5 |= 1 << ((Integer)???.next()).intValue();
            }
            if (localObject3 != null)
            {
              i1 = Math.min(3, ((List)localObject3).size());
              ??? = new int[i1];
              for (i = 0;; i++)
              {
                localObject4 = ???;
                if (i >= i1) {
                  break;
                }
                ???[i] = ((Integer)((List)localObject3).get(i)).intValue();
              }
            }
            localObject4 = null;
            localObject3 = AudioService.F;
            boolean bool1 = Arrays.equals((int[])localObject4, v) ^ true;
            if (!((ArrayList)localObject7).equals(s)) {
              bool1 = true;
            }
            s = ((List)localObject7);
            t.clear();
            u.clear();
            localObject7 = ((ArrayList)localObject7).iterator();
            ??? = (MethodCall)localObject6;
            localObject1 = localObject5;
            bool4 = bool1;
            localObject6 = localObject7;
            while (((Iterator)localObject6).hasNext())
            {
              localObject8 = (f)((Iterator)localObject6).next();
              j = ((AudioService)localObject3).k(a);
              localObject5 = d;
              if (localObject5 != null)
              {
                str1 = a;
                String str2 = b;
                if (!TextUtils.isEmpty(str1))
                {
                  if (!TextUtils.isEmpty(str2))
                  {
                    if (j != 0)
                    {
                      localObject5 = d.b;
                      if (localObject5 == null)
                      {
                        localObject7 = null;
                        localObject5 = localObject1;
                        localObject1 = ???;
                      }
                      else
                      {
                        localObject7 = new Bundle();
                        localObject5 = ((Map)localObject5).entrySet().iterator();
                        if (((Iterator)localObject5).hasNext())
                        {
                          Object localObject9 = (Map.Entry)((Iterator)localObject5).next();
                          String str3 = ((Map.Entry)localObject9).getKey().toString();
                          localObject9 = ((Map.Entry)localObject9).getValue();
                          if ((localObject9 instanceof Integer)) {
                            ((BaseBundle)localObject7).putInt(str3, ((Integer)localObject9).intValue());
                          }
                          for (;;)
                          {
                            break;
                            if ((localObject9 instanceof Long))
                            {
                              ((BaseBundle)localObject7).putLong(str3, ((Long)localObject9).longValue());
                              break;
                            }
                            ((BaseBundle)localObject7).putString(str3, localObject9.toString());
                          }
                        }
                        localObject5 = localObject1;
                        localObject1 = ???;
                      }
                      ??? = new PlaybackStateCompat.CustomAction(str1, str2, j, (Bundle)localObject7);
                    }
                    else
                    {
                      throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                  }
                  else {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                  }
                }
                else {
                  throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
              }
              else
              {
                localObject5 = localObject1;
                localObject1 = ???;
                if (Build.VERSION.SDK_INT >= 33)
                {
                  l6 = c;
                  if (l6 == 1L)
                  {
                    ??? = b;
                    if (!TextUtils.isEmpty("com.ryanheise.audioservice.action.STOP"))
                    {
                      if (!TextUtils.isEmpty(???))
                      {
                        if (j != 0)
                        {
                          ??? = new PlaybackStateCompat.CustomAction("com.ryanheise.audioservice.action.STOP", ???, j, null);
                          break label1577;
                        }
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                      }
                      throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                  }
                  if (l6 == 64L)
                  {
                    ??? = b;
                    if (!TextUtils.isEmpty("com.ryanheise.audioservice.action.FAST_FORWARD"))
                    {
                      if (!TextUtils.isEmpty(???))
                      {
                        if (j != 0)
                        {
                          ??? = new PlaybackStateCompat.CustomAction("com.ryanheise.audioservice.action.FAST_FORWARD", ???, j, null);
                          break label1577;
                        }
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                      }
                      throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                  }
                  if (l6 == 8L)
                  {
                    ??? = b;
                    if (!TextUtils.isEmpty("com.ryanheise.audioservice.action.REWIND"))
                    {
                      if (!TextUtils.isEmpty(???))
                      {
                        if (j != 0)
                        {
                          ??? = new PlaybackStateCompat.CustomAction("com.ryanheise.audioservice.action.REWIND", ???, j, null);
                          break label1577;
                        }
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                      }
                      throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                  }
                }
                ??? = null;
              }
              if (??? != null)
              {
                u.add(???);
              }
              else
              {
                ??? = t;
                str1 = a;
                localObject7 = b;
                l6 = c;
                ???.add(new n(((AudioService)localObject3).k(str1), (String)localObject7, ((AudioService)localObject3).h(l6)));
              }
              ??? = (MethodCall)localObject1;
              localObject1 = localObject5;
            }
            v = ((int[])localObject4);
            bool5 = A;
            i2 = B;
            B = k;
            A = bool2;
            localObject5 = new ArrayList();
            long l6 = -1L;
            j = g.c(B);
            if (j != 1)
            {
              if (j != 2)
              {
                if (j != 3)
                {
                  if (j != 4)
                  {
                    if (j != 5)
                    {
                      j = 0;
                      break label1801;
                    }
                    j = 7;
                    break label1801;
                  }
                  if (!A) {
                    break label1784;
                  }
                }
                else
                {
                  if (!A) {
                    break label1784;
                  }
                }
                j = 3;
                break label1787;
                label1784:
                j = 2;
              }
              else
              {
                label1787:
                j = 6;
              }
            }
            else {
              j = 8;
            }
            label1801:
            localObject6 = u.iterator();
            while (((Iterator)localObject6).hasNext())
            {
              localObject4 = (PlaybackStateCompat.CustomAction)((Iterator)localObject6).next();
              if (localObject4 != null) {
                ((ArrayList)localObject5).add(localObject4);
              } else {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
              }
            }
            if (??? != null) {
              l6 = ???.longValue();
            }
            if ((localObject1 != null) && (localObject2 != null))
            {
              i1 = ((Integer)localObject1).intValue();
            }
            else
            {
              if (localObject2 == null) {
                break label1904;
              }
              i1 = -987654;
            }
            ??? = (MethodCall)localObject2;
            break label1909;
            label1904:
            ??? = null;
            int i1 = 0;
            label1909:
            if (w != null)
            {
              localObject1 = new Bundle();
              ((BaseBundle)localObject1).putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", w.a().a);
            }
            else
            {
              localObject1 = null;
            }
            r.h(new PlaybackStateCompat(j, l1, l2, f, l5 | 0x37FECF, i1, ???, l3 - l4, (ArrayList)localObject5, l6, (Bundle)localObject1));
            r.j(m);
            r.k(n);
            localObject1 = r.a;
            if (j != bool3) {
              j = bool3;
            }
          }
        }
      }
      for (;;)
      {
        synchronized (c)
        {
          j = f.beginBroadcast();
          j--;
          if (j >= 0) {
            localObject2 = (IMediaControllerCallback)f.getBroadcastItem(j);
          }
        }
        try
        {
          ((IMediaControllerCallback)localObject2).f1(bool3);
        }
        catch (RemoteException localRemoteException) {}
        paramResult = finally;
        break label2100;
        f.finishBroadcast();
        break label2104;
        label2100:
        throw paramResult;
        label2104:
        if ((!bool5) && (bool2))
        {
          v.a.startForegroundService((Context)localObject3, new Intent((Context)localObject3, AudioService.class));
          if (!r.c()) {
            r.e(true);
          }
          if (!q.isHeld()) {
            q.acquire();
          }
          ??? = r;
          localObject1 = AudioService.G;
          a.a.setSessionActivity((PendingIntent)localObject1);
          ((Service)localObject3).startForeground(1124, ((AudioService)localObject3).i());
          C = true;
        }
        else if ((bool5) && (!bool2) && (p.k))
        {
          if (Build.VERSION.SDK_INT >= 24) {
            ((Service)localObject3).stopForeground(0);
          } else {
            ((Service)localObject3).stopForeground(false);
          }
          if (q.isHeld()) {
            q.release();
          }
        }
        if ((i2 != 1) && (k == 1))
        {
          if (r.c()) {
            r.e(false);
          }
          ((NotificationManager)((Context)localObject3).getSystemService("notification")).cancel(1124);
          ((Service)localObject3).stopSelf();
        }
        else if ((k != 1) && (bool4) && (C))
        {
          ((NotificationManager)((Context)localObject3).getSystemService("notification")).notify(1124, ((AudioService)localObject3).i());
        }
        paramResult.success(null);
        break label2836;
        ??? = Executors.newSingleThreadExecutor();
        paramResult = new t0.d(this, localObject1, paramResult, 6);
        break label2829;
        ??? = AudioService.F;
        if (??? != null)
        {
          if (r.c()) {
            r.e(false);
          }
          ((NotificationManager)???.getSystemService("notification")).cancel(1124);
          ???.stopSelf();
          break label2803;
          ??? = (Map)((Map)localObject1).get("playbackInfo");
          j = ((Integer)???.get("playbackType")).intValue();
          localObject1 = (Integer)???.get("volumeControlType");
          localObject2 = (Integer)???.get("maxVolume");
          localObject4 = (Integer)???.get("volume");
          ??? = AudioService.F;
          if (j == 1)
          {
            localObject1 = r.a;
            localObject1.getClass();
            localObject2 = new AudioAttributes.Builder();
            ((AudioAttributes.Builder)localObject2).setLegacyStreamType(3);
            a.setPlaybackToLocal(((AudioAttributes.Builder)localObject2).build());
            E = null;
          }
          else if (j == 2)
          {
            if ((E != null) && (((Integer)localObject1).intValue() == E.a))
            {
              j = ((Integer)localObject2).intValue();
              localObject5 = E;
              if (j == b)
              {
                j = ((Integer)localObject4).intValue();
                d = j;
                y.a.a(((y)localObject5).a(), j);
                break label2687;
              }
            }
            E = new a(((Integer)localObject1).intValue(), ((Integer)localObject2).intValue(), ((Integer)localObject4).intValue());
            label2687:
            localObject1 = r;
            ??? = E;
            if (??? != null)
            {
              a.a.setPlaybackToRemote(???.a());
            }
            else
            {
              localObject1.getClass();
              throw new IllegalArgumentException("volumeProvider may not be null!");
            }
          }
          else
          {
            ???.getClass();
            break label2803;
            if (c == null)
            {
              localObject1 = new byte['ࠀ'];
              ??? = new AudioTrack(3, 44100, 2, 3, 2048, 0);
              c = ???;
              ???.write((byte[])localObject1, 0, 2048);
            }
            c.reloadStaticData();
            c.play();
          }
        }
        label2803:
        paramResult.success(null);
        break label2836;
        ??? = Executors.newSingleThreadExecutor();
        paramResult = new x0.d(this, localObject1, paramResult, 5);
        label2829:
        ???.execute(paramResult);
        label2836:
        return;
      }
    }
  }
  
  public static final class d
    implements MethodChannel.MethodCallHandler
  {
    public Context a;
    public Activity b;
    public final BinaryMessenger c;
    public boolean d;
    public boolean e;
    
    public d(BinaryMessenger paramBinaryMessenger)
    {
      c = paramBinaryMessenger;
      new MethodChannel(paramBinaryMessenger, "com.ryanheise.audio_service.client.methods").setMethodCallHandler(this);
    }
    
    public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
    {
      try
      {
        if (!d)
        {
          Object localObject1 = method;
          int i = ((String)localObject1).hashCode();
          int j = -1;
          if ((i == -804429082) && (((String)localObject1).equals("configure"))) {
            i = 0;
          } else {
            i = -1;
          }
          if (i == 0) {
            if (!e)
            {
              b.t = true;
              Object localObject2 = (Map)((Map)arguments).get("config");
              localObject1 = new ta/a;
              ((ta.a)localObject1).<init>(a.getApplicationContext());
              i = ((Boolean)((Map)localObject2).get("androidNotificationClickStartsActivity")).booleanValue();
              j = ((Boolean)((Map)localObject2).get("androidNotificationOngoing")).booleanValue();
              b = ((Boolean)((Map)localObject2).get("androidResumeOnClick")).booleanValue();
              c = ((String)((Map)localObject2).get("androidNotificationChannelId"));
              d = ((String)((Map)localObject2).get("androidNotificationChannelName"));
              e = ((String)((Map)localObject2).get("androidNotificationChannelDescription"));
              if (((Map)localObject2).get("notificationColor") == null)
              {
                i = -1;
              }
              else
              {
                paramMethodCall = ((Map)localObject2).get("notificationColor");
                if ((paramMethodCall != null) && (!(paramMethodCall instanceof Integer))) {
                  paramMethodCall = Integer.valueOf((int)((Long)paramMethodCall).longValue());
                } else {
                  paramMethodCall = (Integer)paramMethodCall;
                }
                i = paramMethodCall.intValue();
              }
              f = i;
              g = ((String)((Map)localObject2).get("androidNotificationIcon"));
              h = ((Boolean)((Map)localObject2).get("androidShowNotificationBadge")).booleanValue();
              k = ((Boolean)((Map)localObject2).get("androidStopForegroundOnPause")).booleanValue();
              if (((Map)localObject2).get("artDownscaleWidth") != null) {
                i = ((Integer)((Map)localObject2).get("artDownscaleWidth")).intValue();
              } else {
                i = -1;
              }
              l = i;
              i = j;
              if (((Map)localObject2).get("artDownscaleHeight") != null) {
                i = ((Integer)((Map)localObject2).get("artDownscaleHeight")).intValue();
              }
              m = i;
              localObject2 = (Map)((Map)localObject2).get("androidBrowsableRootExtras");
              if (localObject2 != null)
              {
                paramMethodCall = new org/json/JSONObject;
                paramMethodCall.<init>((Map)localObject2);
                paramMethodCall = paramMethodCall.toString();
              }
              else
              {
                paramMethodCall = null;
              }
              o = paramMethodCall;
              paramMethodCall = b;
              if (paramMethodCall != null) {
                n = paramMethodCall.getClass().getName();
              }
              ((ta.a)localObject1).a();
              paramMethodCall = AudioService.F;
              if (paramMethodCall != null) {
                paramMethodCall.j((ta.a)localObject1);
              }
              b.p = this;
              localObject1 = b.q;
              if (localObject1 == null)
              {
                paramMethodCall = new com/ryanheise/audioservice/b$c;
                paramMethodCall.<init>(c);
                b.q = paramMethodCall;
                AudioService.H = paramMethodCall;
              }
              else
              {
                localObject2 = a;
                paramMethodCall = c;
                if (localObject2 != paramMethodCall)
                {
                  b.setMethodCallHandler(null);
                  a = paramMethodCall;
                  localObject2 = new io/flutter/plugin/common/MethodChannel;
                  ((MethodChannel)localObject2).<init>(paramMethodCall, "com.ryanheise.audio_service.handler.methods");
                  b = ((MethodChannel)localObject2);
                  ((MethodChannel)localObject2).setMethodCallHandler((MethodChannel.MethodCallHandler)localObject1);
                }
                localObject1 = b.q;
                paramMethodCall = e.iterator();
                while (paramMethodCall.hasNext())
                {
                  localObject2 = (b.e)paramMethodCall.next();
                  b.invokeMethod(a, b, c);
                }
                e.clear();
              }
              if (b.v != null) {
                paramResult.success(b.k(new Object[0]));
              } else {
                b.s = paramResult;
              }
            }
            else
            {
              paramMethodCall = new java/lang/IllegalStateException;
              paramMethodCall.<init>("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
              throw paramMethodCall;
            }
          }
        }
        else
        {
          paramMethodCall = new java/lang/IllegalStateException;
          paramMethodCall.<init>("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
          throw paramMethodCall;
        }
      }
      catch (Exception paramMethodCall)
      {
        paramMethodCall.printStackTrace();
        paramResult.error(paramMethodCall.getMessage(), null, null);
      }
    }
  }
  
  public static final class e
  {
    public final String a;
    public final Object b;
    public final MethodChannel.Result c;
    
    public e(String paramString, HashMap paramHashMap, MethodChannel.Result paramResult)
    {
      a = paramString;
      b = paramHashMap;
      c = paramResult;
    }
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */