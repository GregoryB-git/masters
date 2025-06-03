package w;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import v.b;

public class h$e
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
  
  public h$e(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public h$e(Context paramContext, String paramString)
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

/* Location:
 * Qualified Name:     w.h.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */