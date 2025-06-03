package i2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d
{
  public static final d c = new a().a();
  public final String a;
  public final List b;
  
  public d(String paramString, List paramList)
  {
    a = paramString;
    b = paramList;
  }
  
  public static a c()
  {
    return new a();
  }
  
  public List a()
  {
    return b;
  }
  
  public String b()
  {
    return a;
  }
  
  public static final class a
  {
    public String a = "";
    public List b = new ArrayList();
    
    public d a()
    {
      return new d(a, Collections.unmodifiableList(b));
    }
    
    public a b(List paramList)
    {
      b = paramList;
      return this;
    }
    
    public a c(String paramString)
    {
      a = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     i2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */