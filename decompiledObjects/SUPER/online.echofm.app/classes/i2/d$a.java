package i2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d$a
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

/* Location:
 * Qualified Name:     i2.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */