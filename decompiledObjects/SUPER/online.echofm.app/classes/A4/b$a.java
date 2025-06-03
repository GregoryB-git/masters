package A4;

import S4.b.b;
import com.google.firebase.perf.session.SessionManager;

public class b$a
  implements S4.b
{
  public b$a(b paramb, C4.a parama) {}
  
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
    if (!a.H()) {
      return false;
    }
    return C4.a.g().L();
  }
}

/* Location:
 * Qualified Name:     A4.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */