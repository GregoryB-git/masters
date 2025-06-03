package r3;

import f;
import k3.n;
import k3.s;

public final class b
  extends i
{
  public final long a;
  public final s b;
  public final n c;
  
  public b(long paramLong, s params, n paramn)
  {
    a = paramLong;
    if (params != null)
    {
      b = params;
      if (paramn != null)
      {
        c = paramn;
        return;
      }
      throw new NullPointerException("Null event");
    }
    throw new NullPointerException("Null transportContext");
  }
  
  public final n a()
  {
    return c;
  }
  
  public final long b()
  {
    return a;
  }
  
  public final s c()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof i))
    {
      paramObject = (i)paramObject;
      if ((a != ((i)paramObject).b()) || (!b.equals(((i)paramObject).c())) || (!c.equals(((i)paramObject).a()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l = a;
    return (((int)(l ^ l >>> 32) ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("PersistedEvent{id=");
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
 * Qualified Name:     r3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */