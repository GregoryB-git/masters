package g4;

import c4.v;
import f;
import java.util.Collections;
import v3.i0;
import v3.i0.a;
import v5.t;
import v5.u;
import x3.a.a;

public final class a
  extends d
{
  public static final int[] e = { 5512, 11025, 22050, 44100 };
  public boolean b;
  public boolean c;
  public int d;
  
  public a(v paramv)
  {
    super(paramv);
  }
  
  public final boolean a(u paramu)
  {
    if (!b)
    {
      int i = paramu.v();
      int j = i >> 4 & 0xF;
      d = j;
      if (j == 2)
      {
        j = e[(i >> 2 & 0x3)];
        paramu = new i0.a();
        k = "audio/mpeg";
        x = 1;
      }
      else
      {
        if ((j != 7) && (j != 8))
        {
          if (j == 10) {
            break label180;
          }
          paramu = f.l("Audio format not supported: ");
          paramu.append(d);
          throw new d.a(paramu.toString());
        }
        if (j == 7) {
          paramu = "audio/g711-alaw";
        } else {
          paramu = "audio/g711-mlaw";
        }
        i0.a locala = new i0.a();
        k = paramu;
        x = 1;
        j = 8000;
        paramu = locala;
      }
      y = j;
      paramu = paramu.a();
      a.d(paramu);
      c = true;
      label180:
      b = true;
    }
    else
    {
      paramu.H(1);
    }
    return true;
  }
  
  public final boolean b(long paramLong, u paramu)
  {
    int i;
    if (d == 2)
    {
      i = c;
    }
    else
    {
      i = paramu.v();
      if ((i == 0) && (!c))
      {
        i = c - b;
        byte[] arrayOfByte = new byte[i];
        paramu.d(arrayOfByte, 0, i);
        a.a locala = x3.a.c(new t(arrayOfByte, i), false);
        paramu = new i0.a();
        k = "audio/mp4a-latm";
        h = c;
        x = b;
        y = a;
        m = Collections.singletonList(arrayOfByte);
        paramu = new i0(paramu);
        a.d(paramu);
        c = true;
        return false;
      }
      if ((d == 10) && (i != 1)) {
        return false;
      }
      i = c;
    }
    i -= b;
    a.b(i, paramu);
    a.c(paramLong, 1, i, 0, null);
    return true;
  }
}

/* Location:
 * Qualified Name:     g4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */