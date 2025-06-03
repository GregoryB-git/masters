package i2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a$a
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

/* Location:
 * Qualified Name:     i2.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */