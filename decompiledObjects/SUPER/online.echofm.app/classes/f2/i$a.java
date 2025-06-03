package f2;

import java.util.Map;

public abstract class i$a
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

/* Location:
 * Qualified Name:     f2.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */