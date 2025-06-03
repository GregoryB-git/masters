package com.google.android.gms.internal.measurement;

public enum I1$e
  implements e4
{
  public static final d4 u = new S1();
  public final int o;
  
  static
  {
    e locale1 = new e("CONSENT_TYPE_UNSPECIFIED", 0, 0);
    p = locale1;
    e locale2 = new e("AD_STORAGE", 1, 1);
    q = locale2;
    e locale3 = new e("ANALYTICS_STORAGE", 2, 2);
    r = locale3;
    e locale4 = new e("AD_USER_DATA", 3, 3);
    s = locale4;
    e locale5 = new e("AD_PERSONALIZATION", 4, 4);
    t = locale5;
    v = new e[] { locale1, locale2, locale3, locale4, locale5 };
  }
  
  public I1$e(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static e c(int paramInt)
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
    return R1.a;
  }
  
  public final int a()
  {
    return o;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(e.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.measurement.I1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */