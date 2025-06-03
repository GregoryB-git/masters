package k1;

import android.text.SpannedString;
import c1.t;
import c1.t.b;
import f0.a.b;
import g0.M;
import g0.g;
import g0.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a
  implements t
{
  public final z a = new z();
  
  public static f0.a e(z paramz, int paramInt)
  {
    SpannedString localSpannedString = null;
    Object localObject = localSpannedString;
    while (paramInt > 0)
    {
      boolean bool;
      if (paramInt >= 8) {
        bool = true;
      } else {
        bool = false;
      }
      g0.a.b(bool, "Incomplete vtt cue box header found.");
      int i = paramz.p();
      int j = paramz.p();
      i -= 8;
      String str = M.I(paramz.e(), paramz.f(), i);
      paramz.U(i);
      i = paramInt - 8 - i;
      if (j == 1937011815)
      {
        localObject = e.o(str);
        paramInt = i;
      }
      else
      {
        paramInt = i;
        if (j == 1885436268)
        {
          localSpannedString = e.q(null, str.trim(), Collections.emptyList());
          paramInt = i;
        }
      }
    }
    paramz = localSpannedString;
    if (localSpannedString == null) {
      paramz = "";
    }
    if (localObject != null) {
      paramz = ((a.b)localObject).o(paramz).a();
    } else {
      paramz = e.l(paramz);
    }
    return paramz;
  }
  
  public void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, t.b paramb, g paramg)
  {
    a.R(paramArrayOfByte, paramInt2 + paramInt1);
    a.T(paramInt1);
    paramArrayOfByte = new ArrayList();
    while (a.a() > 0)
    {
      boolean bool;
      if (a.a() >= 8) {
        bool = true;
      } else {
        bool = false;
      }
      g0.a.b(bool, "Incomplete Mp4Webvtt Top Level box header found.");
      paramInt1 = a.p();
      if (a.p() == 1987343459) {
        paramArrayOfByte.add(e(a, paramInt1 - 8));
      } else {
        a.U(paramInt1 - 8);
      }
    }
    paramg.accept(new c1.e(paramArrayOfByte, -9223372036854775807L, -9223372036854775807L));
  }
  
  public int d()
  {
    return 2;
  }
}

/* Location:
 * Qualified Name:     k1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */