package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;

class aax
{
  public final String a;
  public final boolean b;
  public final boolean c;
  
  public aax(aav paramaav, String paramString, boolean paramBoolean1, boolean paramBoolean2, Field paramField, boolean paramBoolean3, yn paramyn, xu paramxu, acx paramacx, boolean paramBoolean4)
  {
    this(paramString, paramBoolean1, paramBoolean2);
  }
  
  public aax(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramString;
    b = paramBoolean1;
    c = paramBoolean2;
  }
  
  public void a(ada paramada, Object paramObject)
    throws IOException, IllegalAccessException
  {
    paramada = f.read(paramada);
    if ((paramada != null) || (!i)) {
      d.set(paramObject, paramada);
    }
  }
  
  public void a(adb paramadb, Object paramObject)
    throws IOException, IllegalAccessException
  {
    Object localObject = d.get(paramObject);
    if (e) {
      paramObject = f;
    } else {
      paramObject = new abf(g, f, h.b());
    }
    ((yn)paramObject).write(paramadb, localObject);
  }
  
  public boolean a(Object paramObject)
    throws IOException, IllegalAccessException
  {
    if (!b) {
      return false;
    }
    return d.get(paramObject) != paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aax
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */