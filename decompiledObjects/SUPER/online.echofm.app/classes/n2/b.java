package n2;

import f2.i;
import f2.p;

public final class b
  extends k
{
  public final long a;
  public final p b;
  public final i c;
  
  public b(long paramLong, p paramp, i parami)
  {
    a = paramLong;
    if (paramp != null)
    {
      b = paramp;
      if (parami != null)
      {
        c = parami;
        return;
      }
      throw new NullPointerException("Null event");
    }
    throw new NullPointerException("Null transportContext");
  }
  
  public i b()
  {
    return c;
  }
  
  public long c()
  {
    return a;
  }
  
  public p d()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof k))
    {
      paramObject = (k)paramObject;
      if ((a != ((k)paramObject).c()) || (!b.equals(((k)paramObject).d())) || (!c.equals(((k)paramObject).b()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    long l = a;
    return (((int)(l ^ l >>> 32) ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PersistedEvent{id=");
    localStringBuilder.append(a);
    localStringBuilder.append(", transportContext=");
    localStringBuilder.append(b);
    localStringBuilder.append(", event=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     n2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */