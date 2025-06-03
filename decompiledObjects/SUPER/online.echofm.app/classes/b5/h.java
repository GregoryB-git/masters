package b5;

import V4.b;
import java.nio.charset.StandardCharsets;

public final class h
{
  public final String a;
  public l b;
  public final StringBuilder c;
  public int d;
  public int e;
  public k f;
  public int g;
  
  public h(String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes(StandardCharsets.ISO_8859_1);
    StringBuilder localStringBuilder = new StringBuilder(arrayOfByte.length);
    int i = arrayOfByte.length;
    for (int j = 0; j < i; j++)
    {
      char c1 = (char)(arrayOfByte[j] & 0xFF);
      if ((c1 == '?') && (paramString.charAt(j) != '?')) {
        throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
      }
      localStringBuilder.append(c1);
    }
    a = localStringBuilder.toString();
    b = l.o;
    c = new StringBuilder(paramString.length());
    e = -1;
  }
  
  public int a()
  {
    return c.length();
  }
  
  public StringBuilder b()
  {
    return c;
  }
  
  public char c()
  {
    return a.charAt(d);
  }
  
  public String d()
  {
    return a;
  }
  
  public int e()
  {
    return e;
  }
  
  public int f()
  {
    return h() - d;
  }
  
  public k g()
  {
    return f;
  }
  
  public final int h()
  {
    return a.length() - g;
  }
  
  public boolean i()
  {
    return d < h();
  }
  
  public void j()
  {
    e = -1;
  }
  
  public void k()
  {
    f = null;
  }
  
  public void l(b paramb1, b paramb2) {}
  
  public void m(int paramInt)
  {
    g = paramInt;
  }
  
  public void n(l paraml)
  {
    b = paraml;
  }
  
  public void o(int paramInt)
  {
    e = paramInt;
  }
  
  public void p()
  {
    q(a());
  }
  
  public void q(int paramInt)
  {
    k localk = f;
    if ((localk == null) || (paramInt > localk.a())) {
      f = k.l(paramInt, b, null, null, true);
    }
  }
  
  public void r(char paramChar)
  {
    c.append(paramChar);
  }
  
  public void s(String paramString)
  {
    c.append(paramString);
  }
}

/* Location:
 * Qualified Name:     b5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */