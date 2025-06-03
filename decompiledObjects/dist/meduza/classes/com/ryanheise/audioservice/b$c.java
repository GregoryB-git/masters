package com.ryanheise.audioservice;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes.Builder;
import android.media.AudioTrack;
import android.media.session.MediaSession;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.c;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.PlaybackStateCompat.CustomAction;
import android.text.TextUtils;
import g1.c;
import g1.c.e;
import g1.h;
import g1.y;
import g1.y.a;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import q0.g;
import ta.e;
import ta.f;
import u.n;

public final class b$c
  implements MethodChannel.MethodCallHandler, AudioService.c
{
  public BinaryMessenger a;
  public MethodChannel b;
  public AudioTrack c;
  public final Handler d = new Handler(Looper.getMainLooper());
  public LinkedList e = new LinkedList();
  
  public b$c(BinaryMessenger paramBinaryMessenger)
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

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */