package h3;

public final class b
  extends f
{
  public final Integer a;
  
  public b(Integer paramInteger)
  {
    a = paramInteger;
  }
  
  public final Integer a()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f))
    {
      Object localObject = (f)paramObject;
      paramObject = a;
      localObject = ((f)localObject).a();
      if (paramObject == null)
      {
        if (localObject != null) {
          bool = false;
        }
      }
      else {
        bool = ((Integer)paramObject).equals(localObject);
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    Integer localInteger = a;
    int i;
    if (localInteger == null) {
      i = 0;
    } else {
      i = localInteger.hashCode();
    }
    return i ^ 0xF4243;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ProductData{productId=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     h3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */