package com.google.android.gms.internal.measurement;

public enum I1$d
  implements e4
{
  public static final d4 s = new P1();
  public final int o;
  
  static
  {
    d locald1 = new d("CONSENT_STATUS_UNSPECIFIED", 0, 0);
    p = locald1;
    d locald2 = new d("GRANTED", 1, 1);
    q = locald2;
    d locald3 = new d("DENIED", 2, 2);
    r = locald3;
    t = new d[] { locald1, locald2, locald3 };
  }
  
  public I1$d(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static d c(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return null;
        }
        return r;
      }
      return q;
    }
    return p;
  }
  
  public static g4 e()
  {
    return Q1.a;
  }
  
  public final int a()
  {
    return o;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(d.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.measurement.I1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */