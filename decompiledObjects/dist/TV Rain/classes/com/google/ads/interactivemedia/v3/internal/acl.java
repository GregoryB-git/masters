package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class acl
  extends yn
{
  public acl(acm paramacm, Class paramClass) {}
  
  public final Object read(ada paramada)
    throws IOException
  {
    paramada = b.a.read(paramada);
    if ((paramada != null) && (!a.isInstance(paramada)))
    {
      StringBuilder localStringBuilder = new StringBuilder("Expected a ");
      localStringBuilder.append(a.getName());
      localStringBuilder.append(" but was ");
      localStringBuilder.append(paramada.getClass().getName());
      throw new yl(localStringBuilder.toString());
    }
    return paramada;
  }
  
  public final void write(adb paramadb, Object paramObject)
    throws IOException
  {
    b.a.write(paramadb, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.acl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */