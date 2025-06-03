package C2;

import A2.r;
import A2.t;
import A2.u;
import V2.j;
import android.content.Context;
import y2.a;
import y2.a.a;
import y2.a.g;
import y2.d.a;
import z2.m;
import z2.m.a;

public final class d
  extends y2.d
  implements t
{
  public static final a.g k;
  public static final a.a l;
  public static final a m;
  
  static
  {
    a.g localg = new a.g();
    k = localg;
    c localc = new c();
    l = localc;
    m = new a("ClientTelemetry.API", localc, localg);
  }
  
  public d(Context paramContext, u paramu)
  {
    super(paramContext, m, paramu, d.a.c);
  }
  
  public final j a(r paramr)
  {
    m.a locala = m.a();
    locala.d(new x2.d[] { K2.d.a });
    locala.c(false);
    locala.b(new b(paramr));
    return c(locala.a());
  }
}

/* Location:
 * Qualified Name:     C2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */