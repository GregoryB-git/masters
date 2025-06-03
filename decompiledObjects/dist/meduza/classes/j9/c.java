package j9;

import f;

public final class c
  extends k.b
{
  public final long a;
  public final k.a b;
  
  public c(long paramLong, b paramb)
  {
    a = paramLong;
    if (paramb != null)
    {
      b = paramb;
      return;
    }
    throw new NullPointerException("Null offset");
  }
  
  public final k.a a()
  {
    return b;
  }
  
  public final long b()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof k.b))
    {
      paramObject = (k.b)paramObject;
      if ((a != ((k.b)paramObject).b()) || (!b.equals(((k.b)paramObject).a()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l = a;
    return ((int)(l ^ l >>> 32) ^ 0xF4243) * 1000003 ^ b.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("IndexState{sequenceNumber=");
    localStringBuilder.append(a);
    localStringBuilder.append(", offset=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j9.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */