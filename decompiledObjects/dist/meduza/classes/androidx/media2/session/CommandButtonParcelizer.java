package androidx.media2.session;

import b2.c;

public final class CommandButtonParcelizer
{
  public static MediaSession.CommandButton read(c paramc)
  {
    MediaSession.CommandButton localCommandButton = new MediaSession.CommandButton();
    a = ((SessionCommand)paramc.x(a, 1));
    b = paramc.o(b, 2);
    CharSequence localCharSequence = c;
    if (paramc.l(3)) {
      localCharSequence = paramc.j();
    }
    c = localCharSequence;
    d = paramc.h(4, d);
    e = paramc.f(5, e);
    return localCommandButton;
  }
  
  public static void write(MediaSession.CommandButton paramCommandButton, c paramc)
  {
    paramc.getClass();
    paramc.R(a, 1);
    paramc.I(b, 2);
    CharSequence localCharSequence = c;
    paramc.y(3);
    paramc.E(localCharSequence);
    paramc.B(4, d);
    paramc.z(5, e);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.CommandButtonParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */