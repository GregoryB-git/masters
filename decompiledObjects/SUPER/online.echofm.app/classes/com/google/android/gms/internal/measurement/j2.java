package com.google.android.gms.internal.measurement;

public enum j2
  implements e4
{
  public static final d4 v = new i2();
  public final int o;
  
  static
  {
    j2 localj21 = new j2("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN", 0, 0);
    p = localj21;
    j2 localj22 = new j2("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED", 1, 1);
    q = localj22;
    j2 localj23 = new j2("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED", 2, 2);
    r = localj23;
    j2 localj24 = new j2("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED", 3, 3);
    s = localj24;
    j2 localj25 = new j2("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED", 4, 4);
    t = localj25;
    j2 localj26 = new j2("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED", 5, 5);
    u = localj26;
    w = new j2[] { localj21, localj22, localj23, localj24, localj25, localj26 };
  }
  
  public j2(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static j2 c(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              if (paramInt != 5) {
                return null;
              }
              return u;
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
    return k2.a;
  }
  
  public final int a()
  {
    return o;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(j2.class.getName());
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
 * Qualified Name:     com.google.android.gms.internal.measurement.j2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */