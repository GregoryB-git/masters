package x3;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat.Builder;
import java.util.Iterator;
import o7.m0;
import o7.r;
import o7.t;
import o7.t.a;
import o7.x;
import r7.a;
import v5.e0;

public final class e$a
{
  public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();
  
  public static int[] a()
  {
    Object localObject = t.b;
    t.a locala = new t.a();
    m0 localm0 = e.e;
    x localx = b;
    localObject = localx;
    if (localx == null)
    {
      localObject = localm0.d();
      b = ((x)localObject);
    }
    localObject = ((r)localObject).n();
    while (((Iterator)localObject).hasNext())
    {
      int i = ((Integer)((Iterator)localObject).next()).intValue();
      if (aa.u.t(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), a)) {
        locala.c(Integer.valueOf(i));
      }
    }
    locala.c(Integer.valueOf(2));
    return a.F(locala.e());
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    for (int i = 8; i > 0; i--) {
      if (aa.u.t(new AudioFormat.Builder().setEncoding(paramInt1).setSampleRate(paramInt2).setChannelMask(e0.o(i)).build(), a)) {
        return i;
      }
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     x3.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */