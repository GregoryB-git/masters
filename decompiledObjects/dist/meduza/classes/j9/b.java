package j9;

import a0.j;
import f;

public final class b
  extends k.a
{
  public final q c;
  public final i d;
  public final int e;
  
  public b(q paramq, i parami, int paramInt)
  {
    if (paramq != null)
    {
      c = paramq;
      if (parami != null)
      {
        d = parami;
        e = paramInt;
        return;
      }
      throw new NullPointerException("Null documentKey");
    }
    throw new NullPointerException("Null readTime");
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof k.a))
    {
      paramObject = (k.a)paramObject;
      if ((!c.equals(((k.a)paramObject).l())) || (!d.equals(((k.a)paramObject).h())) || (e != ((k.a)paramObject).i())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final i h()
  {
    return d;
  }
  
  public final int hashCode()
  {
    return ((c.hashCode() ^ 0xF4243) * 1000003 ^ d.hashCode()) * 1000003 ^ e;
  }
  
  public final int i()
  {
    return e;
  }
  
  public final q l()
  {
    return c;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("IndexOffset{readTime=");
    localStringBuilder.append(c);
    localStringBuilder.append(", documentKey=");
    localStringBuilder.append(d);
    localStringBuilder.append(", largestBatchId=");
    return j.m(localStringBuilder, e, "}");
  }
}

/* Location:
 * Qualified Name:     j9.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */