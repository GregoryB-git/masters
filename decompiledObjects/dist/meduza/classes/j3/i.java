package j3;

import f;

public final class i
  extends s
{
  public final r a;
  
  public i(r paramr)
  {
    a = paramr;
  }
  
  public final r a()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof s))
    {
      Object localObject = (s)paramObject;
      paramObject = a;
      localObject = ((s)localObject).a();
      if (paramObject == null)
      {
        if (localObject != null) {
          bool = false;
        }
      }
      else {
        bool = paramObject.equals(localObject);
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    r localr = a;
    int i;
    if (localr == null) {
      i = 0;
    } else {
      i = localr.hashCode();
    }
    return i ^ 0xF4243;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ExternalPrivacyContext{prequest=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */