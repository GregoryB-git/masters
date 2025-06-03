package w;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import v.b;

public abstract class h
{
  public static Bundle a(Notification paramNotification)
  {
    return extras;
  }
  
  public static class a
  {
    public final Bundle a;
    public IconCompat b;
    public final l[] c;
    public final l[] d;
    public boolean e;
    public boolean f = true;
    public final int g;
    public final boolean h;
    public int i;
    public CharSequence j;
    public PendingIntent k;
    public boolean l;
    
    public a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      this(localIconCompat, paramCharSequence, paramPendingIntent);
    }
    
    public a(IconCompat paramIconCompat, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      this(paramIconCompat, paramCharSequence, paramPendingIntent, new Bundle(), null, null, true, 0, true, false, false);
    }
    
    public a(IconCompat paramIconCompat, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, l[] paramArrayOfl1, l[] paramArrayOfl2, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
    {
      b = paramIconCompat;
      if ((paramIconCompat != null) && (paramIconCompat.i() == 2)) {
        i = paramIconCompat.g();
      }
      j = h.e.e(paramCharSequence);
      k = paramPendingIntent;
      if (paramBundle == null) {
        paramBundle = new Bundle();
      }
      a = paramBundle;
      c = paramArrayOfl1;
      d = paramArrayOfl2;
      e = paramBoolean1;
      g = paramInt;
      f = paramBoolean2;
      h = paramBoolean3;
      l = paramBoolean4;
    }
    
    public PendingIntent a()
    {
      return k;
    }
    
    public boolean b()
    {
      return e;
    }
    
    public Bundle c()
    {
      return a;
    }
    
    public IconCompat d()
    {
      if (b == null)
      {
        int m = i;
        if (m != 0) {
          b = IconCompat.e(null, "", m);
        }
      }
      return b;
    }
    
    public l[] e()
    {
      return c;
    }
    
    public int f()
    {
      return g;
    }
    
    public boolean g()
    {
      return f;
    }
    
    public CharSequence h()
    {
      return j;
    }
    
    public boolean i()
    {
      return l;
    }
    
    public boolean j()
    {
      return h;
    }
  }
  
  public static class b
    extends h.f
  {
    public IconCompat e;
    public IconCompat f;
    public boolean g;
    public CharSequence h;
    public boolean i;
    
    public void b(g paramg)
    {
      int j = Build.VERSION.SDK_INT;
      Notification.BigPictureStyle localBigPictureStyle = a.c(a.b(paramg.a()), b);
      IconCompat localIconCompat = e;
      Context localContext = null;
      Object localObject = localBigPictureStyle;
      if (localIconCompat != null) {
        if (j >= 31)
        {
          if ((paramg instanceof i)) {
            localObject = ((i)paramg).f();
          } else {
            localObject = null;
          }
          c.a(localBigPictureStyle, e.o((Context)localObject));
          localObject = localBigPictureStyle;
        }
        else
        {
          localObject = localBigPictureStyle;
          if (localIconCompat.i() == 1) {
            localObject = a.a(localBigPictureStyle, e.f());
          }
        }
      }
      if (g) {
        if (f == null)
        {
          a.d((Notification.BigPictureStyle)localObject, null);
        }
        else
        {
          if ((paramg instanceof i)) {
            localContext = ((i)paramg).f();
          }
          b.a((Notification.BigPictureStyle)localObject, f.o(localContext));
        }
      }
      if (d) {
        a.e((Notification.BigPictureStyle)localObject, c);
      }
      if (j >= 31)
      {
        c.c((Notification.BigPictureStyle)localObject, i);
        c.b((Notification.BigPictureStyle)localObject, h);
      }
    }
    
    public String c()
    {
      return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
    
    public b h(Bitmap paramBitmap)
    {
      if (paramBitmap == null) {
        paramBitmap = null;
      } else {
        paramBitmap = IconCompat.d(paramBitmap);
      }
      f = paramBitmap;
      g = true;
      return this;
    }
    
    public b i(Bitmap paramBitmap)
    {
      if (paramBitmap == null) {
        paramBitmap = null;
      } else {
        paramBitmap = IconCompat.d(paramBitmap);
      }
      e = paramBitmap;
      return this;
    }
    
    public static abstract class a
    {
      public static Notification.BigPictureStyle a(Notification.BigPictureStyle paramBigPictureStyle, Bitmap paramBitmap)
      {
        return paramBigPictureStyle.bigPicture(paramBitmap);
      }
      
      public static Notification.BigPictureStyle b(Notification.Builder paramBuilder)
      {
        return new Notification.BigPictureStyle(paramBuilder);
      }
      
      public static Notification.BigPictureStyle c(Notification.BigPictureStyle paramBigPictureStyle, CharSequence paramCharSequence)
      {
        return paramBigPictureStyle.setBigContentTitle(paramCharSequence);
      }
      
      public static void d(Notification.BigPictureStyle paramBigPictureStyle, Bitmap paramBitmap)
      {
        paramBigPictureStyle.bigLargeIcon(paramBitmap);
      }
      
      public static void e(Notification.BigPictureStyle paramBigPictureStyle, CharSequence paramCharSequence)
      {
        paramBigPictureStyle.setSummaryText(paramCharSequence);
      }
    }
    
    public static abstract class b
    {
      public static void a(Notification.BigPictureStyle paramBigPictureStyle, Icon paramIcon)
      {
        paramBigPictureStyle.bigLargeIcon(paramIcon);
      }
    }
    
    public static abstract class c
    {
      public static void a(Notification.BigPictureStyle paramBigPictureStyle, Icon paramIcon)
      {
        paramBigPictureStyle.bigPicture(paramIcon);
      }
      
      public static void b(Notification.BigPictureStyle paramBigPictureStyle, CharSequence paramCharSequence)
      {
        paramBigPictureStyle.setContentDescription(paramCharSequence);
      }
      
      public static void c(Notification.BigPictureStyle paramBigPictureStyle, boolean paramBoolean)
      {
        paramBigPictureStyle.showBigPictureWhenCollapsed(paramBoolean);
      }
    }
  }
  
  public static class c
    extends h.f
  {
    public CharSequence e;
    
    public void a(Bundle paramBundle)
    {
      super.a(paramBundle);
    }
    
    public void b(g paramg)
    {
      paramg = a.a(a.c(a.b(paramg.a()), b), e);
      if (d) {
        a.d(paramg, c);
      }
    }
    
    public String c()
    {
      return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
    
    public c h(CharSequence paramCharSequence)
    {
      e = h.e.e(paramCharSequence);
      return this;
    }
    
    public static abstract class a
    {
      public static Notification.BigTextStyle a(Notification.BigTextStyle paramBigTextStyle, CharSequence paramCharSequence)
      {
        return paramBigTextStyle.bigText(paramCharSequence);
      }
      
      public static Notification.BigTextStyle b(Notification.Builder paramBuilder)
      {
        return new Notification.BigTextStyle(paramBuilder);
      }
      
      public static Notification.BigTextStyle c(Notification.BigTextStyle paramBigTextStyle, CharSequence paramCharSequence)
      {
        return paramBigTextStyle.setBigContentTitle(paramCharSequence);
      }
      
      public static Notification.BigTextStyle d(Notification.BigTextStyle paramBigTextStyle, CharSequence paramCharSequence)
      {
        return paramBigTextStyle.setSummaryText(paramCharSequence);
      }
    }
  }
  
  public static final abstract class d
  {
    public static Notification.BubbleMetadata a(d paramd)
    {
      return null;
    }
  }
  
  public static class e
  {
    public boolean A;
    public boolean B;
    public String C;
    public Bundle D;
    public int E = 0;
    public int F = 0;
    public Notification G;
    public RemoteViews H;
    public RemoteViews I;
    public RemoteViews J;
    public String K;
    public int L = 0;
    public String M;
    public long N;
    public int O = 0;
    public int P = 0;
    public boolean Q;
    public Notification R;
    public boolean S;
    public Object T;
    public ArrayList U;
    public Context a;
    public ArrayList b = new ArrayList();
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public PendingIntent h;
    public RemoteViews i;
    public Bitmap j;
    public CharSequence k;
    public int l;
    public int m;
    public boolean n = true;
    public boolean o;
    public h.f p;
    public CharSequence q;
    public CharSequence r;
    public CharSequence[] s;
    public int t;
    public int u;
    public boolean v;
    public String w;
    public boolean x;
    public String y;
    public boolean z = false;
    
    public e(Context paramContext)
    {
      this(paramContext, null);
    }
    
    public e(Context paramContext, String paramString)
    {
      Notification localNotification = new Notification();
      R = localNotification;
      a = paramContext;
      K = paramString;
      when = System.currentTimeMillis();
      R.audioStreamType = -1;
      m = 0;
      U = new ArrayList();
      Q = true;
    }
    
    public static CharSequence e(CharSequence paramCharSequence)
    {
      if (paramCharSequence == null) {
        return paramCharSequence;
      }
      CharSequence localCharSequence = paramCharSequence;
      if (paramCharSequence.length() > 5120) {
        localCharSequence = paramCharSequence.subSequence(0, 5120);
      }
      return localCharSequence;
    }
    
    public e A(CharSequence paramCharSequence)
    {
      R.tickerText = e(paramCharSequence);
      return this;
    }
    
    public e B(long[] paramArrayOfLong)
    {
      R.vibrate = paramArrayOfLong;
      return this;
    }
    
    public e C(int paramInt)
    {
      F = paramInt;
      return this;
    }
    
    public e D(long paramLong)
    {
      R.when = paramLong;
      return this;
    }
    
    public e a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      b.add(new h.a(paramInt, paramCharSequence, paramPendingIntent));
      return this;
    }
    
    public e b(h.a parama)
    {
      if (parama != null) {
        b.add(parama);
      }
      return this;
    }
    
    public Notification c()
    {
      return new i(this).c();
    }
    
    public Bundle d()
    {
      if (D == null) {
        D = new Bundle();
      }
      return D;
    }
    
    public final Bitmap f(Bitmap paramBitmap)
    {
      Object localObject = paramBitmap;
      if (paramBitmap != null) {
        if (Build.VERSION.SDK_INT >= 27)
        {
          localObject = paramBitmap;
        }
        else
        {
          localObject = a.getResources();
          int i1 = ((Resources)localObject).getDimensionPixelSize(b.b);
          int i2 = ((Resources)localObject).getDimensionPixelSize(b.a);
          if ((paramBitmap.getWidth() <= i1) && (paramBitmap.getHeight() <= i2)) {
            return paramBitmap;
          }
          double d1 = Math.min(i1 / Math.max(1, paramBitmap.getWidth()), i2 / Math.max(1, paramBitmap.getHeight()));
          localObject = Bitmap.createScaledBitmap(paramBitmap, (int)Math.ceil(paramBitmap.getWidth() * d1), (int)Math.ceil(paramBitmap.getHeight() * d1), true);
        }
      }
      return (Bitmap)localObject;
    }
    
    public e g(boolean paramBoolean)
    {
      o(16, paramBoolean);
      return this;
    }
    
    public e h(String paramString)
    {
      K = paramString;
      return this;
    }
    
    public e i(int paramInt)
    {
      E = paramInt;
      return this;
    }
    
    public e j(PendingIntent paramPendingIntent)
    {
      g = paramPendingIntent;
      return this;
    }
    
    public e k(CharSequence paramCharSequence)
    {
      f = e(paramCharSequence);
      return this;
    }
    
    public e l(CharSequence paramCharSequence)
    {
      e = e(paramCharSequence);
      return this;
    }
    
    public e m(int paramInt)
    {
      Notification localNotification = R;
      defaults = paramInt;
      if ((paramInt & 0x4) != 0) {
        flags |= 0x1;
      }
      return this;
    }
    
    public e n(PendingIntent paramPendingIntent)
    {
      R.deleteIntent = paramPendingIntent;
      return this;
    }
    
    public final void o(int paramInt, boolean paramBoolean)
    {
      Notification localNotification;
      if (paramBoolean)
      {
        localNotification = R;
        paramInt |= flags;
      }
      for (;;)
      {
        flags = paramInt;
        break;
        localNotification = R;
        paramInt &= flags;
      }
    }
    
    public e p(Bitmap paramBitmap)
    {
      j = f(paramBitmap);
      return this;
    }
    
    public e q(int paramInt1, int paramInt2, int paramInt3)
    {
      Notification localNotification = R;
      ledARGB = paramInt1;
      ledOnMS = paramInt2;
      ledOffMS = paramInt3;
      if ((paramInt2 != 0) && (paramInt3 != 0)) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      flags = (paramInt1 | flags & 0xFFFFFFFE);
      return this;
    }
    
    public e r(boolean paramBoolean)
    {
      z = paramBoolean;
      return this;
    }
    
    public e s(int paramInt)
    {
      l = paramInt;
      return this;
    }
    
    public e t(boolean paramBoolean)
    {
      o(2, paramBoolean);
      return this;
    }
    
    public e u(int paramInt)
    {
      m = paramInt;
      return this;
    }
    
    public e v(boolean paramBoolean)
    {
      n = paramBoolean;
      return this;
    }
    
    public e w(int paramInt)
    {
      R.icon = paramInt;
      return this;
    }
    
    public e x(Uri paramUri)
    {
      Notification localNotification = R;
      sound = paramUri;
      audioStreamType = -1;
      paramUri = a.e(a.c(a.b(), 4), 5);
      R.audioAttributes = a.a(paramUri);
      return this;
    }
    
    public e y(h.f paramf)
    {
      if (p != paramf)
      {
        p = paramf;
        if (paramf != null) {
          paramf.g(this);
        }
      }
      return this;
    }
    
    public e z(CharSequence paramCharSequence)
    {
      q = e(paramCharSequence);
      return this;
    }
    
    public static abstract class a
    {
      public static AudioAttributes a(AudioAttributes.Builder paramBuilder)
      {
        return paramBuilder.build();
      }
      
      public static AudioAttributes.Builder b()
      {
        return new AudioAttributes.Builder();
      }
      
      public static AudioAttributes.Builder c(AudioAttributes.Builder paramBuilder, int paramInt)
      {
        return paramBuilder.setContentType(paramInt);
      }
      
      public static AudioAttributes.Builder d(AudioAttributes.Builder paramBuilder, int paramInt)
      {
        return paramBuilder.setLegacyStreamType(paramInt);
      }
      
      public static AudioAttributes.Builder e(AudioAttributes.Builder paramBuilder, int paramInt)
      {
        return paramBuilder.setUsage(paramInt);
      }
    }
  }
  
  public static abstract class f
  {
    public h.e a;
    public CharSequence b;
    public CharSequence c;
    public boolean d = false;
    
    public void a(Bundle paramBundle)
    {
      if (d) {
        paramBundle.putCharSequence("android.summaryText", c);
      }
      Object localObject = b;
      if (localObject != null) {
        paramBundle.putCharSequence("android.title.big", (CharSequence)localObject);
      }
      localObject = c();
      if (localObject != null) {
        paramBundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", (String)localObject);
      }
    }
    
    public abstract void b(g paramg);
    
    public String c()
    {
      return null;
    }
    
    public RemoteViews d(g paramg)
    {
      return null;
    }
    
    public RemoteViews e(g paramg)
    {
      return null;
    }
    
    public RemoteViews f(g paramg)
    {
      return null;
    }
    
    public void g(h.e parame)
    {
      if (a != parame)
      {
        a = parame;
        if (parame != null) {
          parame.y(this);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     w.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */