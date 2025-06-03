package j3;

import f;

public final class h
  extends r
{
  public final Integer a;
  
  public h(Integer paramInteger)
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
    if ((paramObject instanceof r))
    {
      Object localObject = (r)paramObject;
      paramObject = a;
      localObject = ((r)localObject).a();
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
    StringBuilder localStringBuilder = f.l("ExternalPRequestContext{originAssociatedProductId=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */