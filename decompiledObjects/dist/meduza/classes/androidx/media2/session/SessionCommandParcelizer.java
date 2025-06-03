package androidx.media2.session;

import b2.c;

public final class SessionCommandParcelizer
{
  public static SessionCommand read(c paramc)
  {
    SessionCommand localSessionCommand = new SessionCommand();
    a = paramc.o(a, 1);
    b = paramc.u(2, b);
    c = paramc.h(3, c);
    return localSessionCommand;
  }
  
  public static void write(SessionCommand paramSessionCommand, c paramc)
  {
    paramc.getClass();
    paramc.I(a, 1);
    paramc.O(2, b);
    paramc.B(3, c);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.SessionCommandParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */