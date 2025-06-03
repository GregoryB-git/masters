package androidx.media2.session;

import b2.c;

public final class SessionTokenParcelizer
{
  public static SessionToken read(c paramc)
  {
    SessionToken localSessionToken = new SessionToken();
    a = ((SessionToken.SessionTokenImpl)paramc.x(a, 1));
    return localSessionToken;
  }
  
  public static void write(SessionToken paramSessionToken, c paramc)
  {
    paramc.getClass();
    paramc.R(a, 1);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.SessionTokenParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */