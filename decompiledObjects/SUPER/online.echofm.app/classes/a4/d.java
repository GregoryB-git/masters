package a4;

import Q3.b;
import Q3.p;
import V3.h;
import V3.k;

public class d
  implements e
{
  public final e.a a;
  public final h b;
  public final b c;
  public final String d;
  
  public d(e.a parama, h paramh, b paramb, String paramString)
  {
    a = parama;
    b = paramh;
    c = paramb;
    d = paramString;
  }
  
  public void a()
  {
    b.d(this);
  }
  
  public e.a b()
  {
    return a;
  }
  
  public k c()
  {
    k localk = c.g().s();
    if (a == e.a.s) {
      return localk;
    }
    return localk.a0();
  }
  
  public String d()
  {
    return d;
  }
  
  public b e()
  {
    return c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder;
    if (a == e.a.s)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(c());
      localStringBuilder.append(": ");
      localStringBuilder.append(a);
      localStringBuilder.append(": ");
      localStringBuilder.append(c.i(true));
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(c());
      localStringBuilder.append(": ");
      localStringBuilder.append(a);
      localStringBuilder.append(": { ");
      localStringBuilder.append(c.e());
      localStringBuilder.append(": ");
      localStringBuilder.append(c.i(true));
      localStringBuilder.append(" }");
    }
  }
}

/* Location:
 * Qualified Name:     a4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */