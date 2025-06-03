package A4;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import r4.b;
import s4.i;

public final class g
  implements U5.a
{
  public final U5.a a;
  public final U5.a b;
  public final U5.a c;
  public final U5.a d;
  public final U5.a e;
  public final U5.a f;
  public final U5.a g;
  
  public g(U5.a parama1, U5.a parama2, U5.a parama3, U5.a parama4, U5.a parama5, U5.a parama6, U5.a parama7)
  {
    a = parama1;
    b = parama2;
    c = parama3;
    d = parama4;
    e = parama5;
    f = parama6;
    g = parama7;
  }
  
  public static g a(U5.a parama1, U5.a parama2, U5.a parama3, U5.a parama4, U5.a parama5, U5.a parama6, U5.a parama7)
  {
    return new g(parama1, parama2, parama3, parama4, parama5, parama6, parama7);
  }
  
  public static e c(s3.e parame, b paramb1, i parami, b paramb2, RemoteConfigManager paramRemoteConfigManager, C4.a parama, SessionManager paramSessionManager)
  {
    return new e(parame, paramb1, parami, paramb2, paramRemoteConfigManager, parama, paramSessionManager);
  }
  
  public e b()
  {
    return c((s3.e)a.get(), (b)b.get(), (i)c.get(), (b)d.get(), (RemoteConfigManager)e.get(), (C4.a)f.get(), (SessionManager)g.get());
  }
}

/* Location:
 * Qualified Name:     A4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */