package x3;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import v5.e0;

public final class d$c
{
  public final AudioAttributes a;
  
  public d$c(d paramd)
  {
    AudioAttributes.Builder localBuilder = new AudioAttributes.Builder().setContentType(a).setFlags(b).setUsage(c);
    int i = e0.a;
    if (i >= 29) {
      d.a.a(localBuilder, d);
    }
    if (i >= 32) {
      d.b.a(localBuilder, e);
    }
    a = localBuilder.build();
  }
}

/* Location:
 * Qualified Name:     x3.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */