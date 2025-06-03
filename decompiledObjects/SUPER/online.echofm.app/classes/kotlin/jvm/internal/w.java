package kotlin.jvm.internal;

import m6.c;
import m6.d;
import m6.f;
import m6.g;

public class w
{
  public m6.e a(i parami)
  {
    return parami;
  }
  
  public c b(Class paramClass)
  {
    return new e(paramClass);
  }
  
  public d c(Class paramClass, String paramString)
  {
    return new m(paramClass, paramString);
  }
  
  public f d(n paramn)
  {
    return paramn;
  }
  
  public g e(p paramp)
  {
    return paramp;
  }
  
  public String f(h paramh)
  {
    String str = paramh.getClass().getGenericInterfaces()[0].toString();
    paramh = str;
    if (str.startsWith("kotlin.jvm.functions.")) {
      paramh = str.substring(21);
    }
    return paramh;
  }
  
  public String g(l paraml)
  {
    return f(paraml);
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */