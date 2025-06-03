package e2;

public final class i
  extends o
{
  public final o.c a;
  public final o.b b;
  
  public i(o.c paramc, o.b paramb)
  {
    a = paramc;
    b = paramb;
  }
  
  public o.b b()
  {
    return b;
  }
  
  public o.c c()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof o))
    {
      paramObject = (o)paramObject;
      Object localObject = a;
      if (localObject == null ? ((o)paramObject).c() == null : localObject.equals(((o)paramObject).c()))
      {
        localObject = b;
        paramObject = ((o)paramObject).b();
        if (localObject == null ? paramObject == null : localObject.equals(paramObject)) {}
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
    localStringBuilder.append("NetworkConnectionInfo{networkType=");
    localStringBuilder.append(a);
    localStringBuilder.append(", mobileSubtype=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends o.a
  {
    public o.c a;
    public o.b b;
    
    public o a()
    {
      return new i(a, b, null);
    }
    
    public o.a b(o.b paramb)
    {
      b = paramb;
      return this;
    }
    
    public o.a c(o.c paramc)
    {
      a = paramc;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     e2.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */