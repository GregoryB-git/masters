package s3;

import A2.n;

public final class m$b
{
  public String a;
  public String b;
  public String c;
  public String d;
  public String e;
  public String f;
  public String g;
  
  public m a()
  {
    return new m(b, a, c, d, e, f, g, null);
  }
  
  public b b(String paramString)
  {
    a = n.f(paramString, "ApiKey must be set.");
    return this;
  }
  
  public b c(String paramString)
  {
    b = n.f(paramString, "ApplicationId must be set.");
    return this;
  }
  
  public b d(String paramString)
  {
    c = paramString;
    return this;
  }
  
  public b e(String paramString)
  {
    d = paramString;
    return this;
  }
  
  public b f(String paramString)
  {
    e = paramString;
    return this;
  }
  
  public b g(String paramString)
  {
    g = paramString;
    return this;
  }
  
  public b h(String paramString)
  {
    f = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     s3.m.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */