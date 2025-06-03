package A4;

import R4.l;
import S4.b.b;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.metrics.AppStartTrace.c;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;
import s3.e;
import s3.n;

public class b
{
  public b(e parame, l paraml, n paramn, Executor paramExecutor)
  {
    parame = parame.m();
    final C4.a locala = C4.a.g();
    locala.P(parame);
    B4.a locala1 = B4.a.b();
    locala1.h(parame);
    locala1.i(new f());
    if (paramn != null)
    {
      paramn = AppStartTrace.k();
      paramn.u(parame);
      paramExecutor.execute(new AppStartTrace.c(paramn));
    }
    paraml.e(new a(locala));
    SessionManager.getInstance().initializeGaugeCollection();
  }
  
  public class a
    implements S4.b
  {
    public a(C4.a parama) {}
    
    public S4.b.a a()
    {
      return S4.b.a.p;
    }
    
    public void b(b.b paramb)
    {
      paramb = J4.a.c(paramb.a());
      SessionManager.getInstance().updatePerfSession(paramb);
    }
    
    public boolean c()
    {
      if (!locala.H()) {
        return false;
      }
      return C4.a.g().L();
    }
  }
}

/* Location:
 * Qualified Name:     A4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */