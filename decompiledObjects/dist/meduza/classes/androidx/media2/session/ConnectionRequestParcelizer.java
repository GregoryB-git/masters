package androidx.media2.session;

import b2.c;

public final class ConnectionRequestParcelizer
{
  public static ConnectionRequest read(c paramc)
  {
    ConnectionRequest localConnectionRequest = new ConnectionRequest();
    a = paramc.o(a, 0);
    b = paramc.u(1, b);
    c = paramc.o(c, 2);
    d = paramc.h(3, d);
    return localConnectionRequest;
  }
  
  public static void write(ConnectionRequest paramConnectionRequest, c paramc)
  {
    paramc.getClass();
    paramc.I(a, 0);
    paramc.O(1, b);
    paramc.I(c, 2);
    paramc.B(3, d);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.ConnectionRequestParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */