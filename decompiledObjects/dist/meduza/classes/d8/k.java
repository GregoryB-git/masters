package d8;

import f;
import g;

public final class k
{
  public final t<?> a;
  public final int b;
  public final int c;
  
  public k(int paramInt1, int paramInt2, Class paramClass)
  {
    this(t.a(paramClass), paramInt1, paramInt2);
  }
  
  public k(t<?> paramt, int paramInt1, int paramInt2)
  {
    if (paramt != null)
    {
      a = paramt;
      b = paramInt1;
      c = paramInt2;
      return;
    }
    throw new NullPointerException("Null dependency anInterface.");
  }
  
  public static k a(Class<?> paramClass)
  {
    return new k(0, 2, paramClass);
  }
  
  public static k b(Class<?> paramClass)
  {
    return new k(0, 1, paramClass);
  }
  
  public static k c(t<?> paramt)
  {
    return new k(paramt, 1, 0);
  }
  
  public static k d(Class<?> paramClass)
  {
    return new k(1, 0, paramClass);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof k;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (k)paramObject;
      bool3 = bool2;
      if (a.equals(a))
      {
        bool3 = bool2;
        if (b == b)
        {
          bool3 = bool2;
          if (c == c) {
            bool3 = true;
          }
        }
      }
    }
    return bool3;
  }
  
  public final int hashCode()
  {
    return ((a.hashCode() ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ c;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Dependency{anInterface=");
    localStringBuilder.append(a);
    localStringBuilder.append(", type=");
    int i = b;
    String str;
    if (i == 1) {
      str = "required";
    } else if (i == 0) {
      str = "optional";
    } else {
      str = "set";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(", injection=");
    i = c;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2) {
          str = "deferred";
        } else {
          throw new AssertionError(f.h("Unsupported injection: ", i));
        }
      }
      else {
        str = "provider";
      }
    }
    else {
      str = "direct";
    }
    return g.f(localStringBuilder, str, "}");
  }
}

/* Location:
 * Qualified Name:     d8.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */