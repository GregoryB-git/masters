package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class aap
  extends adb
{
  private static final Writer a = new aas();
  private static final yk b = new yk("closed");
  private final List<yd> c = new ArrayList();
  private String d;
  private yd e = yf.a;
  
  public aap()
  {
    super(a);
  }
  
  private final void a(yd paramyd)
  {
    if (d != null)
    {
      if ((!(paramyd instanceof yf)) || (i())) {
        ((yi)j()).a(d, paramyd);
      }
      d = null;
      return;
    }
    if (c.isEmpty())
    {
      e = paramyd;
      return;
    }
    yd localyd = j();
    if ((localyd instanceof yb))
    {
      ((yb)localyd).a(paramyd);
      return;
    }
    throw new IllegalStateException();
  }
  
  private final yd j()
  {
    List localList = c;
    return (yd)localList.get(localList.size() - 1);
  }
  
  public final adb a(long paramLong)
    throws IOException
  {
    a(new yk(Long.valueOf(paramLong)));
    return this;
  }
  
  public final adb a(Boolean paramBoolean)
    throws IOException
  {
    if (paramBoolean == null) {
      return f();
    }
    a(new yk(paramBoolean));
    return this;
  }
  
  public final adb a(Number paramNumber)
    throws IOException
  {
    if (paramNumber == null) {
      return f();
    }
    if (!g())
    {
      double d1 = paramNumber.doubleValue();
      if ((Double.isNaN(d1)) || (Double.isInfinite(d1)))
      {
        StringBuilder localStringBuilder = new StringBuilder("JSON forbids NaN and infinities: ");
        localStringBuilder.append(paramNumber);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
    }
    a(new yk(paramNumber));
    return this;
  }
  
  public final adb a(String paramString)
    throws IOException
  {
    if ((!c.isEmpty()) && (d == null))
    {
      if ((j() instanceof yi))
      {
        d = paramString;
        return this;
      }
      throw new IllegalStateException();
    }
    throw new IllegalStateException();
  }
  
  public final adb a(boolean paramBoolean)
    throws IOException
  {
    a(new yk(Boolean.valueOf(paramBoolean)));
    return this;
  }
  
  public final yd a()
  {
    if (c.isEmpty()) {
      return e;
    }
    StringBuilder localStringBuilder = new StringBuilder("Expected one JSON element but was ");
    localStringBuilder.append(c);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final adb b()
    throws IOException
  {
    yb localyb = new yb();
    a(localyb);
    c.add(localyb);
    return this;
  }
  
  public final adb b(String paramString)
    throws IOException
  {
    if (paramString == null) {
      return f();
    }
    a(new yk(paramString));
    return this;
  }
  
  public final adb c()
    throws IOException
  {
    if ((!c.isEmpty()) && (d == null))
    {
      if ((j() instanceof yb))
      {
        List localList = c;
        localList.remove(localList.size() - 1);
        return this;
      }
      throw new IllegalStateException();
    }
    throw new IllegalStateException();
  }
  
  public final void close()
    throws IOException
  {
    if (c.isEmpty())
    {
      c.add(b);
      return;
    }
    throw new IOException("Incomplete document");
  }
  
  public final adb d()
    throws IOException
  {
    yi localyi = new yi();
    a(localyi);
    c.add(localyi);
    return this;
  }
  
  public final adb e()
    throws IOException
  {
    if ((!c.isEmpty()) && (d == null))
    {
      if ((j() instanceof yi))
      {
        List localList = c;
        localList.remove(localList.size() - 1);
        return this;
      }
      throw new IllegalStateException();
    }
    throw new IllegalStateException();
  }
  
  public final adb f()
    throws IOException
  {
    a(yf.a);
    return this;
  }
  
  public final void flush()
    throws IOException
  {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */