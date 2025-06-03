package com.google.firebase.remoteconfig.internal;

public enum c$b
{
  public final String o;
  
  static
  {
    b localb1 = new b("BASE", 0, "BASE");
    p = localb1;
    b localb2 = new b("REALTIME", 1, "REALTIME");
    q = localb2;
    r = new b[] { localb1, localb2 };
  }
  
  public c$b(String paramString1)
  {
    o = paramString1;
  }
  
  public String c()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.remoteconfig.internal.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */