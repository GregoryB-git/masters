package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class aan
  extends ada
{
  private static final Reader b = new aaq();
  private static final Object c = new Object();
  private Object[] d = new Object[32];
  private int e = 0;
  private String[] f = new String[32];
  private int[] g = new int[32];
  
  public aan(yd paramyd)
  {
    super(b);
    a(paramyd);
  }
  
  private final void a(adc paramadc)
    throws IOException
  {
    if (f() == paramadc) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("Expected ");
    localStringBuilder.append(paramadc);
    localStringBuilder.append(" but was ");
    localStringBuilder.append(f());
    localStringBuilder.append(v());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private final void a(Object paramObject)
  {
    int i = e;
    Object[] arrayOfObject1 = d;
    if (i == arrayOfObject1.length)
    {
      Object[] arrayOfObject2 = new Object[i << 1];
      int[] arrayOfInt = new int[i << 1];
      String[] arrayOfString = new String[i << 1];
      System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, i);
      System.arraycopy(g, 0, arrayOfInt, 0, e);
      System.arraycopy(f, 0, arrayOfString, 0, e);
      d = arrayOfObject2;
      g = arrayOfInt;
      f = arrayOfString;
    }
    arrayOfObject1 = d;
    i = e;
    e = (i + 1);
    arrayOfObject1[i] = paramObject;
  }
  
  private final Object t()
  {
    return d[(e - 1)];
  }
  
  private final Object u()
  {
    Object[] arrayOfObject = d;
    int i = e - 1;
    e = i;
    Object localObject = arrayOfObject[i];
    arrayOfObject[i] = null;
    return localObject;
  }
  
  private final String v()
  {
    StringBuilder localStringBuilder = new StringBuilder(" at path ");
    localStringBuilder.append(p());
    return localStringBuilder.toString();
  }
  
  public final void a()
    throws IOException
  {
    a(adc.a);
    a(((yb)t()).iterator());
    g[(e - 1)] = 0;
  }
  
  public final void b()
    throws IOException
  {
    a(adc.b);
    u();
    u();
    int i = e;
    if (i > 0)
    {
      int[] arrayOfInt = g;
      i--;
      arrayOfInt[i] += 1;
    }
  }
  
  public final void c()
    throws IOException
  {
    a(adc.c);
    a(((yi)t()).h().iterator());
  }
  
  public final void close()
    throws IOException
  {
    d = new Object[] { c };
    e = 1;
  }
  
  public final void d()
    throws IOException
  {
    a(adc.d);
    u();
    u();
    int i = e;
    if (i > 0)
    {
      int[] arrayOfInt = g;
      i--;
      arrayOfInt[i] += 1;
    }
  }
  
  public final boolean e()
    throws IOException
  {
    adc localadc = f();
    return (localadc != adc.d) && (localadc != adc.b);
  }
  
  public final adc f()
    throws IOException
  {
    Object localObject;
    boolean bool;
    for (;;)
    {
      if (e == 0) {
        return adc.j;
      }
      localObject = t();
      if (!(localObject instanceof Iterator)) {
        break label85;
      }
      bool = d[(e - 2)] instanceof yi;
      localObject = (Iterator)localObject;
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
      if (bool) {
        return adc.e;
      }
      a(((Iterator)localObject).next());
    }
    if (bool) {
      return adc.d;
    }
    return adc.b;
    label85:
    if ((localObject instanceof yi)) {
      return adc.c;
    }
    if ((localObject instanceof yb)) {
      return adc.a;
    }
    if ((localObject instanceof yk))
    {
      localObject = (yk)localObject;
      if (((yk)localObject).j()) {
        return adc.f;
      }
      if (((yk)localObject).h()) {
        return adc.h;
      }
      if (((yk)localObject).i()) {
        return adc.g;
      }
      throw new AssertionError();
    }
    if ((localObject instanceof yf)) {
      return adc.i;
    }
    if (localObject == c) {
      throw new IllegalStateException("JsonReader is closed");
    }
    throw new AssertionError();
  }
  
  public final String g()
    throws IOException
  {
    a(adc.e);
    Map.Entry localEntry = (Map.Entry)((Iterator)t()).next();
    String str = (String)localEntry.getKey();
    f[(e - 1)] = str;
    a(localEntry.getValue());
    return str;
  }
  
  public final String h()
    throws IOException
  {
    Object localObject1 = f();
    Object localObject2 = adc.f;
    if ((localObject1 != localObject2) && (localObject1 != adc.g))
    {
      StringBuilder localStringBuilder = new StringBuilder("Expected ");
      localStringBuilder.append(localObject2);
      localStringBuilder.append(" but was ");
      localStringBuilder.append(localObject1);
      localStringBuilder.append(v());
      throw new IllegalStateException(localStringBuilder.toString());
    }
    localObject1 = ((yk)u()).b();
    int i = e;
    if (i > 0)
    {
      localObject2 = g;
      i--;
      localObject2[i] += 1;
    }
    return (String)localObject1;
  }
  
  public final boolean i()
    throws IOException
  {
    a(adc.h);
    boolean bool = ((yk)u()).f();
    int i = e;
    if (i > 0)
    {
      int[] arrayOfInt = g;
      i--;
      arrayOfInt[i] += 1;
    }
    return bool;
  }
  
  public final void j()
    throws IOException
  {
    a(adc.i);
    u();
    int i = e;
    if (i > 0)
    {
      int[] arrayOfInt = g;
      i--;
      arrayOfInt[i] += 1;
    }
  }
  
  public final double k()
    throws IOException
  {
    Object localObject = f();
    adc localadc = adc.g;
    if ((localObject != localadc) && (localObject != adc.f))
    {
      StringBuilder localStringBuilder = new StringBuilder("Expected ");
      localStringBuilder.append(localadc);
      localStringBuilder.append(" but was ");
      localStringBuilder.append(localObject);
      localStringBuilder.append(v());
      throw new IllegalStateException(localStringBuilder.toString());
    }
    double d1 = ((yk)t()).c();
    if ((!q()) && ((Double.isNaN(d1)) || (Double.isInfinite(d1))))
    {
      localObject = new StringBuilder("JSON forbids NaN and infinities: ");
      ((StringBuilder)localObject).append(d1);
      throw new NumberFormatException(((StringBuilder)localObject).toString());
    }
    u();
    int i = e;
    if (i > 0)
    {
      localObject = g;
      i--;
      localObject[i] += 1;
    }
    return d1;
  }
  
  public final long l()
    throws IOException
  {
    adc localadc = f();
    Object localObject = adc.g;
    if ((localadc != localObject) && (localadc != adc.f))
    {
      StringBuilder localStringBuilder = new StringBuilder("Expected ");
      localStringBuilder.append(localObject);
      localStringBuilder.append(" but was ");
      localStringBuilder.append(localadc);
      localStringBuilder.append(v());
      throw new IllegalStateException(localStringBuilder.toString());
    }
    long l = ((yk)t()).d();
    u();
    int i = e;
    if (i > 0)
    {
      localObject = g;
      i--;
      localObject[i] += 1;
    }
    return l;
  }
  
  public final int m()
    throws IOException
  {
    Object localObject = f();
    adc localadc = adc.g;
    if ((localObject != localadc) && (localObject != adc.f))
    {
      StringBuilder localStringBuilder = new StringBuilder("Expected ");
      localStringBuilder.append(localadc);
      localStringBuilder.append(" but was ");
      localStringBuilder.append(localObject);
      localStringBuilder.append(v());
      throw new IllegalStateException(localStringBuilder.toString());
    }
    int i = ((yk)t()).e();
    u();
    int j = e;
    if (j > 0)
    {
      localObject = g;
      j--;
      localObject[j] += 1;
    }
    return i;
  }
  
  public final void n()
    throws IOException
  {
    if (f() == adc.e)
    {
      g();
      f[(e - 2)] = "null";
    }
    else
    {
      u();
      i = e;
      if (i > 0) {
        f[(i - 1)] = "null";
      }
    }
    int i = e;
    if (i > 0)
    {
      int[] arrayOfInt = g;
      i--;
      arrayOfInt[i] += 1;
    }
  }
  
  public final void o()
    throws IOException
  {
    a(adc.e);
    Map.Entry localEntry = (Map.Entry)((Iterator)t()).next();
    a(localEntry.getValue());
    a(new yk((String)localEntry.getKey()));
  }
  
  public final String p()
  {
    StringBuilder localStringBuilder = new StringBuilder("$");
    int j;
    for (int i = 0; i < e; i = j + 1)
    {
      Object localObject1 = d;
      Object localObject2 = localObject1[i];
      if ((localObject2 instanceof yb))
      {
        i++;
        j = i;
        if ((localObject1[i] instanceof Iterator))
        {
          localStringBuilder.append('[');
          localStringBuilder.append(g[i]);
          localStringBuilder.append(']');
          j = i;
        }
      }
      else
      {
        j = i;
        if ((localObject2 instanceof yi))
        {
          i++;
          j = i;
          if ((localObject1[i] instanceof Iterator))
          {
            localStringBuilder.append('.');
            localObject1 = f[i];
            j = i;
            if (localObject1 != null)
            {
              localStringBuilder.append((String)localObject1);
              j = i;
            }
          }
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  public final String toString()
  {
    return "aan";
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aan
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */