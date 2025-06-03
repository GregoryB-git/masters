package x;

import android.graphics.Insets;
import f;

public final class b
{
  public static final b e = new b(0, 0, 0, 0);
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  
  public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramInt4;
  }
  
  public static b a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0)) {
      return e;
    }
    return new b(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final Insets b()
  {
    return a.a(a, b, c, d);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if (d != d) {
        return false;
      }
      if (a != a) {
        return false;
      }
      if (c != c) {
        return false;
      }
      return b == b;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((a * 31 + b) * 31 + c) * 31 + d;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Insets{left=");
    localStringBuilder.append(a);
    localStringBuilder.append(", top=");
    localStringBuilder.append(b);
    localStringBuilder.append(", right=");
    localStringBuilder.append(c);
    localStringBuilder.append(", bottom=");
    localStringBuilder.append(d);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public static Insets a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return Insets.of(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
}

/* Location:
 * Qualified Name:     x.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */