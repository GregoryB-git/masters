package i2;

import f2.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a
{
  public static final a e = new a().b();
  public final f a;
  public final List b;
  public final b c;
  public final String d;
  
  public a(f paramf, List paramList, b paramb, String paramString)
  {
    a = paramf;
    b = paramList;
    c = paramb;
    d = paramString;
  }
  
  public static a e()
  {
    return new a();
  }
  
  public String a()
  {
    return d;
  }
  
  public b b()
  {
    return c;
  }
  
  public List c()
  {
    return b;
  }
  
  public f d()
  {
    return a;
  }
  
  public byte[] f()
  {
    return m.a(this);
  }
  
  public static final class a
  {
    public f a = null;
    public List b = new ArrayList();
    public b c = null;
    public String d = "";
    
    public a a(d paramd)
    {
      b.add(paramd);
      return this;
    }
    
    public a b()
    {
      return new a(a, Collections.unmodifiableList(b), c, d);
    }
    
    public a c(String paramString)
    {
      d = paramString;
      return this;
    }
    
    public a d(b paramb)
    {
      c = paramb;
      return this;
    }
    
    public a e(f paramf)
    {
      a = paramf;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     i2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */