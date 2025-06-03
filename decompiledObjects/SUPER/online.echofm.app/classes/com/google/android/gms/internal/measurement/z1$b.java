package com.google.android.gms.internal.measurement;

public enum z1$b
  implements e4
{
  public static final d4 u = new C1();
  public final int o;
  
  static
  {
    b localb1 = new b("UNKNOWN_COMPARISON_TYPE", 0, 0);
    p = localb1;
    b localb2 = new b("LESS_THAN", 1, 1);
    q = localb2;
    b localb3 = new b("GREATER_THAN", 2, 2);
    r = localb3;
    b localb4 = new b("EQUAL", 3, 3);
    s = localb4;
    b localb5 = new b("BETWEEN", 4, 4);
    t = localb5;
    v = new b[] { localb1, localb2, localb3, localb4, localb5 };
  }
  
  public z1$b(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static b c(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4) {
              return null;
            }
            return t;
          }
          return s;
        }
        return r;
      }
      return q;
    }
    return p;
  }
  
  public static g4 e()
  {
    return D1.a;
  }
  
  public final int a()
  {
    return o;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(b.class.getName());
    localStringBuilder.append('@');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" number=");
    localStringBuilder.append(o);
    localStringBuilder.append(" name=");
    localStringBuilder.append(name());
    localStringBuilder.append('>');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.z1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */