package m8;

import a0.j;
import java.util.List;

public final class m$a
  extends f0.e.d.a.a
{
  public f0.e.d.a.b a;
  public List<f0.c> b;
  public List<f0.c> c;
  public Boolean d;
  public f0.e.d.a.c e;
  public List<f0.e.d.a.c> f;
  public int g;
  public byte h;
  
  public m$a(f0.e.d.a parama)
  {
    a = parama.e();
    b = parama.d();
    c = parama.f();
    d = parama.b();
    e = parama.c();
    f = parama.a();
    g = parama.g();
    h = ((byte)1);
  }
  
  public final m a()
  {
    if (h == 1)
    {
      localObject = a;
      if (localObject != null) {
        return new m((f0.e.d.a.b)localObject, b, c, d, e, f, g);
      }
    }
    Object localObject = new StringBuilder();
    if (a == null) {
      ((StringBuilder)localObject).append(" execution");
    }
    if ((0x1 & h) == 0) {
      ((StringBuilder)localObject).append(" uiOrientation");
    }
    throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
  }
}

/* Location:
 * Qualified Name:     m8.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */