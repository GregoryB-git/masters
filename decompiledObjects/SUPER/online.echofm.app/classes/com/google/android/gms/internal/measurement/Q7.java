package com.google.android.gms.internal.measurement;

public enum Q7
{
  public final int o;
  
  static
  {
    Q7 localQ71 = new Q7("DEBUG", 0, 3);
    p = localQ71;
    Q7 localQ72 = new Q7("ERROR", 1, 6);
    q = localQ72;
    Q7 localQ73 = new Q7("INFO", 2, 4);
    r = localQ73;
    Q7 localQ74 = new Q7("VERBOSE", 3, 2);
    s = localQ74;
    Q7 localQ75 = new Q7("WARN", 4, 5);
    t = localQ75;
    u = new Q7[] { localQ71, localQ72, localQ73, localQ74, localQ75 };
  }
  
  public Q7(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static Q7 c(int paramInt)
  {
    if (paramInt != 2)
    {
      if (paramInt != 3)
      {
        if (paramInt != 5)
        {
          if (paramInt != 6) {
            return r;
          }
          return q;
        }
        return t;
      }
      return p;
    }
    return s;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.Q7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */