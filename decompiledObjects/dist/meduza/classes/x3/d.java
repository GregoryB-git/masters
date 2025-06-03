package x3;

import aa.w;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import v3.g;
import v5.e0;

public final class d
  implements g
{
  public static final d o = new d(0, 0, 1, 1, 0);
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public c f;
  
  static
  {
    e0.E(0);
    e0.E(1);
    e0.E(2);
    e0.E(3);
    e0.E(4);
  }
  
  public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramInt4;
    e = paramInt5;
  }
  
  public final c a()
  {
    if (f == null) {
      f = new c(this);
    }
    return f;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d.class == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      if ((a != a) || (b != b) || (c != c) || (d != d) || (e != e)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((((527 + a) * 31 + b) * 31 + c) * 31 + d) * 31 + e;
  }
  
  public static final class a
  {
    public static void a(AudioAttributes.Builder paramBuilder, int paramInt)
    {
      w.k(paramBuilder, paramInt);
    }
  }
  
  public static final class b
  {
    public static void a(AudioAttributes.Builder paramBuilder, int paramInt)
    {
      paramBuilder.setSpatializationBehavior(paramInt);
    }
  }
  
  public static final class c
  {
    public final AudioAttributes a;
    
    public c(d paramd)
    {
      AudioAttributes.Builder localBuilder = new AudioAttributes.Builder().setContentType(a).setFlags(b).setUsage(c);
      int i = e0.a;
      if (i >= 29) {
        d.a.a(localBuilder, d);
      }
      if (i >= 32) {
        d.b.a(localBuilder, e);
      }
      a = localBuilder.build();
    }
  }
}

/* Location:
 * Qualified Name:     x3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */