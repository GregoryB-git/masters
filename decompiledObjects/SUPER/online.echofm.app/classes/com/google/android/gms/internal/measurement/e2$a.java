package com.google.android.gms.internal.measurement;

public enum e2$a
  implements e4
{
  public static final d4 r = new m2();
  public final int o;
  
  static
  {
    a locala1 = new a("RADS", 0, 1);
    p = locala1;
    a locala2 = new a("PROVISIONING", 1, 2);
    q = locala2;
    s = new a[] { locala1, locala2 };
  }
  
  public e2$a(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static a c(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2) {
        return null;
      }
      return q;
    }
    return p;
  }
  
  public static g4 e()
  {
    return l2.a;
  }
  
  public final int a()
  {
    return o;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(a.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.measurement.e2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */