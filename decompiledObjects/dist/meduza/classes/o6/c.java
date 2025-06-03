package o6;

import android.content.Context;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import d2.h0;
import k6.a;
import k6.a.g;
import k6.d.a;
import l6.q.a;
import m6.m;
import m6.n;

public final class c
  extends k6.d
{
  public static final a a;
  
  static
  {
    a.g localg = new a.g();
    a = new a("ClientTelemetry.API", new b(), localg);
  }
  
  public c(Context paramContext, n paramn)
  {
    super(paramContext, a, paramn, d.a.c);
  }
  
  public final Task<Void> a(m paramm)
  {
    q.a locala = new q.a();
    c = new j6.d[] { zaf.zaa };
    b = false;
    a = new h0(paramm, 4);
    return doBestEffortWrite(locala.a());
  }
}

/* Location:
 * Qualified Name:     o6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */