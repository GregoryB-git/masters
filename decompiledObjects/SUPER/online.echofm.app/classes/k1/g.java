package k1;

import android.text.TextUtils;
import c1.i;
import c1.t;
import c1.t.b;
import d0.A;
import g0.z;
import java.util.ArrayList;
import java.util.List;

public final class g
  implements t
{
  public final z a = new z();
  public final b b = new b();
  
  public static int e(z paramz)
  {
    int i = -1;
    int j = 0;
    while (i == -1)
    {
      j = paramz.f();
      String str = paramz.r();
      if (str == null) {
        i = 0;
      } else if ("STYLE".equals(str)) {
        i = 2;
      } else if (str.startsWith("NOTE")) {
        i = 1;
      } else {
        i = 3;
      }
    }
    paramz.T(j);
    return i;
  }
  
  public static void f(z paramz)
  {
    while (!TextUtils.isEmpty(paramz.r())) {}
  }
  
  public void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, t.b paramb, g0.g paramg)
  {
    a.R(paramArrayOfByte, paramInt2 + paramInt1);
    a.T(paramInt1);
    ArrayList localArrayList1 = new ArrayList();
    try
    {
      h.e(a);
      while (!TextUtils.isEmpty(a.r())) {}
      ArrayList localArrayList2 = new ArrayList();
      for (;;)
      {
        paramInt1 = e(a);
        if (paramInt1 == 0) {
          break;
        }
        if (paramInt1 == 1)
        {
          f(a);
        }
        else if (paramInt1 == 2)
        {
          if (localArrayList2.isEmpty())
          {
            a.r();
            localArrayList1.addAll(b.d(a));
          }
          else
          {
            throw new IllegalArgumentException("A style block was found after the first cue.");
          }
        }
        else if (paramInt1 == 3)
        {
          paramArrayOfByte = e.m(a, localArrayList1);
          if (paramArrayOfByte != null) {
            localArrayList2.add(paramArrayOfByte);
          }
        }
      }
      i.c(new j(localArrayList2), paramb, paramg);
      return;
    }
    catch (A paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
  
  public int d()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     k1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */