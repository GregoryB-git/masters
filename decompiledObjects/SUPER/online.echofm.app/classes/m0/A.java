package m0;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

public final class A
{
  public final a a;
  public int b;
  public long c;
  public long d;
  public long e;
  public long f;
  
  public A(AudioTrack paramAudioTrack)
  {
    a = new a(paramAudioTrack);
    h();
  }
  
  public void a()
  {
    if (b == 4) {
      h();
    }
  }
  
  public void b()
  {
    a locala = a;
    if (locala != null) {
      locala.a();
    }
  }
  
  public long c()
  {
    a locala = a;
    long l;
    if (locala != null) {
      l = locala.b();
    } else {
      l = -1L;
    }
    return l;
  }
  
  public long d()
  {
    a locala = a;
    long l;
    if (locala != null) {
      l = locala.c();
    } else {
      l = -9223372036854775807L;
    }
    return l;
  }
  
  public boolean e()
  {
    boolean bool;
    if (b == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean f(long paramLong)
  {
    a locala = a;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (locala != null) {
      if (paramLong - e < d)
      {
        bool2 = bool1;
      }
      else
      {
        e = paramLong;
        boolean bool3 = locala.d();
        int i = b;
        if (i != 0)
        {
          if (i != 1) {
            if (i != 2)
            {
              if (i != 3)
              {
                if (i == 4) {
                  break label203;
                }
                throw new IllegalStateException();
              }
              if (!bool3) {
                break label203;
              }
            }
          }
          while (!bool3) {
            for (;;)
            {
              h();
              break;
              if (bool3) {
                break;
              }
            }
          }
          if (a.b() > f) {
            i(2);
          }
        }
        else if (bool3)
        {
          bool2 = bool1;
          if (a.c() < c) {
            break label207;
          }
          f = a.b();
          i(1);
        }
        else if (paramLong - c > 500000L)
        {
          i(3);
        }
        label203:
        bool2 = bool3;
      }
    }
    label207:
    return bool2;
  }
  
  public void g()
  {
    i(4);
  }
  
  public void h()
  {
    if (a != null) {
      i(0);
    }
  }
  
  public final void i(int paramInt)
  {
    b = paramInt;
    long l = 10000L;
    if (paramInt != 0) {
      if (paramInt != 1)
      {
        if ((paramInt == 2) || (paramInt == 3)) {
          break label53;
        }
        if (paramInt != 4) {
          break label45;
        }
        l = 500000L;
      }
    }
    for (;;)
    {
      d = l;
      break;
      label45:
      throw new IllegalStateException();
      label53:
      l = 10000000L;
      continue;
      e = 0L;
      f = -1L;
      c = (System.nanoTime() / 1000L);
    }
  }
  
  public static final class a
  {
    public final AudioTrack a;
    public final AudioTimestamp b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public long g;
    
    public a(AudioTrack paramAudioTrack)
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
}

/* Location:
 * Qualified Name:     m0.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */