package j3;

public final class f
  extends p
{
  public final s a;
  public final p.a b;
  
  public f(s params, p.a parama)
  {
    a = params;
    b = parama;
  }
  
  public final s a()
  {
    return a;
  }
  
  public final p.a b()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof p))
    {
      Object localObject = (p)paramObject;
      paramObject = a;
      if (paramObject == null ? ((p)localObject).a() == null : paramObject.equals(((p)localObject).a()))
      {
        paramObject = b;
        localObject = ((p)localObject).b();
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
    StringBuilder localStringBuilder = f.l("ComplianceData{privacyContext=");
    localStringBuilder.append(a);
    localStringBuilder.append(", productIdOrigin=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */