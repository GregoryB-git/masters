package x7;

import o7.l0;
import o7.r.a;
import o7.t;
import o7.t.a;
import o7.x;
import p2.m0;

public final class b
{
  public static final x<String> a;
  public static final l0 b;
  public static final l0 c;
  public static final l0 d;
  
  static
  {
    int i = x.c;
    Object localObject = new Object[15];
    localObject[0] = "_in";
    localObject[1] = "_xa";
    localObject[2] = "_xu";
    localObject[3] = "_aq";
    localObject[4] = "_aa";
    localObject[5] = "_ai";
    System.arraycopy(new String[] { "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire" }, 0, localObject, 6, 9);
    a = x.p(15, (Object[])localObject);
    localObject = t.b;
    localObject = new Object[7];
    localObject[0] = "_e";
    localObject[1] = "_f";
    localObject[2] = "_iap";
    localObject[3] = "_s";
    localObject[4] = "_au";
    localObject[5] = "_ui";
    localObject[6] = "_cd";
    x6.b.w(7, (Object[])localObject);
    b = t.o(7, (Object[])localObject);
    localObject = new Object[3];
    localObject[0] = "auto";
    localObject[1] = "app";
    localObject[2] = "am";
    x6.b.w(3, (Object[])localObject);
    c = t.o(3, (Object[])localObject);
    d = t.u("_r", "_dbg");
    localObject = new t.a();
    String[] arrayOfString = m0.a;
    x6.b.w(15, arrayOfString);
    ((r.a)localObject).b(b + 15);
    System.arraycopy(arrayOfString, 0, a, b, 15);
    b += 15;
    arrayOfString = m0.b;
    x6.b.w(15, arrayOfString);
    ((r.a)localObject).b(b + 15);
    System.arraycopy(arrayOfString, 0, a, b, 15);
    b += 15;
    ((t.a)localObject).e();
    t.u("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
  }
}

/* Location:
 * Qualified Name:     x7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */