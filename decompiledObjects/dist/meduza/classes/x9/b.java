package x9;

public final class b
  extends f
{
  public final String a;
  public final long b;
  public final int c;
  
  public b(String paramString, long paramLong, int paramInt)
  {
    a = paramString;
    b = paramLong;
    c = paramInt;
  }
  
  public final int a()
  {
    return c;
  }
  
  public final String b()
  {
    return a;
  }
  
  public final long c()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      String str = a;
      if ((str == null ? ((f)paramObject).b() == null : str.equals(((f)paramObject).b())) && (b == ((f)paramObject).c()))
      {
        int i = c;
        int j = ((f)paramObject).a();
        if (i == 0 ? j == 0 : q0.g.b(i, j)) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = a;
    int i = 0;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    long l = b;
    int k = (int)(l ^ l >>> 32);
    int m = c;
    if (m != 0) {
      i = q0.g.c(m);
    }
    return ((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("TokenResult{token=");
    localStringBuilder.append(a);
    localStringBuilder.append(", tokenExpirationTimestamp=");
    localStringBuilder.append(b);
    localStringBuilder.append(", responseCode=");
    localStringBuilder.append(g.u(c));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends f.a
  {
    public Long a;
    public int b;
    
    public final b a()
    {
      String str;
      if (a == null) {
        str = " tokenExpirationTimestamp";
      } else {
        str = "";
      }
      if (str.isEmpty()) {
        return new b(null, a.longValue(), b);
      }
      throw new IllegalStateException(g.d("Missing required properties:", str));
    }
  }
}

/* Location:
 * Qualified Name:     x9.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */