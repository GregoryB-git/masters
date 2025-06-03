package m8;

import a0.j;

public final class l$a
  extends f0.e.d.b
{
  public long a;
  public String b;
  public f0.e.d.a c;
  public f0.e.d.c d;
  public f0.e.d.d e;
  public f0.e.d.f f;
  public byte g;
  
  public l$a() {}
  
  public l$a(f0.e.d paramd)
  {
    a = paramd.e();
    b = paramd.f();
    c = paramd.a();
    d = paramd.b();
    e = paramd.c();
    f = paramd.d();
    g = ((byte)1);
  }
  
  public final l a()
  {
    if (g == 1)
    {
      localObject = b;
      if (localObject != null)
      {
        f0.e.d.a locala = c;
        if (locala != null)
        {
          f0.e.d.c localc = d;
          if (localc != null) {
            return new l(a, (String)localObject, locala, localc, e, f);
          }
        }
      }
    }
    Object localObject = new StringBuilder();
    if ((0x1 & g) == 0) {
      ((StringBuilder)localObject).append(" timestamp");
    }
    if (b == null) {
      ((StringBuilder)localObject).append(" type");
    }
    if (c == null) {
      ((StringBuilder)localObject).append(" app");
    }
    if (d == null) {
      ((StringBuilder)localObject).append(" device");
    }
    throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
  }
}

/* Location:
 * Qualified Name:     m8.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */