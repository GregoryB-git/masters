package m8;

import a0.j;
import java.util.List;

public final class h$a
  extends f0.e.b
{
  public String a;
  public String b;
  public String c;
  public long d;
  public Long e;
  public boolean f;
  public f0.e.a g;
  public f0.e.f h;
  public f0.e.e i;
  public f0.e.c j;
  public List<f0.e.d> k;
  public int l;
  public byte m;
  
  public h$a() {}
  
  public h$a(f0.e parame)
  {
    a = parame.f();
    b = parame.h();
    c = parame.b();
    d = parame.j();
    e = parame.d();
    f = parame.l();
    g = parame.a();
    h = parame.k();
    i = parame.i();
    j = parame.c();
    k = parame.e();
    l = parame.g();
    m = ((byte)7);
  }
  
  public final h a()
  {
    if (m == 7)
    {
      String str1 = a;
      if (str1 != null)
      {
        String str2 = b;
        if (str2 != null)
        {
          localObject = g;
          if (localObject != null) {
            return new h(str1, str2, c, d, e, f, (f0.e.a)localObject, h, i, j, k, l);
          }
        }
      }
    }
    Object localObject = new StringBuilder();
    if (a == null) {
      ((StringBuilder)localObject).append(" generator");
    }
    if (b == null) {
      ((StringBuilder)localObject).append(" identifier");
    }
    if ((m & 0x1) == 0) {
      ((StringBuilder)localObject).append(" startedAt");
    }
    if ((m & 0x2) == 0) {
      ((StringBuilder)localObject).append(" crashed");
    }
    if (g == null) {
      ((StringBuilder)localObject).append(" app");
    }
    if ((m & 0x4) == 0) {
      ((StringBuilder)localObject).append(" generatorType");
    }
    throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
  }
}

/* Location:
 * Qualified Name:     m8.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */