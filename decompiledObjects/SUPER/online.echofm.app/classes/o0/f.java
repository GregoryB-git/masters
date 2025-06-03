package o0;

import Q0.a;

public final class f
{
  public final a[] a;
  public final long[] b;
  public final String c;
  public final String d;
  public final long e;
  
  public f(String paramString1, String paramString2, long paramLong, long[] paramArrayOfLong, a[] paramArrayOfa)
  {
    c = paramString1;
    d = paramString2;
    e = paramLong;
    b = paramArrayOfLong;
    a = paramArrayOfa;
  }
  
  public String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(c);
    localStringBuilder.append("/");
    localStringBuilder.append(d);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     o0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */