package Y3;

public final class g
{
  public final Object a;
  public final Object b;
  
  public g(Object paramObject1, Object paramObject2)
  {
    a = paramObject1;
    b = paramObject2;
  }
  
  public Object a()
  {
    return a;
  }
  
  public Object b()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (g.class == paramObject.getClass()))
    {
      paramObject = (g)paramObject;
      Object localObject = a;
      if (localObject != null ? !localObject.equals(a) : a != null) {
        return false;
      }
      localObject = b;
      paramObject = b;
      return localObject != null ? localObject.equals(paramObject) : paramObject == null;
    }
    return false;
  }
  
  public int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    localObject = b;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Pair(");
    localStringBuilder.append(a);
    localStringBuilder.append(",");
    localStringBuilder.append(b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     Y3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */