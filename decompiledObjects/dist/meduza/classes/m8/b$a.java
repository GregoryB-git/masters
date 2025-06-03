package m8;

import a0.j;

public final class b$a
  extends f0.b
{
  public String a;
  public String b;
  public int c;
  public String d;
  public String e;
  public String f;
  public String g;
  public String h;
  public String i;
  public f0.e j;
  public f0.d k;
  public f0.a l;
  public byte m;
  
  public b$a() {}
  
  public b$a(f0 paramf0)
  {
    a = paramf0.k();
    b = paramf0.g();
    c = paramf0.j();
    d = paramf0.h();
    e = paramf0.f();
    f = paramf0.e();
    g = paramf0.b();
    h = paramf0.c();
    i = paramf0.d();
    j = paramf0.l();
    k = paramf0.i();
    l = paramf0.a();
    m = ((byte)1);
  }
  
  public final b a()
  {
    if ((m == 1) && (a != null) && (b != null) && (d != null) && (h != null) && (i != null)) {
      return new b(a, b, c, d, e, f, g, h, i, j, k, l);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (a == null) {
      localStringBuilder.append(" sdkVersion");
    }
    if (b == null) {
      localStringBuilder.append(" gmpAppId");
    }
    if ((0x1 & m) == 0) {
      localStringBuilder.append(" platform");
    }
    if (d == null) {
      localStringBuilder.append(" installationUuid");
    }
    if (h == null) {
      localStringBuilder.append(" buildVersion");
    }
    if (i == null) {
      localStringBuilder.append(" displayVersion");
    }
    throw new IllegalStateException(j.l("Missing required properties:", localStringBuilder));
  }
}

/* Location:
 * Qualified Name:     m8.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */