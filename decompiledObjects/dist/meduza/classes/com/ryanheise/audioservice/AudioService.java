package com.ryanheise.audioservice;

import aa.w;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.MediaMetadataCompat.b;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.MediaSessionCompat.a;
import android.support.v4.media.session.MediaSessionCompat.c;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.LruCache;
import android.util.Size;
import android.view.KeyEvent;
import b.m;
import g1.c.b;
import g1.c.e;
import g1.c.f;
import g1.c.i;
import g1.c.n;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import q0.g;
import u.n;
import u.q;
import u.s;

public class AudioService
  extends g1.c
{
  public static AudioService F;
  public static PendingIntent G;
  public static c H;
  public static List<MediaSessionCompat.QueueItem> I = new ArrayList();
  public static final HashMap J = new HashMap();
  public boolean A = false;
  public int B = 1;
  public boolean C;
  public final Handler D = new Handler(Looper.getMainLooper());
  public a E;
  public ta.a p;
  public PowerManager.WakeLock q;
  public MediaSessionCompat r;
  public List<ta.f> s = new ArrayList();
  public ArrayList t = new ArrayList();
  public ArrayList u = new ArrayList();
  public int[] v;
  public MediaMetadataCompat w;
  public Bitmap x;
  public String y;
  public a z;
  
  public final c.b b(Bundle paramBundle)
  {
    Object localObject1 = null;
    if (paramBundle == null) {
      paramBundle = null;
    } else {
      paramBundle = Boolean.valueOf(paramBundle.getBoolean("android.service.media.extra.RECENT"));
    }
    Object localObject2 = paramBundle;
    if (paramBundle == null) {
      localObject2 = Boolean.FALSE;
    }
    paramBundle = p;
    if (o == null) {
      paramBundle = (Bundle)localObject1;
    } else {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(o);
        paramBundle = new android/os/Bundle;
        paramBundle.<init>();
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          try
          {
            paramBundle.putInt(str, localJSONObject.getInt(str));
          }
          catch (Exception localException1)
          {
            try
            {
              paramBundle.putBoolean(str, localJSONObject.getBoolean(str));
            }
            catch (Exception localException2)
            {
              try
              {
                paramBundle.putDouble(str, localJSONObject.getDouble(str));
              }
              catch (Exception localException3)
              {
                try
                {
                  paramBundle.putString(str, localJSONObject.getString(str));
                }
                catch (Exception localException4)
                {
                  PrintStream localPrintStream = System.out;
                  StringBuilder localStringBuilder = new java/lang/StringBuilder;
                  localStringBuilder.<init>();
                  localStringBuilder.append("Unsupported extras value for key ");
                  localStringBuilder.append(str);
                  localPrintStream.println(localStringBuilder.toString());
                }
              }
            }
          }
        }
      }
      catch (Exception paramBundle)
      {
        paramBundle.printStackTrace();
        paramBundle = (Bundle)localObject1;
      }
    }
    if (((Boolean)localObject2).booleanValue()) {
      localObject2 = "recent";
    } else {
      localObject2 = "root";
    }
    return new c.b(paramBundle, (String)localObject2);
  }
  
  public final void c(Bundle paramBundle, c.i parami, String paramString)
  {
    if (H == null)
    {
      parami.f(new ArrayList());
      return;
    }
    if (b.q != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("parentMediaId", paramString);
      localHashMap.put("options", b.e(paramBundle));
      b.q.a("getChildren", localHashMap, new c(parami));
    }
    parami.a();
  }
  
  public final void d(String paramString, c.i<List<MediaBrowserCompat.MediaItem>> parami)
  {
    c(null, parami, paramString);
  }
  
  public final void e(String paramString, c.i<MediaBrowserCompat.MediaItem> parami)
  {
    if (H == null)
    {
      parami.f(null);
      return;
    }
    if (b.q != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("mediaId", paramString);
      b.q.a("getMediaItem", localHashMap, new d(parami));
    }
    parami.a();
  }
  
  public final void f(Bundle paramBundle, g1.e parame, String paramString)
  {
    if (H == null)
    {
      parame.f(new ArrayList());
      return;
    }
    if (b.q != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("query", paramString);
      localHashMap.put("extras", b.e(paramBundle));
      b.q.a("search", localHashMap, new e(parame));
    }
    parame.a();
  }
  
  public final PendingIntent h(long paramLong)
  {
    boolean bool1 = paramLong < 4L;
    int i;
    if (!bool1)
    {
      i = 91;
    }
    else
    {
      boolean bool2 = paramLong < 2L;
      if (!bool2) {
        i = 130;
      } else if (i == 0) {
        i = 126;
      } else if (!bool2) {
        i = 127;
      } else if (paramLong == 32L) {
        i = 87;
      } else if (paramLong == 16L) {
        i = 88;
      } else if (paramLong == 1L) {
        i = 86;
      } else if (paramLong == 64L) {
        i = 90;
      } else if (paramLong == 8L) {
        i = 89;
      } else if (paramLong == 512L) {
        i = 85;
      } else {
        i = 0;
      }
    }
    if (i == 0) {
      return null;
    }
    Intent localIntent = new Intent(this, MediaButtonReceiver.class);
    localIntent.setAction("android.intent.action.MEDIA_BUTTON");
    localIntent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
    return PendingIntent.getBroadcast(this, i, localIntent, 67108864);
  }
  
  public final Notification i()
  {
    Object localObject1 = v;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      int i = Math.min(3, t.size());
      localObject2 = new int[i];
      for (j = 0; j < i; j++) {
        localObject2[j] = j;
      }
    }
    if (Build.VERSION.SDK_INT >= 26)
    {
      localObject1 = (NotificationManager)getSystemService("notification");
      if (((NotificationManager)localObject1).getNotificationChannel(y) == null)
      {
        localObject3 = new NotificationChannel(y, p.d, 2);
        ((NotificationChannel)localObject3).setShowBadge(p.h);
        localObject4 = p.e;
        if (localObject4 != null) {
          ((NotificationChannel)localObject3).setDescription((String)localObject4);
        }
        ((NotificationManager)localObject1).createNotificationChannel((NotificationChannel)localObject3);
      }
    }
    localObject1 = new q(this, y);
    x = 1;
    k = false;
    Object localObject4 = new Intent(this, MediaButtonReceiver.class);
    ((Intent)localObject4).setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
    localObject4 = PendingIntent.getBroadcast(this, 0, (Intent)localObject4, 67108864);
    B.deleteIntent = ((PendingIntent)localObject4);
    int j = k(p.g);
    B.icon = j;
    localObject4 = w;
    if (localObject4 != null)
    {
      localObject4 = ((MediaMetadataCompat)localObject4).a();
      localObject3 = b;
      if (localObject3 != null) {
        e = q.b((CharSequence)localObject3);
      }
      localObject3 = c;
      if (localObject3 != null) {
        ((q)localObject1).c((CharSequence)localObject3);
      }
      localObject4 = d;
      if (localObject4 != null) {
        n = q.b((CharSequence)localObject4);
      }
      try
      {
        localObject4 = x;
        if (localObject4 != null) {
          ((q)localObject1).e((Bitmap)localObject4);
        }
      }
      finally {}
    }
    if (p.i) {
      g = r.b.a.a.getSessionActivity();
    }
    j = p.f;
    if (j != -1) {
      w = j;
    }
    Object localObject3 = t.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (n)((Iterator)localObject3).next();
      if (localObject4 != null) {
        b.add(localObject4);
      }
    }
    localObject4 = new h1.b();
    c = r.a.b;
    if (Build.VERSION.SDK_INT < 33) {
      b = arrayOfInt;
    }
    if (p.j)
    {
      h(1L);
      ((q)localObject1).d(2, true);
    }
    ((q)localObject1).g((s)localObject4);
    return ((q)localObject1).a();
  }
  
  public final void j(ta.a parama)
  {
    p = parama;
    Object localObject = c;
    if (localObject == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(getApplication().getPackageName());
      ((StringBuilder)localObject).append(".channel");
      localObject = ((StringBuilder)localObject).toString();
    }
    y = ((String)localObject);
    if (n != null)
    {
      Context localContext = getApplicationContext();
      localObject = new Intent(null);
      ((Intent)localObject).setComponent(new ComponentName(localContext, n));
      ((Intent)localObject).setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
      G = PendingIntent.getActivity(localContext, 1000, (Intent)localObject, 201326592);
    }
    else
    {
      G = null;
    }
    if (!b) {
      r.a.a.setMediaButtonReceiver(null);
    }
  }
  
  public final int k(String paramString)
  {
    Object localObject = paramString.split("/");
    paramString = localObject[0];
    localObject = localObject[1];
    return getResources().getIdentifier((String)localObject, paramString, getApplicationContext().getPackageName());
  }
  
  public final Bitmap l(String paramString1, String paramString2)
  {
    Object localObject1 = (Bitmap)z.get(paramString1);
    if (localObject1 != null) {
      return (Bitmap)localObject1;
    }
    for (;;)
    {
      try
      {
        localUri = Uri.parse(paramString1);
        bool = "content".equals(localUri.getScheme());
        localObject2 = localObject1;
        if (bool) {
          if (paramString2 == null) {}
        }
      }
      catch (Exception paramString1)
      {
        Uri localUri;
        boolean bool;
        Object localObject2;
        int i;
        int j;
        int k;
        int m;
        int n;
        int i1;
        paramString1.printStackTrace();
        return null;
      }
      try
      {
        if (Build.VERSION.SDK_INT >= 29)
        {
          paramString2 = new android/util/Size;
          paramString2.<init>(192, 192);
          localObject2 = getContentResolver();
          localObject1 = new android/util/Size;
          i = p.l;
          j = i;
          if (i == -1) {
            j = paramString2.getWidth();
          }
          k = p.m;
          i = k;
          if (k == -1) {
            i = paramString2.getHeight();
          }
          ((Size)localObject1).<init>(j, i);
          paramString2 = w.d((ContentResolver)localObject2, localUri, (Size)localObject1);
          localObject2 = paramString2;
          if (paramString2 != null) {
            continue;
          }
          return null;
        }
        paramString2 = getContentResolver().openFileDescriptor(localUri, "r");
        if (paramString2 != null)
        {
          localObject2 = paramString2.getFileDescriptor();
          paramString2 = (String)localObject1;
          localObject1 = localObject2;
        }
      }
      catch (FileNotFoundException|IOException paramString1) {}
    }
    return null;
    localObject1 = null;
    paramString2 = (String)localObject2;
    if ((!bool) || (localObject1 != null))
    {
      if (p.l != -1)
      {
        localObject2 = new android/graphics/BitmapFactory$Options;
        ((BitmapFactory.Options)localObject2).<init>();
        i = 1;
        j = 1;
        inJustDecodeBounds = true;
        if (localObject1 != null) {
          BitmapFactory.decodeFileDescriptor((FileDescriptor)localObject1, null, (BitmapFactory.Options)localObject2);
        } else {
          BitmapFactory.decodeFile(localUri.getPath(), (BitmapFactory.Options)localObject2);
        }
        paramString2 = p;
        m = l;
        k = m;
        n = outHeight;
        i1 = outWidth;
        if ((n > k) || (i1 > m))
        {
          n /= 2;
          i1 /= 2;
          for (;;)
          {
            i = j;
            if (n / j < k) {
              break;
            }
            i = j;
            if (i1 / j < m) {
              break;
            }
            j *= 2;
          }
        }
        inSampleSize = i;
        inJustDecodeBounds = false;
        if (localObject1 != null) {}
        for (paramString2 = BitmapFactory.decodeFileDescriptor((FileDescriptor)localObject1, null, (BitmapFactory.Options)localObject2);; paramString2 = BitmapFactory.decodeFile(localUri.getPath(), (BitmapFactory.Options)localObject2)) {
          break;
        }
      }
      if (localObject1 != null) {
        paramString2 = BitmapFactory.decodeFileDescriptor((FileDescriptor)localObject1);
      } else {
        paramString2 = BitmapFactory.decodeFile(localUri.getPath());
      }
    }
    z.put(paramString1, paramString2);
    return paramString2;
  }
  
  public final MediaMetadataCompat m(MediaMetadataCompat paramMediaMetadataCompat)
  {
    paramMediaMetadataCompat = new MediaMetadataCompat.b(paramMediaMetadataCompat);
    paramMediaMetadataCompat.a(x, "android.media.metadata.ALBUM_ART");
    paramMediaMetadataCompat.a(x, "android.media.metadata.DISPLAY_ICON");
    return new MediaMetadataCompat(a);
  }
  
  public final void n(MediaMetadataCompat paramMediaMetadataCompat)
  {
    try
    {
      Object localObject = paramMediaMetadataCompat.b("artCacheFile");
      if (localObject != null) {}
      for (localObject = l((String)localObject, null);; localObject = l((String)localObject, paramMediaMetadataCompat.b("loadThumbnailUri")))
      {
        x = ((Bitmap)localObject);
        break;
        localObject = paramMediaMetadataCompat.b("android.media.metadata.DISPLAY_ICON_URI");
        if ((localObject == null) || (!((String)localObject).startsWith("content:"))) {
          break label76;
        }
      }
      paramMediaMetadataCompat = m(paramMediaMetadataCompat);
      break label81;
      label76:
      x = null;
      label81:
      w = paramMediaMetadataCompat;
      r.g(paramMediaMetadataCompat);
      D.removeCallbacksAndMessages(null);
      paramMediaMetadataCompat = D;
      localObject = new b/m;
      ((m)localObject).<init>(this, 20);
      paramMediaMetadataCompat.post((Runnable)localObject);
      return;
    }
    finally {}
  }
  
  public final void onCreate()
  {
    super.onCreate();
    F = this;
    C = false;
    A = false;
    B = 1;
    r = new MediaSessionCompat(this, "media-session", null);
    j(new ta.a(getApplicationContext()));
    r.a.a.setFlags(7);
    Object localObject = new ArrayList();
    r.h(new PlaybackStateCompat(0, 0L, 0L, 0.0F, 3669711L, 0, null, 0L, (ArrayList)localObject, -1L, null));
    r.f(new b(), null);
    localObject = r.a.b;
    if (localObject != null)
    {
      if (f == null)
      {
        f = ((MediaSessionCompat.Token)localObject);
        c.f localf = a;
        d.e.a(new g1.f(localf, (MediaSessionCompat.Token)localObject));
        r.i(I);
        q = ((PowerManager)getSystemService("power")).newWakeLock(1, AudioService.class.getName());
        z = new a((int)(Runtime.getRuntime().maxMemory() / 1024L) / 8);
        return;
      }
      throw new IllegalStateException("The session token has already been set");
    }
    throw new IllegalArgumentException("Session token may not be null");
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    if (H != null)
    {
      Object localObject1 = b.o;
      try
      {
        localObject1 = b.o.iterator();
        while (((Iterator)localObject1).hasNext()) {
          if (nextb != null) {
            break label78;
          }
        }
        localObject1 = FlutterEngineCache.getInstance().get("audio_service_engine");
        if (localObject1 != null)
        {
          ((FlutterEngine)localObject1).destroy();
          FlutterEngineCache.getInstance().remove("audio_service_engine");
        }
        label78:
        H = null;
      }
      finally {}
    }
    w = null;
    x = null;
    I.clear();
    J.clear();
    s.clear();
    z.evictAll();
    v = null;
    MediaSessionCompat localMediaSessionCompat = r;
    if (localMediaSessionCompat != null)
    {
      if (localMediaSessionCompat.c()) {
        r.e(false);
      }
      ((NotificationManager)getSystemService("notification")).cancel(1124);
      r.d();
      r = null;
    }
    int i = p.b ^ true;
    if (Build.VERSION.SDK_INT >= 24) {
      stopForeground(i);
    } else {
      stopForeground(i);
    }
    if (q.isHeld()) {
      q.release();
    }
    F = null;
    C = false;
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    Object localObject = r;
    paramInt1 = i1.a.a;
    if ((localObject != null) && (paramIntent != null) && ("android.intent.action.MEDIA_BUTTON".equals(paramIntent.getAction())) && (paramIntent.hasExtra("android.intent.extra.KEY_EVENT")))
    {
      paramIntent = (KeyEvent)paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
      localObject = b;
      if (paramIntent != null)
      {
        a.a.dispatchMediaButtonEvent(paramIntent);
      }
      else
      {
        localObject.getClass();
        throw new IllegalArgumentException("KeyEvent may not be null");
      }
    }
    return 2;
  }
  
  public final void onTaskRemoved(Intent paramIntent)
  {
    c localc = H;
    if (localc != null) {
      ((b.c)localc).a("onTaskRemoved", b.k(new Object[0]), null);
    }
    super.onTaskRemoved(paramIntent);
  }
  
  public final class a
    extends LruCache<String, Bitmap>
  {
    public a()
    {
      super();
    }
    
    public final int sizeOf(Object paramObject1, Object paramObject2)
    {
      paramObject1 = (String)paramObject1;
      return ((Bitmap)paramObject2).getByteCount() / 1024;
    }
  }
  
  public final class b
    extends MediaSessionCompat.a
  {
    public b() {}
    
    public final void A0(int paramInt)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("setShuffleMode", b.k(new Object[] { "shuffleMode", Integer.valueOf(paramInt) }), null);
    }
    
    public final void B0()
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("skipToNext", b.k(new Object[0]), null);
    }
    
    public final void C0()
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("skipToPrevious", b.k(new Object[0]), null);
    }
    
    public final void D0(long paramLong)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("skipToQueueItem", b.k(new Object[] { "index", Long.valueOf(paramLong) }), null);
    }
    
    public final void E(MediaDescriptionCompat paramMediaDescriptionCompat)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      paramMediaDescriptionCompat = a;
      paramMediaDescriptionCompat = (MediaMetadataCompat)AudioService.J.get(paramMediaDescriptionCompat);
      ((b.c)localc).a("addQueueItem", b.k(new Object[] { "mediaItem", b.b(paramMediaDescriptionCompat) }), null);
    }
    
    public final void E0()
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("stop", b.k(new Object[0]), null);
    }
    
    public final void H(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      paramMediaDescriptionCompat = a;
      paramMediaDescriptionCompat = (MediaMetadataCompat)AudioService.J.get(paramMediaDescriptionCompat);
      ((b.c)localc).a("insertQueueItem", b.k(new Object[] { "mediaItem", b.b(paramMediaDescriptionCompat), "index", Integer.valueOf(paramInt) }), null);
    }
    
    public final void O(String paramString, Bundle paramBundle)
    {
      if (AudioService.H == null) {
        return;
      }
      if ("com.ryanheise.audioservice.action.STOP".equals(paramString))
      {
        paramString = (b.c)AudioService.H;
        paramString.getClass();
        paramString.a("stop", b.k(new Object[0]), null);
      }
      else if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals(paramString))
      {
        paramString = (b.c)AudioService.H;
        paramString.getClass();
        paramString.a("fastForward", b.k(new Object[0]), null);
      }
      else if ("com.ryanheise.audioservice.action.REWIND".equals(paramString))
      {
        paramString = (b.c)AudioService.H;
        paramString.getClass();
        paramString.a("rewind", b.k(new Object[0]), null);
      }
      else
      {
        b.c localc = (b.c)AudioService.H;
        localc.getClass();
        localc.a("customAction", b.k(new Object[] { "name", paramString, "extras", b.e(paramBundle) }), null);
      }
    }
    
    public final void P()
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("fastForward", b.k(new Object[0]), null);
    }
    
    public final boolean Q(Intent paramIntent)
    {
      if (AudioService.H == null) {
        return false;
      }
      paramIntent = (KeyEvent)paramIntent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
      if (paramIntent.getAction() == 0)
      {
        int i = paramIntent.getKeyCode();
        if (i != 79) {
          if (i != 130)
          {
            if ((i == 126) || (i == 127)) {}
          }
          else {
            switch (i)
            {
            default: 
              break;
            case 91: 
              V();
              break;
            case 90: 
              P();
              break;
            case 89: 
              t0();
              break;
            case 86: 
              E0();
              break;
              U();
              break;
            }
          }
        }
        AudioService.c localc = AudioService.H;
        i = paramIntent.getKeyCode();
        if ((i != 79) && (i != 85)) {
          if (i != 87)
          {
            if (i == 88)
            {
              i = 3;
              break label186;
            }
          }
          else
          {
            i = 2;
            break label186;
          }
        }
        i = 1;
        label186:
        paramIntent = (b.c)localc;
        paramIntent.getClass();
        paramIntent.a("click", b.k(new Object[] { "button", Integer.valueOf(g.c(i)) }), null);
      }
      return true;
    }
    
    public final void U()
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("pause", b.k(new Object[0]), null);
    }
    
    public final void V()
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("play", b.k(new Object[0]), null);
    }
    
    public final void f0(String paramString, Bundle paramBundle)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("playFromMediaId", b.k(new Object[] { "mediaId", paramString, "extras", b.e(paramBundle) }), null);
    }
    
    public final void h0(String paramString, Bundle paramBundle)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("playFromSearch", b.k(new Object[] { "query", paramString, "extras", b.e(paramBundle) }), null);
    }
    
    public final void j0(Uri paramUri, Bundle paramBundle)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("playFromUri", b.k(new Object[] { "uri", paramUri.toString(), "extras", b.e(paramBundle) }), null);
    }
    
    public final void n0()
    {
      if (AudioService.H == null) {
        return;
      }
      if (!r.c()) {
        r.e(true);
      }
      b.c localc = (b.c)AudioService.H;
      localc.getClass();
      localc.a("prepare", b.k(new Object[0]), null);
    }
    
    public final void o0(String paramString, Bundle paramBundle)
    {
      if (AudioService.H == null) {
        return;
      }
      if (!r.c()) {
        r.e(true);
      }
      b.c localc = (b.c)AudioService.H;
      localc.getClass();
      localc.a("prepareFromMediaId", b.k(new Object[] { "mediaId", paramString, "extras", b.e(paramBundle) }), null);
    }
    
    public final void q0(String paramString, Bundle paramBundle)
    {
      if (AudioService.H == null) {
        return;
      }
      if (!r.c()) {
        r.e(true);
      }
      b.c localc = (b.c)AudioService.H;
      localc.getClass();
      localc.a("prepareFromSearch", b.k(new Object[] { "query", paramString, "extras", b.e(paramBundle) }), null);
    }
    
    public final void r0(Uri paramUri, Bundle paramBundle)
    {
      if (AudioService.H == null) {
        return;
      }
      if (!r.c()) {
        r.e(true);
      }
      b.c localc = (b.c)AudioService.H;
      localc.getClass();
      localc.a("prepareFromUri", b.k(new Object[] { "uri", paramUri.toString(), "extras", b.e(paramBundle) }), null);
    }
    
    public final void s0(MediaDescriptionCompat paramMediaDescriptionCompat)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      paramMediaDescriptionCompat = a;
      paramMediaDescriptionCompat = (MediaMetadataCompat)AudioService.J.get(paramMediaDescriptionCompat);
      ((b.c)localc).a("removeQueueItem", b.k(new Object[] { "mediaItem", b.b(paramMediaDescriptionCompat) }), null);
    }
    
    public final void t0()
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("rewind", b.k(new Object[0]), null);
    }
    
    public final void u0(long paramLong)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("seek", b.k(new Object[] { "position", Long.valueOf(paramLong * 1000L) }), null);
    }
    
    public final void v0(boolean paramBoolean)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("setCaptioningEnabled", b.k(new Object[] { "enabled", Boolean.valueOf(paramBoolean) }), null);
    }
    
    public final void w0(float paramFloat)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("setSpeed", b.k(new Object[] { "speed", Float.valueOf(paramFloat) }), null);
    }
    
    public final void x0(RatingCompat paramRatingCompat)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("setRating", b.k(new Object[] { "rating", b.n(paramRatingCompat), "extras", null }), null);
    }
    
    public final void y0(RatingCompat paramRatingCompat, Bundle paramBundle)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("setRating", b.k(new Object[] { "rating", b.n(paramRatingCompat), "extras", b.e(paramBundle) }), null);
    }
    
    public final void z0(int paramInt)
    {
      AudioService.c localc = AudioService.H;
      if (localc == null) {
        return;
      }
      ((b.c)localc).a("setRepeatMode", b.k(new Object[] { "repeatMode", Integer.valueOf(paramInt) }), null);
    }
  }
  
  public static abstract interface c {}
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.AudioService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */