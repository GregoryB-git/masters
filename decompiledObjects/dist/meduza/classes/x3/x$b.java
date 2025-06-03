package x3;

import android.os.Handler;
import g.q;
import v5.m;

public final class x$b
  implements m.c
{
  public x$b(x paramx) {}
  
  public final void a(Exception paramException)
  {
    m.d("MediaCodecAudioRenderer", "Audio sink error", paramException);
    l.a locala = a.L0;
    Handler localHandler = a;
    if (localHandler != null) {
      localHandler.post(new q(5, locala, paramException));
    }
  }
}

/* Location:
 * Qualified Name:     x3.x.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */