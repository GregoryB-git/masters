package E4;

import com.google.firebase.perf.session.SessionManager;
import q5.b;

public final class g
  implements U5.a
{
  public final a a;
  
  public g(a parama)
  {
    a = parama;
  }
  
  public static g a(a parama)
  {
    return new g(parama);
  }
  
  public static SessionManager c(a parama)
  {
    return (SessionManager)b.c(parama.f(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public SessionManager b()
  {
    return c(a);
  }
}

/* Location:
 * Qualified Name:     E4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */