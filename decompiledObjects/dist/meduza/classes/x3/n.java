package x3;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import v5.e0;

public final class n
{
  public final a a;
  public int b;
  public long c;
  public long d;
  public long e;
  public long f;
  
  public n(AudioTrack paramAudioTrack)
  {
    if (e0.a >= 19)
    {
      a = new a(paramAudioTrack);
      a();
    }
    else
    {
      a = null;
      b(3);
    }
  }
  
  public final void a()
  {
    if (a != null) {
      b(0);
    }
  }
  
  public final void b(int paramInt)
  {
    b = paramInt;
    long l = 10000L;
    if (paramInt != 0)
    {
      if (paramInt != 1) {
        if ((paramInt != 2) && (paramInt != 3))
        {
          if (paramInt == 4) {
            l = 500000L;
          } else {
            throw new IllegalStateException();
          }
        }
        else {
          l = 10000000L;
        }
      }
    }
    else
    {
      e = 0L;
      f = -1L;
      c = (System.nanoTime() / 1000L);
    }
    d = l;
  }
  
  public static final class a
  {
    public final AudioTrack a;
    public final AudioTimestamp b;
    public long c;
    public long d;
    public long e;
    
    public a(AudioTrack paramAudioTrack)
    {
      a = paramAudioTrack;
      b = new AudioTimestamp();
    }
  }
}

/* Location:
 * Qualified Name:     x3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */