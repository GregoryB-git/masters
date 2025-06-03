package i2;

import android.graphics.Rect;
import ec.i;
import f2.a;

public final class c
  implements b
{
  public final a a;
  public final a b;
  public final b.b c;
  
  public c(a parama, a parama1, b.b paramb)
  {
    a = parama;
    b = parama1;
    c = paramb;
    int i = c;
    int j = a;
    int k = 0;
    if ((i - j == 0) && (d - b == 0)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      if (j != 0)
      {
        i = k;
        if (b != 0) {}
      }
      else
      {
        i = 1;
      }
      if (i != 0) {
        return;
      }
      throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
    }
    throw new IllegalArgumentException("Bounds must be non zero".toString());
  }
  
  public final b.a a()
  {
    Object localObject = a;
    if ((c - a != 0) && (d - b != 0)) {
      localObject = b.a.c;
    } else {
      localObject = b.a.b;
    }
    return (b.a)localObject;
  }
  
  public final b.b e()
  {
    return c;
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
    if (!i.a(c.class, localClass)) {
      return false;
    }
    i.c(paramObject, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    paramObject = (c)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    if (!i.a(b, b)) {
      return false;
    }
    return i.a(c, c);
  }
  
  public final Rect getBounds()
  {
    a locala = a;
    locala.getClass();
    return new Rect(a, b, c, d);
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    return c.hashCode() + (j + i * 31) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(c.class.getSimpleName());
    localStringBuilder.append(" { ");
    localStringBuilder.append(a);
    localStringBuilder.append(", type=");
    localStringBuilder.append(b);
    localStringBuilder.append(", state=");
    localStringBuilder.append(c);
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public static final a b = new a("FOLD");
    public static final a c = new a("HINGE");
    public final String a;
    
    public a(String paramString)
    {
      a = paramString;
    }
    
    public final String toString()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     i2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */