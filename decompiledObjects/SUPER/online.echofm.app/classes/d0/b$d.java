package d0;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import g0.M;

public final class b$d
{
  public final AudioAttributes a;
  
  public b$d(b paramb)
  {
    AudioAttributes.Builder localBuilder = new AudioAttributes.Builder().setContentType(a).setFlags(b).setUsage(c);
    int i = M.a;
    if (i >= 29) {
      b.b.a(localBuilder, d);
    }
    if (i >= 32) {
      b.c.a(localBuilder, e);
    }
    a = localBuilder.build();
  }
}

/* Location:
 * Qualified Name:     d0.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */