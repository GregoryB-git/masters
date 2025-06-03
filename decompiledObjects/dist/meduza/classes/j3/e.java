package j3;

import f;

public final class e
  extends o
{
  public final o.a a;
  public final a b;
  
  public e(o.a parama, a parama1)
  {
    a = parama;
    b = parama1;
  }
  
  public final a a()
  {
    return b;
  }
  
  public final o.a b()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof o))
    {
      Object localObject = (o)paramObject;
      paramObject = a;
      if (paramObject == null ? ((o)localObject).b() == null : paramObject.equals(((o)localObject).b()))
      {
        paramObject = b;
        localObject = ((o)localObject).a();
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
    StringBuilder localStringBuilder = f.l("ClientInfo{clientType=");
    localStringBuilder.append(a);
    localStringBuilder.append(", androidClientInfo=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */