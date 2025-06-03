package c2;

public final class a
  extends c
{
  public final Integer a;
  public final Object b;
  public final d c;
  
  public a(Integer paramInteger, Object paramObject, d paramd)
  {
    a = paramInteger;
    if (paramObject != null)
    {
      b = paramObject;
      if (paramd != null)
      {
        c = paramd;
        return;
      }
      throw new NullPointerException("Null priority");
    }
    throw new NullPointerException("Null payload");
  }
  
  public Integer a()
  {
    return a;
  }
  
  public Object b()
  {
    return b;
  }
  
  public d c()
  {
    return c;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof c))
    {
      c localc = (c)paramObject;
      paramObject = a;
      if ((paramObject == null ? localc.a() != null : !((Integer)paramObject).equals(localc.a())) || (!b.equals(localc.b())) || (!c.equals(localc.c()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    Integer localInteger = a;
    int i;
    if (localInteger == null) {
      i = 0;
    } else {
      i = localInteger.hashCode();
    }
    return ((i ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Event{code=");
    localStringBuilder.append(a);
    localStringBuilder.append(", payload=");
    localStringBuilder.append(b);
    localStringBuilder.append(", priority=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     c2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */