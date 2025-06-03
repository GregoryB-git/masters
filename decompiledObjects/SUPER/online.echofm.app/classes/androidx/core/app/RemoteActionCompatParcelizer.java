package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import v1.b;

public class RemoteActionCompatParcelizer
{
  public static RemoteActionCompat read(b paramb)
  {
    RemoteActionCompat localRemoteActionCompat = new RemoteActionCompat();
    a = ((IconCompat)paramb.v(a, 1));
    b = paramb.l(b, 2);
    c = paramb.l(c, 3);
    d = ((PendingIntent)paramb.r(d, 4));
    e = paramb.h(e, 5);
    f = paramb.h(f, 6);
    return localRemoteActionCompat;
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, b paramb)
  {
    paramb.x(false, false);
    paramb.M(a, 1);
    paramb.D(b, 2);
    paramb.D(c, 3);
    paramb.H(d, 4);
    paramb.z(e, 5);
    paramb.z(f, 6);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteActionCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */