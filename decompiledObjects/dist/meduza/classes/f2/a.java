package f2;

import a0.j;
import android.graphics.Rect;
import ec.i;
import f;

public final class a
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  
  public a(Rect paramRect)
  {
    a = i;
    b = j;
    c = k;
    d = m;
    int n = 1;
    int i1;
    if (i <= k) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0)
    {
      if (j <= m) {
        i1 = n;
      } else {
        i1 = 0;
      }
      if (i1 != 0) {
        return;
      }
      throw new IllegalArgumentException(f.i("top must be less than or equal to bottom, top: ", j, ", bottom: ", m).toString());
    }
    throw new IllegalArgumentException(f.i("Left must be less than or equal to right, left: ", i, ", right: ", k).toString());
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
    i.c(paramObject, "null cannot be cast to non-null type androidx.window.core.Bounds");
    paramObject = (a)paramObject;
    if (a != a) {
      return false;
    }
    if (b != b) {
      return false;
    }
    if (c != c) {
      return false;
    }
    return d == d;
  }
  
  public final int hashCode()
  {
    return ((a * 31 + b) * 31 + c) * 31 + d;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a.class.getSimpleName());
    localStringBuilder.append(" { [");
    localStringBuilder.append(a);
    localStringBuilder.append(',');
    localStringBuilder.append(b);
    localStringBuilder.append(',');
    localStringBuilder.append(c);
    localStringBuilder.append(',');
    return j.m(localStringBuilder, d, "] }");
  }
}

/* Location:
 * Qualified Name:     f2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */