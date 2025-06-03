package L0;

import F0.T;
import F0.a.b;
import d0.q.b;
import g0.z;
import java.util.Collections;

public final class a
  extends e
{
  public static final int[] e = { 5512, 11025, 22050, 44100 };
  public boolean b;
  public boolean c;
  public int d;
  
  public a(T paramT)
  {
    super(paramT);
  }
  
  public boolean b(z paramz)
  {
    if (!b)
    {
      int i = paramz.G();
      int j = i >> 4 & 0xF;
      d = j;
      if (j == 2) {
        i = e[(i >> 2 & 0x3)];
      }
      for (paramz = new q.b().o0("audio/mpeg").N(1).p0(i);; paramz = new q.b().o0(paramz).N(1).p0(8000))
      {
        paramz = paramz.K();
        a.d(paramz);
        c = true;
        break;
        if ((j != 7) && (j != 8))
        {
          if (j == 10) {
            break;
          }
          paramz = new StringBuilder();
          paramz.append("Audio format not supported: ");
          paramz.append(d);
          throw new e.a(paramz.toString());
        }
        if (j == 7) {
          paramz = "audio/g711-alaw";
        } else {
          paramz = "audio/g711-mlaw";
        }
      }
      b = true;
    }
    else
    {
      paramz.U(1);
    }
    return true;
  }
  
  public boolean c(z paramz, long paramLong)
  {
    if (d == 2)
    {
      i = paramz.a();
      a.e(paramz, i);
      a.b(paramLong, 1, i, 0, null);
      return true;
    }
    int i = paramz.G();
    if ((i == 0) && (!c))
    {
      i = paramz.a();
      byte[] arrayOfByte = new byte[i];
      paramz.l(arrayOfByte, 0, i);
      paramz = F0.a.e(arrayOfByte);
      paramz = new q.b().o0("audio/mp4a-latm").O(c).N(b).p0(a).b0(Collections.singletonList(arrayOfByte)).K();
      a.d(paramz);
      c = true;
      return false;
    }
    if ((d == 10) && (i != 1)) {
      return false;
    }
    i = paramz.a();
    a.e(paramz, i);
    a.b(paramLong, 1, i, 0, null);
    return true;
  }
}

/* Location:
 * Qualified Name:     L0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */