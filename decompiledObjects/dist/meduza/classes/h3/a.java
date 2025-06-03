package h3;

public final class a<T>
  extends d<T>
{
  public final Integer a = null;
  public final T b;
  public final e c;
  public final f d;
  
  public a(Object paramObject, e parame, b paramb)
  {
    if (paramObject != null)
    {
      b = paramObject;
      c = parame;
      d = paramb;
      return;
    }
    throw new NullPointerException("Null payload");
  }
  
  public final Integer a()
  {
    return a;
  }
  
  public final void b() {}
  
  public final T c()
  {
    return (T)b;
  }
  
  public final e d()
  {
    return c;
  }
  
  public final f e()
  {
    return d;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof d))
    {
      paramObject = (d)paramObject;
      Object localObject = a;
      if ((localObject == null ? ((d)paramObject).a() == null : ((Integer)localObject).equals(((d)paramObject).a())) && (b.equals(((d)paramObject).c())) && (c.equals(((d)paramObject).d())))
      {
        localObject = d;
        if (localObject == null ? ((d)paramObject).e() == null : localObject.equals(((d)paramObject).e()))
        {
          ((d)paramObject).b();
          break label118;
        }
      }
      bool = false;
      label118:
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = ((Integer)localObject).hashCode();
    }
    int j = b.hashCode();
    int k = c.hashCode();
    localObject = d;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = localObject.hashCode();
    }
    return ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ 0x0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Event{code=");
    localStringBuilder.append(a);
    localStringBuilder.append(", payload=");
    localStringBuilder.append(b);
    localStringBuilder.append(", priority=");
    localStringBuilder.append(c);
    localStringBuilder.append(", productData=");
    localStringBuilder.append(d);
    localStringBuilder.append(", eventContext=");
    localStringBuilder.append(null);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     h3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */