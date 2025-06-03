package f2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class i
{
  public static a a()
  {
    return new b.b().f(new HashMap());
  }
  
  public final String b(String paramString)
  {
    String str = (String)c().get(paramString);
    paramString = str;
    if (str == null) {
      paramString = "";
    }
    return paramString;
  }
  
  public abstract Map c();
  
  public abstract Integer d();
  
  public abstract h e();
  
  public abstract long f();
  
  public final int g(String paramString)
  {
    paramString = (String)c().get(paramString);
    int i;
    if (paramString == null) {
      i = 0;
    } else {
      i = Integer.valueOf(paramString).intValue();
    }
    return i;
  }
  
  public final long h(String paramString)
  {
    paramString = (String)c().get(paramString);
    long l;
    if (paramString == null) {
      l = 0L;
    } else {
      l = Long.valueOf(paramString).longValue();
    }
    return l;
  }
  
  public final Map i()
  {
    return Collections.unmodifiableMap(c());
  }
  
  public abstract String j();
  
  public abstract long k();
  
  public a l()
  {
    return new b.b().j(j()).g(d()).h(e()).i(f()).k(k()).f(new HashMap(c()));
  }
  
  public static abstract class a
  {
    public final a a(String paramString, int paramInt)
    {
      e().put(paramString, String.valueOf(paramInt));
      return this;
    }
    
    public final a b(String paramString, long paramLong)
    {
      e().put(paramString, String.valueOf(paramLong));
      return this;
    }
    
    public final a c(String paramString1, String paramString2)
    {
      e().put(paramString1, paramString2);
      return this;
    }
    
    public abstract i d();
    
    public abstract Map e();
    
    public abstract a f(Map paramMap);
    
    public abstract a g(Integer paramInteger);
    
    public abstract a h(h paramh);
    
    public abstract a i(long paramLong);
    
    public abstract a j(String paramString);
    
    public abstract a k(long paramLong);
  }
}

/* Location:
 * Qualified Name:     f2.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */