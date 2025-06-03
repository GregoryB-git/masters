package pa;

import android.app.Activity;
import android.app.PictureInPictureParams.Builder;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.util.LongSparseArray;
import com.jhomlala.better_player.CacheWorker;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.view.TextureRegistry;
import io.flutter.view.TextureRegistry.SurfaceTextureEntry;
import io.flutter.view.TextureRegistry.TextureEntry;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o2.l;
import o2.l.a;
import o2.p;
import o2.q.a;
import p2.k0;
import r5.j.a;
import v3.d0;
import v3.e;
import v3.e1;
import v3.r1;
import v3.r1.c;
import x0.q0;
import x3.d;
import z4.j0;

public final class g
  implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler
{
  public final LongSparseArray<b> a = new LongSparseArray();
  public final LongSparseArray<Map<String, Object>> b = new LongSparseArray();
  public a c;
  public long d = -1L;
  public Map<String, ? extends Object> e;
  public Activity f;
  public Handler o;
  public q0 p;
  
  public static Object b(Map paramMap, String paramString, Serializable paramSerializable)
  {
    int i = 1;
    if ((paramMap == null) || (paramMap.containsKey(paramString) != true)) {
      i = 0;
    }
    if (i != 0)
    {
      paramMap = paramMap.get(paramString);
      if (paramMap != null) {
        return paramMap;
      }
    }
    return paramSerializable;
  }
  
  public final void a()
  {
    int i = a.size();
    for (int j = 0; j < i; j++) {
      ((b)a.valueAt(j)).a();
    }
    a.clear();
    b.clear();
  }
  
  public final Long c(b paramb)
  {
    int i = a.size();
    for (int j = 0; j < i; j++) {
      if (paramb == a.valueAt(j)) {
        return Long.valueOf(a.keyAt(j));
      }
    }
    return null;
  }
  
  public final void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    ec.i.e(paramActivityPluginBinding, "binding");
    f = paramActivityPluginBinding.getActivity();
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    ec.i.e(paramFlutterPluginBinding, "binding");
    FlutterLoader localFlutterLoader = new FlutterLoader();
    Context localContext = paramFlutterPluginBinding.getApplicationContext();
    ec.i.d(localContext, "getApplicationContext(...)");
    BinaryMessenger localBinaryMessenger = paramFlutterPluginBinding.getBinaryMessenger();
    ec.i.d(localBinaryMessenger, "getBinaryMessenger(...)");
    paramFlutterPluginBinding = new a(localContext, localBinaryMessenger, new d(localFlutterLoader), new e(localFlutterLoader), paramFlutterPluginBinding.getTextureRegistry());
    c = paramFlutterPluginBinding;
    f.setMethodCallHandler(this);
  }
  
  public final void onDetachedFromActivity() {}
  
  public final void onDetachedFromActivityForConfigChanges() {}
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    ec.i.e(paramFlutterPluginBinding, "binding");
    if (c == null) {
      Log.wtf("BetterPlayerPlugin", "Detached from the engine before registering to it.");
    }
    a();
    paramFlutterPluginBinding = f.a;
    try
    {
      if (f.b != null)
      {
        paramFlutterPluginBinding = f.b;
        ec.i.b(paramFlutterPluginBinding);
        paramFlutterPluginBinding.q();
        f.b = null;
      }
    }
    catch (Exception paramFlutterPluginBinding)
    {
      Log.e("BetterPlayerCache", paramFlutterPluginBinding.toString());
    }
    paramFlutterPluginBinding = c;
    if (paramFlutterPluginBinding != null) {
      f.setMethodCallHandler(null);
    }
    c = null;
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    ec.i.e(paramMethodCall, "call");
    ec.i.e(paramResult, "result");
    Object localObject1 = c;
    Object localObject2 = null;
    if ((localObject1 != null) && (e != null))
    {
      localObject1 = method;
      long l2;
      long l3;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      if (localObject1 != null) {
        switch (((String)localObject1).hashCode())
        {
        default: 
          break;
        case 1800570049: 
          if (((String)localObject1).equals("stopPreCache"))
          {
            localObject1 = (String)paramMethodCall.argument("url");
            paramMethodCall = c;
            if (paramMethodCall != null) {
              paramMethodCall = a;
            } else {
              paramMethodCall = null;
            }
            if ((localObject1 != null) && (paramMethodCall != null))
            {
              paramMethodCall = k0.d(paramMethodCall);
              paramMethodCall.getClass();
              localObject1 = new y2.c(paramMethodCall, (String)localObject1);
              d.d((Runnable)localObject1);
            }
            paramResult.success(null);
          }
          break;
        case 3237136: 
          if (((String)localObject1).equals("init")) {
            a();
          }
          break;
        case -759238347: 
          if (((String)localObject1).equals("clearCache"))
          {
            paramMethodCall = c;
            if (paramMethodCall != null) {
              paramMethodCall = a;
            } else {
              paramMethodCall = null;
            }
            if (paramMethodCall != null) {}
            try
            {
              localObject1 = new java/io/File;
              ((File)localObject1).<init>(paramMethodCall.getCacheDir(), "betterPlayerCache");
              b.a.a((File)localObject1);
              paramResult.success(null);
            }
            catch (Exception paramMethodCall)
            {
              Log.e("BetterPlayer", paramMethodCall.toString());
              paramResult.error("", "", "");
            }
          }
          break;
        case -1321125217: 
          if (((String)localObject1).equals("preCache"))
          {
            paramMethodCall = (Map)paramMethodCall.argument("dataSource");
            if (paramMethodCall == null) {
              break label3381;
            }
            localObject2 = (Number)b(paramMethodCall, "maxCacheSize", Integer.valueOf(104857600));
            localObject1 = (Number)b(paramMethodCall, "maxCacheFileSize", Integer.valueOf(10485760));
            l1 = ((Number)localObject2).longValue();
            l2 = ((Number)localObject1).longValue();
            l3 = ((Number)b(paramMethodCall, "preCacheSize", Integer.valueOf(3145728))).longValue();
            localObject1 = (String)b(paramMethodCall, "uri", "");
            localObject3 = (String)b(paramMethodCall, "cacheKey", null);
            localObject2 = (Map)b(paramMethodCall, "headers", new HashMap());
            paramMethodCall = c;
            if (paramMethodCall != null) {
              paramMethodCall = a;
            } else {
              paramMethodCall = null;
            }
            ec.i.e(localObject2, "headers");
            localObject4 = new HashMap();
            ((HashMap)localObject4).put("url", localObject1);
            ((HashMap)localObject4).put("preCacheSize", Long.valueOf(l3));
            ((HashMap)localObject4).put("maxCacheSize", Long.valueOf(l1));
            ((HashMap)localObject4).put("maxCacheFileSize", Long.valueOf(l2));
            if (localObject3 != null) {
              ((HashMap)localObject4).put("cacheKey", localObject3);
            }
            localObject3 = ((Map)localObject2).keySet().iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localObject5 = (String)((Iterator)localObject3).next();
              ((HashMap)localObject4).put(g.d("header_", (String)localObject5), (String)((Map)localObject2).get(localObject5));
            }
            if ((localObject1 != null) && (paramMethodCall != null))
            {
              localObject2 = new l.a(CacheWorker.class);
              d.add(localObject1);
              localObject1 = new androidx.work.c((HashMap)localObject4);
              androidx.work.c.e((androidx.work.c)localObject1);
              c.e = ((androidx.work.c)localObject1);
              localObject1 = ((q.a)localObject2).a();
              ec.i.d(localObject1, "build(...)");
              localObject1 = (l)localObject1;
              k0.d(paramMethodCall).a((o2.q)localObject1);
            }
            paramResult.success(null);
          }
          break;
        case -1352294148: 
          if (((String)localObject1).equals("create"))
          {
            localObject1 = c;
            ec.i.b(localObject1);
            localObject1 = e;
            ec.i.b(localObject1);
            localObject3 = ((TextureRegistry)localObject1).createSurfaceTexture();
            ec.i.d(localObject3, "createSurfaceTexture(...)");
            localObject1 = c;
            if (localObject1 != null) {
              localObject1 = b;
            } else {
              localObject1 = null;
            }
            localObject4 = f.l("better_player_channel/videoEvents");
            ((StringBuilder)localObject4).append(((TextureRegistry.TextureEntry)localObject3).id());
            localObject4 = new EventChannel((BinaryMessenger)localObject1, ((StringBuilder)localObject4).toString());
            if ((paramMethodCall.hasArgument("minBufferMs")) && (paramMethodCall.hasArgument("maxBufferMs")) && (paramMethodCall.hasArgument("bufferForPlaybackMs")) && (paramMethodCall.hasArgument("bufferForPlaybackAfterRebufferMs"))) {
              paramMethodCall = new i((Integer)paramMethodCall.argument("minBufferMs"), (Integer)paramMethodCall.argument("maxBufferMs"), (Integer)paramMethodCall.argument("bufferForPlaybackMs"), (Integer)paramMethodCall.argument("bufferForPlaybackAfterRebufferMs"));
            } else {
              paramMethodCall = null;
            }
            localObject5 = c;
            localObject1 = localObject2;
            if (localObject5 != null) {
              localObject1 = a;
            }
            ec.i.b(localObject1);
            paramMethodCall = new b((Context)localObject1, (EventChannel)localObject4, (TextureRegistry.SurfaceTextureEntry)localObject3, paramMethodCall, paramResult);
            a.put(((TextureRegistry.TextureEntry)localObject3).id(), paramMethodCall);
          }
          break;
        }
      }
      localObject1 = (Number)paramMethodCall.argument("textureId");
      ec.i.b(localObject1);
      long l1 = ((Number)localObject1).longValue();
      b localb = (b)a.get(l1);
      if (localb == null)
      {
        paramResult.error("Unknown textureId", a0.j.i("No video player associated with texture id ", l1), null);
        return;
      }
      localObject1 = method;
      if (localObject1 != null)
      {
        int i = ((String)localObject1).hashCode();
        l3 = 0L;
        int k;
        boolean bool1;
        switch (i)
        {
        default: 
          break;
        case 2015518999: 
          if (!((String)localObject1).equals("setAudioTrack")) {
            break label3375;
          }
          localObject2 = (String)paramMethodCall.argument("name");
          paramMethodCall = (Integer)paramMethodCall.argument("index");
          if ((localObject2 != null) && (paramMethodCall != null))
          {
            int j = paramMethodCall.intValue();
            try
            {
              paramMethodCall = e.c;
              if (paramMethodCall != null)
              {
                i = a;
                k = 0;
                for (;;)
                {
                  if (k < i)
                  {
                    if (b[k] == 1)
                    {
                      localObject3 = c[k];
                      ec.i.d(localObject3, "getTrackGroups(...)");
                      int m = a;
                      int n = 0;
                      int i1 = 0;
                      for (int i2 = 0; n < m; i2 = i5)
                      {
                        localObject1 = ((j0)localObject3).a(n);
                        int i3 = a;
                        int i4 = 0;
                        i5 = i2;
                        i6 = i1;
                        i2 = m;
                        i1 = i4;
                        while (i1 < i3)
                        {
                          localObject4 = d[i1];
                          ec.i.d(localObject4, "getFormat(...)");
                          if (b == null) {
                            i6 = 1;
                          }
                          localObject4 = a;
                          m = i5;
                          if (localObject4 != null)
                          {
                            m = i5;
                            if (ec.i.a(localObject4, "1/15")) {
                              m = 1;
                            }
                          }
                          i1++;
                          i5 = m;
                        }
                        n++;
                        m = i2;
                        i1 = i6;
                      }
                      localObject1 = paramMethodCall;
                      n = i;
                      int i6 = a;
                      for (int i5 = 0;; i5++)
                      {
                        paramMethodCall = (MethodCall)localObject1;
                        i = n;
                        if (i5 >= i6) {
                          break;
                        }
                        paramMethodCall = ((j0)localObject3).a(i5);
                        m = a;
                        for (i = 0; i < m; i++)
                        {
                          localObject4 = d[i].b;
                          if (((ec.i.a(localObject2, localObject4)) && (j == i5)) || ((i2 == 0) && (i1 != 0) && (j == i5)) || ((i2 != 0) && (ec.i.a(localObject2, localObject4))))
                          {
                            localb.e();
                            break label3212;
                          }
                        }
                      }
                    }
                    k++;
                    continue;
                    if (((String)localObject1).equals("absolutePosition")) {
                      break;
                    }
                  }
                }
              }
            }
            catch (Exception paramMethodCall)
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("setAudioTrack failed");
              ((StringBuilder)localObject1).append(paramMethodCall);
              Log.e("BetterPlayer", ((StringBuilder)localObject1).toString());
            }
          }
        case 1809884096: 
          break label3375;
          paramMethodCall = c;
          if (paramMethodCall != null) {
            paramMethodCall = paramMethodCall.J();
          } else {
            paramMethodCall = null;
          }
          if ((paramMethodCall != null) && (!paramMethodCall.p()))
          {
            l1 = m0r1.cf;
            paramMethodCall = c;
            if (paramMethodCall != null) {
              l3 = paramMethodCall.P();
            }
            l3 = l1 + l3;
          }
          else
          {
            paramMethodCall = c;
            if (paramMethodCall != null) {
              l3 = paramMethodCall.P();
            }
          }
          paramMethodCall = Long.valueOf(l3);
          break;
        case 1748853351: 
          if (!((String)localObject1).equals("setDataSource")) {
            break label3375;
          }
          paramMethodCall = paramMethodCall.argument("dataSource");
          ec.i.b(paramMethodCall);
          localObject3 = (Map)paramMethodCall;
          paramMethodCall = b;
          localObject1 = c(localb);
          ec.i.b(localObject1);
          paramMethodCall.put(((Long)localObject1).longValue(), localObject3);
          String str1 = (String)b((Map)localObject3, "key", "");
          Map localMap = (Map)b((Map)localObject3, "headers", new HashMap());
          localObject1 = Integer.valueOf(0);
          Number localNumber = (Number)b((Map)localObject3, "overriddenDuration", (Serializable)localObject1);
          long l4;
          String str2;
          Context localContext;
          if (((Map)localObject3).get("asset") != null)
          {
            paramMethodCall = (String)b((Map)localObject3, "asset", "");
            if (((Map)localObject3).get("package") != null)
            {
              localObject2 = (String)b((Map)localObject3, "package", "");
              localObject1 = c;
              ec.i.b(localObject1);
              localObject1 = d.a(paramMethodCall, (String)localObject2);
            }
            else
            {
              localObject1 = c;
              ec.i.b(localObject1);
              localObject1 = c.a(paramMethodCall);
            }
            paramMethodCall = c;
            if (paramMethodCall != null) {
              paramMethodCall = a;
            } else {
              paramMethodCall = null;
            }
            ec.i.b(paramMethodCall);
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("asset:///");
            ((StringBuilder)localObject2).append((String)localObject1);
            localObject4 = ((StringBuilder)localObject2).toString();
            l4 = localNumber.longValue();
            localObject3 = null;
            str2 = null;
            localObject5 = null;
            l1 = 0L;
            localContext = null;
            localObject2 = null;
            bool1 = false;
            localObject1 = paramMethodCall;
            paramMethodCall = localContext;
            l2 = l3;
          }
          else
          {
            bool1 = ((Boolean)b((Map)localObject3, "useCache", Boolean.FALSE)).booleanValue();
            paramMethodCall = (Number)b((Map)localObject3, "maxCacheSize", (Serializable)localObject1);
            localObject1 = (Number)b((Map)localObject3, "maxCacheFileSize", (Serializable)localObject1);
            l2 = paramMethodCall.longValue();
            l3 = ((Number)localObject1).longValue();
            localObject1 = (String)b((Map)localObject3, "uri", "");
            str2 = (String)b((Map)localObject3, "cacheKey", null);
            paramMethodCall = (String)b((Map)localObject3, "formatHint", null);
            localObject2 = (String)b((Map)localObject3, "licenseUrl", null);
            localObject5 = (String)b((Map)localObject3, "clearKey", null);
            localObject3 = (Map)b((Map)localObject3, "drmHeaders", new HashMap());
            localObject4 = c;
            ec.i.b(localObject4);
            localContext = a;
            l4 = localNumber.longValue();
            l1 = l3;
            localObject4 = localObject1;
            localObject1 = localContext;
          }
          localb.f((Context)localObject1, str1, (String)localObject4, paramMethodCall, paramResult, localMap, bool1, l2, l1, l4, (String)localObject2, (Map)localObject3, str2, (String)localObject5);
          break;
        case 1671767583: 
          if (!((String)localObject1).equals("dispose")) {
            break label3375;
          }
          localb.a();
          a.remove(l1);
          b.remove(l1);
          paramMethodCall = o;
          if (paramMethodCall != null)
          {
            paramMethodCall.removeCallbacksAndMessages(null);
            o = null;
          }
          p = null;
          break;
        case 1404354821: 
          if (!((String)localObject1).equals("setSpeed")) {
            break label3375;
          }
          paramMethodCall = paramMethodCall.argument("speed");
          ec.i.b(paramMethodCall);
          paramMethodCall = new e1((float)((Number)paramMethodCall).doubleValue());
          localObject1 = c;
          if (localObject1 != null) {
            ((d0)localObject1).c(paramMethodCall);
          }
          break;
        case 869456835: 
          if (!((String)localObject1).equals("disablePictureInPicture")) {
            break label3375;
          }
          paramMethodCall = o;
          if (paramMethodCall != null)
          {
            paramMethodCall.removeCallbacksAndMessages(null);
            o = null;
          }
          p = null;
          paramMethodCall = f;
          ec.i.b(paramMethodCall);
          paramMethodCall.moveTaskToBack(false);
          localb.c(false);
          paramMethodCall = n;
          if (paramMethodCall != null) {
            paramMethodCall.d();
          }
          n = null;
          break;
        case 747804969: 
          if (!((String)localObject1).equals("position")) {
            break label3375;
          }
          paramMethodCall = c;
          if (paramMethodCall != null) {
            l3 = paramMethodCall.P();
          }
          paramResult.success(Long.valueOf(l3));
          localb.d(false);
          break;
        case 670514716: 
          if (!((String)localObject1).equals("setVolume")) {
            break label3375;
          }
          paramMethodCall = paramMethodCall.argument("volume");
          ec.i.b(paramMethodCall);
          float f1 = (float)Math.max(0.0D, Math.min(1.0D, ((Number)paramMethodCall).doubleValue()));
          paramMethodCall = c;
          if (paramMethodCall != null) {
            paramMethodCall.o0(f1);
          }
          break;
        case 106440182: 
          if (!((String)localObject1).equals("pause")) {
            break label3375;
          }
          paramMethodCall = c;
          if (paramMethodCall != null) {
            paramMethodCall.m0(false);
          }
          break;
        case 3443508: 
          i = 0;
          if (!((String)localObject1).equals("play")) {
            break label3375;
          }
          try
          {
            localObject2 = c(localb);
            if (localObject2 != null)
            {
              paramMethodCall = (Map)b.get(((Long)localObject2).longValue());
              l3 = d;
              if (((Long)localObject2).longValue() == l3)
              {
                localObject1 = e;
                if ((localObject1 != null) && (paramMethodCall != null) && (localObject1 == paramMethodCall)) {}
              }
              else
              {
                e = paramMethodCall;
                d = ((Long)localObject2).longValue();
                k = a.size();
                while (i < k)
                {
                  ((b)a.valueAt(i)).b();
                  i++;
                }
                if (((Boolean)b(paramMethodCall, "showNotification", Boolean.FALSE)).booleanValue())
                {
                  localObject2 = (String)b(paramMethodCall, "title", "");
                  localObject4 = (String)b(paramMethodCall, "author", "");
                  localObject1 = (String)b(paramMethodCall, "imageUrl", "");
                  localObject3 = (String)b(paramMethodCall, "notificationChannelName", null);
                  localObject5 = (String)b(paramMethodCall, "activityName", "MainActivity");
                  paramMethodCall = c;
                  if (paramMethodCall != null) {
                    paramMethodCall = a;
                  } else {
                    paramMethodCall = null;
                  }
                  ec.i.b(paramMethodCall);
                  localb.i(paramMethodCall, (String)localObject2, (String)localObject4, (String)localObject1, (String)localObject3, (String)localObject5);
                }
              }
            }
          }
          catch (Exception paramMethodCall)
          {
            Log.e("BetterPlayerPlugin", "SetupNotification failed", paramMethodCall);
          }
          paramMethodCall = c;
          if (paramMethodCall != null) {
            paramMethodCall.m0(true);
          }
          break;
        case -547403682: 
          if (!((String)localObject1).equals("enablePictureInPicture")) {
            break label3375;
          }
          i = Build.VERSION.SDK_INT;
          if (i >= 26)
          {
            paramMethodCall = c;
            ec.i.b(paramMethodCall);
            localb.h(a);
            paramMethodCall = f;
            ec.i.b(paramMethodCall);
            paramMethodCall.enterPictureInPictureMode(new PictureInPictureParams.Builder().build());
            if (i >= 24)
            {
              localObject1 = new Handler(Looper.getMainLooper());
              o = ((Handler)localObject1);
              paramMethodCall = new q0(18, this, localb);
              p = paramMethodCall;
              ((Handler)localObject1).post(paramMethodCall);
            }
            localb.c(true);
          }
          break;
        case -651597783: 
          boolean bool2 = false;
          if (!((String)localObject1).equals("isPictureInPictureSupported")) {
            break label3375;
          }
          bool1 = bool2;
          if (Build.VERSION.SDK_INT >= 26)
          {
            paramMethodCall = f;
            bool1 = bool2;
            if (paramMethodCall != null)
            {
              bool1 = bool2;
              if (paramMethodCall.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                bool1 = true;
              }
            }
          }
          paramMethodCall = Boolean.valueOf(bool1);
          break;
        case -906224877: 
          if (!((String)localObject1).equals("seekTo")) {
            break label3375;
          }
          paramMethodCall = (Number)paramMethodCall.argument("location");
          ec.i.b(paramMethodCall);
          i = paramMethodCall.intValue();
          paramMethodCall = c;
          if (paramMethodCall != null) {
            paramMethodCall.T(5, i);
          }
          break;
        case -971364356: 
          i = 0;
          if (!((String)localObject1).equals("setLooping")) {
            break label3375;
          }
          paramMethodCall = paramMethodCall.argument("looping");
          ec.i.b(paramMethodCall);
          bool1 = ((Boolean)paramMethodCall).booleanValue();
          paramMethodCall = c;
          if (paramMethodCall != null)
          {
            if (bool1) {
              i = 2;
            }
            paramMethodCall.u(i);
          }
          paramMethodCall = null;
          paramResult.success(paramMethodCall);
          break;
        case -1022740989: 
          label3212:
          if (!((String)localObject1).equals("setMixWithOthers")) {
            break label3375;
          }
          paramMethodCall = (Boolean)paramMethodCall.argument("mixWithOthers");
          if (paramMethodCall == null) {
            break label3381;
          }
          bool1 = paramMethodCall.booleanValue();
          paramMethodCall = c;
          if (paramMethodCall == null) {
            break label3381;
          }
          paramMethodCall.u0();
          paramMethodCall.k0(new d(3, 0, 1, 1, 0), bool1 ^ true);
          break;
        }
        if (((String)localObject1).equals("setTrackParameters"))
        {
          paramResult = paramMethodCall.argument("width");
          ec.i.b(paramResult);
          ((Number)paramResult).intValue();
          paramResult = paramMethodCall.argument("height");
          ec.i.b(paramResult);
          ((Number)paramResult).intValue();
          paramMethodCall = paramMethodCall.argument("bitrate");
          ec.i.b(paramMethodCall);
          ((Number)paramMethodCall).intValue();
          localb.g();
          throw null;
        }
      }
      label3375:
      paramResult.notImplemented();
      label3381:
      return;
    }
    paramResult.error("no_activity", "better_player plugin requires a foreground activity", null);
  }
  
  public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    ec.i.e(paramActivityPluginBinding, "binding");
  }
  
  public static final class a
  {
    public final Context a;
    public final BinaryMessenger b;
    public final g.c c;
    public final g.b d;
    public final TextureRegistry e;
    public final MethodChannel f;
    
    public a(Context paramContext, BinaryMessenger paramBinaryMessenger, g.d paramd, g.e parame, TextureRegistry paramTextureRegistry)
    {
      a = paramContext;
      b = paramBinaryMessenger;
      c = paramd;
      d = parame;
      e = paramTextureRegistry;
      f = new MethodChannel(paramBinaryMessenger, "better_player_channel");
    }
  }
  
  public static abstract interface b
  {
    public abstract String a(String paramString1, String paramString2);
  }
  
  public static abstract interface c
  {
    public abstract String a(String paramString);
  }
  
  public static final class d
    implements g.c
  {
    public d(FlutterLoader paramFlutterLoader) {}
    
    public final String a(String paramString)
    {
      FlutterLoader localFlutterLoader = a;
      ec.i.b(paramString);
      paramString = localFlutterLoader.getLookupKeyForAsset(paramString);
      ec.i.d(paramString, "getLookupKeyForAsset(...)");
      return paramString;
    }
  }
  
  public static final class e
    implements g.b
  {
    public e(FlutterLoader paramFlutterLoader) {}
    
    public final String a(String paramString1, String paramString2)
    {
      FlutterLoader localFlutterLoader = a;
      ec.i.b(paramString1);
      ec.i.b(paramString2);
      paramString1 = localFlutterLoader.getLookupKeyForAsset(paramString1, paramString2);
      ec.i.d(paramString1, "getLookupKeyForAsset(...)");
      return paramString1;
    }
  }
}

/* Location:
 * Qualified Name:     pa.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */