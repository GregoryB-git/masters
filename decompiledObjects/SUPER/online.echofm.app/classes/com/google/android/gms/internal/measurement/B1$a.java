package com.google.android.gms.internal.measurement;

public enum B1$a
  implements e4
{
  public static final d4 w = new G1();
  public final int o;
  
  static
  {
    a locala1 = new a("UNKNOWN_MATCH_TYPE", 0, 0);
    p = locala1;
    a locala2 = new a("REGEXP", 1, 1);
    q = locala2;
    a locala3 = new a("BEGINS_WITH", 2, 2);
    r = locala3;
    a locala4 = new a("ENDS_WITH", 3, 3);
    s = locala4;
    a locala5 = new a("PARTIAL", 4, 4);
    t = locala5;
    a locala6 = new a("EXACT", 5, 5);
    u = locala6;
    a locala7 = new a("IN_LIST", 6, 6);
    v = locala7;
    x = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7 };
  }
  
  public B1$a(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static a c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 6: 
      return v;
    case 5: 
      return u;
    case 4: 
      return t;
    case 3: 
      return s;
    case 2: 
      return r;
    case 1: 
      return q;
    }
    return p;
  }
  
  public static g4 e()
  {
    return E1.a;
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
 * Qualified Name:     com.google.android.gms.internal.measurement.B1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */