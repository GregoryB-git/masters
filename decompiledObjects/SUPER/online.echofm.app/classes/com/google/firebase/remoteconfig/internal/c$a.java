package com.google.firebase.remoteconfig.internal;

import java.util.Date;

public class c$a
{
  public final Date a;
  public final int b;
  public final b c;
  public final String d;
  
  public c$a(Date paramDate, int paramInt, b paramb, String paramString)
  {
    a = paramDate;
    b = paramInt;
    c = paramb;
    d = paramString;
  }
  
  public static a a(Date paramDate, b paramb)
  {
    return new a(paramDate, 1, paramb, null);
  }
  
  public static a b(b paramb, String paramString)
  {
    return new a(paramb.g(), 0, paramb, paramString);
  }
  
  public static a c(Date paramDate)
  {
    return new a(paramDate, 2, null, null);
  }
  
  public b d()
  {
    return c;
  }
  
  public String e()
  {
    return d;
  }
  
  public int f()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.remoteconfig.internal.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */