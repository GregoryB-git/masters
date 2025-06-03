package d0;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import g0.M;

public final class b
{
  public static final b g = new e().a();
  public static final String h = M.w0(0);
  public static final String i = M.w0(1);
  public static final String j = M.w0(2);
  public static final String k = M.w0(3);
  public static final String l = M.w0(4);
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public d f;
  
  public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramInt4;
    e = paramInt5;
  }
  
  public d a()
  {
    if (f == null) {
      f = new d(this, null);
    }
    return f;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((a != a) || (b != b) || (c != c) || (d != d) || (e != e)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((((527 + a) * 31 + b) * 31 + c) * 31 + d) * 31 + e;
  }
  
  public static final abstract class b
  {
    public static void a(AudioAttributes.Builder paramBuilder, int paramInt)
    {
      c.a(paramBuilder, paramInt);
    }
  }
  
  public static final abstract class c
  {
    public static void a(AudioAttributes.Builder paramBuilder, int paramInt)
    {
      d.a(paramBuilder, paramInt);
    }
  }
  
  public static final class d
  {
    public final AudioAttributes a;
    
    public d(b paramb)
    {
      AudioAttributes.Builder localBuilder = new AudioAttributes.Builder().setContentType(a).setFlags(b).setUsage(c);
      int i = M.a;
      if (i >= 29) {
        b.b.a(localBuilder, d);
      }
      if (i >= 32) {
        b.c.a(localBuilder, e);
      }
      a = localBuilder.build();
    }
  }
  
  public static final class e
  {
    public int a = 0;
    public int b = 0;
    public int c = 1;
    public int d = 1;
    public int e = 0;
    
    public b a()
    {
      return new b(a, b, c, d, e, null);
    }
    
    public e b(int paramInt)
    {
      a = paramInt;
      return this;
    }
    
    public e c(int paramInt)
    {
      b = paramInt;
      return this;
    }
    
    public e d(int paramInt)
    {
      c = paramInt;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     d0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */