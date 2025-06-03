package i2;

import android.graphics.Rect;
import e0.s0;
import ec.i;
import f;
import f2.a;

public final class l
{
  public final a a;
  public final s0 b;
  
  public l(Rect paramRect, s0 params0)
  {
    this(new a(paramRect), params0);
  }
  
  public l(a parama, s0 params0)
  {
    a = parama;
    b = params0;
  }
  
  public final Rect a()
  {
    a locala = a;
    locala.getClass();
    return new Rect(a, b, c, d);
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
    if (!i.a(l.class, localClass)) {
      return false;
    }
    i.c(paramObject, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
    paramObject = (l)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    return i.a(b, b);
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() + i * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("WindowMetrics( bounds=");
    localStringBuilder.append(a);
    localStringBuilder.append(", windowInsetsCompat=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     i2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */