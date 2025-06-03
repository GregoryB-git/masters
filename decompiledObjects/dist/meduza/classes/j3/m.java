package j3;

import f;

public final class m
  extends w
{
  public final w.b a;
  public final w.a b;
  
  public m(w.b paramb, w.a parama)
  {
    a = paramb;
    b = parama;
  }
  
  public final w.a a()
  {
    return b;
  }
  
  public final w.b b()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof w))
    {
      Object localObject = (w)paramObject;
      paramObject = a;
      if (paramObject == null ? ((w)localObject).b() == null : paramObject.equals(((w)localObject).b()))
      {
        paramObject = b;
        localObject = ((w)localObject).a();
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
  
  public final int hashCode()
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
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("NetworkConnectionInfo{networkType=");
    localStringBuilder.append(a);
    localStringBuilder.append(", mobileSubtype=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j3.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */