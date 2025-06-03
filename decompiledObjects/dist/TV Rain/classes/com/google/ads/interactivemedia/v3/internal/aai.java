package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class aai<E>
  extends yn<Object>
{
  public static final yp a = new aah();
  private final Class<E> b;
  private final yn<E> c;
  
  public aai(xu paramxu, yn<E> paramyn, Class<E> paramClass)
  {
    c = new abf(paramxu, paramyn, paramClass);
    b = paramClass;
  }
  
  public final Object read(ada paramada)
    throws IOException
  {
    if (paramada.f() == adc.i)
    {
      paramada.j();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramada.a();
    while (paramada.e()) {
      localArrayList.add(c.read(paramada));
    }
    paramada.b();
    int i = localArrayList.size();
    paramada = Array.newInstance(b, i);
    for (int j = 0; j < i; j++) {
      Array.set(paramada, j, localArrayList.get(j));
    }
    return paramada;
  }
  
  public final void write(adb paramadb, Object paramObject)
    throws IOException
  {
    if (paramObject == null)
    {
      paramadb.f();
      return;
    }
    paramadb.b();
    int i = 0;
    int j = Array.getLength(paramObject);
    while (i < j)
    {
      Object localObject = Array.get(paramObject, i);
      c.write(paramadb, localObject);
      i++;
    }
    paramadb.c();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */