package m9;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import eb.b;
import eb.c;
import eb.e;
import eb.n0;
import eb.t0;
import g.q;
import g9.h;
import n9.a;
import n9.a.a;
import n9.a.c;
import p2.m0;
import r3.l;

public final class y
{
  public Task<n0> a;
  public final a b;
  public c c;
  public a.a d;
  public final Context e;
  public final h f;
  public final b g;
  
  public y(a parama, Context paramContext, h paramh, n paramn)
  {
    b = parama;
    e = paramContext;
    f = paramh;
    g = paramn;
    a = Tasks.call(n9.f.c, new w(this, 0));
  }
  
  public final <ReqT, RespT> Task<e<ReqT, RespT>> a(t0<ReqT, RespT> paramt0)
  {
    return a.continueWithTask(b.a, new l(7, this, paramt0));
  }
  
  public final void b(n0 paramn0)
  {
    eb.n localn = paramn0.E();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Current gRPC connectivity state: ");
    localStringBuilder.append(localn);
    m0.y(1, "GrpcCallProvider", localStringBuilder.toString(), new Object[0]);
    if (d != null)
    {
      m0.w("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
      d.a();
      d = null;
    }
    if (localn == eb.n.a)
    {
      m0.y(1, "GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
      d = b.b(a.c.q, 15000L, new q(19, this, paramn0));
    }
    paramn0.F(localn, new x0.f(20, this, paramn0));
  }
}

/* Location:
 * Qualified Name:     m9.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */