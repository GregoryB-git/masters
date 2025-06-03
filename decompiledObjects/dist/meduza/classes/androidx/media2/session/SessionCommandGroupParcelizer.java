package androidx.media2.session;

import b2.c;
import java.util.Set;
import r.d;

public final class SessionCommandGroupParcelizer
{
  public static SessionCommandGroup read(c paramc)
  {
    SessionCommandGroup localSessionCommandGroup = new SessionCommandGroup();
    Set localSet = a;
    if (!paramc.l(1)) {
      paramc = localSet;
    } else {
      paramc = (Set)paramc.k(new d());
    }
    a = paramc;
    return localSessionCommandGroup;
  }
  
  public static void write(SessionCommandGroup paramSessionCommandGroup, c paramc)
  {
    paramc.getClass();
    paramc.F(1, a);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.SessionCommandGroupParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */