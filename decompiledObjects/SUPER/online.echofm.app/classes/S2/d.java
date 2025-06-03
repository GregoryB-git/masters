package S2;

import com.google.android.gms.common.api.Scope;
import y2.a;
import y2.a.a;
import y2.a.g;

public abstract class d
{
  public static final a.g a;
  public static final a.g b;
  public static final a.a c;
  public static final a.a d;
  public static final Scope e;
  public static final Scope f;
  public static final a g;
  public static final a h;
  
  static
  {
    a.g localg1 = new a.g();
    a = localg1;
    a.g localg2 = new a.g();
    b = localg2;
    b localb = new b();
    c = localb;
    c localc = new c();
    d = localc;
    e = new Scope("profile");
    f = new Scope("email");
    g = new a("SignIn.API", localb, localg1);
    h = new a("SignIn.INTERNAL_API", localc, localg2);
  }
}

/* Location:
 * Qualified Name:     S2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */