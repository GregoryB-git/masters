package pa;

import a4.s;
import a4.v;
import aa.m0;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.a;
import android.support.v4.media.session.MediaSessionCompat.c;
import android.util.Log;
import android.view.Surface;
import b1.x;
import com.google.android.exoplayer2.source.dash.DashMediaSource.Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource.Factory;
import com.google.android.exoplayer2.source.smoothstreaming.a.a;
import com.jhomlala.better_player.ImageWorker;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.view.TextureRegistry.SurfaceTextureEntry;
import io.flutter.view.TextureRegistry.TextureEntry;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import o2.l.a;
import o2.p;
import o2.q;
import o2.q.a;
import p2.k0;
import r5.f.c;
import s5.c.c;
import t5.r.a;
import t5.s.a;
import t5.u;
import v3.d0;
import v3.f1;
import v3.f1.c;
import v3.j0;
import v3.o0;
import v3.o0.a;
import v3.o0.f;
import v3.r;
import v5.e0;
import z4.z;

public final class b
{
  public final EventChannel a;
  public final TextureRegistry.SurfaceTextureEntry b;
  public final d0 c;
  public final k d;
  public final r5.f e;
  public boolean f;
  public Surface g;
  public String h;
  public s5.c i;
  public Handler j;
  public b.d k;
  public c l;
  public Bitmap m;
  public MediaSessionCompat n;
  public a4.b o;
  public final k0 p;
  public final HashMap<UUID, x<o2.o>> q;
  public long r;
  
  public b(Context paramContext, EventChannel paramEventChannel, TextureRegistry.SurfaceTextureEntry paramSurfaceTextureEntry, i parami, MethodChannel.Result paramResult)
  {
    a = paramEventChannel;
    b = paramSurfaceTextureEntry;
    d = new k();
    r5.f localf = new r5.f(paramContext);
    e = localf;
    if (parami == null) {
      parami = new i();
    }
    int i1 = a;
    int i2 = b;
    int i3 = c;
    int i4 = d;
    v3.j.j("bufferForPlaybackMs", i3, 0, "0");
    v3.j.j("bufferForPlaybackAfterRebufferMs", i4, 0, "0");
    v3.j.j("minBufferMs", i1, i3, "bufferForPlaybackMs");
    v3.j.j("minBufferMs", i1, i4, "bufferForPlaybackAfterRebufferMs");
    v3.j.j("maxBufferMs", i2, i1, "minBufferMs");
    v3.j localj = new v3.j(new t5.o(), i1, i2, i3, i4, -1, false, 0, false);
    parami = new r(paramContext);
    x6.b.H(t ^ true);
    e = new e(localf, 0);
    x6.b.H(t ^ true);
    f = new m0(localj, 0);
    x6.b.H(t ^ true);
    t = true;
    parami = new d0(parami);
    c = parami;
    p = k0.d(paramContext);
    q = new HashMap();
    paramEventChannel.setStreamHandler(new d(this));
    paramContext = new Surface(paramSurfaceTextureEntry.surfaceTexture());
    g = paramContext;
    parami.u0();
    parami.n0(paramContext);
    parami.g0(-1, -1);
    parami.u0();
    parami.k0(new x3.d(3, 0, 1, 1, 0), false);
    paramContext = new e(this);
    l.a(paramContext);
    paramContext = new HashMap();
    paramContext.put("textureId", Long.valueOf(paramSurfaceTextureEntry.id()));
    paramResult.success(paramContext);
  }
  
  public final void a()
  {
    Object localObject = n;
    if (localObject != null) {
      ((MediaSessionCompat)localObject).d();
    }
    n = null;
    b();
    if (f)
    {
      localObject = c;
      if (localObject != null) {
        ((d0)localObject).stop();
      }
    }
    b.release();
    a.setStreamHandler(null);
    localObject = g;
    if (localObject != null) {
      ((Surface)localObject).release();
    }
    localObject = c;
    if (localObject != null) {
      ((d0)localObject).h0();
    }
  }
  
  public final void b()
  {
    Object localObject = l;
    if (localObject != null)
    {
      d0 locald0 = c;
      if (locald0 != null) {
        locald0.h((f1.c)localObject);
      }
    }
    localObject = j;
    if (localObject != null)
    {
      ((Handler)localObject).removeCallbacksAndMessages(null);
      j = null;
      k = null;
    }
    localObject = i;
    if (localObject != null) {
      ((s5.c)localObject).b(null);
    }
    m = null;
  }
  
  public final void c(boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    String str;
    if (paramBoolean) {
      str = "pipStart";
    } else {
      str = "pipStop";
    }
    localHashMap.put("event", str);
    d.success(localHashMap);
  }
  
  public final void d(boolean paramBoolean)
  {
    Object localObject = c;
    long l1;
    if (localObject != null) {
      l1 = ((d0)localObject).z();
    } else {
      l1 = 0L;
    }
    if ((paramBoolean) || (l1 != r))
    {
      localObject = new HashMap();
      ((HashMap)localObject).put("event", "bufferingUpdate");
      ((HashMap)localObject).put("values", va.a.f(va.a.g(new Long[] { Long.valueOf(0L), Long.valueOf(l1) })));
      d.success(localObject);
      r = l1;
    }
  }
  
  public final void e()
  {
    if (e.e() == null) {
      return;
    }
    e.h().buildUpon();
    throw null;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (ec.i.a(b.class, paramObject.getClass())))
    {
      Object localObject = (b)paramObject;
      paramObject = c;
      int i1;
      if (paramObject != null ? !ec.i.a(paramObject, c) : c != null) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0) {
        return false;
      }
      paramObject = g;
      localObject = g;
      if (paramObject != null) {
        bool = ec.i.a(paramObject, localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final void f(Context paramContext, String paramString1, String paramString2, String paramString3, MethodChannel.Result paramResult, Map<String, String> paramMap1, boolean paramBoolean, long paramLong1, long paramLong2, long paramLong3, String paramString4, Map<String, String> arg15, String paramString5, String paramString6)
  {
    ec.i.e(paramContext, "context");
    ec.i.e(paramResult, "result");
    h = paramString1;
    int i1 = 0;
    f = false;
    Uri localUri = Uri.parse(paramString2);
    Object localObject = System.getProperty("http.agent");
    paramString2 = (String)localObject;
    if (paramMap1 != null)
    {
      paramString2 = (String)localObject;
      if (paramMap1.containsKey("User-Agent"))
      {
        paramString1 = (String)paramMap1.get("User-Agent");
        paramString2 = (String)localObject;
        if (paramString1 != null) {
          paramString2 = paramString1;
        }
      }
    }
    if (paramString4 != null)
    {
      if (paramString4.length() > 0) {
        i1 = 1;
      }
      if (i1 != 0)
      {
        paramString4 = new a4.t(paramString4, new s.a());
        if (??? != null)
        {
          paramString1 = ???.entrySet().iterator();
          while (paramString1.hasNext())
          {
            ??? = (Map.Entry)paramString1.next();
            paramString6 = (String)???.getKey();
            localObject = (String)???.getValue();
            paramString6.getClass();
            localObject.getClass();
            synchronized (d)
            {
              d.put(paramString6, localObject);
            }
          }
        }
        if (e0.a >= 18) {}
      }
    }
    label358:
    label361:
    do
    {
      Log.e("BetterPlayer", "Protected content not supported on API levels below 18");
      paramString1 = null;
      break label604;
      paramString1 = x6.b.x0("widevine");
      paramString1.getClass();
      i1 = paramString1.hashCode();
      if (i1 != -1860423953)
      {
        if (i1 != -1400551171)
        {
          if ((i1 == 790309106) && (paramString1.equals("clearkey")))
          {
            i1 = 2;
            break label361;
          }
        }
        else if (paramString1.equals("widevine"))
        {
          i1 = 1;
          break label361;
        }
      }
      else {
        if (paramString1.equals("playready")) {
          break label358;
        }
      }
      i1 = -1;
      break label361;
      i1 = 0;
      if (i1 != 0)
      {
        if (i1 != 1)
        {
          if (i1 != 2) {
            try
            {
              paramString1 = UUID.fromString("widevine");
            }
            catch (RuntimeException paramString1)
            {
              paramString1 = null;
            }
          } else {
            paramString1 = v3.h.c;
          }
        }
        else {
          paramString1 = v3.h.d;
        }
      }
      else {
        paramString1 = v3.h.e;
      }
      if (paramString1 != null)
      {
        ??? = new HashMap();
        paramString6 = v3.h.a;
        paramString6 = new u();
        o = new a4.b(paramString1, new f(), paramString4, ???, false, new int[0], false, paramString6, 300000L);
      }
      i2 = 0;
      break label612;
      if (paramString6 == null) {
        break;
      }
      if (paramString6.length() > 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 == 0) {
        break;
      }
    } while (e0.a < 18);
    paramString1 = new HashMap();
    ??? = new u();
    localObject = v3.h.c;
    paramString4 = s.d;
    localObject.getClass();
    paramString6 = paramString6.getBytes(lc.a.a);
    ec.i.d(paramString6, "this as java.lang.String).getBytes(charset)");
    paramString1 = new a4.b((UUID)localObject, paramString4, new v(paramString6), paramString1, false, new int[0], false, ???, 300000L);
    break label604;
    paramString1 = null;
    label604:
    o = paramString1;
    int i2 = 0;
    label612:
    if (j.b(localUri))
    {
      paramString2 = j.a(paramString2, paramMap1);
      paramString1 = paramString2;
      if (paramBoolean)
      {
        paramString1 = paramString2;
        if (paramLong1 > 0L)
        {
          paramString1 = paramString2;
          if (paramLong2 > 0L) {
            paramString1 = new h(paramContext, paramLong1, paramLong2, paramString2);
          }
        }
      }
    }
    else
    {
      paramString1 = new r.a(paramContext);
    }
    ec.i.b(localUri);
    if (paramString3 == null)
    {
      paramString3 = localUri.getLastPathSegment();
      paramString2 = paramString3;
      if (paramString3 == null) {
        paramString2 = "";
      }
      i1 = e0.a;
      paramString3 = new StringBuilder();
      paramString3.append("file:///");
      paramString3.append(paramString2);
      i1 = e0.C(Uri.parse(paramString3.toString()));
    }
    else
    {
      i1 = paramString3.hashCode();
      if (i1 != 3680)
      {
        if (i1 != 103407)
        {
          if (i1 != 3075986)
          {
            if ((i1 == 106069776) && (paramString3.equals("other")))
            {
              i1 = 4;
              break label876;
            }
          }
          else if (paramString3.equals("dash"))
          {
            i1 = i2;
            break label876;
          }
        }
        else if (paramString3.equals("hls"))
        {
          i1 = 2;
          break label876;
        }
      }
      else {
        if (paramString3.equals("ss")) {
          break label873;
        }
      }
      i1 = -1;
      break label876;
      label873:
      i1 = 1;
    }
    label876:
    paramString2 = new o0.a();
    b = localUri;
    if (paramString5 != null)
    {
      if (paramString5.length() > 0) {
        i2 = 1;
      }
      if (i2 != 0) {
        g = paramString5;
      }
    }
    paramString3 = paramString2.a();
    paramString2 = o;
    if (paramString2 != null) {
      paramString2 = new a(paramString2);
    } else {
      paramString2 = null;
    }
    if (i1 != 0)
    {
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 == 4)
          {
            paramContext = new d(new c4.f(), 7);
            paramMap1 = new u();
            x6.b.A(paramString2);
            b.getClass();
            paramString4 = b.g;
            paramContext = new z(paramString3, paramString1, paramContext, a, paramMap1, 1048576);
          }
          else
          {
            throw new IllegalStateException(f.h("Unsupported type: ", i1));
          }
        }
        else
        {
          paramContext = new HlsMediaSource.Factory(paramString1);
          x6.b.A(paramString2);
          f = paramString2;
          paramContext = paramContext.a(paramString3);
        }
      }
      else
      {
        paramMap1 = new a.a(paramString1);
        paramString4 = new r.a(paramContext, paramString1);
        paramString1 = new SsMediaSource.Factory(paramMap1, paramString4);
        x6.b.A(paramString2);
        b = paramString2;
        b.getClass();
        paramContext = new g5.b();
        paramString2 = b.d;
        if (!paramString2.isEmpty()) {
          paramContext = new y4.b(paramContext, paramString2);
        }
        paramContext = new SsMediaSource(paramString3, paramString4, paramContext, paramMap1, a, b.a(paramString3), c, d);
      }
    }
    else
    {
      paramContext = new DashMediaSource.Factory(new com.google.android.exoplayer2.source.dash.c.a(paramString1), new r.a(paramContext, paramString1));
      x6.b.A(paramString2);
      c = paramString2;
      paramContext = paramContext.a(paramString3);
    }
    if (paramLong3 != 0L)
    {
      paramString1 = new z4.d(paramContext, 0L, 'Ϩ' * paramLong3);
      paramContext = c;
      if (paramContext != null) {
        paramContext.l0(paramString1);
      }
    }
    else
    {
      paramString1 = c;
      if (paramString1 != null) {
        paramString1.l0(paramContext);
      }
    }
    paramContext = c;
    if (paramContext != null) {
      paramContext.a();
    }
    paramResult.success(null);
  }
  
  public final void g()
  {
    ec.i.d(e.buildUponParameters(), "buildUponParameters(...)");
    throw null;
  }
  
  public final MediaSessionCompat h(Context paramContext)
  {
    Object localObject = n;
    if (localObject != null) {
      ((MediaSessionCompat)localObject).d();
    }
    if (paramContext != null)
    {
      localObject = new Intent("android.intent.action.MEDIA_BUTTON");
      boolean bool = false;
      localObject = new MediaSessionCompat(paramContext, "BetterPlayer", PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject, 67108864));
      ((MediaSessionCompat)localObject).f(new b(this), null);
      ((MediaSessionCompat)localObject).e(true);
      b4.a locala = new b4.a((MediaSessionCompat)localObject);
      d0 locald0 = c;
      if ((locald0 == null) || (s == b)) {
        bool = true;
      }
      x6.b.q(bool);
      paramContext = i;
      if (paramContext != null) {
        paramContext.h(c);
      }
      i = locald0;
      if (locald0 != null) {
        locald0.s(c);
      }
      locala.c();
      locala.b();
      n = ((MediaSessionCompat)localObject);
      return (MediaSessionCompat)localObject;
    }
    return null;
  }
  
  public final int hashCode()
  {
    Object localObject = c;
    int i1 = 0;
    int i2;
    if (localObject != null) {
      i2 = localObject.hashCode();
    } else {
      i2 = 0;
    }
    localObject = g;
    if (localObject != null) {
      i1 = localObject.hashCode();
    }
    return i2 * 31 + i1;
  }
  
  public final void i(final Context paramContext, String paramString1, final String paramString2, final String paramString3, String paramString4, final String paramString5)
  {
    ec.i.e(paramString1, "title");
    ec.i.e(paramString5, "activityName");
    paramString2 = new d(paramString1, paramContext, paramString5, paramString2, paramString3, this);
    if ((paramString4 == null) && (Build.VERSION.SDK_INT >= 26))
    {
      paramString1 = new NotificationChannel("BETTER_PLAYER_NOTIFICATION", "BETTER_PLAYER_NOTIFICATION", 2);
      paramString1.setDescription("BETTER_PLAYER_NOTIFICATION");
      ((NotificationManager)paramContext.getSystemService(NotificationManager.class)).createNotificationChannel(paramString1);
      paramString1 = "BETTER_PLAYER_NOTIFICATION";
    }
    else
    {
      paramString1 = paramString4;
    }
    ec.i.b(paramString1);
    paramString1 = new s5.c(paramContext, paramString1, 20772077, paramString2, 2131230890, 2131230887, 2131230886, 2131230891, 2131230889, 2131230884, 2131230888, 2131230885);
    i = paramString1;
    paramString2 = c;
    if (paramString2 != null)
    {
      paramString1.b(new j0(paramString2));
      if (u)
      {
        u = false;
        if ((q) && (!e.hasMessages(0))) {
          e.sendEmptyMessage(0);
        }
      }
      if (t)
      {
        t = false;
        if ((q) && (!e.hasMessages(0))) {
          e.sendEmptyMessage(0);
        }
      }
      if (y)
      {
        y = false;
        if ((q) && (!e.hasMessages(0))) {
          e.sendEmptyMessage(0);
        }
      }
    }
    paramContext = h(paramContext);
    if (paramContext != null)
    {
      paramContext = a.b;
      if (!e0.a(s, paramContext))
      {
        s = paramContext;
        if ((q) && (!e.hasMessages(0))) {
          e.sendEmptyMessage(0);
        }
      }
    }
    paramString1 = new Handler(Looper.getMainLooper());
    j = paramString1;
    paramContext = new b.d(this, 22);
    k = paramContext;
    paramString1.postDelayed(paramContext, 0L);
    paramString1 = new c(this);
    l = paramString1;
    paramContext = c;
    if (paramContext != null) {
      l.a(paramString1);
    }
    paramContext = c;
    if (paramContext != null) {
      paramContext.T(5, 0L);
    }
  }
  
  public static final class a
  {
    public static void a(File paramFile)
    {
      if (paramFile.isDirectory())
      {
        File[] arrayOfFile = paramFile.listFiles();
        if (arrayOfFile != null) {
          for (int i = 0;; i++)
          {
            int j;
            if (i < arrayOfFile.length) {
              j = 1;
            } else {
              j = 0;
            }
            if (j == 0) {
              break;
            }
            File localFile = arrayOfFile[i];
            ec.i.b(localFile);
            a(localFile);
          }
        }
      }
      if (!paramFile.delete()) {
        Log.e("BetterPlayer", "Failed to delete cache dir.");
      }
    }
  }
  
  public static final class b
    extends MediaSessionCompat.a
  {
    public b(b paramb) {}
    
    public final void u0(long paramLong)
    {
      b localb = f;
      Object localObject = c;
      if (localObject != null) {
        ((v3.e)localObject).T(5, paramLong);
      }
      localObject = new HashMap();
      ((HashMap)localObject).put("event", "seek");
      ((HashMap)localObject).put("position", Long.valueOf(paramLong));
      d.success(localObject);
    }
  }
  
  public static final class c
    implements f1.c
  {
    public c(b paramb) {}
    
    public final void N(int paramInt)
    {
      MediaSessionCompat localMediaSessionCompat = a.n;
      if (localMediaSessionCompat != null)
      {
        Bundle localBundle = new Bundle();
        Object localObject = a.c;
        long l;
        if (localObject != null) {
          l = ((d0)localObject).getDuration();
        } else {
          l = 0L;
        }
        localObject = MediaMetadataCompat.d;
        if ((((r.h)localObject).containsKey("android.media.metadata.DURATION")) && (((Integer)((r.h)localObject).getOrDefault("android.media.metadata.DURATION", null)).intValue() != 0)) {
          throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        localBundle.putLong("android.media.metadata.DURATION", l);
        localMediaSessionCompat.g(new MediaMetadataCompat(localBundle));
      }
    }
  }
  
  public static final class d
    implements c.c
  {
    public d(String paramString1, Context paramContext, String paramString2, String paramString3, String paramString4, b paramb) {}
    
    public final CharSequence a(f1 paramf1)
    {
      ec.i.e(paramf1, "player");
      return a;
    }
    
    public final Bitmap b(f1 paramf1, s5.c.a parama)
    {
      ec.i.e(paramf1, "player");
      if (paramString3 == null) {
        return null;
      }
      paramf1 = jdField_thism;
      if (paramf1 != null) {
        return paramf1;
      }
      paramf1 = new l.a(ImageWorker.class);
      Object localObject = paramString3;
      ec.i.e(localObject, "tag");
      d.add(localObject);
      localObject = new HashMap();
      ((HashMap)localObject).put("url", paramString3);
      localObject = new androidx.work.c((HashMap)localObject);
      androidx.work.c.e((androidx.work.c)localObject);
      c.e = ((androidx.work.c)localObject);
      paramf1 = paramf1.a();
      ec.i.d(paramf1, "build(...)");
      localObject = (o2.l)paramf1;
      jdField_thisp.a((q)localObject);
      paramf1 = new c(jdField_this, (o2.l)localObject, parama);
      parama = a;
      ec.i.d(parama, "getId(...)");
      jdField_thisp.e(parama).observeForever(paramf1);
      jdField_thisq.put(parama, paramf1);
      return null;
    }
    
    public final PendingIntent d(f1 paramf1)
    {
      ec.i.e(paramf1, "player");
      paramf1 = paramContext.getApplicationContext().getPackageName();
      Intent localIntent = new Intent();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramf1);
      localStringBuilder.append('.');
      localStringBuilder.append(paramString5);
      localIntent.setClassName(paramf1, localStringBuilder.toString());
      localIntent.setFlags(603979776);
      return PendingIntent.getActivity(paramContext, 0, localIntent, 67108864);
    }
    
    public final CharSequence e(f1 paramf1)
    {
      ec.i.e(paramf1, "player");
      return paramString2;
    }
  }
}

/* Location:
 * Qualified Name:     pa.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */