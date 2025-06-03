package m0;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

public final class A$a
{
  public final AudioTrack a;
  public final AudioTimestamp b;
  public long c;
  public long d;
  public long e;
  public boolean f;
  public long g;
  
  public A$a(AudioTrack paramAudioTrack)
  {
    a = paramAudioTrack;
    b = new AudioTimestamp();
  }
  
  public void a()
  {
    f = true;
  }
  
  public long b()
  {
    return e;
  }
  
  public long c()
  {
    return b.nanoTime / 1000L;
  }
  
  public boolean d()
  {
    boolean bool = a.getTimestamp(b);
    if (bool)
    {
      long l1 = b.framePosition;
      long l2 = d;
      if (l2 > l1) {
        if (f)
        {
          g += l2;
          f = false;
        }
        else
        {
          c += 1L;
        }
      }
      d = l1;
      e = (l1 + g + (c << 32));
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     m0.A.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */