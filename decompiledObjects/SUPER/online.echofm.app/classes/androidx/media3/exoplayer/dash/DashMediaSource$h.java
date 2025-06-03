package androidx.media3.exoplayer.dash;

import B0.p.a;
import android.net.Uri;
import g0.M;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class DashMediaSource$h
  implements p.a
{
  public Long b(Uri paramUri, InputStream paramInputStream)
  {
    return Long.valueOf(M.Q0(new BufferedReader(new InputStreamReader(paramInputStream)).readLine()));
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.dash.DashMediaSource.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */