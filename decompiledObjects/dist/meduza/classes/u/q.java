package u;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public final class q
{
  public boolean A;
  public Notification B;
  @Deprecated
  public ArrayList<String> C;
  public Context a;
  public ArrayList<n> b = new ArrayList();
  public ArrayList<x> c = new ArrayList();
  public ArrayList<n> d = new ArrayList();
  public CharSequence e;
  public CharSequence f;
  public PendingIntent g;
  public IconCompat h;
  public int i;
  public int j;
  public boolean k = true;
  public boolean l;
  public s m;
  public CharSequence n;
  public int o;
  public int p;
  public boolean q;
  public String r;
  public boolean s = false;
  public boolean t;
  public boolean u;
  public Bundle v;
  public int w = 0;
  public int x = 0;
  public String y;
  public int z = 0;
  
  public q(Context paramContext, String paramString)
  {
    Notification localNotification = new Notification();
    B = localNotification;
    a = paramContext;
    y = paramString;
    when = System.currentTimeMillis();
    B.audioStreamType = -1;
    j = 0;
    C = new ArrayList();
    A = true;
  }
  
  public static CharSequence b(CharSequence paramCharSequence)
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
  
  public final Notification a()
  {
    Object localObject = new t(this);
    s locals = c.m;
    if (locals != null) {
      locals.b((t)localObject);
    }
    if (locals != null) {
      locals.e();
    }
    int i1 = Build.VERSION.SDK_INT;
    if ((i1 < 26) && (i1 < 24)) {
      b.setExtras(d);
    }
    Notification localNotification = b.build();
    c.getClass();
    if (locals != null) {
      locals.d();
    }
    if (locals != null) {
      c.m.getClass();
    }
    if (locals != null)
    {
      localObject = extras;
      if (localObject != null) {
        locals.a((Bundle)localObject);
      }
    }
    return localNotification;
  }
  
  public final void c(CharSequence paramCharSequence)
  {
    f = b(paramCharSequence);
  }
  
  public final void d(int paramInt, boolean paramBoolean)
  {
    Notification localNotification;
    if (paramBoolean)
    {
      localNotification = B;
      paramInt |= flags;
    }
    else
    {
      localNotification = B;
      paramInt &= flags;
    }
    flags = paramInt;
  }
  
  public final void e(Bitmap paramBitmap)
  {
    if (paramBitmap == null)
    {
      paramBitmap = null;
    }
    else
    {
      Object localObject = a;
      if (Build.VERSION.SDK_INT < 27)
      {
        localObject = ((Context)localObject).getResources();
        int i1 = ((Resources)localObject).getDimensionPixelSize(2131165273);
        int i2 = ((Resources)localObject).getDimensionPixelSize(2131165272);
        if ((paramBitmap.getWidth() > i1) || (paramBitmap.getHeight() > i2))
        {
          double d1 = Math.min(i1 / Math.max(1, paramBitmap.getWidth()), i2 / Math.max(1, paramBitmap.getHeight()));
          paramBitmap = Bitmap.createScaledBitmap(paramBitmap, (int)Math.ceil(paramBitmap.getWidth() * d1), (int)Math.ceil(paramBitmap.getHeight() * d1), true);
        }
      }
      localObject = IconCompat.k;
      paramBitmap.getClass();
      localObject = new IconCompat(1);
      b = paramBitmap;
      paramBitmap = (Bitmap)localObject;
    }
    h = paramBitmap;
  }
  
  public final void f(int paramInt1, int paramInt2)
  {
    o = paramInt1;
    p = paramInt2;
    q = false;
  }
  
  public final void g(s params)
  {
    if (m != params)
    {
      m = params;
      if (params != null) {
        params.f(this);
      }
    }
  }
  
  public static final class a
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
 * Qualified Name:     u.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */