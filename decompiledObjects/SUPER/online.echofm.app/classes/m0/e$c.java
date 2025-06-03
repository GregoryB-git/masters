package m0;

import X2.g0;
import X2.v;
import X2.v.a;
import X2.w;
import X2.y;
import android.media.AudioFormat.Builder;
import d0.b;
import d0.b.d;
import g0.M;
import java.util.Iterator;

public abstract class e$c
{
  public static v a(b paramb)
  {
    v.a locala = v.M();
    g0 localg0 = e.e.i().q();
    while (localg0.hasNext())
    {
      Integer localInteger = (Integer)localg0.next();
      int i = localInteger.intValue();
      if ((M.a >= M.K(i)) && (f.a(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), aa))) {
        locala.h(localInteger);
      }
    }
    locala.h(Integer.valueOf(2));
    return locala.k();
  }
  
  public static int b(int paramInt1, int paramInt2, b paramb)
  {
    for (int i = 10; i > 0; i--)
    {
      int j = M.M(i);
      if ((j != 0) && (f.a(new AudioFormat.Builder().setEncoding(paramInt1).setSampleRate(paramInt2).setChannelMask(j).build(), aa))) {
        return i;
      }
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     m0.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */