package L5;

import E5.d.b;
import Q3.b;

public class a
  extends c
  implements Q3.a
{
  public a(d.b paramb, String paramString)
  {
    super(paramb, paramString);
  }
  
  public void a(Q3.c paramc)
  {
    paramc = y.a(paramc);
    a.b(paramc.e(), paramc.getMessage(), paramc.d());
  }
  
  public void c(b paramb)
  {
    h("childRemoved", paramb, null);
  }
  
  public void d(b paramb, String paramString)
  {
    h("childMoved", paramb, paramString);
  }
  
  public void e(b paramb, String paramString)
  {
    h("childChanged", paramb, paramString);
  }
  
  public void f(b paramb, String paramString)
  {
    h("childAdded", paramb, paramString);
  }
}

/* Location:
 * Qualified Name:     L5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */