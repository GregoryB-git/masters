package B3;

public final class r
{
  public final F a;
  public final int b;
  public final int c;
  
  public r(F paramF, int paramInt1, int paramInt2)
  {
    a = ((F)E.c(paramF, "Null dependency anInterface."));
    b = paramInt1;
    c = paramInt2;
  }
  
  public r(Class paramClass, int paramInt1, int paramInt2)
  {
    this(F.b(paramClass), paramInt1, paramInt2);
  }
  
  public static r a(Class paramClass)
  {
    return new r(paramClass, 0, 2);
  }
  
  public static String b(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt == 2) {
          return "deferred";
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unsupported injection: ");
        localStringBuilder.append(paramInt);
        throw new AssertionError(localStringBuilder.toString());
      }
      return "provider";
    }
    return "direct";
  }
  
  public static r h(Class paramClass)
  {
    return new r(paramClass, 0, 0);
  }
  
  public static r i(Class paramClass)
  {
    return new r(paramClass, 0, 1);
  }
  
  public static r j(F paramF)
  {
    return new r(paramF, 1, 0);
  }
  
  public static r k(Class paramClass)
  {
    return new r(paramClass, 1, 0);
  }
  
  public static r l(F paramF)
  {
    return new r(paramF, 1, 1);
  }
  
  public static r m(Class paramClass)
  {
    return new r(paramClass, 1, 1);
  }
  
  public static r n(Class paramClass)
  {
    return new r(paramClass, 2, 0);
  }
  
  public F c()
  {
    return a;
  }
  
  public boolean d()
  {
    boolean bool;
    if (c == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean e()
  {
    boolean bool;
    if (c == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof r;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (r)paramObject;
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
  
  public boolean f()
  {
    int i = b;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean g()
  {
    boolean bool;
    if (b == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return ((a.hashCode() ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ c;
  }
  
  public String toString()
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
    localStringBuilder.append(b(c));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     B3.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */