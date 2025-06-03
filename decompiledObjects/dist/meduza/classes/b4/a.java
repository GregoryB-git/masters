package b4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.MediaMetadataCompat.b;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.MediaSessionCompat.a;
import android.support.v4.media.session.MediaSessionCompat.c;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.PlaybackStateCompat.CustomAction;
import android.util.Log;
import android.util.SparseBooleanArray;
import g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v3.e1;
import v3.f1;
import v3.f1.b;
import v3.f1.c;
import v3.h0;
import v3.o0;
import v3.r1;
import v5.e0;

public final class a
{
  public static final MediaMetadataCompat l = new MediaMetadataCompat(new Bundle());
  public final MediaSessionCompat a;
  public final Looper b;
  public final b c;
  public final ArrayList<a> d;
  public final ArrayList<a> e;
  public c[] f;
  public Map<String, c> g;
  public d h;
  public f1 i;
  public long j;
  public boolean k;
  
  static
  {
    h0.a("goog.exo.mediasession");
  }
  
  public a(MediaSessionCompat paramMediaSessionCompat)
  {
    a = paramMediaSessionCompat;
    int m = e0.a;
    Looper localLooper = Looper.myLooper();
    if (localLooper == null) {
      localLooper = Looper.getMainLooper();
    }
    b = localLooper;
    b localb = new b();
    c = localb;
    d = new ArrayList();
    e = new ArrayList();
    f = new c[0];
    g = Collections.emptyMap();
    h = new d(b);
    j = 2360143L;
    a.a.setFlags(3);
    paramMediaSessionCompat.f(localb, new Handler(localLooper));
    k = true;
  }
  
  public static boolean a(a parama, long paramLong)
  {
    boolean bool;
    if ((i != null) && ((paramLong & j) != 0L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void b()
  {
    d locald = h;
    if (locald != null)
    {
      Object localObject1 = i;
      if (localObject1 != null)
      {
        if (((f1)localObject1).J().p())
        {
          localObject1 = l;
          break label943;
        }
        MediaMetadataCompat.b localb = new MediaMetadataCompat.b();
        if (((f1)localObject1).g()) {
          localb.b("android.media.metadata.ADVERTISEMENT", 1L);
        }
        if ((!((f1)localObject1).H()) && (((f1)localObject1).getDuration() != -9223372036854775807L)) {
          l1 = ((f1)localObject1).getDuration();
        } else {
          l1 = -1L;
        }
        localb.b("android.media.metadata.DURATION", l1);
        Object localObject3 = a.a;
        if (e.a() != null)
        {
          try
          {
            localObject1 = e.a().d();
          }
          catch (RemoteException localRemoteException)
          {
            Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", localRemoteException);
          }
        }
        else
        {
          localObject2 = a.getPlaybackState();
          if (localObject2 != null) {
            localObject2 = PlaybackStateCompat.a(localObject2);
          } else {
            localObject2 = null;
          }
        }
        long l1 = r;
        if (l1 != -1L)
        {
          localObject2 = a.a.a.getQueue();
          if (localObject2 != null) {
            localObject2 = MediaSessionCompat.QueueItem.a((List)localObject2);
          } else {
            localObject2 = null;
          }
          for (int m = 0; (localObject2 != null) && (m < ((List)localObject2).size()); m++)
          {
            localObject3 = (MediaSessionCompat.QueueItem)((List)localObject2).get(m);
            if (b == l1)
            {
              localObject3 = a;
              Bundle localBundle = o;
              if (localBundle != null)
              {
                Iterator localIterator = localBundle.keySet().iterator();
                while (localIterator.hasNext())
                {
                  localObject2 = (String)localIterator.next();
                  Object localObject4 = localBundle.get((String)localObject2);
                  Object localObject5;
                  if ((localObject4 instanceof String))
                  {
                    localObject5 = String.valueOf(b);
                    localObject2 = String.valueOf(localObject2);
                    if (((String)localObject2).length() != 0) {
                      localObject2 = ((String)localObject5).concat((String)localObject2);
                    } else {
                      localObject2 = new String((String)localObject5);
                    }
                    localb.d((String)localObject2, (String)localObject4);
                  }
                  else if ((localObject4 instanceof CharSequence))
                  {
                    localObject5 = String.valueOf(b);
                    localObject2 = String.valueOf(localObject2);
                    if (((String)localObject2).length() != 0) {
                      localObject2 = ((String)localObject5).concat((String)localObject2);
                    } else {
                      localObject2 = new String((String)localObject5);
                    }
                    localObject5 = (CharSequence)localObject4;
                    localObject4 = MediaMetadataCompat.d;
                    if ((((r.h)localObject4).containsKey(localObject2)) && (((Integer)((r.h)localObject4).getOrDefault(localObject2, null)).intValue() != 1)) {
                      throw new IllegalArgumentException(g.e("The ", (String)localObject2, " key cannot be used to put a CharSequence"));
                    }
                    a.putCharSequence((String)localObject2, (CharSequence)localObject5);
                  }
                  else
                  {
                    if ((localObject4 instanceof Long))
                    {
                      localObject5 = String.valueOf(b);
                      localObject2 = String.valueOf(localObject2);
                      if (((String)localObject2).length() != 0) {
                        localObject2 = ((String)localObject5).concat((String)localObject2);
                      } else {
                        localObject2 = new String((String)localObject5);
                      }
                      l1 = ((Long)localObject4).longValue();
                    }
                    else
                    {
                      if (!(localObject4 instanceof Integer)) {
                        break label640;
                      }
                      localObject5 = String.valueOf(b);
                      localObject2 = String.valueOf(localObject2);
                      if (((String)localObject2).length() != 0) {
                        localObject2 = ((String)localObject5).concat((String)localObject2);
                      } else {
                        localObject2 = new String((String)localObject5);
                      }
                      l1 = ((Integer)localObject4).intValue();
                    }
                    localb.b((String)localObject2, l1);
                    continue;
                    label640:
                    if ((localObject4 instanceof Bitmap))
                    {
                      localObject5 = String.valueOf(b);
                      localObject2 = String.valueOf(localObject2);
                      if (((String)localObject2).length() != 0) {
                        localObject2 = ((String)localObject5).concat((String)localObject2);
                      } else {
                        localObject2 = new String((String)localObject5);
                      }
                      localb.a((Bitmap)localObject4, (String)localObject2);
                    }
                    else if ((localObject4 instanceof RatingCompat))
                    {
                      localObject5 = String.valueOf(b);
                      localObject2 = String.valueOf(localObject2);
                      if (((String)localObject2).length() != 0) {
                        localObject2 = ((String)localObject5).concat((String)localObject2);
                      } else {
                        localObject2 = new String((String)localObject5);
                      }
                      localb.c((String)localObject2, (RatingCompat)localObject4);
                    }
                  }
                }
              }
              localObject2 = b;
              if (localObject2 != null)
              {
                localObject2 = String.valueOf(localObject2);
                localb.d("android.media.metadata.TITLE", (String)localObject2);
                localb.d("android.media.metadata.DISPLAY_TITLE", (String)localObject2);
              }
              localObject2 = c;
              if (localObject2 != null) {
                localb.d("android.media.metadata.DISPLAY_SUBTITLE", String.valueOf(localObject2));
              }
              localObject2 = d;
              if (localObject2 != null) {
                localb.d("android.media.metadata.DISPLAY_DESCRIPTION", String.valueOf(localObject2));
              }
              localObject2 = e;
              if (localObject2 != null) {
                localb.a((Bitmap)localObject2, "android.media.metadata.DISPLAY_ICON");
              }
              localObject2 = f;
              if (localObject2 != null) {
                localb.d("android.media.metadata.DISPLAY_ICON_URI", String.valueOf(localObject2));
              }
              localObject2 = a;
              if (localObject2 != null) {
                localb.d("android.media.metadata.MEDIA_ID", (String)localObject2);
              }
              localObject2 = p;
              if (localObject2 == null) {
                break;
              }
              localb.d("android.media.metadata.MEDIA_URI", String.valueOf(localObject2));
              break;
            }
          }
        }
        localObject2 = new MediaMetadataCompat(a);
        break label943;
      }
    }
    Object localObject2 = l;
    label943:
    a.g((MediaMetadataCompat)localObject2);
  }
  
  public final void c()
  {
    Object localObject1 = new ArrayList();
    Object localObject2 = i;
    int m = 0;
    long l1;
    if (localObject2 == null)
    {
      l1 = SystemClock.elapsedRealtime();
      a.j(0);
      a.k(0);
      localObject2 = a;
    }
    Object localObject4;
    label270:
    float f1;
    long l2;
    long l3;
    long l4;
    long l5;
    for (localObject1 = new PlaybackStateCompat(0, 0L, 0L, 0.0F, 0L, 0, null, l1, (ArrayList)localObject1, -1L, null);; localObject1 = new PlaybackStateCompat(???, l5, l4, f1, 0L | l3 & l2, 0, null, l1, (ArrayList)localObject1, -1L, (Bundle)localObject4))
    {
      ((MediaSessionCompat)localObject2).h((PlaybackStateCompat)localObject1);
      return;
      Object localObject3 = new HashMap();
      for (c localc : f)
      {
        localObject4 = localc.b();
        if (localObject4 != null)
        {
          ((HashMap)localObject3).put(a, localc);
          ((ArrayList)localObject1).add(localObject4);
        }
      }
      g = Collections.unmodifiableMap((Map)localObject3);
      localObject4 = new Bundle();
      if (((f1)localObject2).v() == null) {
        ??? = 0;
      } else {
        ??? = 1;
      }
      if (??? != 0)
      {
        ??? = 7;
      }
      else
      {
        ??? = ((f1)localObject2).d();
        bool1 = ((f1)localObject2).k();
        if (??? != 2)
        {
          ??? = 3;
          if (??? != 3)
          {
            if (??? != 4)
            {
              ??? = 0;
              break label270;
            }
            ??? = 1;
            break label270;
          }
          if (bool1) {
            break label270;
          }
        }
        else if (bool1)
        {
          ??? = 6;
          break label270;
        }
        ??? = 2;
        ??? = ???;
      }
      f1 = fa;
      ((Bundle)localObject4).putFloat("EXO_SPEED", f1);
      if (!((f1)localObject2).D()) {
        f1 = 0.0F;
      }
      localObject3 = ((f1)localObject2).m();
      if ((localObject3 != null) && (!"".equals(a))) {
        ((BaseBundle)localObject4).putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", a);
      }
      boolean bool2 = ((f1)localObject2).G(5);
      boolean bool3 = ((f1)localObject2).G(11);
      boolean bool1 = ((f1)localObject2).G(12);
      if (!((f1)localObject2).J().p()) {
        ((f1)localObject2).g();
      }
      l2 = 6554119L;
      if (bool2) {
        l2 = 6554375L;
      }
      l1 = l2;
      if (bool1) {
        l1 = l2 | 0x40;
      }
      l2 = l1;
      if (bool3) {
        l2 = l1 | 0x8;
      }
      l3 = j;
      l4 = ((f1)localObject2).z();
      l5 = ((f1)localObject2).P();
      l1 = SystemClock.elapsedRealtime();
      int i2 = ((f1)localObject2).x();
      localObject3 = a;
      if (i2 == 1)
      {
        ??? = 1;
      }
      else
      {
        ??? = m;
        if (i2 == 2) {
          ??? = 2;
        }
      }
      ((MediaSessionCompat)localObject3).j(???);
      a.k(((f1)localObject2).L());
      localObject2 = a;
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean a();
  }
  
  public final class b
    extends MediaSessionCompat.a
    implements f1.c
  {
    public int f;
    public int o;
    
    public b() {}
    
    public final void A0(int paramInt)
    {
      if (a.a(a.this, 2097152L))
      {
        boolean bool1 = true;
        boolean bool2 = bool1;
        if (paramInt != 1)
        {
          bool2 = bool1;
          if (paramInt != 2) {
            bool2 = false;
          }
        }
        i.n(bool2);
      }
    }
    
    public final void B0()
    {
      getClass();
    }
    
    public final void C0()
    {
      getClass();
    }
    
    public final void D0(long paramLong)
    {
      getClass();
    }
    
    public final void E(MediaDescriptionCompat paramMediaDescriptionCompat)
    {
      getClass();
    }
    
    public final void E0()
    {
      if (a.a(a.this, 1L))
      {
        i.stop();
        a locala = a.this;
        if (k) {
          i.l();
        }
      }
    }
    
    public final void H(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
    {
      getClass();
    }
    
    public final void M(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
    {
      if (a.this.i != null)
      {
        int i = 0;
        int k;
        for (int j = 0;; j++)
        {
          k = i;
          if (j >= d.size()) {
            break;
          }
          paramBundle = (a.a)d.get(j);
          paramString = a.this.i;
          if (paramBundle.a()) {
            return;
          }
        }
        while (k < e.size())
        {
          paramBundle = (a.a)e.get(k);
          paramString = a.this.i;
          if (paramBundle.a()) {
            return;
          }
          k++;
        }
      }
    }
    
    public final void O(String paramString, Bundle paramBundle)
    {
      paramBundle = a.this;
      if ((i != null) && (g.containsKey(paramString)))
      {
        paramBundle = (a.c)g.get(paramString);
        paramString = i;
        paramBundle.a();
        c();
      }
    }
    
    public final void P()
    {
      if (a.a(a.this, 64L)) {
        i.N();
      }
    }
    
    public final boolean Q(Intent paramIntent)
    {
      getClass();
      boolean bool;
      if (super.Q(paramIntent)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void U()
    {
      if (a.a(a.this, 2L)) {
        i.pause();
      }
    }
    
    public final void V()
    {
      if (a.a(a.this, 4L))
      {
        if (i.d() == 1)
        {
          getClass();
          i.a();
        }
        else if (i.d() == 4)
        {
          localf1 = i;
          localf1.j(localf1.F(), -9223372036854775807L);
        }
        f1 localf1 = i;
        localf1.getClass();
        localf1.b();
      }
    }
    
    public final void e0(f1 paramf1, f1.b paramb)
    {
      boolean bool = a.a.get(11);
      int i = 1;
      int k;
      if (bool)
      {
        if (f != paramf1.F())
        {
          getClass();
          j = 1;
        }
        else
        {
          j = 0;
        }
        k = 1;
      }
      else
      {
        j = 0;
        k = j;
      }
      int m = j;
      int j = k;
      if (a.a.get(0))
      {
        j = paramf1.J().o();
        m = paramf1.F();
        getClass();
        if ((o != j) || (f != m)) {
          k = 1;
        }
        o = j;
        m = 1;
        j = k;
      }
      f = paramf1.F();
      if (paramb.a(new int[] { 4, 5, 7, 8, 12 })) {
        j = 1;
      }
      if (paramb.a(new int[] { 9 }))
      {
        getClass();
        j = i;
      }
      if (j != 0) {
        c();
      }
      if (m != 0) {
        b();
      }
    }
    
    public final void f0(String paramString, Bundle paramBundle)
    {
      getClass();
    }
    
    public final void h0(String paramString, Bundle paramBundle)
    {
      getClass();
    }
    
    public final void j0(Uri paramUri, Bundle paramBundle)
    {
      getClass();
    }
    
    public final void n0()
    {
      getClass();
    }
    
    public final void o0(String paramString, Bundle paramBundle)
    {
      getClass();
    }
    
    public final void q0(String paramString, Bundle paramBundle)
    {
      getClass();
    }
    
    public final void r0(Uri paramUri, Bundle paramBundle)
    {
      getClass();
    }
    
    public final void s0(MediaDescriptionCompat paramMediaDescriptionCompat)
    {
      getClass();
    }
    
    public final void t0()
    {
      if (a.a(a.this, 8L)) {
        i.O();
      }
    }
    
    public final void u0(long paramLong)
    {
      if (a.a(a.this, 256L))
      {
        f1 localf1 = i;
        localf1.j(localf1.F(), paramLong);
      }
    }
    
    public final void v0(boolean paramBoolean)
    {
      getClass();
    }
    
    public final void w0(float paramFloat)
    {
      if ((a.a(a.this, 4194304L)) && (paramFloat > 0.0F))
      {
        f1 localf1 = i;
        localf1.c(new e1(paramFloat, fb));
      }
    }
    
    public final void x0(RatingCompat paramRatingCompat)
    {
      getClass();
    }
    
    public final void y0(RatingCompat paramRatingCompat, Bundle paramBundle)
    {
      getClass();
    }
    
    public final void z0(int paramInt)
    {
      if (a.a(a.this, 262144L))
      {
        int i = 2;
        int j;
        if (paramInt != 1)
        {
          j = i;
          if (paramInt != 2)
          {
            j = i;
            if (paramInt != 3) {
              j = 0;
            }
          }
        }
        else
        {
          j = 1;
        }
        a.this.i.u(j);
      }
    }
  }
  
  public static abstract interface c
  {
    public abstract void a();
    
    public abstract PlaybackStateCompat.CustomAction b();
  }
  
  public static final class d
  {
    public final MediaControllerCompat a;
    public final String b;
    
    public d(MediaControllerCompat paramMediaControllerCompat)
    {
      a = paramMediaControllerCompat;
      b = "";
    }
  }
}

/* Location:
 * Qualified Name:     b4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */