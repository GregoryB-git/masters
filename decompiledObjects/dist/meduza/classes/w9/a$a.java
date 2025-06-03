package w9;

import g;

public final class a$a
  extends d.a
{
  public String a;
  public int b;
  public String c;
  public String d;
  public Long e;
  public Long f;
  public String g;
  
  public a$a() {}
  
  public a$a(d paramd)
  {
    a = paramd.c();
    b = paramd.f();
    c = paramd.a();
    d = paramd.e();
    e = Long.valueOf(paramd.b());
    f = Long.valueOf(paramd.g());
    g = paramd.d();
  }
  
  public final a a()
  {
    if (b == 0) {
      localObject1 = " registrationStatus";
    } else {
      localObject1 = "";
    }
    Object localObject2 = localObject1;
    if (e == null) {
      localObject2 = g.d((String)localObject1, " expiresInSecs");
    }
    Object localObject1 = localObject2;
    if (f == null) {
      localObject1 = g.d((String)localObject2, " tokenCreationEpochInSecs");
    }
    if (((String)localObject1).isEmpty()) {
      return new a(a, b, c, d, e.longValue(), f.longValue(), g);
    }
    throw new IllegalStateException(g.d("Missing required properties:", (String)localObject1));
  }
  
  public final a b(int paramInt)
  {
    if (paramInt != 0)
    {
      b = paramInt;
      return this;
    }
    throw new NullPointerException("Null registrationStatus");
  }
}

/* Location:
 * Qualified Name:     w9.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */