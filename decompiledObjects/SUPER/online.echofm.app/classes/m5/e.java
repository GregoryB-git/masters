package m5;

import E5.c;
import E5.d;
import E5.d.b;
import E5.d.d;

public class e
  implements d.b
{
  public d.b a;
  
  public e(c paramc, String paramString)
  {
    new d(paramc, paramString).d(new a());
  }
  
  public void a(Object paramObject)
  {
    d.b localb = a;
    if (localb != null) {
      localb.a(paramObject);
    }
  }
  
  public void b(String paramString1, String paramString2, Object paramObject)
  {
    d.b localb = a;
    if (localb != null) {
      localb.b(paramString1, paramString2, paramObject);
    }
  }
  
  public void c()
  {
    d.b localb = a;
    if (localb != null) {
      localb.c();
    }
  }
  
  public class a
    implements d.d
  {
    public a() {}
    
    public void a(Object paramObject)
    {
      e.d(e.this, null);
    }
    
    public void b(Object paramObject, d.b paramb)
    {
      e.d(e.this, paramb);
    }
  }
}

/* Location:
 * Qualified Name:     m5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */