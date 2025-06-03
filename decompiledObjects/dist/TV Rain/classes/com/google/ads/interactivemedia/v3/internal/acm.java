package com.google.ads.interactivemedia.v3.internal;

final class acm
  implements yp
{
  public acm(Class paramClass, yn paramyn) {}
  
  public final <T2> yn<T2> a(xu paramxu, acx<T2> paramacx)
  {
    paramxu = paramacx.a();
    if (!b.isAssignableFrom(paramxu)) {
      return null;
    }
    return new acl(this, paramxu);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Factory[typeHierarchy=");
    localStringBuilder.append(b.getName());
    localStringBuilder.append(",adapter=");
    localStringBuilder.append(a);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.acm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */