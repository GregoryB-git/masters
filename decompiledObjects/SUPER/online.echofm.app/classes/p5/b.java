package p5;

import java.util.List;
import n5.F;

public abstract class b
  implements e
{
  public F d()
  {
    return new F(m(), n());
  }
  
  public boolean e()
  {
    return Boolean.TRUE.equals(c("noResult"));
  }
  
  public Boolean f()
  {
    return k("inTransaction");
  }
  
  public Integer g()
  {
    return (Integer)c("transactionId");
  }
  
  public boolean h()
  {
    boolean bool;
    if ((j("transactionId")) && (g() == null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Boolean k(String paramString)
  {
    paramString = c(paramString);
    if ((paramString instanceof Boolean)) {
      return (Boolean)paramString;
    }
    return null;
  }
  
  public boolean l()
  {
    return Boolean.TRUE.equals(c("continueOnError"));
  }
  
  public final String m()
  {
    return (String)c("sql");
  }
  
  public final List n()
  {
    return (List)c("arguments");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("");
    localStringBuilder.append(i());
    localStringBuilder.append(" ");
    localStringBuilder.append(m());
    localStringBuilder.append(" ");
    localStringBuilder.append(n());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     p5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */