package l8;

import f;

public final class b
  extends k
{
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final long f;
  
  public b(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    if (paramString1 != null)
    {
      b = paramString1;
      if (paramString2 != null)
      {
        c = paramString2;
        if (paramString3 != null)
        {
          d = paramString3;
          if (paramString4 != null)
          {
            e = paramString4;
            f = paramLong;
            return;
          }
          throw new NullPointerException("Null variantId");
        }
        throw new NullPointerException("Null parameterValue");
      }
      throw new NullPointerException("Null parameterKey");
    }
    throw new NullPointerException("Null rolloutId");
  }
  
  public final String b()
  {
    return c;
  }
  
  public final String c()
  {
    return d;
  }
  
  public final String d()
  {
    return b;
  }
  
  public final long e()
  {
    return f;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof k))
    {
      paramObject = (k)paramObject;
      if ((!b.equals(((k)paramObject).d())) || (!c.equals(((k)paramObject).b())) || (!d.equals(((k)paramObject).c())) || (!e.equals(((k)paramObject).f())) || (f != ((k)paramObject).e())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final String f()
  {
    return e;
  }
  
  public final int hashCode()
  {
    int i = b.hashCode();
    int j = c.hashCode();
    int k = d.hashCode();
    int m = e.hashCode();
    long l = f;
    return ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ (int)(l ^ l >>> 32);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("RolloutAssignment{rolloutId=");
    localStringBuilder.append(b);
    localStringBuilder.append(", parameterKey=");
    localStringBuilder.append(c);
    localStringBuilder.append(", parameterValue=");
    localStringBuilder.append(d);
    localStringBuilder.append(", variantId=");
    localStringBuilder.append(e);
    localStringBuilder.append(", templateVersion=");
    localStringBuilder.append(f);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     l8.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */