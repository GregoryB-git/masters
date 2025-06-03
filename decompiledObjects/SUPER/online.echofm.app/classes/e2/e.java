package e2;

public final class e
  extends k
{
  public final k.b a;
  public final a b;
  
  public e(k.b paramb, a parama)
  {
    a = paramb;
    b = parama;
  }
  
  public a b()
  {
    return b;
  }
  
  public k.b c()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof k))
    {
      Object localObject = (k)paramObject;
      paramObject = a;
      if (paramObject == null ? ((k)localObject).c() == null : paramObject.equals(((k)localObject).c()))
      {
        paramObject = b;
        localObject = ((k)localObject).b();
        if (paramObject == null ? localObject == null : paramObject.equals(localObject)) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = b;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return (j ^ 0xF4243) * 1000003 ^ i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ClientInfo{clientType=");
    localStringBuilder.append(a);
    localStringBuilder.append(", androidClientInfo=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends k.a
  {
    public k.b a;
    public a b;
    
    public k a()
    {
      return new e(a, b, null);
    }
    
    public k.a b(a parama)
    {
      b = parama;
      return this;
    }
    
    public k.a c(k.b paramb)
    {
      a = paramb;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     e2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */