package A;

import android.graphics.Insets;
import android.graphics.Rect;

public final class f
{
  public static final f e = new f(0, 0, 0, 0);
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  
  public f(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramInt4;
  }
  
  public static f a(f paramf1, f paramf2)
  {
    return b(Math.max(a, a), Math.max(b, b), Math.max(c, c), Math.max(d, d));
  }
  
  public static f b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0)) {
      return e;
    }
    return new f(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static f c(Rect paramRect)
  {
    return b(left, top, right, bottom);
  }
  
  public static f d(Insets paramInsets)
  {
    return b(b.a(paramInsets), c.a(paramInsets), d.a(paramInsets), e.a(paramInsets));
  }
  
  public Insets e()
  {
    return a.a(a, b, c, d);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (f.class == paramObject.getClass()))
    {
      paramObject = (f)paramObject;
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
  
  public int hashCode()
  {
    return ((a * 31 + b) * 31 + c) * 31 + d;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Insets{left=");
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
  
  public static abstract class a
  {
    public static Insets a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return Insets.of(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
}

/* Location:
 * Qualified Name:     A.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */