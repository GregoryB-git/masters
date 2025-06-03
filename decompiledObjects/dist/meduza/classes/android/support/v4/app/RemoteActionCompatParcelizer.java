package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import b2.c;

public final class RemoteActionCompatParcelizer
  extends androidx.core.app.RemoteActionCompatParcelizer
{
  public static RemoteActionCompat read(c paramc)
  {
    return androidx.core.app.RemoteActionCompatParcelizer.read(paramc);
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, c paramc)
  {
    androidx.core.app.RemoteActionCompatParcelizer.write(paramRemoteActionCompat, paramc);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.RemoteActionCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */