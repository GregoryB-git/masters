package o2;

import a0.j;
import android.net.Uri;
import android.os.Build.VERSION;
import ec.i;
import f;
import java.util.Collection;
import java.util.Set;
import q0.g;
import sb.u;

public final class c
{
  public static final c i = new c(1, false, false, false, false, -1L, -1L, u.a);
  public final int a;
  public final boolean b;
  public final boolean c;
  public final boolean d;
  public final boolean e;
  public final long f;
  public final long g;
  public final Set<a> h;
  
  public c(Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, long paramLong1, long paramLong2, Set<a> paramSet)
  {
    a = paramObject;
    b = paramBoolean1;
    c = paramBoolean2;
    d = paramBoolean3;
    e = paramBoolean4;
    f = paramLong1;
    g = paramLong2;
    h = paramSet;
  }
  
  public c(c paramc)
  {
    b = b;
    c = c;
    a = a;
    d = d;
    e = e;
    h = h;
    f = f;
    g = g;
  }
  
  public final boolean a()
  {
    int j = Build.VERSION.SDK_INT;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (j >= 24) {
      if ((h.isEmpty() ^ true)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramObject != null) {
      if (!i.a(c.class, paramObject.getClass()))
      {
        bool2 = bool1;
      }
      else
      {
        paramObject = (c)paramObject;
        if (b != b) {
          return false;
        }
        if (c != c) {
          return false;
        }
        if (d != d) {
          return false;
        }
        if (e != e) {
          return false;
        }
        if (f != f) {
          return false;
        }
        if (g != g) {
          return false;
        }
        if (a != a) {
          bool2 = bool1;
        } else {
          bool2 = i.a(h, h);
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    int j = g.c(a);
    int k = b;
    int m = c;
    int n = d;
    int i1 = e;
    long l = f;
    int i2 = (int)(l ^ l >>> 32);
    l = g;
    int i3 = (int)(l ^ l >>> 32);
    return h.hashCode() + ((((((j * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Constraints{requiredNetworkType=");
    localStringBuilder.append(j.x(a));
    localStringBuilder.append(", requiresCharging=");
    localStringBuilder.append(b);
    localStringBuilder.append(", requiresDeviceIdle=");
    localStringBuilder.append(c);
    localStringBuilder.append(", requiresBatteryNotLow=");
    localStringBuilder.append(d);
    localStringBuilder.append(", requiresStorageNotLow=");
    localStringBuilder.append(e);
    localStringBuilder.append(", contentTriggerUpdateDelayMillis=");
    localStringBuilder.append(f);
    localStringBuilder.append(", contentTriggerMaxDelayMillis=");
    localStringBuilder.append(g);
    localStringBuilder.append(", contentUriTriggers=");
    localStringBuilder.append(h);
    localStringBuilder.append(", }");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final Uri a;
    public final boolean b;
    
    public a(boolean paramBoolean, Uri paramUri)
    {
      a = paramUri;
      b = paramBoolean;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      Class localClass;
      if (paramObject != null) {
        localClass = paramObject.getClass();
      } else {
        localClass = null;
      }
      if (!i.a(a.class, localClass)) {
        return false;
      }
      i.c(paramObject, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
      paramObject = (a)paramObject;
      if (!i.a(a, a)) {
        return false;
      }
      return b == b;
    }
    
    public final int hashCode()
    {
      int i = a.hashCode();
      int j;
      if (b) {
        j = 1231;
      } else {
        j = 1237;
      }
      return i * 31 + j;
    }
  }
}

/* Location:
 * Qualified Name:     o2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */