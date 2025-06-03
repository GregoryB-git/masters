package com.google.firebase.remoteconfig.internal;

import P4.q;
import P4.s;

public class f
  implements q
{
  public final long a;
  public final int b;
  public final s c;
  
  public f(long paramLong, int paramInt, s params)
  {
    a = paramLong;
    b = paramInt;
    c = params;
  }
  
  public static b d()
  {
    return new b(null);
  }
  
  public long a()
  {
    return a;
  }
  
  public s b()
  {
    return c;
  }
  
  public int c()
  {
    return b;
  }
  
  public static class b
  {
    public long a;
    public int b;
    public s c;
    
    public f a()
    {
      return new f(a, b, c, null);
    }
    
    public b b(s params)
    {
      c = params;
      return this;
    }
    
    public b c(int paramInt)
    {
      b = paramInt;
      return this;
    }
    
    public b d(long paramLong)
    {
      a = paramLong;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.remoteconfig.internal.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */