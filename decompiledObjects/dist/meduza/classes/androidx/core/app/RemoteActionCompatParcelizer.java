package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import b2.c;

public class RemoteActionCompatParcelizer
{
  public static RemoteActionCompat read(c paramc)
  {
    RemoteActionCompat localRemoteActionCompat = new RemoteActionCompat();
    a = ((IconCompat)paramc.x(a, 1));
    CharSequence localCharSequence = b;
    if (paramc.l(2)) {
      localCharSequence = paramc.j();
    }
    b = localCharSequence;
    localCharSequence = c;
    if (paramc.l(3)) {
      localCharSequence = paramc.j();
    }
    c = localCharSequence;
    d = ((PendingIntent)paramc.s(d, 4));
    e = paramc.f(5, e);
    f = paramc.f(6, f);
    return localRemoteActionCompat;
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, c paramc)
  {
    paramc.getClass();
    paramc.R(a, 1);
    CharSequence localCharSequence = b;
    paramc.y(2);
    paramc.E(localCharSequence);
    localCharSequence = c;
    paramc.y(3);
    paramc.E(localCharSequence);
    paramc.M(d, 4);
    paramc.z(5, e);
    paramc.z(6, f);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteActionCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */