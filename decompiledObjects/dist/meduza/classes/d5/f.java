package d5;

import r4.a;

public final class f
{
  public final a[] a;
  public final long[] b;
  public final String c;
  public final String d;
  
  public f(String paramString1, String paramString2, long[] paramArrayOfLong, a[] paramArrayOfa)
  {
    c = paramString1;
    d = paramString2;
    b = paramArrayOfLong;
    a = paramArrayOfa;
  }
  
  public final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(c);
    localStringBuilder.append("/");
    localStringBuilder.append(d);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */