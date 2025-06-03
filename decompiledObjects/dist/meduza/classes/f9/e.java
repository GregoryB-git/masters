package f9;

import j9.q;

public final class e
  implements c
{
  public final String a;
  public final int b;
  public final q c;
  public final int d;
  public final long e;
  
  public e(String paramString, int paramInt1, q paramq, int paramInt2, long paramLong)
  {
    a = paramString;
    b = paramInt1;
    c = paramq;
    d = paramInt2;
    e = paramLong;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (e.class == paramObject.getClass()))
    {
      paramObject = (e)paramObject;
      if (b != b) {
        return false;
      }
      if (d != d) {
        return false;
      }
      if (e != e) {
        return false;
      }
      if (!a.equals(a)) {
        return false;
      }
      return c.equals(c);
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b;
    int k = d;
    long l = e;
    int m = (int)(l ^ l >>> 32);
    return c.hashCode() + (((i * 31 + j) * 31 + k) * 31 + m) * 31;
  }
}

/* Location:
 * Qualified Name:     f9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */